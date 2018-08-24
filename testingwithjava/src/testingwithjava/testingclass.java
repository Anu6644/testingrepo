package testingwithjava;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tivo.helloworld;

public class testingclass {
		helloworld h = new helloworld();
		String result = h.str;
		
		
		@Test
		public void test() {
		    
		    String originalText = "Hello";
		    AssertJUnit.assertEquals(originalText, result);

		}
		
	}

