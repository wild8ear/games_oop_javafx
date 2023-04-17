package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest {
        @Test
        public void whenPositionC8() {
                BishopBlack bb = new BishopBlack(Cell.C1);
                assertThat(Cell.C1).isEqualTo(bb.position());
        }

        @Test
        public void whenCopyFigure() {
                BishopBlack bb = new BishopBlack(Cell.C1);
                assertThat(Cell.G5).isEqualTo(bb.copy(Cell.G5).position());
        }

        @Test
        public void whenWayFromG8ToToG5() {
                Cell[] rsl = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
                BishopBlack bb = new BishopBlack(Cell.C1);
                assertThat(rsl).isEqualTo(bb.way(Cell.G5));
        }

}
