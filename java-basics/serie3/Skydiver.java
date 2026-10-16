package serie3;

import java.util.Scanner;

public class Skydiver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double G = 9.81;
        final double SPEED_OF_SOUND = 343;
        double v0 = 0.0, t0 = 0.0;
        double speed = v0, acceleration = G, t=t0;
        double altitude;
        double surface = 2.0;


        double mass = 80.0;
        do {
            System.out.print("Skydiver's mass (>= 40) ? ");
            mass = sc.nextDouble();
        } while (mass < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("Starting height (>= 250) ? ");
            h0 = sc.nextDouble();
        } while (h0 < 250.0);

        sc.close();
        altitude = h0;

        double s = surface/mass;
        double q = Math.exp(-s * (t - t0));

        for(t = t0; t <= 170; t++){
            if(altitude > 2500) {
                q = Math.exp(-s * (t - t0));
                speed = (G / s) * (1 - q) + v0 * q;
                altitude = h0 - (G / s) * (t - t0) - ((v0 - G / s) / s) * (1 - q);
                acceleration = G - s * speed;

                if (speed > SPEED_OF_SOUND && speed < 344) {
                    System.out.println("## THE SKYDIVER MOVES FASTER THAN SOUND");
                }

                if (acceleration > 0.48 && acceleration < 0.5) {
                    System.out.println("## THE SKYDIVER REACHED MAX ACCELERATION");
                }

                System.out.printf("%.0f, %.4f, %.4f, %.5f\n",
                        t, altitude, speed, acceleration);

                if(t == 131) {
                    System.out.println("## THE SKYDIVER OPENS THE PARACHUTE");
                }

            }else{

                surface = 25;
                s = surface/mass;
                t0 = 132;
                v0 = 377.9270;
                h0 = 2320.2818;

                q = Math.exp(-s * (t - t0));
                speed = (G / s) * (1 - q) + v0 * q;
                altitude = h0 - (G / s) * (t - t0) - ((v0 - G / s) / s) * (1 - q);
                acceleration = G - s * speed;

                if (speed > SPEED_OF_SOUND && speed < 344) {
                    System.out.println("## THE SKYDIVER MOVES FASTER THAN SOUND");
                }

                if (acceleration > 0.48 && acceleration < 0.5) {
                    System.out.println("## THE SKYDIVER REACHED MAX ACCELERATION");
                }

                System.out.printf("%.0f, %.4f, %.4f, %.5f\n",
                        t, altitude, speed, acceleration);
            }
        }
    }
}
