public class Main {
    public static void main(String[] args) {
     SBI_Account account1=new SBI_Account("Sachin","abc123",500);
        System.out.println("Congrats! "+account1.getAccountUserName()+
                "your account has been created with account number: "+
                account1.getAccountNumber());

        SBI_Account account2=new SBI_Account("Suresh","asd123",2000);
        System.out.println("Congrats! "+account2.getAccountUserName()+
                "your account has been created with account number: "+
                account2.getAccountNumber());

        account1.addMoney(3000);
        System.out.println(account1.fetchBalance("abc123"));

        System.out.println(account1.withDrawMoney("dsf",100));
        System.out.println(account1.withDrawMoney("abc123",1000));

        System.out.println(account1.fetchBalance("sdfsf"));
        System.out.println(account1.fetchBalance("abc123"));

        System.out.println(account1.changePassword("qwerty123","adfsff"));
        System.out.println(account1.changePassword("qwerty123","abc123"));

        System.out.println(account1.fetchBalance("abc123"));
        System.out.println(account1.fetchBalance("qwerty123"));

        System.out.println(account1.calculateInterest(2));



    }
}