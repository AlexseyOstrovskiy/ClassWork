package com.company;

public class Bankomat implements BankomImpl{
    private Card [] _cards;
    private Card _userCard;
    public  Bankomat () {
        // создаем базу данных карточек
        this._cards = new Card []{
                new Card ("777777","1234",12.5f),
                new Card ("777778","2234",0f),
                new Card ("777779","3234",1000f)
        };

    }

    public boolean checkPin (String cardID,String pin){

        int i = 0;
        for (;i < this._cards.length; i++){
            if (this._cards[i].ID.equals(cardID)) {
                this._userCard = this._cards[i];
                break;
            }
        }//null- нулевая ссылка
        if (this._userCard == null) {
            System.out.println("Неверный ID карточки.");
            return false;
        }
        // проверяем пин-код
        /*if (this._cards[i].PIN == pin) {
            return true;
        }
        return false;*/
        return this._cards[i].PIN.equals(pin);
    }

    public float getBalans(){
        return this._userCard.money;
    }

    public void getCash (float cash){
        if (cash > this._userCard.money) {
            System.out.println("Недостаточно средств на вашей карте");
        }
        else {
            //this._userCard.money = this._userCard.money - cash;
            this._userCard.money -= cash;
        }
    }

   public void addCash (float cash){
        this._userCard.money += cash;
   }

   public void reject (){
        this._userCard = null;
   }

    class Card {
        String ID;
        String PIN;
        float money;

        public Card (String id,String pin,float money){
            this.ID = id;
            this.PIN = pin;
            this.money = money;
        }
    }
}
