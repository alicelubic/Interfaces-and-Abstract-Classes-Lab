import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by owlslubic on 6/28/16.
 */
public class Samsung extends Remote{


    //give it any variables?

    //default constructor
    public Samsung(){
        super(false, false, "Samsung");

    }
    //constructor
    public Samsung(boolean needsBatteries, boolean supportsUSB, String brand){
        super(needsBatteries, supportsUSB, brand);
        mBrand = brand;

    }


    @Override
    public void channelUp() {
        System.out.println("You've pressed Channel Up");

    }

    @Override
    public void channelDown() {
        System.out.println("You've pressed Channel Down");

    }

    @Override
    public void volumeUp() {
        System.out.println("You've turned the Volume Up -- Careful! Extended listening at high volumes can damage your hearing.");

    }

    @Override
    public void volumeDown() {
        System.out.println("You've turned the Volume Down -- Smart");

    }


    @Override
    public boolean isRechargeable() {
        return true;
    }

    @Override
    public void supportsBrands() {

    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}
