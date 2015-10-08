public class AdBot {
    private String[] data;
    private int counter;

    public AdBot(String[] data){
        this.data = data;
        this.counter = 0;
    }
    public void showNextAd() {
        System.out.println(data[counter]);
        counter = (counter < data.length - 1) ? counter + 1 : 0 ;
    }
}
