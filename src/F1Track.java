class F1Track {

    private String name;
    private String country;
    private String tracktype;
    private int length;
    private int turns;

    public F1Track(String name, String country, String tracktype, int length, int turns) {
        this.name = name;
        this.country = country;
        this.tracktype = tracktype;
        this.length = length;
        this.turns = turns;
    }

    void startRace() {
        IO.println("Race started... 🏁🏎️");
    }

    String weather() {
        return "Light rain on track 🌧️";
    }

    void runCars(int cars) {
        IO.println("Cars running on track... 🏎️🏎️🏎️");
        IO.println("Cars: " + cars);

        if (cars > 20) {
            IO.println("Too many cars on track! Safety risk 🚨");
        } else {
            IO.println("Track running safely with " + cars + " cars ✅");
        }
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getTrackType() {
        return tracktype;
    }

    public double getLengthKm() {
        return length;
    }

    public int getTurns() {
        return turns;
    }
}