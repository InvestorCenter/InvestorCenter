public class Interest {
    private double initialAmount;
    private double contribution;
    private int length;

    private double[] dataSet;
    private double[] dataCopy;
    private double[] interestSet;
    private float interestRate;


    public Interest(double initialAmount, double contribution, int length, float interestRate){
        this.initialAmount = initialAmount;
        this.contribution = contribution;
        this.length = length+1;
        this.interestRate = interestRate;
        this.interestSet = new double[this.length];
        // create initial array
        createData();
    }

    private void createData(){
        // create array with initial amount and contributions yearly 
        dataSet = new double[length];
        dataSet[0] = initialAmount;

        dataCopy = new double[length];
        dataCopy[0] = initialAmount;
        for (int i = 1; i < length; i++){
            dataSet[i] = dataSet[i-1] + contribution;
            dataCopy[i] = dataSet[i];
        }
    }

    public double[] getDataSet(){
        // create array with initial amount and contributions yearly 
       return dataSet;
    }

    public double[] calculateInterest() {
        double[] set = new double[interestSet.length];

        for (int i = 0; i < dataCopy.length; i++) {
            // calculate interest for the current amount
            double currentInterest = (dataCopy[i] * (interestRate / 100));
            // store it separately
            set[i] = currentInterest;
            // if it's not the last data point
            if (i < dataCopy.length - 1) {
                // aggregate the interest
                interestSet[i] = (i > 0 ? interestSet[i - 1] : 0) + currentInterest;
                // update the next principal amount
                dataCopy[i + 1] += interestSet[i];
            } else {
                // for the last data point
                interestSet[i] = (i > 0 ? interestSet[i - 1] : 0) + currentInterest;
                dataCopy[i] += currentInterest;
            }
        }

        return set;
    }
}
