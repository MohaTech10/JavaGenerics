class Main {

	public static void main(String[] args) {
		GenericsClasses<Float> instance = new GenericsClasses<Float>();

		System.out.println(instance.justPrint(122.1f));
		System.out.println(instance.demoMethod());
	}
	
}