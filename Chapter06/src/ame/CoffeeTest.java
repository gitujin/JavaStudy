package ame;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person kim = new Person("Kim", 10000);
		StarCoffee starCoffee = new StarCoffee();
		Person lee = new Person("Lee", 20000);
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarCoffee(starCoffee, 4000);
		lee.buyBeanCoffee(beanCoffee, 4500);
	}

}
