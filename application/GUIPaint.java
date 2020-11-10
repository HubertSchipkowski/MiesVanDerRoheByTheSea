package application;

import javafx.application.Application;

import javafx.stage.Stage;

import javafx.scene.Group;

import javafx.scene.Scene;

import javafx.scene.layout.Pane;


import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.paint.CycleMethod;

/**
 * FileName	: GUIPaint.java
 * Description : A little bit of code painting with JavaFX

 * @author      Hubert Schipkowski (schipkowski@sincerelycontent.com)
 *
 *
 * @version     1.0, 15.06.2020
 *
 */

public class GUIPaint extends Application {

	// Coordinate Data:

	public double[] kHimmel = new double[] {14, 14, 772, 256};
	public double[] kMeer = new double[] {14, 270, 772, 15};
	public double[] kSegelschiff1 = new double[] {94, 256, 94, 282, 82, 282};
	public double[] kSegelschiff2 = new double[] {106, 257, 106, 277, 97, 277};
	public double[] kSegelschiff3 = new double[] {77, 260, 77, 274, 70, 274};
	public double[] kKueste = new double[] {14, 285, 772, 25};
	public double[] kRasen = new double[] {14, 310, 772, 76};
	public double[] kHausSchatten = new double[] {176, 328, 500, 328, 488, 318, 534, 318, 550, 298, 620, 298, 600, 310, 602, 318, 754, 316, 766, 324, 698, 324, 730, 334, 180, 336};
	public double[] kHausVerandaSenkrecht1 = new double[] {512, 312, 2, 6};
	public double[] kHausVerandaSenkrecht2 = new double[] {626, 312, 2, 6};
	public double[] kHausVerandaSenkrecht3 = new double[] {740, 312, 2, 6};
	public double[] kHausVerandaWaagerecht1 = new double[] {488, 306, 488, 312, 486, 312, 486, 308};
	public double[] kHausVerandaWaagerecht2 = new double[] {488, 306, 262, 6};
	public double[] kHausSenkrechtHintenUnten1 = new double[] {248, 300, 4, 28};
	public double[] kHausSenkrechtHintenUnten2 = new double[] {346, 300, 14, 32};
	public double[] kHausSenkrechtHintenUnten3 = new double[] {384, 300, 4, 28};
	public double[] kHausSenkrechtHintenUnten4 = new double[] {520, 300, 4, 28};
	public double[] kHausSenkrechtHintenUnten5 = new double[] {654, 300, 4, 28};
	public double[] kHausSenkrechtHintenOben1 = new double[] {218, 236, 1, 56};
	public double[] kHausSenkrechtHintenOben2 = new double[] {488, 236, 1, 56};
	public double[] kHausSenkrechtHintenOben3 = new double[] {526, 236, 1, 56};
	public double[] kHausSenkrechtHintenOben4 = new double[] {554, 236, 1, 56};
	public double[] kHausSenkrechtHintenOben5 = new double[] {654, 236, 4, 56};
	public double[] kDeckeLinks = new double[] {236, 216, 236, 236, 218, 236, 154, 216};
	public double[] kDeckeRechts = new double[] {754, 216, 690, 236, 454, 236, 454, 216};
	public double[] kFenster1 = new double[] {154, 216, 82, 76};
	public double[] kFenster2 = new double[] {454, 216, 82, 76};
	public double[] kFenster3 = new double[] {542, 216, 38, 76};
	public double[] kPrivatraum = new double[] {236, 216, 216, 76};
	public double[] kHausSenkrechtVorn2a = new double[] {152, 216, 2, 76};
	public double[] kHausSenkrechtVorn2b = new double[] {282, 216, 2, 76};
	public double[] kHausSenkrechtVorn2c = new double[] {452, 216, 2, 76};
	public double[] kHausSenkrechtVorn2d = new double[] {580, 216, 2, 76};
	public double[] kHausWaagerechtVorn1 = new double[] {152, 292, 602, 8};
	public double[] kHausWaagerechtVorn2 = new double[] {152, 208, 602, 8};
	public double[] kHausWaagerechtVorn3 = new double[] {150, 204, 606, 4};
	public double[] kHausSenkrechtVorn1a = new double[] {192, 208, 6, 130};
	public double[] kHausSenkrechtVorn1b = new double[] {362, 208, 6, 130};
	public double[] kHausSenkrechtVorn1c = new double[] {536, 208, 6, 130};
	public double[] kHausSenkrechtVorn1d = new double[] {706, 208, 6, 130};
	public double[] kTitel = new double[] {517, 80};


	// Colors


	public Color fHimmelStart = new Color(0, 0.014, 0.864, 1);
	public Color fHimmelEnde = new Color(0.933, 0.910, 0.835, 1);

	public Color fMeerStart = new Color(0.933, 0.910, 0.835, 1);
	public Color fMeerEnde = new Color(0, 0.253, 1, 1);

	public Color fKuesteStart = new Color(0.976, 0.851, 0.878, 1);
	public Color fKuesteEnde = new Color(0.037, 0.374, 0.189, 1);

	public Color fRasenStart = new Color(0.037, 0.374, 0.189, 1);
	public Color fRasenEnde = new Color(0.017, 0.181, 0.090, 1);


	public Color fSegelschiff1 = new Color(1, 1, 1, 1);
	public Color fSegelschiff2 = new Color(0.942, 0.942, 0.942, 1);
	public Color fSegelschiff3 = new Color(0.919, 0.919, 0.919, 1);
	public Color fHausSchatten = new Color(0.015, 0.230, 0.079, 1);
	public Color fHausVerandaSenkrecht1 = new Color(0.202, 0.225, 0.211, 1);
	public Color fHausVerandaSenkrecht2 = new Color(0.202, 0.225, 0.211, 1);
	public Color fHausVerandaSenkrecht3 = new Color(0.202, 0.225, 0.211, 1);
	public Color fHausVerandaWaagerecht1 = new Color(0.466, 0.522, 0.484, 1);
	public Color fHausVerandaWaagerecht2 = new Color(0.318, 0.353, 0.329, 1);
	public Color fHausSenkrechtHintenUnten1 =  new Color(0.239, 0.265, 0.245, 1);
	public Color fHausSenkrechtHintenUnten2 = new Color(0.239, 0.265, 0.245, 1);
	public Color fHausSenkrechtHintenUnten3 = new Color(0.239, 0.265, 0.245, 1);
	public Color fHausSenkrechtHintenUnten4 = new Color(0.239, 0.265, 0.245, 1);
	public Color fHausSenkrechtHintenUnten5 = new Color(0.239, 0.267, 0.247, 1);
	public Color fHausSenkrechtHintenOben1 = new Color(0.404, 0.400, 0.435, 1);
	public Color fHausSenkrechtHintenOben2 = new Color(0.404, 0.400, 0.435, 1);
	public Color fHausSenkrechtHintenOben3 = new Color(0.404, 0.400, 0.435, 1);
	public Color fHausSenkrechtHintenOben4 = new Color(0.404, 0.400, 0.435, 1);
	public Color fHausSenkrechtHintenOben5 = new Color(0.550, 0.545, 0.590, 1);
	public Color fDeckeLinks = new Color(0.404, 0.400, 0.435, 1);
	public Color fDeckeRechts = new Color(0.490, 0.486, 0.526, 1);
	public Color fFenster1 = new Color(0.691, 0.691, 0.691, 0.48);
	public Color fFenster2 = new Color(0.691, 0.691, 0.691, 0.48);
	public Color fFenster3 = new Color(0.691, 0.691, 0.691, 0.48);
	public Color fPrivatraum = new Color(0.604, 0.600, 0.651, 1);
	public Color fHausSenkrechtVorn2a = new Color(0.782, 0.775, 0.840, 1);
	public Color fHausSenkrechtVorn2b = new Color(0.784, 0.776, 0.839, 1);
	public Color fHausSenkrechtVorn2c = new Color(0.782, 0.775, 0.840, 1);
	public Color fHausSenkrechtVorn2d = new Color(0.782, 0.775, 0.840, 1);
	public Color fHausWaagerechtVorn1 = new Color(0.713, 0.707, 0.766, 1);
	public Color fHausWaagerechtVorn2 = new Color(0.728, 0.721, 0.781, 1);
	public Color fHausWaagerechtVorn3 = new Color(0.888, 0.880, 0.953, 1);
	public Color fHausSenkrechtVorn1a = new Color(0.798, 0.791, 0.857, 1);
	public Color fHausSenkrechtVorn1b = new Color(0.798, 0.791, 0.857, 1);
	public Color fHausSenkrechtVorn1c = new Color(0.798, 0.791, 0.857, 1);
	public Color fHausSenkrechtVorn1d = new Color(0.798, 0.791, 0.857, 1);
	public Color fTitel = new Color(0.798, 0.791, 0.857, 1);





    @Override
    public void start(Stage postkarte) {
        try {

        	// UI-Entities:


        	Group director = new Group();
            Scene rahmen = new Scene(director,800,400);
            Pane bild = new Pane();

            Rectangle himmel = new Rectangle(kHimmel[0], kHimmel[1], kHimmel[2], kHimmel[3]);
            Rectangle meer = new Rectangle(kMeer[0], kMeer[1], kMeer[2], kMeer[3]);
            Polygon segelschiff1 = new Polygon(kSegelschiff1[0], kSegelschiff1[1], kSegelschiff1[2], kSegelschiff1[3], kSegelschiff1[4], kSegelschiff1[5]);
            Polygon segelschiff2 = new Polygon(kSegelschiff2[0], kSegelschiff2[1], kSegelschiff2[2], kSegelschiff2[3], kSegelschiff2[4], kSegelschiff2[5]);
            Polygon segelschiff3 = new Polygon(kSegelschiff3[0], kSegelschiff3[1], kSegelschiff3[2], kSegelschiff3[3], kSegelschiff3[4], kSegelschiff3[5]);
            Rectangle kueste = new Rectangle(kKueste[0], kKueste[1], kKueste[2], kKueste[3]);
            Rectangle rasen = new Rectangle(kRasen[0], kRasen[1], kRasen[2], kRasen[3]);
            Polygon hausSchatten = new Polygon(176, 328, 500, 328, 488, 318, 534, 318, 550, 298, 620, 298, 600, 310, 602, 318, 754, 316, 766, 324, 698, 324, 730, 334, 180, 336);
            Rectangle hausVerandaSenkrecht1 = new Rectangle(kHausVerandaSenkrecht1[0], kHausVerandaSenkrecht1[1], kHausVerandaSenkrecht1[2], kHausVerandaSenkrecht1[3]);
            Rectangle hausVerandaSenkrecht2 = new Rectangle(kHausVerandaSenkrecht2[0], kHausVerandaSenkrecht2[1], kHausVerandaSenkrecht2[2], kHausVerandaSenkrecht2[3]);
            Rectangle hausVerandaSenkrecht3 = new Rectangle(kHausVerandaSenkrecht3[0], kHausVerandaSenkrecht3[1], kHausVerandaSenkrecht3[2], kHausVerandaSenkrecht3[3]);
            Polygon hausVerandaWaagerecht1 = new Polygon(kHausVerandaWaagerecht1[0], kHausVerandaWaagerecht1[1], kHausVerandaWaagerecht1[2], kHausVerandaWaagerecht1[3], kHausVerandaWaagerecht1[4], kHausVerandaWaagerecht1[5], kHausVerandaWaagerecht1[6], kHausVerandaWaagerecht1[7]);
            Rectangle hausVerandaWaagerecht2 = new Rectangle(kHausVerandaWaagerecht2[0], kHausVerandaWaagerecht2[1], kHausVerandaWaagerecht2[2], kHausVerandaWaagerecht2[3]);
            Rectangle hausSenkrechtHintenUnten1 = new Rectangle(kHausSenkrechtHintenUnten1[0], kHausSenkrechtHintenUnten1[1], kHausSenkrechtHintenUnten1[2], kHausSenkrechtHintenUnten1[3]);
            Rectangle hausSenkrechtHintenUnten2 = new Rectangle(kHausSenkrechtHintenUnten2[0], kHausSenkrechtHintenUnten2[1], kHausSenkrechtHintenUnten2[2], kHausSenkrechtHintenUnten2[3]);
            Rectangle hausSenkrechtHintenUnten3 = new Rectangle(kHausSenkrechtHintenUnten3[0], kHausSenkrechtHintenUnten3[1], kHausSenkrechtHintenUnten3[2], kHausSenkrechtHintenUnten3[3]);
            Rectangle hausSenkrechtHintenUnten4 = new Rectangle(kHausSenkrechtHintenUnten4[0], kHausSenkrechtHintenUnten4[1], kHausSenkrechtHintenUnten4[2], kHausSenkrechtHintenUnten4[3]);
            Rectangle hausSenkrechtHintenUnten5 = new Rectangle(kHausSenkrechtHintenUnten5[0], kHausSenkrechtHintenUnten5[1], kHausSenkrechtHintenUnten5[2], kHausSenkrechtHintenUnten5[3]);
            Rectangle hausSenkrechtHintenOben1 = new Rectangle(kHausSenkrechtHintenOben1[0], kHausSenkrechtHintenOben1[1], kHausSenkrechtHintenOben1[2], kHausSenkrechtHintenOben1[3]);
            Rectangle hausSenkrechtHintenOben2 = new Rectangle(kHausSenkrechtHintenOben2[0], kHausSenkrechtHintenOben2[1], kHausSenkrechtHintenOben2[2], kHausSenkrechtHintenOben2[3]);
            Rectangle hausSenkrechtHintenOben3 = new Rectangle(kHausSenkrechtHintenOben3[0], kHausSenkrechtHintenOben3[1], kHausSenkrechtHintenOben3[2], kHausSenkrechtHintenOben3[3]);
            Rectangle hausSenkrechtHintenOben4 = new Rectangle(kHausSenkrechtHintenOben4[0], kHausSenkrechtHintenOben4[1], kHausSenkrechtHintenOben4[2], kHausSenkrechtHintenOben4[3]);
            Rectangle hausSenkrechtHintenOben5 = new Rectangle(kHausSenkrechtHintenOben5[0], kHausSenkrechtHintenOben5[1], kHausSenkrechtHintenOben5[2], kHausSenkrechtHintenOben5[3]);
            Polygon deckeLinks = new Polygon(kDeckeLinks[0], kDeckeLinks[1], kDeckeLinks[2], kDeckeLinks[3], kDeckeLinks[4], kDeckeLinks[5], kDeckeLinks[6], kDeckeLinks[7]);
            Polygon deckeRechts = new Polygon(kDeckeRechts[0], kDeckeRechts[1], kDeckeRechts[2], kDeckeRechts[3], kDeckeRechts[4], kDeckeRechts[5], kDeckeRechts[6], kDeckeRechts[7]);
            Rectangle fenster1 = new Rectangle(kFenster1[0], kFenster1[1], kFenster1[2], kFenster1[3]);
            Rectangle fenster2 = new Rectangle(kFenster2[0], kFenster2[1], kFenster2[2], kFenster2[3]);
            Rectangle fenster3 = new Rectangle(kFenster3[0], kFenster3[1], kFenster3[2], kFenster3[3]);
            Rectangle privatraum = new Rectangle(kPrivatraum[0], kPrivatraum[1], kPrivatraum[2], kPrivatraum[3]);
            Rectangle hausSenkrechtVorn2a = new Rectangle(kHausSenkrechtVorn2a[0], kHausSenkrechtVorn2a[1], kHausSenkrechtVorn2a[2], kHausSenkrechtVorn2a[3]);
            Rectangle hausSenkrechtVorn2b = new Rectangle(kHausSenkrechtVorn2b[0], kHausSenkrechtVorn2b[1], kHausSenkrechtVorn2b[2], kHausSenkrechtVorn2b[3]);
            Rectangle hausSenkrechtVorn2c = new Rectangle(kHausSenkrechtVorn2c[0], kHausSenkrechtVorn2c[1], kHausSenkrechtVorn2c[2], kHausSenkrechtVorn2c[3]);
            Rectangle hausSenkrechtVorn2d = new Rectangle(kHausSenkrechtVorn2d[0], kHausSenkrechtVorn2d[1], kHausSenkrechtVorn2d[2], kHausSenkrechtVorn2d[3]);
            Rectangle hausWaagerechtVorn1 = new Rectangle(kHausWaagerechtVorn1[0], kHausWaagerechtVorn1[1], kHausWaagerechtVorn1[2], kHausWaagerechtVorn1[3]);
            Rectangle hausWaagerechtVorn2 = new Rectangle(kHausWaagerechtVorn2[0], kHausWaagerechtVorn2[1], kHausWaagerechtVorn2[2], kHausWaagerechtVorn2[3]);
            Rectangle hausWaagerechtVorn3 = new Rectangle(kHausWaagerechtVorn3[0], kHausWaagerechtVorn3[1], kHausWaagerechtVorn3[2], kHausWaagerechtVorn3[3]);
            Rectangle hausSenkrechtVorn1a = new Rectangle(kHausSenkrechtVorn1a[0], kHausSenkrechtVorn1a[1], kHausSenkrechtVorn1a[2], kHausSenkrechtVorn1a[3]);
            Rectangle hausSenkrechtVorn1b = new Rectangle(kHausSenkrechtVorn1b[0], kHausSenkrechtVorn1b[1], kHausSenkrechtVorn1b[2], kHausSenkrechtVorn1b[3]);
            Rectangle hausSenkrechtVorn1c = new Rectangle(kHausSenkrechtVorn1c[0], kHausSenkrechtVorn1c[1], kHausSenkrechtVorn1c[2], kHausSenkrechtVorn1c[3]);
            Rectangle hausSenkrechtVorn1d = new Rectangle(kHausSenkrechtVorn1d[0], kHausSenkrechtVorn1d[1], kHausSenkrechtVorn1d[2], kHausSenkrechtVorn1d[3]);
            Text titel = new Text(kTitel[0], kTitel[1], "Mies  van der Rohe - By the Sea…");







            // Styling


            himmel.setFill(himmelsGradient());
            meer.setFill(meeresGradient());
            segelschiff1.setFill(this.fSegelschiff1);
            segelschiff2.setFill(this.fSegelschiff2);
            segelschiff3.setFill(this.fSegelschiff3);
            kueste.setFill(kuestenGradient());
            rasen.setFill(rasenGradient());
            hausSchatten.setFill(this.fHausSchatten);
            hausVerandaSenkrecht1.setFill(this.fHausVerandaSenkrecht1);
            hausVerandaSenkrecht2.setFill(this.fHausVerandaSenkrecht2);
            hausVerandaSenkrecht3.setFill(this.fHausVerandaSenkrecht3);
            hausVerandaWaagerecht1.setFill(this.fHausVerandaWaagerecht1);
            hausVerandaWaagerecht2.setFill(this.fHausVerandaWaagerecht2);
            hausSenkrechtHintenUnten1.setFill(this.fHausSenkrechtHintenUnten1);
            hausSenkrechtHintenUnten2.setFill(this.fHausSenkrechtHintenUnten2);
            hausSenkrechtHintenUnten3.setFill(this.fHausSenkrechtHintenUnten3);
            hausSenkrechtHintenUnten4.setFill(this.fHausSenkrechtHintenUnten4);
            hausSenkrechtHintenUnten5.setFill(this.fHausSenkrechtHintenUnten5);
            hausSenkrechtHintenOben1.setFill(this.fHausSenkrechtHintenOben1);
            hausSenkrechtHintenOben2.setFill(this.fHausSenkrechtHintenOben2);
            hausSenkrechtHintenOben3.setFill(this.fHausSenkrechtHintenOben3);
            hausSenkrechtHintenOben4.setFill(this.fHausSenkrechtHintenOben4);
            hausSenkrechtHintenOben5.setFill(this.fHausSenkrechtHintenOben5);
            deckeLinks.setFill(this.fDeckeLinks);
            deckeRechts.setFill(this.fDeckeRechts);
            fenster1.setFill(this.fFenster1);
            fenster2.setFill(this.fFenster2);
            fenster3.setFill(this.fFenster3);
            privatraum.setFill(this.fPrivatraum);
            hausSenkrechtVorn2a.setFill(this.fHausSenkrechtVorn2a);
            hausSenkrechtVorn2b.setFill(this.fHausSenkrechtVorn2b);
            hausSenkrechtVorn2c.setFill(this.fHausSenkrechtVorn2c);
            hausSenkrechtVorn2d.setFill(this.fHausSenkrechtVorn2d);
            hausWaagerechtVorn1.setFill(this.fHausWaagerechtVorn1);
            hausWaagerechtVorn2.setFill(this.fHausWaagerechtVorn2);
            hausWaagerechtVorn3.setFill(this.fHausWaagerechtVorn3);
            hausSenkrechtVorn1a.setFill(this.fHausSenkrechtVorn1a);
            hausSenkrechtVorn1b.setFill(this.fHausSenkrechtVorn1b);
            hausSenkrechtVorn1c.setFill(this.fHausSenkrechtVorn1c);
            hausSenkrechtVorn1d.setFill(this.fHausSenkrechtVorn1d);
            titel.setFill(this.fTitel);
            titel.setFont(Font.font ("Avenir Next", 14));
            rahmen.setFill(this.fTitel);






            // Collecting and publishing:

            bild.setPrefSize(800, 400);
            bild.getChildren().addAll(himmel, meer, segelschiff1, segelschiff2, segelschiff3, kueste, rasen, hausSchatten, hausVerandaSenkrecht1, hausVerandaSenkrecht2, hausVerandaSenkrecht3, hausVerandaWaagerecht1, hausVerandaWaagerecht2, hausSenkrechtHintenUnten1, hausSenkrechtHintenUnten2, hausSenkrechtHintenUnten3, hausSenkrechtHintenUnten4, hausSenkrechtHintenUnten5, hausSenkrechtHintenOben1, hausSenkrechtHintenOben2, hausSenkrechtHintenOben3, hausSenkrechtHintenOben4, hausSenkrechtHintenOben5, deckeLinks, deckeRechts, fenster1, fenster2, fenster3, privatraum, hausSenkrechtVorn2a, hausSenkrechtVorn2b, hausSenkrechtVorn2c, hausSenkrechtVorn2d, hausWaagerechtVorn1, hausWaagerechtVorn2, hausWaagerechtVorn3, hausSenkrechtVorn1a, hausSenkrechtVorn1b, hausSenkrechtVorn1c, hausSenkrechtVorn1d, titel);



            director.getChildren().addAll(bild);

            postkarte.setScene(rahmen);
            postkarte.setTitle("Mies van der Rohe by the Sea");
            postkarte.show();
        }
        catch(Exception e) {
			e.printStackTrace();
		}
    }


    // Gradients methods:


    // sky

    public LinearGradient himmelsGradient() {

    	return new LinearGradient (0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
                new Stop(0.2, fHimmelStart), new Stop(0.8, fHimmelEnde));
    }


    // sea

 public LinearGradient meeresGradient() {

	 return new LinearGradient (0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
             new Stop(0.0, fMeerStart), new Stop(1.0, fMeerEnde));
    }

    // coast

 public LinearGradient kuestenGradient() {

	 return new LinearGradient (0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
             new Stop(0.0, fKuesteStart), new Stop(1.0, fKuesteEnde));
 }

    // lawn
 public LinearGradient rasenGradient() {

	 return new LinearGradient (0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
             new Stop(0.0, fRasenStart), new Stop(1.0, fRasenEnde));
	 }




    public static void main(String[] args) {
		launch(args);
	}
}
