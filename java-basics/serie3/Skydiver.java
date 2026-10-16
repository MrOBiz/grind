package serie3;

import java.util.Scanner;

public class Skydiver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double G = 9.81;
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

        for(t = t0; t < 140; t++){
            q = Math.exp(-s * (t - t0));
            speed = (G/s)*(1-q)+v0*q;
            altitude = h0 -(G/s)*(t-t0)-((v0-G/s)/s)*(1-q);
            acceleration = G -s*speed;

            System.out.printf("%.0f, %.4f, %.4f, %.5f\n",
                    t, altitude, speed, acceleration);
        }
    }
}
