/**
 * This interface will simulate as if the BaseRate was coming
 * from an external API.
 * 
 * @author Anderson Cossul
 *
 */
public interface IBaseRate {
	default double getBaseRate() {
		return 2.5;
	}
}
