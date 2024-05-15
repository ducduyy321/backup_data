public class ElectricityCostCalculator {
    public static double calculateElectricityCost(double kWhUsage, double electricityRate) {
        return kWhUsage * electricityRate;
    }
    public static void main(String[] args) {

        double electricityRate = 0.1;
        double[] kWhUsageArray = {0, 1, 1.678};

        for (double kWhUsage : kWhUsageArray) {
            double electricityCost = calculateElectricityCost(kWhUsage, electricityRate);
            System.out.println("Sử dụng " + kWhUsage + " kWh, chi phí tiền điện là: $" + electricityCost);
        }
    }
}