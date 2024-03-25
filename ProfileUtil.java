public class ProfileUtil {

    public static StringBuilder ProfileObject(int income, int risk, boolean contributionBool, int contributionAmount, int timePeriod) {
        StringBuilder code = new StringBuilder();

        // Income
        if (income >= 0 && income < 50000) {
            code.append('1');
        } else if (income >= 50000 && income < 100000) {
            code.append('2');
        } else if (income >= 100000) {
            code.append('3');
        }

        // Risk amount
        if (risk == 1) {
            code.append('1');
        } else if (risk == 2) {
            code.append('2');
        } else if (risk == 3) {
            code.append('3');
        }

        // Contribution
        if (contributionBool) {
            code.append('1');
        } else {
            code.append('0');
        }

        // Time periods
        if (timePeriod == 1) {
            code.append('0');
        } else if (timePeriod == 2) {
            code.append('1');
        } else if (timePeriod == 3) {
            code.append('2');
        }


        
        return code;
    }
}