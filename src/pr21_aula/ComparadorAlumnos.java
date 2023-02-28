package pr21_aula;

import java.util.Comparator;

public class ComparadorAlumnos implements Comparator<Aula>{
	
	private int comoOrdenar;
	public static final int CODIGO = 1;
	public static final int NOTA_PR1 = 2;
	public static final int NOTA_BBDD1 = 3;

	public ComparadorAlumnos() {

		comoOrdenar = CODIGO;
	}

	public void setComoOrdenar(int como) {

		if (como == NOTA_PR1) {

			comoOrdenar = NOTA_PR1;
		} else if (como == NOTA_BBDD1) {

			comoOrdenar = NOTA_BBDD1;
		} else
			comoOrdenar = CODIGO;
	}

	@Override
	public int compare(Aula a1, Aula a2) {
		
		int devolver;

		if (comoOrdenar == CODIGO) {

			devolver = a2.getCodigo() - a1.getCodigo();
		} else if (comoOrdenar == NOTA_PR1) {

			devolver = a2.getNotasPR() - a1.getNotasPR();
		} else devolver = a2.getNotasBBDD() - a1.getNotasBBDD();

		return devolver;
	}

}
