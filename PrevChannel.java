public class PrevChannel implements Command {
    private TV tv;

    public PrevChannel(TV tv) {
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.prvChannel();
    }
}
