// this is where we don't encapsulate the data 

public class Data {
    private String data;

    public Data(String data){
        this.data = data;
    }
    public String getData() {
        return data;
    }
    public void addData(String data){
        this.data = this.data + data;
    }
}
