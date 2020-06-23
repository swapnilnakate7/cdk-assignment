package in.swapnilnakate;

import in.swapnilnakate.exceptions.InvalidInput;
import in.swapnilnakate.processors.GoldProcessor;
import in.swapnilnakate.processors.PremiumProcessor;
import in.swapnilnakate.processors.RegularProcessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Processor processor;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.println("Enter Customer Type: ex 1/2 \n 1 Regular \n 2 Premium \n 3 Gold");

            String customerType = validateCustomerType(bufferedReader.readLine().trim());
            processor = getProcessor(customerType);
            System.out.println("Enter Purchase Amount");
            Double purchaseAmount = Double.valueOf(bufferedReader.readLine());
            bufferedReader.close();
            System.out.println("\nAmount to be Paid with discount: " + processor.process(purchaseAmount));
        } catch (IOException | InvalidInput e) {
            System.out.println(e.getMessage());
        }


    }

    private static String validateCustomerType(String customerType) throws InvalidInput {
        if (!(customerType.equals("1") || customerType.equals("2") ||  customerType.equals("3"))) {
            throw new InvalidInput("Invalid CustomerType");
        }

        return customerType.trim();
    }

    private static Processor getProcessor(String customerType) throws InvalidInput {
        switch (customerType) {
            case "1":
                return new RegularProcessor();
            case "2":
                return new PremiumProcessor();
            case "3":
                return new GoldProcessor();
            default:
                throw new InvalidInput("Unsupported customer type ");
        }

    }
}
