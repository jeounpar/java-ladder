package nextstep.ladder.domain.ladder.line;

public class HorizontalLine {

    private final boolean exist;

    public HorizontalLine(boolean exist) {
        this.exist = exist;
    }

    public boolean exist() {
        return exist;
    }
}