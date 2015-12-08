// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;


// Referenced classes of package rrrrrr:
//            lnnnnn

public class grrrrg extends lnnnnn
{

    public static int b041D041D041D041D041D041D = 63;
    public static int b041D041D041D041D041D041D = 1;
    public static int b041D041D041D041D041D041D = 2;
    public static int b041D041D041D041D041D041D;

    public grrrrg()
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int b044004400440044004400440()
    {
        return 25;
    }

    public String b043604360436043604360436(String s, char c)
    {
        char ac[];
        int i;
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
        i = b041D041D041D041D041D041D;
        switch ((i * (b041D041D041D041D041D041D + i)) % b041D041D041D041D041D041D)
        {
        default:
            b041D041D041D041D041D041D = b044004400440044004400440();
            b041D041D041D041D041D041D = b044004400440044004400440();
            // fall through

        case 0: // '\0'
            i = 0;
            break;
        }
        do
        {
label0:
            {
                int j;
                try
                {
                    j = s.length;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
                if (((b041D041D041D041D041D041D + b041D041D041D041D041D041D) * b041D041D041D041D041D041D) % b041D041D041D041D041D041D != b041D041D041D041D041D041D)
                {
                    b041D041D041D041D041D041D = b044004400440044004400440();
                    b041D041D041D041D041D041D = 49;
                }
                if (i >= j)
                {
                    break label0;
                }
                ac[i] = (char)(s[i] + c + c);
                i++;
            }
        } while (true);
        s = new String(ac);
        return s;
    }
}
