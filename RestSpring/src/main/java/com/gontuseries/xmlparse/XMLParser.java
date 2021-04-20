/*
 * package com.gontuseries.xmlparse;
 * 
 * import java.io.File; import java.io.IOException;
 * 
 * import javax.xml.parsers.DocumentBuilder; import
 * javax.xml.parsers.DocumentBuilderFactory; import
 * javax.xml.parsers.ParserConfigurationException;
 * 
 * import org.w3c.dom.Document; import org.w3c.dom.Element; import
 * org.w3c.dom.Node; import org.w3c.dom.NodeList; import
 * org.xml.sax.SAXException;
 * 
 * public class XMLParser {
 * 
 * public static void main(String[] args) {
 * 
 * // Get the document builder DocumentBuilderFactory builderFactory =
 * DocumentBuilderFactory.newInstance();
 * 
 * try {
 * 
 * DocumentBuilder builder = builderFactory.newDocumentBuilder();
 * 
 * // Get Document Document document = builder .parse(new
 * File("classpath:src/main/resources/laptops.xml"));
 * 
 * 
 * // Normalize the xml structure document.getDocumentElement().normalize();
 * 
 * // Get all elements by Tag name NodeList laptopList =
 * document.getElementsByTagName("laptop");
 * 
 * for (int i = 0; i < laptopList.getLength(); i++) { Node laptop =
 * laptopList.item(i);
 * 
 * if (laptop.getNodeType() == Node.ELEMENT_NODE) {
 * 
 * Element laptopElement = (Element) laptop; System.out.println("Laptop Name: "
 * + laptopElement.getAttribute("name"));
 * 
 * NodeList laptopDetails = laptop.getChildNodes();
 * 
 * for (int j = 0; j < laptopDetails.getLength(); j++) { Node details =
 * laptopDetails.item(j);
 * 
 * if (details.getNodeType() == Node.ELEMENT_NODE) { Element detailElement =
 * (Element) details; System.out.println("  " + detailElement.getTagName()); } }
 * } }
 * 
 * } catch (ParserConfigurationException e1) { e1.printStackTrace(); } catch
 * (SAXException e) { e.printStackTrace(); } catch (IOException e) {
 * e.printStackTrace(); }
 * 
 * } }
 */