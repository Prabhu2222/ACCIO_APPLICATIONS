import java.util.UUID;

public class SBI_Account implements BankAccountInterface {
     //its a good practice to keep all variables as private
    //its always advisable to create a default no Parameter constructor
    private String accountUserName;
    private String password;
    private String accountNumber;
    private double balance;
    final double rateOfInterest=4.2;
    ///////////////CONSTRUCTOR ZONE/////////////////////////////////////////////////////////////////////
    public SBI_Account(){}

    public SBI_Account(String accountUserName, String password, double balance) {
        this.accountUserName = accountUserName;
        this.password = password;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.balance = balance;
    }
    /////////////////CONSTRUCTOR ZONE ENDS HERE////////////////////////////////////////////////////////


    ///////////////GETTERS AND SETTERS ZONE///////////////////////////////////////////////////////////

    public String getAccountUserName() {
        return accountUserName;
    }

    public void setAccountUserName(String accountUserName) {
        this.accountUserName = accountUserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    ///////////////GETTERS AND SETTERS END HERE////////////////////////////////////////

    /////////////OVERRIDED METHODS OF INTERFACE//////////////////////////////////////////
    @Override
    public String fetchBalance(String password) {

        if(this.password.equals(password)){
            return "Your Account Balance is: "+this.balance;
        }
        return "Invalid password";
    }

    @Override
    public double addMoney(double amount) {

        this.balance+=amount;
        return this.balance;

        /////////////appending a character into a string
        //two ways
        //str=str+'a';  ->this is a order of n O(n) operation
        //str+='a';     ->this is a order of  1 O(1) operation
    }

    @Override
    public String withDrawMoney(String password, double amount) {

        if(this.password.equals(password)){
            if(amount<=this.balance){
                this.balance-=amount;
                return "Money has been withdrawn .Your remaining Balance is: "+this.balance;
            }else
                return "Insufficient Balance";
        }
        return "Invalid password";
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {

        if(this.password.equals(oldPassword)){
            this.password=newPassword;
            return "Congrats! Your Password has been updated";
        }
        return "Invalid Password";
    }

    @Override
    public double calculateInterest(int years) {
        return (this.balance*rateOfInterest*years)/100;
    }
}
