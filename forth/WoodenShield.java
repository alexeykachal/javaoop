public class WoodenShield implements Shield {

    @Override
    public Integer protect() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format(" Shield protect %d", protect());
    }
}