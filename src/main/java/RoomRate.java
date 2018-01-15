public enum RoomRate extends Room{
    CLASSIC(100),
    EXECUTIVE(200),
    CASTLE(300),
    SUITE(400);

    private final int rate;

    RoomRate(int rate){
        this.rate = rate;
    }

    public int getRate(){
        return rate;
    }
}
