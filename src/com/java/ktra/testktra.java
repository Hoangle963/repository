package com.java.ktra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testktra {




	    @Test
	    public void TC001() {
	        assertTrue(ktra.isValidStudentRecord("Nguyen Van A", "2000-01-01", "nguyenvana@example.com", "Nam"));
	    }

	    @Test
	    public void TC002() {
	        assertFalse(ktra.isValidStudentRecord("", "2000-01-01", "nguyenvana@example.com", "Nam"));
	    }

	    @Test
	    public void TC003() {
	        assertFalse(ktra.isValidStudentRecord(null, "2000-01-01", "nguyenvana@example.com", "Nam"));
	    }

	    @Test
	    public void TC004() {
	        assertFalse(ktra.isValidStudentRecord("Nguyen Van A", "01-01-2000", "nguyenvana@example.com", "Nam"));
	    }

	    @Test
	    public void TC005() {
	        assertFalse(ktra.isValidStudentRecord("Nguyen Van A", null, "nguyenvana@example.com", "Nam"));
	    }

	    @Test
	    public void TC006() {
	        assertFalse(ktra.isValidStudentRecord("Nguyen Van A", "2000-01-01", "invalidemail", "Nam"));
	    }

	    @Test
	    public void TC007() {
	        assertFalse(ktra.isValidStudentRecord("Nguyen Van A", "2000-01-01", null, "Nam"));
	    }

	    @Test
	    public void TC008() {
	        assertFalse(ktra.isValidStudentRecord("Nguyen Van A", "2000-01-01", "nguyenvana@example.com", "Unknown"));
	    }

	    @Test
	    public void TC009() {
	        assertFalse(ktra.isValidStudentRecord("Nguyen Van A", "2000-01-01", "nguyenvana@example.com", null));
	    }
	}
