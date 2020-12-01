#include <iostream>
#include <string>
using namespace std;
 
struct tipoDatos
{
    string nombreFich;        
    long tamanyo;            
    long fecha;
};
 
int numeroFichas=0; 
int i;               
int opcion;          
 
string textoTemporal; 
int numeroTemporal;
 
int main()
{
    tipoDatos *fichas = new tipoDatos[1000];
 
    do
    {
        // Menu principal
        cout << endl;
        cout << "Opcion: " << endl;
        cout << "1.- Anadir un empleado" << endl;
        cout << "2.- Mostrar los nombres de todos los empleados" << endl;
        cout << "3.- Mostrar por codigo " << endl;
        cout << "4.- Ver datos de un empleado" << endl;
        cout << "5.- Mostrar por fecha"<< endl;
        cout << "6.- Salir" << endl;
 
        cin >> opcion;

        switch(opcion)
        {
            case 1: 
                if (numeroFichas < 1000)   
                {
                    cout << "Introduce el nombre del empleado: ";
                    cin >> fichas[numeroFichas].nombreFich;
                    cout << "Introduce codigo de empleado: ";
                    cin >> fichas[numeroFichas].tamanyo;
                    cout <<"Fecha de ingreso:";
                    cin>> fichas[numeroFichas].fecha;
                    numeroFichas++;  
                }
                else   
                    cout << "Máximo de fichas alcanzado (1000)!" << endl;
                break;
 
            case 2: 
                for (i=0; i<numeroFichas; i++)
                    cout << "Nombre: " << fichas[i].nombreFich
                        << "; Codigo: " << fichas[i].tamanyo
                        <<"; fecha: "<<fichas[i].fecha
                        << "" << endl;
                break;
 
 
            case 3: 
                cout << "¿A partir de que numero se mostrara? ";
                cin >> numeroTemporal;
                for (i=0; i<numeroFichas; i++)
                    if (fichas[i].tamanyo >= numeroTemporal)
                        cout << "Nombre: " << fichas[i].nombreFich
                            << "; Codigo: " << fichas[i].tamanyo
                             <<";fecha: "<<fichas[i].fecha
                            << " " << endl;
                break;
                
 
            case 4: 
                cout << "¿De qué empleado quieres  los datos?";
                cin >> textoTemporal;
                for (i=0; i<numeroFichas; i++)
                    if (fichas[i].nombreFich == textoTemporal)
                        cout << "Nombre: " << fichas[i].nombreFich
                            << "; Codigo: " << fichas[i].tamanyo
                             <<";fecha: "<<fichas[i].fecha
                            << " " << endl;
                break;
                
                
                 case 5: 
                cout << "¿A partir de que fecha se mostrara? ";
                cin >> numeroTemporal;
                for (i=0; i<numeroFichas; i++)
                    if (fichas[i].fecha >= numeroTemporal)
                        cout << "Nombre: " << fichas[i].nombreFich
                            << "; Codigo: " << fichas[i].fecha
                             <<";fecha: "<<fichas[i].fecha
                            << " " << endl;
                break;
 
            case 6: 
                cout << "Fin del programa" << endl;
                break;
 
            default: 
                cout << "Opcion no valida!" << endl;
                break;
        }
    } while (opcion != 5); 
 
    return 0;
}