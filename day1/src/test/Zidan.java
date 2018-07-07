package test;

public class Zidan {
    private  int bleed;
    private  boolean live;
    public int damage=50;

    public Zidan(int bleed,boolean live){
        this.bleed=bleed;
        this.live=live;
    }

    public void zi2Tanke(Tanke t){
        this.bleed-=damage;
        t.decreseBleed(damage);
    }
    public int getBleed(){
        return this.bleed;
    }

    public boolean getLive(){
        if(this.bleed<=0)
            this.live=false;
        else
            this.live=true;


        return this.live;
    }

}
