package Test;

import Synatax.Extractor;

/**
 * Created by limerickgangster on 9/7/16.
 */
public class Run {
    public static void main (String[] args){
        Extractor extractor = new Extractor();
                extractor.extractSentencesFromText(" Zwei Wochen vor der Parlamentswahl droht einem der renommiertesten Meinungsforschungsinstitute Russlands das Ende. Das Lewada-Zentrum muss sich künftig als \"ausländischer Agent\" ausweisen, teilte das russische Justizministerium mit. Dies sei nach einer \"außerplanmäßigen Kontrolle\" des Zentrums beschlossen worden, hieß es in der offiziellen Stellungnahme des Ministeriums. Was genau bei dieser Kontrolle festgestellt wurde, kommentierte das Ministerium nicht. \n" +
                        "Derzeit ist die Website von Lewada nicht zu erreichen. In einer Erklärung des Direktors Lew Gudkow heißt es die Gründen des Aussetzens der Seite lägen \"außerhalb der Kontrolle\" des Instituts.\n" +
                        "\n");
    }
}
