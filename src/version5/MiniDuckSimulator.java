package version5;

public class MiniDuckSimulator {

	public static void main(String[] args) {
            // Ducks that can Quack
            QuackingGroup[] ducks = {
                new MallardDuck(new Quack(), new FlyWithWings()),
                new RubberDuck(new Squeak())
            };
                    
            for(QuackingGroup duck : ducks) {
                duck.quack();
                duck.display();
            }              
            
            // Ducks that can Fly
            FlyingGroup[] ducks2 = {
                new MallardDuck(new Quack(), new FlyWithWings()),
                //new MuteMallardDuck(new FlyWithWings())
            };
                    
            for(FlyingGroup duck : ducks2) {
                duck.fly();
                duck.display();
            }   
            
            // Ducks that can Fly and Quack
            FlyAndQuackGroup[] ducks3 = {
                new MallardDuck(new Quack(), new FlyWithWings()),
                //new RedHeadedDuck(new Quack(), new FlyWithWings())
            };
                    
            for(FlyAndQuackGroup duck : ducks3) {
                duck.fly();
                duck.quack();
                duck.display();
            }   
            
            // Ducks that are just, well Ducks (can display)
            DuckGroup[] ducks4 = {
                new MallardDuck(new Quack(), new FlyWithWings()),
                //new RedHeadedDuck(new Quack(), new FlyWithWings()),
                new RubberDuck(new Squeak()),
                //new MuteMallardDuck(new FlyRocketPowered()),
                new ModelDuck()
            };
                    
            for(DuckGroup duck : ducks4) {
                duck.display();
            }   
            
	}

}
