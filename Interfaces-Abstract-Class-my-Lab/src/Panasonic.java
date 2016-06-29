/**
 * Created by owlslubic on 6/28/16.
 */
public class Panasonic extends Remote {

    public Panasonic(boolean needsBatteries, boolean supportsUsb, String brand) {
        super(needsBatteries, supportsUsb, brand);
        mBrand = brand;
    }
    public Panasonic(){
        super(true, false, "Panasonic");
    }



    @Override
    public void channelUp() {
        System.out.println("You hit Channel Up");

    }

    @Override
    public void channelDown() {
        System.out.println("You hit Channel Down");

    }

    @Override
    public void volumeUp() {
        System.out.println("You hit Volume Up");

    }

    @Override
    public void volumeDown() {
        System.out.println("You hit Volume Down -- Your neighbors will thank you!");

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
        return true;
    }
}
