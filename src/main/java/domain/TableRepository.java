package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableRepository {
    private static final String NOT_MATCH_TABLE_NUMBER_MESSAGE = "존재하지 않는 테이블 번호입니다.";
    private static final List<Table> TABLES = new ArrayList<>();

    static {
        TABLES.add(new Table(1));
        TABLES.add(new Table(2));
        TABLES.add(new Table(3));
        TABLES.add(new Table(5));
        TABLES.add(new Table(6));
        TABLES.add(new Table(8));
    }

    public static List<Table> tables() {
        return Collections.unmodifiableList(TABLES);
    }

    public static Table from(int tableNo) {
        return TABLES.stream()
            .filter(table -> table.isMatch(tableNo))
            .findAny()
            .orElseThrow(() -> new IllegalArgumentException(NOT_MATCH_TABLE_NUMBER_MESSAGE));
    }
}
