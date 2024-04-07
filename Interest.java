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

    public double[] calculateInterest(){
        // FIXME:
        // Interest is not being stacked up, interest needs to be added to each data point, 
        // 1000 makes 60 dollars in interest
        // SInce we add 1000 each year, we add that 60 so it becomes 2060
        // 6% of 2060 is 123.60
        // we add another grand so its 3183.60
        double[] set = new double[interestSet.length];
        
        for (int i = 0; i < dataCopy.length; i++){
            if (i>0 && i < dataCopy.length - 1){

                
                double currentInterest = (dataCopy[i] * (interestRate/100));
               // get previous data
               double prevInterest = interestSet[i-1];
               interestSet[i] = currentInterest + prevInterest;
               dataCopy[i+1] += currentInterest + prevInterest;;



               set[i] = currentInterest;



            }
            else if (i == dataCopy.length-1){
                double currentInterest = (dataCopy[i] * (interestRate/100));
               // get previous data
               interestSet[i] = currentInterest;
               dataCopy[i] += currentInterest;

               set[i] = currentInterest;
            }
            else{
                interestSet[0] = 0;
            }
        }
        
        return set;
    }
}
