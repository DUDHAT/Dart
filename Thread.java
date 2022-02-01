class ThreadSleep extends Thread
{
	String str[] = new String[5];
	ThreadSleep(String st[])
	{
		for(int i=0;i<st.length;i++)
		{
			str[i]=st[i];	
		}
	}
	public void run()
	{
		for(int i=0;i<str.length;i++)
		{
			System.out.println((i+1)+" : "+str[i]);
		try
		{
			sleep(1000);
		}
		catch(Exception e)
		}
	}
}