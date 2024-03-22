package aed;

class Funciones {
    int cuadrado(int x) {
        
        return x*x;
    }

    double distancia(double x, double y) {
        return Math.sqrt(x*x + y*y);
    }

    boolean esPar(int n) {
        if ( n % 2 == 0) {
        return true;
        }
        else {
        return false;
        }
    }

    boolean esBisiesto(int n) {
        if ( n % 400 == 0) {
        return true;
        }
        if (n % 4 == 0 && n % 100 != 0) {
            return true;
        }
        else {
            return false;
        }
    }

    int factorialIterativo(int n) {
        int res = 1;
        if ( n == 0) {
            return res;
        } 
        while (n != 0) {
             res = res * n;
             n -= 1;
            
        }
        return res;  
        
    }

    int factorialRecursivo(int n) { 
        if ( n == 0) {
            return 1;
        }
         else if (n==1) {
            return 1;
        }
        else {
            return n * factorialRecursivo(n-1);
        } 
    }

    boolean esPrimo(int n) {
        int divisor = 2;
        if ( n == 2) {
            return true;
        }
        if ( n == 0 || n == 1) {
            return false;
        }
        while( divisor <= n/2) {
            if (n % divisor == 0) {
                return false;
            }
            else {
                divisor += 1;
            }
        }
        return true;
    }

    int sumatoria(int[] numeros) {
       int res = 0;
       for (int i = 0; i < numeros.length;) {
        res += numeros[i];
        i += 1;
       }

        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        int i = 0;
        for (i = 0; i < numeros.length;) {
            if ( numeros[i] == buscado){
                return i; 
            }
            else {
                i += 1;
            }
        } return i; 
    }

    boolean tienePrimo(int[] numeros) {
        for ( int i = 0; i < numeros.length;) {
            if (esPrimo(numeros[i]) == true) {
                return true; 
            }
            else {
                i += 1;
            }
        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        for (int i = 0; i < numeros.length;) {
            if (esPar(numeros[i]) == false) {
                return false;
            }
            else {
                i += 1;
            }
        }
        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        String s3 = "";
        if (s1.length() > s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length();) {
            s3 += s2.charAt(i);
            i += 1;
        }
        if (s1.equals(s3)) {
            return true;
        }
        else {
            return false;
        } 
    }

    boolean esSufijo(String s1, String s2) {
        s1 = reverso(s1);
        s2 = reverso(s2);
        return esPrefijo(s1,s2);
    } 
    

    String reverso(String s1) {
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i-- ) {
            s2 += s1.charAt(i);
        } 
        return s2;
    }
}
