// this is the chain and the program is getting ahead form hear
public interface Chain {
    public void setNextChain(Chain nextChain);
    public void process(Data request);
}
