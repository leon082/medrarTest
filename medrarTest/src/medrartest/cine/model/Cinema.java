/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medrartest.cine.model;

/**
 *
 * @author luis.leon
 */
public class Cinema {

    private Movie movie;
    private int price;
    private Chair[][] chairs;
    private static Cinema cinema;

    private Cinema() {
        // llenar la sala
        chairs = new Chair[8][9];

        for (int i = 0; i < chairs.length; i++) {
            for (int j = 0; j < chairs[i].length; j++) {
                chairs[i][j] = createChair("" + (i + 1), (j + 1));
            }
        }
    }

    static Chair createChair(String column, int row) {

        String letter;
        switch (row) {
            case 1:
                letter = "I";
                break;
            case 2:
                letter = "H";
                break;
            case 3:
                letter = "G";
                break;
            case 4:
                letter = "F";
                break;
            case 5:
                letter = "E";
                break;
            case 6:
                letter = "D";
                break;
            case 7:
                letter = "C";
                break;
            case 8:
                letter = "B";
                break;
            case 9:
                letter = "A";
                break;

            default:
                letter = "";
        }

        return new Chair(column, letter, true);

    }

    public static Cinema getInstance() {
        if (cinema == null) {

            cinema = new Cinema();
        }

        return cinema;
    }

    public int getEnabledChairs() {
        int count = 0;
        for (int i = 0; i < chairs.length; i++) {
            for (int j = 0; j < chairs[i].length; j++) {
                count += chairs[i][j].isState() ? 1 : 0;
            }
        }

        return count;
    }

    public int getDisabledChairs() {
       int count = 0;
        for (int i = 0; i < chairs.length; i++) {
            for (int j = 0; j < chairs[i].length; j++) {
                count += !chairs[i][j].isState() ? 1 : 0;
            }
        }

        return count;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Chair[][] getChairs() {
        return chairs;
    }

    public void setChairs(Chair[][] chairs) {
        this.chairs = chairs;
    }

}
