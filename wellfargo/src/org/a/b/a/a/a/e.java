// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.b.a.a.a;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

// Referenced classes of package org.a.b.a.a.a:
//            a

public class e extends a
{

    private final byte a[];
    private final Charset b;

    public e(String s, String s1, Charset charset)
    {
        super(s1);
        if (s == null)
        {
            throw new IllegalArgumentException("Text may not be null");
        }
        s1 = charset;
        if (charset == null)
        {
            s1 = Charset.forName("US-ASCII");
        }
        a = s.getBytes(s1.name());
        b = s1;
    }

    public e(String s, Charset charset)
    {
        this(s, "text/plain", charset);
    }

    public void a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(a);
        byte abyte0[] = new byte[4096];
        do
        {
            int i = bytearrayinputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
            } else
            {
                outputstream.flush();
                return;
            }
        } while (true);
    }

    public String b()
    {
        return null;
    }

    public String c()
    {
        return b.name();
    }

    public String d()
    {
        return "8bit";
    }

    public long e()
    {
        return (long)a.length;
    }
}
