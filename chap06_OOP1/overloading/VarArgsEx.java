package chap06_OOP1.overloading;

class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = { "100", "200", "300" };

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
        System.out.println("["+concatenate(",", new String[0])+"]");
        System.out.println("["+concatenate(",")+"]");

    }

    static String concatenate(String tmp, String... args) { // tmp + 가변인자(str)
        String result = "";

        for(String str : args) {    // 매개변수 반복
            result += str + tmp;
        }

        return result;
    }

/*
	static String concatenate(String... args) {
		return concatenate("",args);
	}
*/
} // class