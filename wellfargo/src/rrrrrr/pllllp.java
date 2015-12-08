// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;


// Referenced classes of package rrrrrr:
//            ggggrg

public class pllllp extends ggggrg
{

    public static int b043D043D043D043D043D043D = 62;
    public static int b043D043D043D043D043D043D = 1;
    public static int b043D043D043D043D043D043D = 2;
    public static int b043D043D043D043D043D043D;

    public pllllp()
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int b0421042104210421042104210421()
    {
        return 99;
    }

    public String b042B042B042B042B042B042B(String s, char c, char c1)
    {
        s = s.toCharArray();
        char ac[] = new char[s.length];
        int i;
        if (((b043D043D043D043D043D043D + b043D043D043D043D043D043D) * b043D043D043D043D043D043D) % b043D043D043D043D043D043D != b043D043D043D043D043D043D)
        {
            b043D043D043D043D043D043D = b0421042104210421042104210421();
            b043D043D043D043D043D043D = 53;
        }
        i = 0;
        while (i < s.length) 
        {
            int j = s[i];
            char c2 = (char)((j - c) + c1);
            int k;
            int l;
            int i1;
            int j1;
            try
            {
                j = b043D043D043D043D043D043D;
                k = b043D043D043D043D043D043D;
                l = b043D043D043D043D043D043D;
                i1 = b043D043D043D043D043D043D;
                j1 = b043D043D043D043D043D043D;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (((j + k) * l) % i1 != j1)
            {
                try
                {
                    b043D043D043D043D043D043D = 55;
                    b043D043D043D043D043D043D = 46;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
            }
            ac[i] = c2;
            i++;
        }
        s = new String(ac);
        return s;
        s;
        throw s;
        s;
        throw s;
    }
}
