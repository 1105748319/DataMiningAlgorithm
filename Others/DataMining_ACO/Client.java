package DataMining_ACO;

/**
 * ��Ⱥ�㷨������
 * @author lyq
 *
 */
public class Client {
	public static void main(String[] args){
		//��������
		String filePath = "C:\\Users\\lyq\\Desktop\\icon\\input.txt";
		//��������
		int antNum;
		//���Ʋ���
		double alpha;
		double beita;
		double p;
		double Q;
		
		antNum = 3;
		alpha = 0.5;
		beita = 1;
		p = 0.5;
		Q = 5;
		
		ACOTool tool = new ACOTool(filePath, antNum, alpha, beita, p, Q);
		tool.antStartSearching();
	}
}
