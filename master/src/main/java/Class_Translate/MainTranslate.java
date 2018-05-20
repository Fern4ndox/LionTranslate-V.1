package Class_Translate;

import java.io.IOException;
import java.io.*;

import com.darkprograms.speech.translator.GoogleTranslate;

public class MainTranslate {
	public static String palabrita = null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;

	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\Users\\Fern4ndox\\workspace\\Translate_ProjectCompi\\test\\test.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null)
	            palabrita = linea;
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		System.out.println(GoogleTranslate.translate("es", palabrita));

	}

}
