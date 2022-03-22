package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BishopBlackTest {

    @Test(expected = ImpossibleMoveException.class)
    public void whenBishopBlackCouldNotWayByDiagonalfromA1toA2() {
        BishopBlack black = new BishopBlack(Cell.A1);
        black.way(Cell.A2);
        Cell[] cells = new Cell[] {Cell.A2};
        assertThat(black, is(cells));
    }

    @Test()
    public void whenWayBishopBlackA3toB4() {
        BishopBlack black = new BishopBlack(Cell.A3);
        black.way(Cell.B4);
    }

    @Test
    public void whenApplyPositionBishopBlack() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.position(), is(Cell.C1));
    }

}