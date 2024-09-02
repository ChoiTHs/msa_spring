package ex05.aop;

public class CalcImpl implements ICalc {

	@Override
	public int add(int x, int y) {
		// 보조 관심사 부분
		int result = x + y;
		// 보조 관심사 부분
		System.out.println("add 주 관심사");
		return result;
	}

	@Override
	public int mul(int x, int y) {
		// 보조 관심사 부분
		int result = x * y;
		// 보조 관심사 부분
		System.out.println("mul 주 관심사");
		return result;
	}

	@Override
	public int sub(int x, int y, int z) {
		if (y > x) {
			throw new IllegalArgumentException("y값이 x값 보다 큽니다");
		}
		System.out.println("aa......");
		
		// 보조 관심사 부분
		int result = x - y - z;
		// 보조 관심사 부분
		System.out.println("sub 주 관심사");
		return result;
	}
	

}
