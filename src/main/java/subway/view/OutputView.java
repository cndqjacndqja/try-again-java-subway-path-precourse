package subway.view;

public class OutputView {
	public static void printMainScreen() {
		System.out.println("## 메인 화면");
		System.out.println("1. 경로 조회");
		System.out.println("Q. 종료");
		printEmptyLine();
	}

	public static void printShortestRouteScreen() {
		System.out.println("## 경로 기준");
		System.out.println("1. 최단 거리");
		System.out.println("2. 최소 시간");
		System.out.println("B. 돌아가기");
		printEmptyLine();
	}

	private static void printEmptyLine() {
		System.out.println();
	}
}
