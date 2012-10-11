
public enum Criterion {
	BESTGRAPHICS, BESTIDEA, MOSTUSEFUL; 
	
	public String toString() {
		String s = "";
		switch(this) {
			case BESTGRAPHICS: 
				s = "Best Graphics";
			case BESTIDEA: 
				s = "Best idea";
			case MOSTUSEFUL: 
				s = "Most Useful";
		}
		return s;
	}
}
