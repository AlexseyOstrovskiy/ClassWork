package com.company;

public interface BankomImpl {
    boolean checkPin (String cardID,String pin);
    float getBalans();
    void getCash (float cash);
    void addCash (float cash);
    void reject ();

}
