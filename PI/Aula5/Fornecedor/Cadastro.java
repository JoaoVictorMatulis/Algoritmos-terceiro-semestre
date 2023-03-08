package Fornecedor;

import javax.swing.JOptionPane;

public class Cadastro {

    static FornecedorEmpresa[] fe = new FornecedorEmpresa[1];
    static int indiceEmpresa = 0;
    static FornecedorPessoa[] fp = new FornecedorPessoa[4];
    static int indicePessoa = 0;
    
    public static void main(String[] args){
        Object selectedValue;
        do{
            Object[] escolhas = { "Cadastrar Fonecedor Empresa", "Cadastrar Fornecedor Pessoa", "Encerrar"};
            selectedValue = JOptionPane.showInputDialog(null,"Escolha uma das opções abaixo:", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,
            escolhas, escolhas [0]);
            if(selectedValue != "Encerrar"){
                switch((String)selectedValue){
                    case "Cadastrar Fonecedor Empresa":
                        inserirEmpresa();
                        break;
                    case "Cadastrar Fornecedor Pessoa":
                        inserirPessoa();
                        break;
                }
            }
        }while(selectedValue != "Encerrar");
        if(indiceEmpresa > 0){
            System.out.println("Fonecedores Empresa: \n");
            for(int i = 0; i < indiceEmpresa; i++){
                System.out.println(fe[i].toString());
            }
        }
        if(indicePessoa >0){
            System.out.println("\nFonecedores Pessoas: \n");
            for(int i = 0; i < indiceEmpresa; i++){
                System.out.println(fp[i].toString());
            }
        }
    }

    public static void inserirEmpresa() {
        if (indiceEmpresa < fe.length) {
            String nome = JOptionPane.showInputDialog(null,"Digite o nome do fornecedor:");
            String fone = JOptionPane.showInputDialog(null,"Digite seu telefone:");
            String IE = JOptionPane.showInputDialog(null,"Digite seu Inscrição Estadual:");
            String CNPJ = JOptionPane.showInputDialog(null,"Digite seu CNPJ:");
            fe[indiceEmpresa++] = new FornecedorEmpresa(nome,fone,IE,CNPJ);
        } else{
            fe = alocarNovoArrayEmpresa(fe);
            inserirEmpresa();
        }
    }

    private static FornecedorEmpresa[] alocarNovoArrayEmpresa(FornecedorEmpresa[] feArray) {
        FornecedorEmpresa[] novo = new FornecedorEmpresa[feArray.length + 4];
        System.arraycopy(feArray, 0, novo, 0, feArray.length);
        return novo;
    }

    public static void inserirPessoa() {
        if (indicePessoa < fp.length) {
            String nome = JOptionPane.showInputDialog(null,"Digite o nome do fornecedor:");
            String fone = JOptionPane.showInputDialog(null,"Digite seu telefone:");
            String RG = JOptionPane.showInputDialog(null,"Digite seu RG:");
            String CPF = JOptionPane.showInputDialog(null,"Digite seu CPF:");
            fp[indicePessoa++] = new FornecedorPessoa(nome,fone,RG,CPF);
        } else{
            fp = alocarNovoArrayPessoa(fp);
            inserirEmpresa();
        }
    }

    private static FornecedorPessoa[] alocarNovoArrayPessoa(FornecedorPessoa[] fpArray) {
        FornecedorPessoa[] novo = new FornecedorPessoa[fpArray.length + 4];
        System.arraycopy(fpArray, 0, novo, 0, fpArray.length);
        return novo;
    }
}

/*
 * https://dontpad.com/marcos2023


package poo2023.aula4;
import javax.swing.JOptionPane;
public class CadastraFornecedor {
	public static void main(String[] args) {
		int qtd = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a quantidade de Fornecedores a cadastrar:"));
		Fornecedor fornecedores[] = new Fornecedor[qtd];
		
		for(int i=0 ; i<fornecedores.length ; i++) {
			int tipo = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite: \n1-Pessoa \n2-Empresa"));
                String nome = JOptionPane.showInputDialog(
						"Digite o nome do Fornecedor:");
				String telefone = JOptionPane.showInputDialog(
						"Digite o telefone do Fornecedor:");
			if(tipo==1) {				
				String cpf = JOptionPane.showInputDialog(
						"Digite o CPF do Fornecedor:");
				String rg = JOptionPane.showInputDialog(
						"Digite o RG do Fornecedor:");
				FornecedorPessoa fornecedorPessoa = new FornecedorPessoa(
						nome, telefone, cpf, rg);
				fornecedores[i] = fornecedorPessoa;
			}
			else if(tipo==2) {				
				String nome = JOptionPane.showInputDialog(
				String ie = JOptionPane.showInputDialog(
						"Digite a Inscricao Estadual:");
				String cnpj = JOptionPane.showInputDialog(
						"Digite o CNPJ do Fornecedor:");
				FornecedorEmpresa fornecedorEmpresa = new FornecedorEmpresa(
						nome, telefone, ie, cnpj);
				fornecedores[i] = fornecedorEmpresa;
			}
		}
		for(int i=0 ; i<fornecedores.length ; i++) {
			if(fornecedores[i] instanceof FornecedorPessoa) {
				FornecedorPessoa pessoa = (FornecedorPessoa)fornecedores[i];
				System.out.println(pessoa);
			}
			else if(fornecedores[i] instanceof FornecedorEmpresa) {
				FornecedorEmpresa empresa = (FornecedorEmpresa)fornecedores[i];
				System.out.println(empresa);
			}
		}		
	}
}
 */
