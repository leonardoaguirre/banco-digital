package interfaces;

public interface IConta {
    double sacar(double valor);

    double depositar(double valor);

    double transferir(double valor, IConta destino);
}
