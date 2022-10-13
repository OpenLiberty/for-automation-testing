import java.util.List;

public class NewsOfTheWorld {

	private final List<String> goodNews;
	private final List<String> badNews;
	private final boolean happy;
	private final boolean maddening;
	private final boolean depressing;
	private final boolean neutral;

	public NewsOfTheWorld(List<String> goodNews, List<String> badNews, boolean happy, boolean maddening, boolean depressing, boolean neutral) {
		this.goodNews = goodNews;
		this.badNews = badNews;
		this.happy = happy;
		this.maddening = maddening;
		this.depressing = depressing;
		this.neutral = neutral;
	}

	public List<String> getGoodNews() {
		return goodNews;
	}

	public List<String> getBadNews() {
		return badNews;
	}

	public boolean isHappy() {
		return happy;
	}

	public boolean isMaddening() {
		return maddening;
	}

	public boolean isDepressing() {
		return depressing;
	}

	public boolean isNeutral() {
		return neutral;
	}
}