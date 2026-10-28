public class WatchList {
    public static void main(String[] args) {
        // store watchlsit of the anime series
        String topPick = "Naruto";

        String ogTitle = new String("One piece");

        System.out.println(topPick);
        System.out.println(ogTitle);

        System.out.println(topPick.toUpperCase());

        System.out.println(formatAnimeTitle(ogTitle));
    }

    static String formatAnimeTitle(String animeTitle){
        System.out.println("Before Format" + animeTitle);
        return animeTitle.toLowerCase();
    }
}