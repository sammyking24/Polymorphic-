/*One of the main aspect of polymor... is that you can put object in array
and you can loop through that array and call the same method for object*/



class Apples{
	public static void main(String[] args) {
		
		Animal[] thelist = new Animal[2];
		Dog d = new Dog();
		Fish f = new Fish();
		
		
		thelist[0]= d;
		thelist[1]= f;
		
		/* hence for-loop is a special_loop to loop through an array */
		
		for(Animal x: thelist) {
			x.noise();
		}
		
	}

}
