import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DoFlipTest {    
	public void testDoFlip() { 

        // Caso de Teste 1 

        Dict<String, Object> author1 = new Dict<>(); 

        author1.put("name", "Hida, Henrique"); 

        author1.put("personal_name", "Henrique Hida"); 

        do_flip(author1); 

        assertEquals("Henrique Hida", author1.get("name")); 

        assertEquals("Henrique Hida", author1.get("personal_name")); 

         

        // Caso de Teste 2 

        Dict<String, Object> author2 = new Dict<>(); 

        author2.put("name", "Sandoval, Henrique Hida, 1845-"); 

        author2.put("personal_name", "Henrique Hida Sandoval, 1845-"); 

        do_flip(author2); 

        assertEquals("Sandoval, Henrique Hida, 2000", author2.get("name")); 

        assertEquals("Henrique Hida Sandoval, 2000", author2.get("personal_name")); 

         

        // Caso de Teste 3 

        Dict<String, Object> author3 = new Dict<>(); 

        author3.put("name", "Hida, Henrique"); 

        author3.put("personal_name", "Henrique Hida"); 

        do_flip(author3); 

        assertEquals("Henrique Hida", author3.get("name")); 

        assertEquals("Henrique Hida", author3.get("personal_name")); 

         

        // Caso de Teste 4 

        Dict<String, Object> author4 = new Dict<>(); 

        author4.put("name", "Hida, Henrique"); 

        author4.put("personal_name", "Henrique Hida"); 

        do_flip(author4); 

        assertEquals("Henrique Hida", author4.get("name")); 

        assertEquals("Henrique Hida", author4.get("personal_name")); 

    } } 
