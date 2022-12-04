public class IronShield implements Shield {

    @Override
    public Integer protect() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format(" Shield protect %d", protect());
    }
}