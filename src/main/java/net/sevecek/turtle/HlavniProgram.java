package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.time.Year;

public class HlavniProgram {
        Turtle zofka;
    public void main(String[] args) {

        zofka = new Turtle();
        zofka.setLocation(50, 370);
        nakresliRovnoramennyTrojuhelnik(200, 50);
        zofka.penUp();
        zofka.move(30);
        zofka.penDown();
        nakresliKruh(87);
        zofka.setLocation (300,450);
        nakresliKruh(120);
        zofka.penUp();
        zofka.move(120+5);
        zofka.turnRight(90);
        zofka.move(120);
        zofka.turnLeft(180);
        zofka.penDown();
        nakresliKruh(80);
        zofka.penUp();
        zofka.move(80+5);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliKruh(30);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(160);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKruh(30);
        zofka.penUp();
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(80+5);
        zofka.penDown();
        nakresliKruh(60);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.setLocation (600,500);
        zofka.turnLeft(45);
        zofka.penDown();
        nakresliRovnoramennyTrojuhelnik(100, 90);
        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100+40);
        zofka.penDown();
        nakresliObdelnik(200, 100);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.penDown();
        nakresliKruh(30);
        zofka.move(75);
        nakresliKruh(30);
        zofka.move(75);
        zofka.turnRight(180);
        nakresliObdelnik(200,120);
        zofka.turnRight(90);
        nakresliKruh(60);
        zofka.setLocation(700, 200);
        for (int i = 0; i < 4; i++) {
            zofka.turnRight(360);
        }
    }
    public void nakresliRovnoramennyTrojuhelnik(double delkaRamena, double uhelBeta) {
        double uhelAlfa =  ((180 - uhelBeta)/2);
        double zakladna =  vypocitejDelkuTretiStrany(delkaRamena, uhelBeta);
        zofka.turnRight(90);
        zofka.move(zakladna);
        zofka.turnRight(180-uhelAlfa);
        zofka.move(delkaRamena);
        zofka.turnRight(180-uhelBeta);
        zofka.move(delkaRamena);
        zofka.turnRight(90-uhelAlfa);
    }
    public void nakresliKruh (double polomer) {
        double pocetVrcholuMnohouhelniku = 50;
        double uhelMeziRameny = 360 / pocetVrcholuMnohouhelniku;
        double uhelMnohouhelniku = (180 - uhelMeziRameny);
        double StranaMnohouhelniku = vypocitejDelkuTretiStrany(polomer, uhelMeziRameny);
        for (int i = 0; i < pocetVrcholuMnohouhelniku; i++) {
            zofka.move(StranaMnohouhelniku);
            zofka.turnRight(180 - uhelMnohouhelniku);
        }
    }
    public void nakresliObdelnik (double stranaDelsiA, double stranaKratsiB){
         for (int i = 0; i < 2; i++) {
            zofka.turnRight(90);
            zofka.move (stranaDelsiA);
            zofka.turnRight(90);
            zofka.move(stranaKratsiB);
         }
    }
        public double vypocitejDelkuTretiStrany(double velikostRamene, double uhelMeziRameny) {
        double tretiStrana;
        tretiStrana = Math.abs((velikostRamene
                * Math.sin((uhelMeziRameny * Math.PI / 180.0) / 2.0))
                * 2.0);
        return tretiStrana;
    }
}
