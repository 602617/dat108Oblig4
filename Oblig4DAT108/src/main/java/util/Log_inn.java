package util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Log_inn {
	   private static int MAX_INTERACTIVE_INTERVAL = 10000;

	    public static void loggUtBruker(HttpSession session) {
	        session.invalidate();
	    }

	    public static void loggInnBruker(HttpServletRequest request, String passord) {
	        loggUtBruker(request.getSession());
	        HttpSession session = request.getSession();
	        session.setMaxInactiveInterval(MAX_INTERACTIVE_INTERVAL);
	        session.setAttribute("passord", passord);
	    }

	    public static boolean erBrukerInnlogget(HttpSession session) {
	        return session != null && session.getAttribute("passord") != null;
	    }

	}

