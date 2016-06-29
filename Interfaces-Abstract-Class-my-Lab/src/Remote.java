import java.util.Random;

/**
 * Created by owlslubic on 6/28/16.
 */
public abstract class Remote implements WaterProof, Rechargeable, Universal{
    boolean mNeedsBatteries;
    boolean mSupportsUsb;
    String mBrand;

    public Remote(){ //i guess this is a default constructor
    }

    public Remote(boolean needsBatteries, boolean supportsUsb, String brand){
        mSupportsUsb = supportsUsb;
        mNeedsBatteries = needsBatteries;
        mBrand = brand;
    }


    public boolean getNeedsBatts(){
        return mNeedsBatteries;
    }

    public void setNeedsBatts(boolean needs){
        mNeedsBatteries = needs;
    }

    public boolean getSupportsUsb(){
        return mSupportsUsb;
    }
    public void setSupportsUsb(boolean support){
        mSupportsUsb = support;
    }

    public abstract void channelUp();
    public abstract void channelDown();
    public abstract void volumeUp();
    public abstract void volumeDown();

    public void powerButtonPressed(){
        System.out.println("you pressed the Power Button");
    }

    public void numberButtonPressed(int button){

        System.out.println("Changing channel to " + getRandomChannel());
    }

    public String getRemoteBrand(){
        return mBrand;
    }

    public int getRandomChannel() {
        Random r = new Random();

        int value = 0 + r.nextInt(800);

        return value;
    }


}
