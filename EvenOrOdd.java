public class EvenOrOdd {
    String evenOrOdd(int num) {
    	
    	if (num % 2 == 0)
    	{
    		String result = "Even";
    		return result;
    	}
    	else
    	{
    		String result = "Odd";
    		return result;
    	}
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("��� : " + evenOrOdd.evenOrOdd(3));
        System.out.println("��� : " + evenOrOdd.evenOrOdd(2));
    }
}