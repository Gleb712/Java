package ru.netology.maskalev.domain;

public class CashbackOperation extends Operation {

    private final int cashbackAmount;

    public CashbackOperation(int id, int sum, String currency, String merchant, int cashbackAmount, int clientId) {
        super(id, sum, currency, merchant, clientId);
        this.cashbackAmount = cashbackAmount;
    }


    @Override
    public String toString()
    {
        return "{id=" + getId() + ", sum=" + getSum() + ", currency=" + getCurrency() + ", merchant=" + getMerchant() + ", cashback=" + cashbackAmount + "}";
    }
}
