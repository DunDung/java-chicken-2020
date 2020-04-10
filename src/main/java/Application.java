import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
import view.InputView;
import view.OutputView;

public class Application {
	// TODO 구현 진행
	public static void main(String[] args) {
		OutputView.printTables(TableRepository.tables());
		Table table = TableRepository.fromWithNumber(InputView.inputTableNumber());

		OutputView.printMenus(MenuRepository.menus());
	}

	public static void order() {

	}
}
