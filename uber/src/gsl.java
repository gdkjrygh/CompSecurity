// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;

public final class gsl
    implements gsj
{

    private String a;

    public gsl(String s)
    {
        a = s;
    }

    private String a(String s)
    {
        byte abyte2[] = s.getBytes(Charset.forName("UTF-8"));
        s = a(8);
        byte abyte1[] = a(32);
        byte abyte0[] = a(32);
        abyte2 = (new gsi(abyte1, s)).a(abyte2);
        byte abyte3[] = a(((byte []) (s)), abyte2);
        abyte3 = (new gsk(abyte0)).a(abyte3);
        gsm gsm1 = new gsm(a, "RSA/ECB/OAEPWithSHA1AndMGF1Padding");
        abyte1 = gsm1.a(abyte1);
        return a("ue-1_0_1", new byte[][] {
            gsm1.a(abyte0), abyte1, s, abyte2, abyte3
        });
    }

    private static transient String a(String s, byte abyte0[][])
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        for (int i = 0; i < 5; i++)
        {
            arraylist.add(Base64.encodeToString(abyte0[i], 2));
        }

        return gjw.a("$").a(arraylist);
    }

    private static byte[] a(int i)
    {
        byte abyte0[] = new byte[i];
        (new SecureRandom()).nextBytes(abyte0);
        return abyte0;
    }

    private static byte[] a(byte abyte0[], byte abyte1[])
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(Base64.encodeToString(abyte0, 2));
        arraylist.add(Base64.encodeToString(abyte1, 2));
        return gjw.a("$").a(arraylist).getBytes(Charset.forName("UTF-8"));
    }

    public final volatile Object a(Object obj)
    {
        return a((String)obj);
    }
}
