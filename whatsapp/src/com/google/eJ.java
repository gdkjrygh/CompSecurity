// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google:
//            ga, d9, b, bp, 
//            a3, eL, z

public abstract class eJ
    implements ga
{

    private static final String z[];

    public eJ()
    {
    }

    private static void a(Iterable iterable)
    {
        int i = d9.c;
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            if (iterable.next() == null)
            {
                try
                {
                    throw new NullPointerException();
                }
                // Misplaced declaration of an exception variable
                catch (Iterable iterable)
                {
                    throw iterable;
                }
            }
        } while (i == 0);
    }

    protected static void a(Iterable iterable, Collection collection)
    {
        int i = d9.c;
        boolean flag = iterable instanceof b;
        if (flag)
        {
            try
            {
                a(((Iterable) (((b)iterable).a())));
            }
            // Misplaced declaration of an exception variable
            catch (Iterable iterable)
            {
                throw iterable;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_33;
            }
        }
        a(iterable);
label0:
        {
            if (iterable instanceof Collection)
            {
                collection.addAll((Collection)iterable);
                if (i == 0)
                {
                    break label0;
                }
            }
            iterable = iterable.iterator();
            do
            {
                if (!iterable.hasNext())
                {
                    break;
                }
                collection.add(iterable.next());
            } while (i == 0);
        }
        return;
        iterable;
        throw iterable;
    }

    public abstract eJ a();

    public eJ a(a3 a3_1, z z1)
    {
        try
        {
            a3_1 = a3_1.d();
            a(((eL) (a3_1)), z1);
            a3_1.c(0);
        }
        // Misplaced declaration of an exception variable
        catch (a3 a3_1)
        {
            throw a3_1;
        }
        // Misplaced declaration of an exception variable
        catch (a3 a3_1)
        {
            throw new RuntimeException(z[1], a3_1);
        }
        return this;
    }

    public eJ a(eL el)
    {
        return a(el, com.google.z.b());
    }

    public abstract eJ a(eL el, z z1);

    public eJ a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public eJ a(byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = eL.a(abyte0, i, j);
            a(((eL) (abyte0)));
            abyte0.c(0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(z[0], abyte0);
        }
        return this;
    }

    public ga a(eL el, z z1)
    {
        return a(el, z1);
    }

    public ga a(byte abyte0[])
    {
        return a(abyte0);
    }

    public Object clone()
    {
        return a();
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "[8qpdg:0r\177f00u-k$dq-h/but))xfh~}qz-@\022Ulnl-d}bg}8gef(|p-g8fq\177)5qd}l39:".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            ac = "[8qpdg:0r\177f00u-K$dq^}/yzj))xfh~}qz-@\022Ulnl-d}bg}8gef(|p-g8fq\177)5qd}l39:".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_42;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 112
    //                   0 130
    //                   1 136
    //                   2 142
    //                   3 148;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_148;
_L1:
        byte0 = 13;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 9;
          goto _L7
_L3:
        byte0 = 93;
          goto _L7
_L4:
        byte0 = 16;
          goto _L7
        byte0 = 20;
          goto _L7
_L14:
        byte byte0;
        if (j <= i)
        {
            z = (new String[] {
                obj, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 210
    //                   1 216
    //                   2 222
    //                   3 228;
           goto _L8 _L9 _L10 _L11 _L12
_L9:
        break; /* Loop/switch isn't completed */
_L12:
        break MISSING_BLOCK_LABEL_228;
_L8:
        byte byte1 = 13;
_L15:
        ac[i] = (char)(byte1 ^ c);
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        byte1 = 9;
          goto _L15
_L10:
        byte1 = 93;
          goto _L15
_L11:
        byte1 = 16;
          goto _L15
        byte1 = 20;
          goto _L15
    }
}
