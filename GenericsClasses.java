class GenericsClasses<T> {
	public T z;

	// Rule => if your class is generic and you have a method that takes 
	// T param then the param should be the same class datatype for 
	// consistency ! i.e: 
	// class<T> the same datatype sent to the class 
	// should be passed as args as well if it takes just a param 
	public T justPrint(T aaa) {
		return  aaa;
	}


	// !! -- HOWEVER -- !! if the method just returns T type no param 
	// then this method could return any datatype with type casting must

	public T demoMethod() {
		return (T) new Person("Jhon");  // any datatype
	}


}