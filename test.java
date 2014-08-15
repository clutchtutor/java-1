import java.util.*;
class test
{
	static void check(int b)
	{
		int j,k,z,flag;
		for(j=1;j<2147483647;j++)
		{
			z=b*j;
			flag=0;
			if((z%10==9||z%10==0))
				{if(z/10>1&&(z%100==9||z%100==0))
					{if(z/100>1&&(z%1000==9||z%1000==0))
						{if(z/1000>1&&(z%10000==9||z%10000==0))
							{if(z/10000>1&&(z%100000==9||z%100000==0))
								{if(z/100000>1&&(z%1000000==9||z%1000000==0))
									{if(z/1000000>1&&(z%10000000==9||z%10000000==0))
										{if(z/10000000>1&&(z%100000000==9||z%10000000==0))
											{if(z/100000000>1&&(z%1000000000==9||z%1000000000==0))
												flag=1;
											}
										}
									}
								}
							}
						}
					}
				}
										

			if(flag==1)
			{
				System.out.print(z+",");
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner o=new Scanner(System.in);
		int t,i,m;
		for(i=1;i<500;i++)
		{
			check(i);
		}
	}
}