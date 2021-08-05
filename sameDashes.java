public class sameDashes{
public static boolean sameDashes(String str1, String str2) {
	int i1 = str1.indexOf('-');
	int i2 = str2.indexOf('-');
	while (i1 != -1 || i2 != -1) {
	    if (i1 != i2) {
		return false;
	    }
	    str1 = str1.substring(i1 + 1, str1.length());
	    str2 = str2.substring(i2 + 1, str2.length());
	    i1 = str1.indexOf('-');
	    i2 = str2.indexOf('-');
	}
	return true;
    }

    public static boolean sameDashes(String str1, String str2) {
	for (int i = 0; i < str1.length(); i++) {
	    if (str1.charAt(i) == '-') {
		if (i > str2.length() || str2.charAt(i) != '-') {
		    return false;
		}
	    }
	}
	for (int i = 0; i < str2.length(); i++) {
	    if (str2.charAt(i) == '-') {
		if (i > str1.length() || str1.charAt(i) != '-') {
		    return false;
		}
	    }
	}
	return true;
    }
  }