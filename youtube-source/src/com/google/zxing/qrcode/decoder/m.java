// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.b;
import com.google.zxing.common.d;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.a;
import com.google.zxing.common.reedsolomon.c;
import java.util.Map;

// Referenced classes of package com.google.zxing.qrcode.decoder:
//            a, n, b, l, 
//            o

public final class m
{

    private final c a;

    public m()
    {
        a = new c(a.e);
    }

    private d a(com.google.zxing.qrcode.decoder.a a1, Map map)
    {
        p p = a1.b();
        ErrorCorrectionLevel errorcorrectionlevel = a1.a().a();
        a1 = com.google.zxing.qrcode.decoder.b.a(a1.c(), p, errorcorrectionlevel);
        int k = 0;
        int i1 = a1.length;
        for (int i = 0; i < i1; i++)
        {
            k += a1[i].a();
        }

        byte abyte0[] = new byte[k];
        k = 0;
        int i2 = a1.length;
        for (int j = 0; j < i2; j++)
        {
            com.google.zxing.qrcode.decoder.b b1 = a1[j];
            byte abyte1[] = b1.b();
            int j2 = b1.a();
            int k2 = abyte1.length;
            int ai[] = new int[k2];
            for (int j1 = 0; j1 < k2; j1++)
            {
                ai[j1] = abyte1[j1] & 0xff;
            }

            int k1 = abyte1.length;
            try
            {
                a.a(ai, k1 - j2);
            }
            // Misplaced declaration of an exception variable
            catch (com.google.zxing.qrcode.decoder.a a1)
            {
                throw ChecksumException.getChecksumInstance();
            }
            for (k1 = 0; k1 < j2; k1++)
            {
                abyte1[k1] = (byte)ai[k1];
            }

            for (int l1 = 0; l1 < j2;)
            {
                abyte0[k] = abyte1[l1];
                l1++;
                k++;
            }

        }

        return com.google.zxing.qrcode.decoder.l.a(abyte0, p, errorcorrectionlevel, map);
    }

    public final d a(b b1, Map map)
    {
        com.google.zxing.qrcode.decoder.a a1 = new com.google.zxing.qrcode.decoder.a(b1);
        b1 = a(a1, map);
        return b1;
        FormatException formatexception;
        formatexception;
        b1 = null;
_L2:
        try
        {
            a1.d();
            a1.a(true);
            a1.b();
            a1.a();
            a1.e();
            map = a(a1, map);
            map.a(new o(true));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            if (formatexception != null)
            {
                throw formatexception;
            }
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            if (formatexception != null)
            {
                throw formatexception;
            }
            if (b1 != null)
            {
                throw b1;
            } else
            {
                throw map;
            }
        }
        return map;
        b1;
        formatexception = null;
        if (true) goto _L2; else goto _L1
_L1:
        if (b1 != null)
        {
            throw b1;
        } else
        {
            throw map;
        }
    }
}
