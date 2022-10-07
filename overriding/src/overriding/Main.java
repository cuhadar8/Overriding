package overriding;

public class Main {
	
	public static void main(String[] args) {
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {new TarimKrediManager(), new OgretmenKrediManager(), new OgrenciManager()};
		
		for(BaseKrediManager krediManager : krediManagers) {
			
			System.out.println(krediManager.hesapla(1000));
			
			
		}
		
	}

}
