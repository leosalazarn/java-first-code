class RaceSimulator {

    static void main(String[] args) {


        var track = new F1Track("Monaco", "Monaco", "Street", 3337, 19);
        var track1 = new F1Track("Monza", "Italy", "Fast", 5793, 11);
        var track2 = new F1Track("Silverstone", "UK", "Technical", 5891, 18);
        var track3 = new F1Track("Spa", "Belgium", "Mixed", 7004, 20);
        var track4 = new F1Track("Suzuka", "Japan", "Technical", 5807, 18);
        var track5 = new F1Track("Interlagos", "Brazil", "Short", 4309, 15);

        String weather = track.weather();

        IO.println("La pista es: " + track.getName());
        IO.println("País: " + track.getCountry());
        IO.println("Tipo: " + track.getTrackType());
        IO.println("Longitud: " + track.getLengthKm());
        IO.println("Curvas: " + track.getTurns());

        IO.println("\nLa pista es: " + track1.getName());
        IO.println("País: " + track1.getCountry());
        IO.println("Tipo: " + track1.getTrackType());
        IO.println("Longitud: " + track1.getLengthKm());
        IO.println("Curvas: " + track1.getTurns());

        IO.println("\nLa pista es: " + track2.getName());
        IO.println("País: " + track2.getCountry());
        IO.println("Tipo: " + track2.getTrackType());
        IO.println("Longitud: " + track2.getLengthKm());
        IO.println("Curvas: " + track2.getTurns());

        IO.println("Clima: " + weather);

        track.startRace();
        track.runCars(21);
    }
}