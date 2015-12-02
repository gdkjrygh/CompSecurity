// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.SecureRandom;

public final class gxc
    implements gsj
{

    private final gxf a;
    private final gsm b;
    private final SecureRandom c = new SecureRandom();

    public gxc(gxf gxf1, gsm gsm1)
    {
        a = gxf1;
        b = gsm1;
    }

    private byte[] a()
    {
        byte abyte0[] = new byte[24];
        c.nextBytes(abyte0);
        return abyte0;
    }

    public final gxd a(String s)
    {
        byte abyte0[] = s.getBytes(Charset.forName("UTF-8"));
        s = a();
        a.a(s);
        abyte0 = a.b(abyte0);
        s = b.a(s);
        if (abyte0 != null && s != null)
        {
            return new gxd(Base64.encodeToString(abyte0, 2), Base64.encodeToString(s, 2));
        } else
        {
            return null;
        }
    }

    public final volatile Object a(Object obj)
    {
        return a((String)obj);
    }
}
