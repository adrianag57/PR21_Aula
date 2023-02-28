package pr21_aula;

public class Aula {

	private int codigo;
	private int notasPR;
	private int notasBBDD;

	public Aula () {
		
		Aula[] alumnos = new Aula[30];
		
		for (int i = 0; i < 30; i++) {
		
		codigo = i;
		notasPR = (int) (Math.random() * 10 + 1);
		notasBBDD = (int) (Math.random() * 10 + 1);
		
		}
		
	}

	public int getCodigo() {
		return codigo;
	}

	public int getNotasPR() {
		return notasPR;
	}

	public int getNotasBBDD() {
		return notasBBDD;
	}

	@Override
	public String toString() {
		return "[DAW" + codigo + ", notasPR:" + notasPR + ", notasBBDD:" + notasBBDD + "]";
	}

}
