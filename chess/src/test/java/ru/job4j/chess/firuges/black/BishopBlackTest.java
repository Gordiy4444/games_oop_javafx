package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void whenBishopBlackTest(){
        BishopBlack sl = new  BishopBlack(Cell.A1);
        assertThat(sl.position(), Cell.A1);
    }
}