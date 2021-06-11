
public class ExcepcionPersonal extends Throwable {

	private final static String MESSAGE = "Exception personal";
	
	public ExcepcionPersonal(String message) {
		super(MESSAGE +": "+message);
	}

}
