package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        BamkAccount bamkAccount = new BamkAccount();
        bamkAccount.deposit(20000);
        for (int i = 0; ; i++) {
            try {
                bamkAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        System.out.println(bamkAccount.getAmount());
    }
    
}
