class Gen <T> {
	//Объявление переменной обобщенного типа
	T ob;
	//Определение конструктора, в качестве параметра указываем объект обобщенного типа
	Gen (T o) {
		ob = o;
	}
	//Метод, возвращающий объект
	T getOb () {
		return ob;
	}
	//Метод, получающий информацию об имени типа
	void showType () {
		System.out.println("Тип Т: " + ob.getClass().getName());
	}
}

class TwoGen<T,V>{
	//Объявление переменных обобщенного типа
	T ob1;
	V ob2;
	//Определение конструктора, в качестве параметров указываем объекты обобщенных типов
	TwoGen (T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	//Методы, возвращающие объекты
	T getOb1 () {
		return ob1;
	}

	V getOb2 () {
		return ob2;
	}
	//Методы, получающие информацию об имени типов
	void showTypes () {
		System.out.println("Тип Т: " + ob1.getClass().getName());	
		System.out.println("Тип V: " + ob2.getClass().getName());
	}
}

class Pr001 {
	public static void main (String [] args) {
		
		//Создаем ссылочные переменные на объект
		TwoGen<Integer, String> tgOb;
		//Присваиваем ссылку на новый объект
		tgOb = new TwoGen<Integer, String>(88, "Обобщения");
		//Выводим информацию о типе объекта
		tgOb.showTypes();
		//Присваиваем целой переменной значение, хранящееся в первом объекте
		int v = tgOb.getOb1();
		System.out.println("Значение: " + v);

		System.out.println();
		//Создаем ссылочную переменную на объект типа Integer и присваиваем ссылку на новый объект
		Gen<String> strOb = new Gen<String>("Строка обобщённого класса");
		//Выводим информацию о типе объекта
		strOb.showType();
		//Присваиваем строковой переменной значение, хранящиеся во втором объекте
		String str = tgOb.getOb2();
		System.out.println("Значение в переменной str: " + str);
	} 
}
