package of2.lf;

import java.util.Arrays;
import java.util.List;

public class SelfServiceCheckout {

    public static final List<String> days = Arrays.asList("mon", "tue", "wed", "thu", "fri", "sat", "sun");

    private String day;
    private String phoneNumber;

    public SelfServiceCheckout(String day, String phoneNumber) {
        validateDay(day);
        this.day = day;
        if (!validatePhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Not a valid phone number");
        }
        
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (!validatePhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Not a valid phone number");
        }
    
        this.phoneNumber = phoneNumber;
    }

    private boolean validatePhoneNumber(String phoneNumber) {
        String cleanPhoneNumber = phoneNumber.replaceAll("\\s", "");

        if (cleanPhoneNumber.startsWith("0047")) {
            if (!(cleanPhoneNumber.startsWith("00479") || cleanPhoneNumber.startsWith("00474"))) {
                return false;
            }
            if (cleanPhoneNumber.length() != 12) {
                return false;
            }
        } else if (cleanPhoneNumber.startsWith("+47")) {
            if (!(cleanPhoneNumber.startsWith("+479") || cleanPhoneNumber.startsWith("+474"))) {
                return false;
            }
            if (cleanPhoneNumber.length() != 11) {
                return false;
            }
        } else {
            return false;
        }

        String subCleanPhoneNumber = cleanPhoneNumber.substring(cleanPhoneNumber.length() - 8);

        char[] chars = subCleanPhoneNumber.toCharArray();

        for (char c : chars) {
            if (!Character.isDigit(c)) {
                return false;
            }

        }

        return true;

    }

    private void validateDay(String day) {
        if (!days.contains(day)) {
            throw new IllegalArgumentException("Not a valid day");
        }
    }

    public static void main(String[] args) {
        SelfServiceCheckout s1 = new SelfServiceCheckout("mon", "+47 41009110");

    }

}
