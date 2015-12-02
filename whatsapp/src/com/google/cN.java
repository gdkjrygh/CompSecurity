// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            d9, fq

final class cN
{

    private static final String z[];
    private final StringBuilder a;
    private final Appendable b;
    private boolean c;

    private cN(Appendable appendable)
    {
        a = new StringBuilder();
        c = true;
        b = appendable;
    }

    cN(Appendable appendable, fq fq)
    {
        this(appendable);
    }

    private void a(CharSequence charsequence, int i)
    {
        if (i == 0)
        {
            return;
        }
        try
        {
            if (c)
            {
                c = false;
                b.append(a);
            }
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        b.append(charsequence);
    }

    public void a()
    {
        a.append(z[1]);
    }

    public void a(CharSequence charsequence)
    {
        int i = 0;
        int l = d9.c;
        int i1 = charsequence.length();
        int k = 0;
        int j;
        do
        {
            j = i;
            if (k >= i1)
            {
                break;
            }
            j = i;
            if (charsequence.charAt(k) == '\n')
            {
                a(charsequence.subSequence(i, i1), (k - i) + 1);
                j = k + 1;
                c = true;
            }
            k++;
            i = j;
        } while (l == 0);
        a(charsequence.subSequence(j, i1), i1 - j);
    }

    public void b()
    {
        int i = a.length();
        if (i == 0)
        {
            try
            {
                throw new IllegalArgumentException(z[0]);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            a.delete(i - 2, i);
            return;
        }
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "pMGU\n5lF\tGpu[U\006?wF\001\0031vQI\007>e\022h\0004g\\UFy,".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            ac = "p\"".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_42;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 112
    //                   0 130
    //                   1 136
    //                   2 141
    //                   3 147;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_147;
_L1:
        byte0 = 110;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 80;
          goto _L7
_L3:
        byte0 = 2;
          goto _L7
_L4:
        byte0 = 50;
          goto _L7
        byte0 = 33;
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
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 210
    //                   1 216
    //                   2 221
    //                   3 227;
           goto _L8 _L9 _L10 _L11 _L12
_L9:
        break; /* Loop/switch isn't completed */
_L12:
        break MISSING_BLOCK_LABEL_227;
_L8:
        byte byte1 = 110;
_L15:
        ac[i] = (char)(byte1 ^ c1);
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        byte1 = 80;
          goto _L15
_L10:
        byte1 = 2;
          goto _L15
_L11:
        byte1 = 50;
          goto _L15
        byte1 = 33;
          goto _L15
    }
}
