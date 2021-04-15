package Trabajos_Practicos.TPN2;

public class TPN2Ejercicio7 {
    /*a) (X||Y)&&(numero>0)
    b) ((X&&Y)&&X)&&(||!Y)
    c) ((numero=0||numero<>0)&&numero<23))
    d) !Z&&Y
    e) (Z&&X)||Y
    f) (Y||Z)&&(Z!!X)||!(Z&&Y)

    Repuestas

    a)	Primero se resuelve (Y&&(numero>0), luego (X||).
    b)	Primero se resuelve (!Y), luego (X&&Y), luego (&& X), (&& Z), finalmente (ӀӀ !Y).
    c)	Primero (numero<>0&&numero<23) luego (numero=0||) con el resultado del AND.
    d)	Primero (!Z) luego ese resultado con (&&Y).
    e)	Primero (Z&&X) luego ese resultado con (||Y).
    f)	Primero (!Z) luego ese resultado con (&&Y), luego (Z&&Z), luego (Y||) con el resultado de (Z&&Z), luego ese resultado con (||X), luego ese resultado con el resultado de (!Z&&Y).
    */

}
