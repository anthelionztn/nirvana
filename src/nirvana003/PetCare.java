package nirvana003;

public interface PetCare {
	public void feed();
	public void play();
}

class Worker implements PetCare{
	public void feed(){
		System.out.println("worker is feeding");
	}
	public void play(){
		System.out.println("worker is playing with the pet");
	}
}

class Farmer implements PetCare{
	public void feed(){
		System.out.println("farmer is feeding");
	}
	public void play(){
		System.out.println("farmer is playing with the pet");
	}
}

class Test{
	public static void main(String[] args){
		Worker w = new Worker();
		Farmer f = new Farmer();
		w.feed();
		w.play();
		f.feed();
		f.play();
	}
	
}