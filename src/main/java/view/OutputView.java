package view;

import domain.Menu;
import domain.Table;

import java.util.List;

public class OutputView {
    private static final String TOP_LINE = "┌ ─ ┐";
    private static final String TABLE_FORMAT = "| %s |";
    private static final String BOTTOM_LINE_FORMAT = "└ %c ┘";
    private static final char ORDERED = '₩';
    private static final char NOT_ORDERED = '─';

    public static void printTables(final List<Table> tables) {
        System.out.println("## 테이블 목록");
        final int size = tables.size();
        printTopLine(size);
        printTableNumbers(tables);
        printBottomLine(tables);
    }

    private static void printTopLine(final int count) {
        for (int index = 0; index < count; index++) {
            System.out.print(TOP_LINE);
        }
        System.out.println();
    }

    private static void printTableNumbers(final List<Table> tables) {
        for (final Table table : tables) {
            System.out.printf(TABLE_FORMAT, table);
        }
        System.out.println();
    }

    private static void printBottomLine(final List<Table> tables) {
        for (final Table table : tables) {
            printLineByOrdered(table);
        }
        System.out.println();
    }

    private static void printLineByOrdered(Table table) {
        if (table.isOrdered()) {
            System.out.printf(BOTTOM_LINE_FORMAT, ORDERED);
            return;
        }
        System.out.printf(BOTTOM_LINE_FORMAT, NOT_ORDERED);
    }

    public static void printMenus(final List<Menu> menus) {
        for (final Menu menu : menus) {
            System.out.println(menu);
        }
}

    public static void printOrders(Menu menu) {
            System.out.println(menu);
    }
}
