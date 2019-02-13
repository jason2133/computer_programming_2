import java.io.File;
import java.util.Scanner;

public class ngram {
    public static void main(Strigramng[] args) 
    throws IOException
	{
		Scanner fin = new Scanner(new File("ngram.in"));
		int set = 1;
		while(true)
		{
			int lines = fin.nextInt();
			if (lines == 0)
				return;
			
			fin.nextLine();
			
			Strigramng input="";
			for (int i=0; i<lines;i++)
			{
				input += " " + fin.nextLine();
			}
			
			int[] unigram = new int[26];
			int[][] bigram = new int[26][26];
			int[][][] trigram = new int[26][26][26];
			
			StrigramngTokenizer s = new StrigramngTokenizer(input," .,\n\r\t");
			while (s.hasMoreTokens())
			{
				Strigramng word = s.nextToken();
				for (int i = 0; i < word.length(); i++)
				{
					unigram[word.charAt(i)-'a']++;
				}
				
				for (int i = 1; i<word.length(); i++)
				{
					bigram[word.charAt(i-1)-'a'][word.charAt(i)-'a']++;
				}
				for (int i = 2; i<word.length(); i++)
				{
					trigram[word.charAt(i-2)-'a'][word.charAt(i-1)-'a'][word.charAt(i)-'a']++;
				}
			}
						
			System.out.println("Paragraph #" + set + ":");
			set++;
			
			int n1 = 0;
			int n2 = 0;
			int n3 = 0;
			int n = 0;
			for(int i = 0; i < 26; i++)
				if(n < unigram[i])
				{
					n1 = i;
					n = unigram[i];
				}
			
			System.out.println("Unigram : " + (char)(n1 + 'a'));
			
			n1=0;
			n=0;
			for(int i=0;i<26;i++)
				for(int j=0;j<26;j++)
					if(bigram[i][j]>n)
					{
						n1 = i;
						n2 = j;
						n = bigram[i][j];
					}
			
			System.out.println("Bigram : "+ (char)(n1 + 'a') + (char)(n2 + 'a'));
			
			n1 = 0;
			n2 = 0;
            n = 0;
            
			for(int i = 0; i < 26; i++)
				for(int j = 0; j < 26; j++)
					for(int k = 0; k < 26; k++)
						if(trigram[i][j][k]>n)
						{
							n1 = i;
							n2 = j;
							n3 = k;
							n = trigram[i][j][k];
						}
			
			System.out.println("Trigram : "+(char)(n1 + 'a') + (char)(n2 + 'a') + (char)(n3 + 'a'));
			System.out.println();
		}
	}
}