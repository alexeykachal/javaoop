public class MagicShield implements Shield {

    @Override
    public Integer protect() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format(" Shield protect %d", protect());
    }
}