package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest {

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayBishopBlack() {
        BishopBlack black = new BishopBlack(Cell.A1);
        black.way(Cell.A2);
    }

    @Test
    public void whenWayBishopBlackA3toB4() {
        BishopBlack black = new BishopBlack(Cell.A3);
        black.way(Cell.B4);
    }

}