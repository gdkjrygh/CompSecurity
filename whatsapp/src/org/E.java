// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org;

import java.io.ByteArrayOutputStream;
import java.util.BitSet;

// Referenced classes of package org:
//            ap, v, b, u, 
//            d, S

public class E
    implements ap, v, b, u
{

    public static int a;
    private static final BitSet b;
    private static final String z;

    public static final byte[] a(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream;
        int i;
        int j;
        j = a;
        if (abyte0 == null)
        {
            return null;
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        i = 0;
_L2:
        int k;
        if (i >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        k = abyte0[i];
        if (k != 61)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        i++;
        try
        {
            k = d.a(abyte0[i]);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new S(z, abyte0);
        }
        i++;
        bytearrayoutputstream.write((char)((k << 4) + d.a(abyte0[i])));
_L3:
        i++;
        if (j == 0) goto _L2; else goto _L1
_L1:
        return bytearrayoutputstream.toByteArray();
        bytearrayoutputstream.write(k);
          goto _L3
    }

    static 
    {
        Object obj;
        int j;
        int k;
        obj = "=l2Aa\035fdQx\033v!D \004p-Ny\025`(E-\021l'Oi\035l#".toCharArray();
        k = obj.length;
        j = 0;
_L7:
        char c;
        if (k <= j)
        {
            z = (new String(((char []) (obj)))).intern();
            b = new BitSet(256);
            int i = 33;
            while (i <= 60) 
            {
                try
                {
                    b.set(i);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                i++;
            }
            i = 62;
            while (i <= 126) 
            {
                try
                {
                    b.set(i);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                i++;
            }
            b.set(9);
            b.set(32);
            return;
        }
        c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 152
    //                   0 170
    //                   1 176
    //                   2 181
    //                   3 187;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_187;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 13;
_L8:
        obj[j] = (char)(byte0 ^ c);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 116;
          goto _L8
_L3:
        byte0 = 2;
          goto _L8
_L4:
        byte0 = 68;
          goto _L8
        byte0 = 32;
          goto _L8
    }
}
