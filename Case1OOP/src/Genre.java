public enum Genre {

    FANTASY(8,30), CRIME(25,60), HISTORY(20,80),
    THRILLER(18,60);

    private Genre (int minAge, int maxAge){
        this.minAge = minAge;
        this.maxAge = maxAge;
    }
    public final int minAge;
    public final int maxAge;
}
