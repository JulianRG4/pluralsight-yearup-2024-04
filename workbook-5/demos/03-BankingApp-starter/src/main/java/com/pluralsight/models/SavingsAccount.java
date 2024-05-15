package com.pluralsight.models;

public class SavingsAccount extends BankAccount
{
    private static final double MINIMUM_Balance = 25;

    public SavingsAccount(int accountNumber, String owner, double balance)
    {
        super(accountNumber,owner,balance);
    }

    @Override
    public boolean canWithdraw(double amount)
    {
        if(canWithdraw(amount))
        {
            return super.withdraw(amount);
        }
        return getBalance();
    }

    @Override
    public double withdraw(double amount)
    {
        if(canWithdraw(amount));
        {
            return super.withdraw(amount);
        }
        return getBalance();
    }


}
