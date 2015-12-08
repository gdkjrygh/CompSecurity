// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class llllpl
{

    public static int b044B044B044B044B044B044B = 2;
    public static int b044B044B044B044B044B044B = 83;
    public static int b044B044B044B044B044B044B = 1;

    public llllpl()
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int b043104310431043104310431()
    {
        return 0;
    }

    public static int b043104310431043104310431()
    {
        return 83;
    }

    public static boolean b043104310431043104310431(String s)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        int i = b044B044B044B044B044B044B;
        int k = b044B044B044B044B044B044B;
        int i1 = b044B044B044B044B044B044B;
        int k1 = b044B044B044B044B044B044B;
        Object obj = rrrrrr/llllpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8A\uFF58\uFF5C\uFF5B\uFF59\uFF58\uFF5C\uFF5B\uFF59\u0359\u0359\u0359\uFF58\uFF5C\uFF5B\uFF59", 'H', '\004'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if (((i + k) * i1) % k1 != ((Integer)obj).intValue())
        {
            b044B044B044B044B044B044B = 71;
            Object obj1 = rrrrrr/llllpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF78\uFF46\uFF4A\uFF49\uFF47\u0347\u0347\u0347\u0347\uFF46\uFF4A\uFF49\uFF47", '0', '\272', '\0'), new Class[0]);
            int j;
            int l;
            int j1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b044B044B044B044B044B044B = ((Integer)obj1).intValue();
        }
        obj1 = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("KMVR", '?', '\002'), new Class[0]);
        try
        {
            s = ((String) (((Method) (obj1)).invoke(s, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        s = (String)s;
        obj1 = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\u016F\u0179\u014B\u0173\u0176\u017A\u017F", '\203', '\001'), new Class[0]);
        try
        {
            s = ((String) (((Method) (obj1)).invoke(s, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if (!((Boolean)s).booleanValue()) goto _L3; else goto _L2
_L2:
        j = b044B044B044B044B044B044B;
        l = b044B044B044B044B044B044B;
        j1 = b044B044B044B044B044B044B;
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        (j * (l + j)) % j1;
        JVM INSTR tableswitch 0 0: default 276
    //                   0 410;
           goto _L4 _L5
_L4:
        s = rrrrrr/llllpl.getMethod(nuuuuu.b0417041704170417041704170417("\222`dca\u0461\u0461\u0461\u0461`dca", '0', '\005'), new Class[0]);
        try
        {
            s = ((String) (s.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        b044B044B044B044B044B044B = ((Integer)s).intValue();
        b044B044B044B044B044B044B = 62;
        flag = true;
_L7:
        switch (1)
        {
        case 0: // '\0'
            continue; /* Loop/switch isn't completed */

        default:
label1:
            while (true) 
            {
                switch (1)
                {
                default:
                    break;

                case 0: // '\0'
                    continue; /* Loop/switch isn't completed */

                case 1: // '\001'
                    break label1;
                }
            }
            // fall through

        case 1: // '\001'
            return flag;
        }
_L3:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L5:
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static boolean b043104310431043104310431(String s, String s1)
    {
label0:
        {
            {
                if (s == s1)
                {
                    return true;
                }
                if (s == null)
                {
                    break label0;
                }
                Method method = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\227\243\247\223\236\245", '\177', '\261', '\001'), new Class[] {
                    java/lang/Object
                });
                int i;
                int j;
                int k;
                int l;
                try
                {
                    s = ((String) (method.invoke(s, new Object[] {
                        s1
                    })));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                if (!((Boolean)s).booleanValue())
                {
                    break label0;
                }
                i = b044B044B044B044B044B044B;
                j = b044B044B044B044B044B044B;
                k = b044B044B044B044B044B044B;
                l = b044B044B044B044B044B044B;
                switch ((l * (b044B044B044B044B044B044B + l)) % b044B044B044B044B044B044B)
                {
                default:
                    s = rrrrrr/llllpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFE84\uFE52\uFE56\uFE55\uFE53\u0253\u0253\u0253\u0253\uFE52\uFE56\uFE55\uFE53", '\357', '\003'), new Class[0]);
                    boolean flag;
                    try
                    {
                        s = ((String) (s.invoke(null, new Object[0])));
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw s.getCause();
                    }
                    b044B044B044B044B044B044B = ((Integer)s).intValue();
                    b044B044B044B044B044B044B = 87;
                    // fall through

                case 0: // '\0'
                    switch ((i * (j + i)) % k)
                    {
                    default:
                        b044B044B044B044B044B044B = 82;
                        s = rrrrrr/llllpl.getMethod(nuuuuu.b0417041704170417041704170417("}KONL\u044C\u044C\u044C\u044CKONL", '\t', '\006'), new Class[0]);
                        try
                        {
                            s = ((String) (s.invoke(null, new Object[0])));
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            throw s.getCause();
                        }
                        b044B044B044B044B044B044B = ((Integer)s).intValue();
                        break;

                    case 0: // '\0'
                        break;
                    }
                    break;
                }
label1:
                do
                {
                    switch (1)
                    {
                    default:
                        while (true) 
                        {
                            switch (0)
                            {
                            default:
                                break;

                            case 0: // '\0'
                                break label1;

                            case 1: // '\001'
                                continue label1;
                            }
                        }
                        break;

                    case 0: // '\0'
                        break;

                    case 1: // '\001'
                        break label1;
                    }
                } while (true);
                flag = true;
            }
            return flag;
        }
        flag = false;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_282;
        }
    }

    public static int b043104310431043104310431()
    {
        return 1;
    }
}
