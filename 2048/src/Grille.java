import java.util.Random;


public class Grille {

	public static int tab[][] = new int[4][4];

	public Grille(){
		int a = genererIndice();
		int b = genererIndice();
		int c = genererIndice();
		int d = genererIndice();
		if (a!=c && b!=d){
			tab[a][b] = genererTuile();
			tab[c][d] = genererTuile();
		}
		else{
			tab[b][a] = genererTuile();
			tab[d][c] = genererTuile();
		}
	}

	private int genererIndice() {
		Random random = new Random();
		int indice = random.nextInt(4);
		return indice;
	}
	
	private int genererTuile() {
		Random random = new Random();
		int tuile = (random.nextInt(2)+1)*2;
		return tuile;
	}
	
	public void aleatoire(){
		int a = genererIndice();
		int b = genererIndice();
        while (tab[a][b]!=0){
        	a = genererIndice();
    		b = genererIndice();
        }
        tab[a][b]=genererTuile();
	}
	
	public void decalageHaut(){
		for (int i=0;i<4;i++){
			for (int j=1;j<4;j++){
				if (tab[j][i]!=0 && tab[j-1][i]==0){
					tab[j-1][i]=tab[j][i];
					tab[j][i]=0;
					j=0;
				}
			}
		}
	}
	
	public void decalageBas(){
		for (int i=0;i<4;i++){
			for (int j=2;j>=0;j--){
				if (tab[j][i]!=0 && tab[j+1][i]==0){
					tab[j+1][i]=tab[j][i];
					tab[j][i]=0;
					j=3;
				}
			}
		}
	}
	
	public void decalageGauche(){
		for (int i=0;i<4;i++){
			for (int j=1;j<4;j++){
				if (tab[i][j]!=0 && tab[i][j-1]==0){
					tab[i][j-1]=tab[i][j];
					tab[i][j]=0;
					j=0;
				}
			}
		}
	}
	
	public void decalageDroite(){
		for (int i=0;i<4;i++){
			for (int j=2;j>=0;j--){
				if (tab[i][j]!=0 && tab[i][j+1]==0){
					tab[i][j+1]=tab[i][j];
					tab[i][j]=0;
					j=3;
				}
			}
		}
	}
	
	public void fusionHaut(){
		for(int i=0;i<4;i++){
			for(int j=1;j<4;j++){
				if (tab[j][i]!=0 && tab[j-1][i]!=0 && tab[j][i]==tab[j-1][i]){
					tab[j-1][i]=2*tab[j][i];
					tab [j][i]=0;
					j=0;
				}
			}
		}
	}
	
	public void fusionBas(){
		for(int i=0;i<4;i++){
			for(int j=2;j>=0;j--){
				if (tab[j][i]!=0 && tab[j+1][i]!=0 && tab[j][i]==tab[j+1][i]){
					tab[j+1][i]=2*tab[j][i];
					tab [j][i]=0;
					j=3;
				}
			}
		}
	}
	
	public void fusionGauche(){
		for(int i=0;i<4;i++){
			for(int j=1;j<4;j++){
				if (tab[i][j]!=0 && tab[i][j-1]!=0 && tab[i][j]==tab[i][j-1]){
					tab[i][j-1]=2*tab[i][j];
					tab [i][j]=0;
					j=0;
				}
			}
		}
	}
	
	public void fusionDroite(){
		for(int i=0;i<4;i++){
			for(int j=2;j>=0;j--){
				if (tab[i][j]!=0 && tab[i][j+1]!=0 && tab[i][j]==tab[i][j+1]){
					tab[i][j+1]=2*tab[i][j];
					tab [i][j]=0;
					j=3;
				}
			}
		}
	}
	
}
