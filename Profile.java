


public class Profile {
    private String username;
    private int income;
    private int risk;
    private boolean contributeMonthly;
    private int timePeriod;
    private int monthlyAmount;

    // Getter and setter for income

    public void setUsername(String username) {
        this.username = username;
    }


    public void setIncome(int income) {
        this.income = income;
    }

    // Getter and setter for risk
    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    // Getter and setter for contributeMonthly
    public boolean isContributeMonthly() {
        return contributeMonthly;
    }

    public void setContributeMonthly(boolean contributeMonthly) {
        this.contributeMonthly = contributeMonthly;
    }

    // Getter and setter for timePeriod
    public int getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(int timePeriod) {
        this.timePeriod = timePeriod;
    }

    public int getMonthlyAmount(){
        return this.monthlyAmount;
    }

    public void setMonthlyAmount(int monthlyAmount){
        this.monthlyAmount = monthlyAmount;
    }

    public void uploadProfile(){
        Auth.uploadProfile(this.username,this.income, this.risk, this.contributeMonthly, this.timePeriod, this.monthlyAmount);
    }
    public boolean checkProfile(){
        return Auth.CheckIfProfileExists(this.username);
    }

    public int getRiskFromDB(){
        return Auth.getUserRisk(this.username);
    }
    public boolean getContributeMonthFromDB(){
        int num = Auth.getUserContributeMonthly(this.username);
        if(num == 0){
            return false;
        }
        else{
            return true;
        }
    }

    public int getTimePeriodFromDB(){
        return Auth.getUserTimePeriod(this.username);
    }
}
