package ThreadPractice.Bank;

class Server{
    int capacity;
    Server(int capacity){
        this.capacity = capacity;
    }
    synchronized void transaction(Account account) {
        if (capacity > 0) {
            capacity--;
            System.out.println(account.getName() + " has successfully completed transaction");
        }
        else {
            System.out.println("For "+ account.getName() +" Transaction has failed");
        }
    }
}

class Account extends Thread{
    Server server;
    Account(Server server) {
        this.server = server;
    }
    @Override
    public void run() {
        System.out.println("Account " + this.getName() + " has started");
        server.transaction(this);
    }
}


public class Bank {
    public static void main(String[] args) {
        Server server = new Server(2);
        Account account1 = new Account(server);
        Account account2 = new Account(server);
        Account account3 = new Account(server);
        Account account4 = new Account(server);
        account1.start(); account2.start(); account3.start(); account4.start();
        try {
            account1.join(); account2.join(); account3.join(); account4.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
