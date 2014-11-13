
import java.util.Scanner;


public class P2048{

	static Grille grille = new Grille();
	
	public static void direction(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Commandes :\nz:haut | s:droite | w:bas | q:gauche");
		String str = sc.nextLine();
		char carac = str.charAt(0);
		if (carac=='z'){
			grille.decalageHaut();
			grille.fusionHaut();
			grille.aleatoire();
		}
		else if (carac=='w'){
			grille.decalageBas();
			grille.fusionBas();
			grille.aleatoire();
		}
		else if (carac=='q'){
			grille.decalageGauche();
			grille.fusionGauche();
			grille.aleatoire();
		}
		else if (carac=='s'){
			grille.decalageDroite();
			grille.fusionDroite();
			grille.aleatoire();
		}
		else{
			str = sc.nextLine();
			carac = str.charAt(0);
			;
		}
	}

	public static void affichage(){
		for (int i=0;i<4;i++){
			for (int j=0;j<4;j++){
				System.out.print(Grille.tab[i][j] + "   ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		affichage();
		while (true){
			direction();
			affichage();
		}
	}
}
