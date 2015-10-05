//Definició del package
package cat.iesjoaquimmir.myapp.views;

//Declaració d'importacions de classes
import java.util.Random;
import java.util.Date;
import cat.iesjoaquimmir.myapp.entities.A;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;
import static java.lang.Math.E
import static java.lang.Math.PI
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.out;
import static java.lang.System.gc;
import static java.lang.System.exit;

//Declaració de la classe
public class Application{

	//Definición de mètode main
	public static void main(String[] args){
	new A();
	out.println("Hello world from Java!");
	//Examples d'us d'atributs estàtics
	out.println("PI = " + PI);
	out.println("E = " + E);
	//Examples d'us de mètodes estàtics
	out.println("sqrt(4) = " + sqrt(4));
	out.println("pow(2,3) = " + pow(2,3));
	out.println("max(2,3) = " + max(2,3));
	out.println("min(2,3) = " + min(2,3));
	
	out.println("StringUtils: " + StringUtils.capatilaze("Andrea Angulo"));
	out.println("WordUtils: " + WordUtils.capatalize("Andrea Angulo"));	
	}
}
