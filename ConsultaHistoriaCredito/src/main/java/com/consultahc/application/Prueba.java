package com.consultahc.application;

import java.io.StringReader;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import com.consultahc.infraestructure.ws.HCServiceImpl2Proxy;

public class Prueba {

	public static void main(String[] args) {
		try {
//Pruebas7
			HCServiceImpl2Proxy ws = new HCServiceImpl2Proxy();

			String prueba = "<?xml version='1.0' encoding='UTF-8'?> "
			+ "<Solicitud>"
			+ "<Solicitud  tipoIdentificacion='1' identificacion='1019017905' primerApellido='ESPINDOLA' producto='64' clave='78VAT' usuario='1128418874' >"
			+ "</Solicitud>"+"</Solicitud>";

			// + "<Parametros>"
			// + "<Parametro tipo='T' nombre='STRAID' valor='1550' />"
			// +
			// "<Parametro tipo='T' nombre='STRNAM' valor='Billing_Strategy' />"
			// +
			// "<Parametro tipo='A' nombre='facturarAciertaCod' valor='true' /> "
			// +
			// "<Parametro tipo='B' nombre='facturarQuantoMinimoCod' valor='true' />"
			// +
			// "<Parametro tipo='C' nombre='facturarQuantoMaximoCod' valor='true' />"
			// + "<Parametro tipo='R' nombre='_edad' valor='30' /> "
			// + "</Parametros>"

			String xmlRespuesta = ws.consultarHC2(prueba);

			System.out.print(xmlRespuesta);
			Document document = new SAXReader().read(new StringReader(xmlRespuesta));
			 List<Element> lisElementos = document.selectNodes("/Informes/Informe" );
			for(Element a:lisElementos){
			System.out.println(a.getName());
			}
			
			 List<Attribute> lisAttribute =document.selectNodes("//Informe/@fechaConsulta" );
			 for(Attribute a: lisAttribute ){
			 System.out.println(a.getText());
			 }
			
			 Element elemento = (Element)document.selectSingleNode("/Informes/Informe");
			 System.out.println(elemento.getName());
			
			 Attribute attribute =(Attribute)document.selectSingleNode("//Informe/NaturalNacional/@nombreCompleto");
			 System.out.println(attribute.getText());
			
			
			 System.out.println(document.asXML());

		} catch (Exception ex) {

		}
	}

}
