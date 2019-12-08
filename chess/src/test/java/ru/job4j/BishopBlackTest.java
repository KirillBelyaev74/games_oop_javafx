package ru.job4j;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void whenTheCellsAreTheSame() {
        Cell cell = Cell.A1;
        BishopBlack bishopBlack = new BishopBlack(cell);
        Cell result = bishopBlack.position();
        assertThat(cell, is(result));
    }

    @Test
    public void whenObjectsAreTheSame() {
        Cell cell = Cell.B1;
        BishopBlack bishopBlack = new BishopBlack(cell);
        BishopBlack result = (BishopBlack) bishopBlack.copy(cell);
        assertThat(bishopBlack.position(), is(result.position()));
    }

    @Test
    public void whenYouGiveС1ThenComesG5() {
        Cell c1 = Cell.C1;
        Cell g5 = Cell.G5;
        BishopBlack bishopBlack = new BishopBlack(c1);
        Cell[] result = bishopBlack.way(c1, g5);
        Cell[] answer = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(answer, is(result));
    }

}
