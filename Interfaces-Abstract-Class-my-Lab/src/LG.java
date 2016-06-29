import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by owlslubic on 6/28/16.
 */
public class LG extends Remote {


    public LG(boolean needsBatteries, boolean supportsUsb, String brand) {
        super(needsBatteries, supportsUsb, brand);
        mBrand = brand;
    }
    public LG(){
        super(true, true, "LG");
    }

    @Override
    public void channelUp() {
        System.out.println("Channel Up");

    }

    @Override
    public void channelDown() {
        System.out.println("Channel Down");

    }

    @Override
    public void volumeUp() {
        System.out.println("Volume Up");

    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Down");

    }

    @Override
    public boolean isRechargeable() {
        return false;
    }

    @Override
    public void supportsBrands() {

    }

    @Override
    public boolean isWaterProof() {
        return true;
    }
}
