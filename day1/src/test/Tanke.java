package test;

public class Tanke {
    private int bleed;
    private boolean live;

    public Tanke(int bleed,boolean live){
        this.bleed=bleed;
        this.live=live;
    }

    public int getBleed(){
        return this.bleed;
    }
    public void decreseBleed(int damage){
        this.bleed-=damage;
    }

    public boolean getLive(){
        if(this.bleed<=0)
            this.live=false;
        else
            this.live=true;


        return this.live;
    }

}
