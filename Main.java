class Main {

	public static void main(String[] args) {

		// so here when insatntiate a reference variable we have to pass 
		// the datatype so that all methods and attributes of the class
		// will have the passed data type 
		GenericsClasses<Integer> instance = new GenericsClasses<Integer>();
		instance.z = 100;
		System.out.println(instance.z.getClass());

		/* that gives power so that each object could have totally different
			attrs and methods datatype. i.e => down below
		*/


		GenericsClasses<String> instance2 = new GenericsClasses<String>();
		instance2.z = "text goes here ...";
		System.out.println(instance2.z.getClass());

		// however it's really useful to make things dynamic as well as 
		// having one methods that can take care of various of data type
		


	}
	
}