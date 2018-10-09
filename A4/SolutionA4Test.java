import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class SolutionA4Test {

	@Test
	public void testDuckSwim() {
		SwimmingAnimal duck = new Duck();
		
		Assert.assertEquals("I am swimming", duck.swim());
	}
	
	@Test
	public void testDuckSing() {
		Animal duck = new Duck();
		
		Assert.assertEquals("Quack, Quack", duck.sing());
		Assert.assertEquals("I am walking", duck.walk());
	}
	
	@Test
	public void testChicken() {
		Animal chicken = new Chicken(false);
		
		Assert.assertEquals("Cluck, Cluck", chicken.sing());
		Assert.assertEquals("I am walking", chicken.walk());
	}

	@Test
	public void testChickenFlying() {
		FlyingAnimal chicken = new Chicken(false);
		
		Assert.assertEquals("Wings clipped", chicken.fly());
	}
	
	@Test
	public void testRooster() {
		Rooster rooster = new Rooster();
		
		Assert.assertEquals("Cock-a-doodle-do", rooster.sing());
	}
	
	@Test
	public void testParrots() {
		Parrot parrot = new Parrot(new Dog());
		Assert.assertEquals("Woof, woof", parrot.sing());
		
		parrot = new Parrot(new Cat());
		Assert.assertEquals("Meow", parrot.sing());
		
		parrot = new Parrot(new Rooster());
		Assert.assertEquals("Cock-a-doodle-do", parrot.sing());
		
		parrot = new Parrot(new Duck());
		Assert.assertEquals("Quack, Quack", parrot.sing());
	}
	
}
