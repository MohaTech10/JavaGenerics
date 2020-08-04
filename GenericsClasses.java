class GenericsClasses<T, E> {
	public T z;

	// some important terms: 
	/* 
		1 - <T> this is called type parameter 
		2 - class ClassName<T> this is called either generic class or 
			=> Parameterized class
		3- a parameterized class could have multiple type parameters
	*/

	public void get(T one_param, E sec_param) {
		System.out.println(one_param ); 
		System.out.println(sec_param); 
	}




}