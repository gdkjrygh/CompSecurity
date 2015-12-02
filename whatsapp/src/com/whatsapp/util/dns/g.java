// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.dns;

import java.io.OutputStream;

// Referenced classes of package com.whatsapp.util.dns:
//            i, e

class g
{

    private static final String z[];
    private final int a;
    private final i b;
    private final short c;
    private final short d;

    private g(i j, short word0, short word1, int k)
    {
        b = j;
        d = word0;
        c = word1;
        a = k;
    }

    static g a(i j, short word0, short word1)
    {
        return new g(j, word0, word1, j.c() + 4);
    }

    static g a(byte abyte0[], int j)
    {
        if (abyte0 == null)
        {
            try
            {
                throw new NullPointerException(z[1]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        i k = i.a(abyte0, j);
        j = k.c() + j;
        try
        {
            if (abyte0.length < j + 4)
            {
                throw new IllegalArgumentException(z[0]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        return new g(k, e.a(abyte0, j), e.a(abyte0, j + 2), k.c() + 4);
    }

    int a()
    {
        return a;
    }

    void a(OutputStream outputstream)
    {
        b.a(outputstream);
        e.a(outputstream, d);
        e.a(outputstream, c);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int j;
        as = new String[2];
        obj = "F\034\025zgI\033\005fdA\006Fk`[\023";
        byte1 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "M\013\022jr\017\037\007v!A\035\022/cJR\bzmC";
                j = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 156
    //                   1 162
    //                   2 168
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 1;
_L9:
        obj[k] = (char)(byte0 ^ c1);
        k++;
          goto _L8
_L4:
        byte0 = 47;
          goto _L9
_L5:
        byte0 = 114;
          goto _L9
_L6:
        byte0 = 102;
          goto _L9
        byte0 = 15;
          goto _L9
    }
}
