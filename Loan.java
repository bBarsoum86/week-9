public class Loan {
    private double loanAmount;
    private double annualInterestRate;
    private int loanTerm;

    // Constructor to initialize loan with amount, interest rate, and term in years
    public Loan(double loanAmount, double annualInterestRate, int loanTerm) {
        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
    }

    // Method to calculate monthly payment based on loan details
    public double calculateMonthlyPayment() {
        double monthlyRate = annualInterestRate / 100 / 12; // Convert annual rate to monthly rate
        int totalPayments = loanTerm * 12; // Total number of payments (months)

        // Formula to calculate monthly payment for fixed-rate mortgage
        return loanAmount * monthlyRate / (1 - Math.pow(1 + monthlyRate, -totalPayments));
    }

    // Prints loan details and calculated monthly payment
    public void printLoanDetails() {
        System.out.printf("Loan Amount: $%.2f%n", loanAmount);
        System.out.printf("Annual Interest Rate: %.2f%%%n", annualInterestRate);
        System.out.printf("Loan Term: %d years%n", loanTerm);
        System.out.printf("Monthly Payment: $%.2f%n", calculateMonthlyPayment());
    }
}
