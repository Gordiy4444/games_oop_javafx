package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void whenBishopBlackTest(){
        BishopBlack sl = new  BishopBlack(Cell.E3);
        Cell[] cells = sl.way(Cell.G5);
        Cell[] dells = new Cell[]{Cell.F4,Cell.G5};
        assertThat(cells, is(dells));
    }
}