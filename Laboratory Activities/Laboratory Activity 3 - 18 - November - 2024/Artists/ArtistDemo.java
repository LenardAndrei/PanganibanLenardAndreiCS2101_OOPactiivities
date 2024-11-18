public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Leonardo Da Vinci", "Italian", 67, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Jose Rizal", "Filipino", 35, "Writing", WritingStyle.POETRY);
        writer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Sheena Catacutan", "Filipino", 20, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();

    }
}