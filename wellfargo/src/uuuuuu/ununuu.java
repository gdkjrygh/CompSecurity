// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uuuuuu;


// Referenced classes of package uuuuuu:
//            unuuuu

public class ununuu extends unuuuu
{

    public ununuu()
    {
    }

    public String b0417041704170417041704170417(String s, char c)
    {
        s = s.toCharArray();
        char ac[] = new char[s.length];
        for (int i = 0; i < s.length; i++)
        {
            ac[i] = (char)(s[i] + c + c + c);
        }

        return new String(ac);
    }
}
