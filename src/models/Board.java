package models;

import java.util.Arrays;

public class Board {
    private Square[] squares = new Square[64];

    public Board() {
        this.CreateSquares();
    }

    private void CreateSquares() {
        for (int i = 0; i < 64; i++) {
            Square square = new Square(String.format("%s", i));
            squares[i] = square;
        }
    };
}
