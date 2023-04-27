package bw.co.roguesystems.bomaid.rogueedibomaid;

import java.io.StringWriter;
import java.util.Base64;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

import bw.co.roguesystems.edi.bomaid.ClaimHeader;
import bw.co.roguesystems.edi.bomaid.ObjectFactory;
import jakarta.xml.bind.JAXB;


// @SpringBootApplication
public class RogueediBomaidApplication {//implements CommandLineRunner {

	public static void main(String[] args) {
		// SpringApplication.run(RogueediBomaidApplication.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception {
	// 	ObjectFactory factory = new ObjectFactory();
	// 	ClaimHeader header = factory.createClaimHeader();
	// 	header.getClaims().add(factory.createClaimHeaderClaims());
	// 	// header.getClaims().get(0).get

	// 	header.setBatchNum(865 + "");
	// 	header.setNumTrans(3);
	// 	header.setScheme("BOMAID");
	// 	header.setTradePart("9914271");
	// 	System.out.println(header);

	// 	StringWriter sw = new StringWriter();
	// 	JAXB.marshal(header, sw);
	// 	String xmlString = sw.toString();
	// 	System.out.println(xmlString);
	// }

}
