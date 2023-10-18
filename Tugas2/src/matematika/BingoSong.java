/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author ASUS
 */
public class BingoSong {
    private String[] verses = {
        "B-I-N-G-O",
        "I-N-G-O",
        "N-G-O",
        "G-O",
        "O",
        ""
    };
    public BingoSong() {
        int i,j,k,l=0;
        for (i = 0; i < verses.length; i++) {
            if (i > 0) {
                System.out.println("\nThere was a farmer who had a dog,");
                System.out.println("And Bingo was his name-o.");
                while(l<3){
                    String claps = "";
                    for (j = 0; j < i; j++) {
                        claps += "(clap)-";
                    }
                    System.out.println(claps + verses[i]);
                    l++;
                }
                l=0;
                System.out.println("And Bingo was his name-o.");
            } else {
                System.out.println("There was a farmer who had a dog,");
                System.out.println("And Bingo was his name-o.");
                for (k = 0; k < 3; k++) {
                System.out.println(verses[0]);
                }
                System.out.println("And Bingo was his name-o.");
            }
        }
    }
}