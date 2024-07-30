class SubjectsRunner
{
	public static void science(String biology, String chemistry, String physics)
	{
		System.out.println("method with three parameter");
		System.out.println("Biology is the study of living things: "+biology);
		System.out.println("The branch of science that deals with the properties of elements: "+chemistry);
		System.out.println("Physics is the scientific study that governs the physical world: "+physics);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	
	public static void social(String history, String civics, String geography, String poloticalScience, String businessStudies)
	{
		System.out.println("method with five parameter");
		System.out.println("history: "+history);
		System.out.println("civics: "+civics);
		System.out.println("geography: "+geography);
		System.out.println("poloticalScience: "+poloticalScience);
		System.out.println("businessStudies: "+businessStudies);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	
	public static void maths(String arithmatic, String geometry, String algebra)
	{
		System.out.println("method with three parameter");
		System.out.println("arithmatic: "+arithmatic);
		System.out.println("geometry: "+geometry);
		System.out.println("algebra: "+algebra);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	
	public static void english(String stories, String grammer)
	{
		System.out.println("method with two parameter");
		System.out.println("stories: "+stories);
		System.out.println("grammer: "+grammer);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	public static void stats(String stats)
	{
		System.out.println("method with one parameter");
		System.out.println("stats: "+stats);
	}
	
	public static void main(String[] args)
	{
		science("humans","molecules","motion");
		social("kings","citizenship","geographicArea","politicalThings","study of business");
		maths("calculations","cubes prism","algebraic expressions");
		english("grandma climbes a tree","nouns");
		stats("mean, median,mode");
	}
}