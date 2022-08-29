package _15.interfaces.exercicio_fixacao.servicos;

public interface OnlinePaymentService {
double paymentFee (double amount);
double interest (double amount, int months);
}
