package day16_forLoop;

public class C03_soru2 {

	public static void main(String[] args) {
		// 2.soru) 10 ile 30 arasindaki sayilari aralarinda virgul olarak
		// ayni satira yazdir

		for (int i = 10; i <= 30; i++) {
			if (i == 30) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}

		}
		System.out.println();// bos syso sadece alt satira gecmek icin kullanilir }

		for (int i = 10; i <= 29; i++) {
			System.out.print(i + ", ");
		}

		System.out.println(30);
	}

}
