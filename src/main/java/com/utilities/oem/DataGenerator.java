package com.utilities.oem;

import java.util.Random;

public class DataGenerator {

    private static final String ALPHANUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String DIGITS = "0123456789";
    private static final Random random = new Random();

    // Generate Serial Number (length 25 to 32, alphanumeric)
    public static String generateSerial() {
        int length = random.nextInt(8) + 25; // 25 to 32
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(ALPHANUMERIC.charAt(random.nextInt(ALPHANUMERIC.length())));
        }

        return sb.toString();
    }

    // Generate IMEI Number (length 10 to 15, digits only)
    public static String generateIMEI() {
        int length = random.nextInt(6) + 10; // 10 to 15
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        }

        return sb.toString();
    }
}
