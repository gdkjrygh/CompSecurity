// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package org.whispersystems:
//            b7, at, aY

public class a6
{

    public static int b;
    private static final byte d[];
    private static final byte e[];
    private static final String z[];
    private final at a;
    private final byte c[];
    private final int f;

    public a6(at at1, byte abyte0[], int i)
    {
        a = at1;
        c = abyte0;
        f = i;
    }

    private byte[] a(byte abyte0[])
    {
        Mac mac = Mac.getInstance(z[1]);
        mac.init(new SecretKeySpec(c, z[2]));
        abyte0 = mac.doFinal(abyte0);
        return abyte0;
        abyte0;
_L2:
        throw new AssertionError(abyte0);
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public aY a()
    {
        byte abyte0[] = a(e);
        b7 b7_1 = new b7(a.a(abyte0, z[0].getBytes(), 80));
        return new aY(b7_1.c(), b7_1.b(), b7_1.a(), f);
    }

    public byte[] b()
    {
        return c;
    }

    public a6 c()
    {
        byte abyte0[] = a(d);
        return new a6(a, abyte0, f + 1);
    }

    public int d()
    {
        return f;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "'I =T\025S\004+W\003@.+o\025X:";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "8L(-w8`{{\022";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "8L(-w8`{{\022";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                e = (new byte[] {
                    1
                });
                d = (new byte[] {
                    2
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 36;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 112;
          goto _L9
_L5:
        byte0 = 33;
          goto _L9
_L6:
        byte0 = 73;
          goto _L9
        byte0 = 78;
          goto _L9
    }
}
