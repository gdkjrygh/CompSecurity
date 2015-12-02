// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            a0, k, bQ

abstract class at extends a0
{

    private static final String z;

    at(bQ bq)
    {
        super(bq);
    }

    private static void a(StringBuilder stringbuilder, int i)
    {
        int k1 = a0.b;
        int l = 0;
        int j = 0;
        do
        {
label0:
            {
                int i1 = j;
                if (l < 13)
                {
                    int j1 = stringbuilder.charAt(l + i) - 48;
                    i1 = j1;
                    if ((l & 1) == 0)
                    {
                        i1 = j1 * 3;
                    }
                    j += i1;
                    if (k1 == 0)
                    {
                        break label0;
                    }
                    i1 = j;
                }
                j = 10 - i1 % 10;
                i = j;
                if (j == 10)
                {
                    i = 0;
                }
                stringbuilder.append(i);
                return;
            }
            l++;
        } while (true);
    }

    protected final void a(StringBuilder stringbuilder, int i, int j)
    {
        int i1 = a0.b;
        int l = 0;
        do
        {
            if (l >= 4)
            {
                break;
            }
            int j1 = a().a(l * 10 + i, 10);
            if (j1 / 100 == 0)
            {
                stringbuilder.append('0');
            }
            if (j1 / 10 == 0)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(j1);
            l++;
        } while (i1 == 0);
        a(stringbuilder, j);
    }

    protected final void b(StringBuilder stringbuilder, int i)
    {
        stringbuilder.append(z);
        int j = stringbuilder.length();
        stringbuilder.append('9');
        a(stringbuilder, i, j);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "8.Qn".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 15;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 16;
          goto _L8
_L3:
        byte0 = 30;
          goto _L8
_L4:
        byte0 = 96;
          goto _L8
        byte0 = 71;
          goto _L8
    }
}
