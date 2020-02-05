package edu.kis.vh.nursery;

// "alt + ←" and "alt + →" helps to move between places you were, e.g. files
// (like back / forward)

public class HanoiRhymer extends defaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
