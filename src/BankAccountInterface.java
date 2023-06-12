public interface BankAccountInterface {

    String fetchBalance(String password);
    double addMoney(double amount);
    String withDrawMoney(String password,double amount);
    String changePassword(String newPassword,String oldPassword);

    double calculateInterest(int years);
}
