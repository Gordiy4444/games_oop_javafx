package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        throw new IllegalStateException(
                String.format("Could not way by diagonal from %s to %s", position, dest)
        );
    }
    int size = position().getX() - position().getX();
    Cell[] steps = new Cell[size];
    int deltaX = position().getX() - position().getX();
    int deltaY = position().getY() - position().getY();
    for (int index = 0; index < size; index++) {
        steps[index] =
    }
    return steps;
}
    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(dest.getX() - source.getX()) == Math.abs(dest.getY() - source.getY());
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
