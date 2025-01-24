public abstract class Pet {
    private String voice;
    private int pawsCount = 8;

    public Pet(String voice) {
        this.voice = voice;
    }
    public void sleep(){
        System.out.println("Сплю");
    }
    public void play(){
        System.out.println("Играю");
    }
    public int getPawsCount() {
        return pawsCount;
    }
    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }
    public void giveVoice() {
        System.out.println(voice);
    }


}
