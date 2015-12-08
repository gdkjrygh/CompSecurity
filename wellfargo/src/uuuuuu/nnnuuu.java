// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uuuuuu;


// Referenced classes of package uuuuuu:
//            unuuuu

public class nnnuuu extends unuuuu
{

    public nnnuuu()
    {
    }

    public String b0417041704170417041704170417(String s, char c)
    {
        Object obj = String.valueOf(c);
        int ai[] = new int[257];
        int ai1[] = new int[257];
        int k = ((String) (obj)).length();
        for (int i = 0; i <= 255; i++)
        {
            ai1[i] = Integer.valueOf(((String) (obj)).substring(i % k, i % k + 1).toCharArray()[0]).intValue();
            ai[i] = i;
        }

        int j = 0;
        k = 0;
        for (; j <= 255; j++)
        {
            k = (k + ai[j] + ai1[j]) % 256;
            int l = ai[j];
            ai[j] = ai[k];
            ai[k] = l;
        }

        obj = new StringBuilder();
        j = 1;
        k = 0;
        int i1 = 0;
        for (; j <= s.length(); j++)
        {
            i1 = (i1 + 1) % 256;
            k = (k + ai[i1]) % 256;
            int j1 = ai[i1];
            ai[i1] = ai[k];
            ai[k] = j1;
            ((StringBuilder) (obj)).append((char)(ai[(ai[i1] + ai[k]) % 256] ^ Integer.valueOf(s.substring(j - 1, (j - 1) + 1).toCharArray()[0]).intValue()));
        }

        s = ((StringBuilder) (obj)).toString();
        ((StringBuilder) (obj)).setLength(0);
        return s;
    }
}
