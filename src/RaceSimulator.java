class RaceSimulator {

    public static void main(String[] args) {


        var track = new f1track("Monaco", "Monaco", "Street", 3337, 19);
        f1track track1 = new f1track("Monza", "Italy", "Fast", 5793, 11);
        f1track track2 = new f1track("Silverstone", "UK", "Technical", 5891, 18);
        f1track track3 = new f1track("Spa", "Belgium", "Mixed", 7004, 20);
        f1track track4 = new f1track("Suzuka", "Japan", "Technical", 5807, 18);
        f1track track5 = new f1track("Interlagos", "Brazil", "Short", 4309, 15);

        String weather = track.weather();

        IO.println("La pista es: " + track.getName());
        IO.println("País: " + track.getCountry());
        IO.println("Tipo: " + track.getTrackType());
        IO.println("Longitud: " + track.getLengthKm());
        IO.println("Curvas: " + track.getTurns());

        IO.println("Clima: " + weather);

        track.startRace();
        track.runCars(20);
    }
}