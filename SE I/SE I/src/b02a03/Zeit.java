package b02a03;

public class Zeit {

	int h; 		/* Stunden */
	int min; 	/* Minuten */

	public Zeit(int h, int min) {
		this.h = h + (min / 60);
		this.min = min % 60;
	}

	public int stunden() {
		return h;
	}

	public int minuten() {
		return min;
	}

	void add(Zeit other) {
		int tempMin = this.min + other.min;
		
		this.h += other.h + (tempMin / 60);
		this.min = tempMin % 60;	
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d", h, min);
	}

	@Override
	public boolean equals(Object other) {
		if(other.getClass() == Zeit.class) {
			return equalsZeit((Zeit) other);
		} else {
			return false;
		}
	}
	
	private boolean equalsZeit(Zeit other) {
		if(this.h == other.h && this.min == other.min) {
			return true;
		} else {
			return false;
		}
	}

}
