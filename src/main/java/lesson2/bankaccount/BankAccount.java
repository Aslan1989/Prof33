package lesson2.bankaccount;

public class BankAccount {
    /*
      UML - Universal Modelling Language
      используется для построения и визуализации диаграмм
        диаграммы классов - классы, свойства, методы
        диагрыммф объектов
        диаграммы потоков данных
        и тп

        BankAccount
        -----------------------------------------------
         - id: String     - занчит что свойство private
                             id название свойства
                             String тип данных

         - name: String
         - balance: int = 0  значение по умолчанию
        ------------------------------------------------
        +BankAccount(id,name,balance)   + значит что свойство публичное
        +getId
        +getName
        +getBalance
        +credit(amount: int): int значит что передаем в метод целый параметр и возвращаем целое
            возвращается баланс счета
        +debit(amount: int) : int деньги можно снять только если amount <= balance
                усли баланс счета меньше amount, печатем на экрамне ошибку, возвращаем 0

        +transfer(account: BankAccount, amount: int) : int
        +toString : String - возвращает описание экземпяра класса в виде строки
     */
    private String id;
    private String name;
    private int balance = 0;

    public BankAccount(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    /*
                +credit(amount: int): int значит что передаем в метод целый параметр и возвращаем целое
                увеличиваем баланс счета на amount
            возвращается баланс счета
     */
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    /*
                +debit(amount: int) : int деньги можно снять только если amount <= balance
                усли баланс счета меньше amount, печатем на экрамне ошибку, возвращаем 0
     */

    public int debit(int amount)
    {
        if (amount <= balance){
            balance -= amount;
            return amount;
        }
        else System.out.println("недостаточно денег на счете");
        return 0;
    }

    /*
                +transfer(account: BankAccount, amount: int) : int
     */

    public int transfer(BankAccount account, int amount)
    {
        int a = debit(amount); // фактическое кол во денег
        account.credit(a);
        return a;
    }

    @Override
    public String toString()
    {
        //return "account id: "+getId()+", holder: "+getName()+", balance: " + getBalance();
        return String.format("account id: %s, holder: %s, balance: %d", getId(), getName(), getBalance());
        // %s - строковой формат
        // %f - плавающая точка - например 0.22
        // %d - для чисел
    }
}
