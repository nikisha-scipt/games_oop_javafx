package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void whenEmptyDest()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.B8));
        logic.move(Cell.C8, Cell.A6);
    }

    @Test()
    public void whenWrongMove()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.add(new BishopBlack(Cell.B7));
        logic.move(Cell.C8, Cell.A1);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayBishopBlack() {
        BishopBlack black = new BishopBlack(Cell.A1);
        black.way(Cell.A2);
    }

}