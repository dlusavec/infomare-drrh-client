package hr.infomare.drrh.pomocni;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ErrorResponse;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.Error;

public class PomocnaError {

	public static String getErrorMessage(Exception e) {
		Throwable throwable = e.getCause();
		if (throwable != null) {
			StringBuilder result = new StringBuilder(" ");
			String novaLinija = System.getProperty("line.separator");
			// result.append(NEW_LINE);
			result.append(throwable.toString());
			result.append(novaLinija);
			for (StackTraceElement element : throwable.getStackTrace()) {
				result.append(element);
				result.append(novaLinija);
			}
			return result.toString();
		} else {
			return e.getMessage();
		}

	}

	public static ErrorResponse getErrorResponse(String target, Exception e) {
		String errorStack = StringUtils.trimToEmpty(getErrorMessage(e));
		if (errorStack.length() > 2000) {
			errorStack = errorStack.substring(0, 2000);
		}
		ErrorResponse errorResponse = new ErrorResponse();
		List<Error> listaError = new ArrayList<Error>();
		Error error = new Error();
		error.setTarget(target);
		error.setValue(" ");
		error.setErrorCode("TEHNIKA_JE_ZAKAZALA");
		error.setDescription(errorStack);
		listaError.add(error);
		errorResponse.getError().addAll(listaError);
		return errorResponse;
	}
}