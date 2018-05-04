package com.phoenix.motion;

import com.example.motion.R;

public class MotionUtils {

    private static MotionUtils mInstance;

    private MotionUtils() {
    }

    public static MotionUtils getInstance() {

        if (mInstance == null) {

            mInstance = new MotionUtils();
        }

        return mInstance;
    }

    public static String hidePaymentMethodNumber(String paymentMethodNumber) {

        if (paymentMethodNumber.length() == 4) {

            return "···· ".concat(paymentMethodNumber);
        }

        if (paymentMethodNumber.length() <= 10) {

            return paymentMethodNumber;
        }

        String suffix = paymentMethodNumber
                .substring(paymentMethodNumber.length() - 4, paymentMethodNumber.length());
        return "···· ".concat(suffix);
    }

    public static int getCardCompanyIcon(String type) {

        switch (type) {

            case Constants.VISA:
                return R.drawable.icon_card_visa;

            case Constants.MASTERCARD:
                return R.drawable.icon_card_mastercard;

            case Constants.AMEX:
                return R.drawable.icon_card_amex;

            case Constants.MAESTRO:
                return R.drawable.icon_card_maestro;

            default:
                return R.drawable.icon_card_plain;
        }
    }

    public static String concatStrings(String value1, String value2, boolean divider) {

        StringBuilder builder = new StringBuilder();

        if (value1 != null && value1.length() > 0) {

            builder.append(value1);
        }

        if (builder.length() > 0) {

            if (divider) {

                builder.append(" | ");
            } else {

                builder.append(" ");
            }
        }

        if (value2 != null && value2.length() > 0) {

            builder.append(value2);
        }

        return builder.toString();
    }
}
