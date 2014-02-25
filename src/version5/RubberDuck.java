package version5;

    public class RubberDuck implements QuackingGroup {
        private QuackBehavior qb;
	
	public RubberDuck(QuackBehavior qb) {
		this.qb = qb;
	}
        
        @Override
        public void setQuackBehavior(QuackBehavior qb){
            this.qb = qb;
        }
        
        @Override
        public void quack(){
            qb.quack();
        }
	
	public void display() {
		System.out.println("I'm a Rubber Duck");
	}
	

}
