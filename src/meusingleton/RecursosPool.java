package meusingleton;

public class RecursosPool {
	private static RecursosPool _pool;
	
	private RecursosPool() {}
	
	public static RecursosPool getRecursosPool()
	{
		if (_pool == null)
		{
			_pool = new RecursosPool();
			System.out.println("Criado um pool de recursos para aplica��o.");
		}
		else
		{
			System.out.print("Um pool de recursos ja foi criado para a aplica��o.");
		}
		return _pool;
	}
	

} 

class SingletonPatternEx
{
	public static void main(String[] args)
	{
		System.out.println("***Exemplo do Padrao Singleton***\n");
		System.out.println("Tentando criar um pool de reucursos para aplica��o.");
		RecursosPool p1 = RecursosPool.getRecursosPool();
		System.out.println("Tentando criar outro pool de recursos para aplica��o.");
		RecursosPool p2 = RecursosPool.getRecursosPool();
		
		if (p1==p2)
		{
			System.out.println("p1 e p2  sao as mesma inst�ncias.");
		}
	}
}