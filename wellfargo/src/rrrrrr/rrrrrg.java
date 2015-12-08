// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;


// Referenced classes of package rrrrrr:
//            ggggrg

public class rrrrrg extends ggggrg
{

    public static int b041D041D041D041D041D041D = 1;
    public static int b041D041D041D041D041D041D = 66;
    public static int b041D041D041D041D041D041D = 2;

    public rrrrrg()
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int b044004400440044004400440()
    {
        return 64;
    }

    public static int b044004400440044004400440()
    {
        return 0;
    }

    public String b042B042B042B042B042B042B(String s, char c, char c1)
    {
        char c2;
        char ac[];
        int i;
        char c3;
        try
        {
            s = s.toCharArray();
            ac = new char[s.length];
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        i = 0;
        while (i < s.length) 
        {
            c3 = s[i];
            if (((b041D041D041D041D041D041D + b041D041D041D041D041D041D) * b041D041D041D041D041D041D) % b041D041D041D041D041D041D != b044004400440044004400440())
            {
                b041D041D041D041D041D041D = b044004400440044004400440();
                b041D041D041D041D041D041D = 13;
            }
            c2 = (char)((c3 + c) - c1);
            ac[i] = c2;
            i++;
        }
        c = b041D041D041D041D041D041D;
        switch ((c * (b041D041D041D041D041D041D + c)) % b041D041D041D041D041D041D)
        {
        default:
            b041D041D041D041D041D041D = 89;
            b041D041D041D041D041D041D = b044004400440044004400440();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            s = new String(ac);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        return s;
    }
}
