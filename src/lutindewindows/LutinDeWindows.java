/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lutindewindows;

/**
 *
 * @author sebastien-javary
 */
public class LutinDeWindows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Repertoire racine = new Repertoire("D");
        Repertoire media = new Repertoire("Multimedia");
        Repertoire doc = new Repertoire("Documents");
        Repertoire photo = new Repertoire("Photos");
        Repertoire vids = new Repertoire("Videos");
        Repertoire img = new Repertoire("Images");
        Repertoire pic = new Repertoire("Pictures");
        Repertoire douze = new Repertoire("2012");
        Repertoire vingt = new Repertoire("2020");
        Repertoire web = new Repertoire("web");
        Repertoire zoo = new Repertoire("Animaux");
        Repertoire dog = new Repertoire("Chiens");

        racine.rep.add(media);
        racine.rep.add(doc);
        media.rep.add(img);
        media.rep.add(vids);
        img.rep.add(photo);
        img.rep.add(pic);
        photo.rep.add(douze);
        photo.rep.add(vingt);
        pic.rep.add(web);
        web.rep.add(zoo);
        zoo.rep.add(dog);

        doc.rep.add(new Repertoire("Word"));
        doc.rep.add(new Repertoire("Excel"));
        doc.rep.add(new Repertoire("Facture"));
        vids.rep.add(new Repertoire("Films"));
        vids.rep.add(new Repertoire("Animes"));
        douze.rep.add(new Repertoire("01"));
        douze.rep.add(new Repertoire("02"));
        vingt.rep.add(new Repertoire("01"));
        vingt.rep.add(new Repertoire("12"));
        web.rep.add(new Repertoire("Hentai"));
        zoo.rep.add(new Repertoire("Chats"));
        dog.rep.add(new Repertoire("Poils long"));
        dog.rep.add(new Repertoire("Poils court"));
        // print arborescence
        System.out.println(racine.nom + ":");
        for (Repertoire r0 : racine.rep) {
            System.out.println("\t" + r0.nom);
            for (Repertoire r1 : r0.rep) {
                System.out.println("\t\t" + r1.nom);
                for (Repertoire r2 : r1.rep) {
                    System.out.println("\t\t\t" + r2.nom);
                    for (Repertoire r3 : r2.rep) {
                        System.out.println("\t\t\t\t" + r3.nom);
                        for (Repertoire r4 : r3.rep) {
                            System.out.println("\t\t\t\t\t" + r4.nom);
                            for (Repertoire r5 : r4.rep) {
                                System.out.println("\t\t\t\t\t\t" + r5.nom);
                                for (Repertoire r6 : r5.rep) {
                                    System.out.println("\t\t\t\t\t\t\t" + r6.nom);
                                }
                            }
                        }
                    }
                }
            }
        }
//        racine.addChildren(doc);
//        doc.addChildren(img);
//        racine.addChildren(media);
//        media.addChildren(excel);
//        media.addChildren(word);
//        media.addChildren(fac);
//        racine.afficherNom();
    }
}
