package presenter;

/**
 * @author Gustavo Levandowski
 * @version 1.0
 */
public interface InteractionViewListener {

    String openDialogs(String message, boolean isNumber);

    String checkResult(String number, String returnConversion);
}
