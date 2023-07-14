package exercFuncionario;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {

	private String nome;
	private FuncionarioStatus status;
	private double salarioBase;
	private Departamento departamento;
	private List<Contrato> contratos = new ArrayList<>();

	public Funcionario() {

	}

	public Funcionario(String nome, FuncionarioStatus status, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.status = status;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public FuncionarioStatus getStatus() {
		return status;
	}

	public void setStatus(FuncionarioStatus status) {
		this.status = status;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void addContrato(Contrato contrato) {
		contratos.add(contrato);
	}

	public void removerContrato(Contrato contrato) {
		contratos.remove(contrato);
	}

	public double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar calendario = Calendar.getInstance();
		for (Contrato c : contratos) {
			calendario.setTime(c.getData());
			int c_ano = calendario.get(calendario.YEAR);
			int c_mes = 1 + calendario.get(calendario.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.totalValor();
			}
		}
		return soma;
	}
}
