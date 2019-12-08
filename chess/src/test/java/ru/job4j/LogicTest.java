package ru.job4j;

import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicTest {
    @Test
    public void whenThereIsNoShapeFromC1ToG5ReturnsFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Logic logic = new Logic();
        logic.add(bishopBlack);
        boolean result = logic.move(Cell.C1, Cell.G5);
        assertThat(result, is(true));
    }

    @Test
    public void whenThereIsNoShapeFromC1ToC5ReturnsFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Logic logic = new Logic();
        logic.add(bishopBlack);
        boolean result = logic.move(Cell.C1, Cell.C5);
        assertThat(result, is(false));
    }
}
