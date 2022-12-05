// this is the datalink layer of the osi model java file
public class DataLink implements Chain{
    private Chain nextInChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            request.addData("+DataLinkHeader");
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
