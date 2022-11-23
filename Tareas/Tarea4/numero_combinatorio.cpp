#include <iostream>
using namespace std;
int n, x, comb;
int leerN();
int leerX(int n);
int factorial(int n);
int main() {
	cout << "\tCALCULO DEL NUMERO COMBINATORIO\n\n";
	cout << "\tDonde: \n";
	cout << "\t\t n >= 1\n";
	cout << "\t\t 0 <= x <= n\n\n";
	n = leerN();
	x = leerX(n);
	comb = factorial(n)/(factorial(x) * factorial(n - x));
	cout << "El valor del número combinatorio es: " << comb;
	return 0;
}

int leerN(){
	int n;
	do{
		cout << "Introducir el valor de N: ";
		cin >> n;
	}while(n <= 0);
	return n;
}
int leerX(int n){
	int x;
	do{
		cout << "Introducir el valor de X: ";
		cin >> x;
	}while(x < 0 || x > n);
	return x;
}
int factorial(int n){
	if(n <= 1){
		return 1;
	} else {
		return n * factorial(n - 1);
	}
}
