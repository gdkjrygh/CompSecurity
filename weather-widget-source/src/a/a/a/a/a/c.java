// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a;

import a.a.a.a.a.a.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.util.ByteArrayBuffer;

// Referenced classes of package a.a.a.a.a:
//            f, a, d, e, 
//            b, g

public class c
{

    private static final ByteArrayBuffer a;
    private static final ByteArrayBuffer b;
    private static final ByteArrayBuffer c;
    private final String d;
    private final Charset e;
    private final String f;
    private final List g = new ArrayList();
    private final e h;

    public c(String s, Charset charset, String s1, e e1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Multipart subtype may not be null");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Multipart boundary may not be null");
        }
        d = s;
        if (charset == null)
        {
            charset = f.a;
        }
        e = charset;
        f = s1;
        h = e1;
    }

    private static ByteArrayBuffer a(Charset charset, String s)
    {
        charset = charset.encode(CharBuffer.wrap(s));
        s = new ByteArrayBuffer(charset.remaining());
        s.append(charset.array(), charset.position(), charset.remaining());
        return s;
    }

    private void a(e e1, OutputStream outputstream, boolean flag)
    {
        ByteArrayBuffer bytearraybuffer;
        Iterator iterator;
        bytearraybuffer = a(e, b());
        iterator = g.iterator();
_L2:
        a a1;
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_222;
        }
        a1 = (a)iterator.next();
        a(c, outputstream);
        a(bytearraybuffer, outputstream);
        a(b, outputstream);
        obj = a1.c();
        switch (d.a[e1.ordinal()])
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;
        }
        break MISSING_BLOCK_LABEL_170;
_L3:
        a(b, outputstream);
        if (flag)
        {
            a1.().a(outputstream);
        }
        a(b, outputstream);
        if (true) goto _L2; else goto _L1
_L1:
        obj = ((a.a.a.a.a.b) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            a((g)((Iterator) (obj)).next(), outputstream);
        }
          goto _L3
        a(a1.c().a("Content-Disposition"), e, outputstream);
        if (a1.().b() != null)
        {
            a(a1.c().a("Content-Type"), e, outputstream);
        }
          goto _L3
        a(c, outputstream);
        a(bytearraybuffer, outputstream);
        a(c, outputstream);
        a(b, outputstream);
        return;
    }

    private static void a(g g1, OutputStream outputstream)
    {
        a(g1.a(), outputstream);
        a(a, outputstream);
        a(g1.b(), outputstream);
        a(b, outputstream);
    }

    private static void a(g g1, Charset charset, OutputStream outputstream)
    {
        a(g1.a(), charset, outputstream);
        a(a, outputstream);
        a(g1.b(), charset, outputstream);
        a(b, outputstream);
    }

    private static void a(String s, OutputStream outputstream)
    {
        a(a(f.a, s), outputstream);
    }

    private static void a(String s, Charset charset, OutputStream outputstream)
    {
        a(a(charset, s), outputstream);
    }

    private static void a(ByteArrayBuffer bytearraybuffer, OutputStream outputstream)
    {
        outputstream.write(bytearraybuffer.buffer(), 0, bytearraybuffer.length());
    }

    public List a()
    {
        return g;
    }

    public void a(a a1)
    {
        if (a1 == null)
        {
            return;
        } else
        {
            g.add(a1);
            return;
        }
    }

    public void a(OutputStream outputstream)
    {
        a(h, outputstream, true);
    }

    public String b()
    {
        return f;
    }

    public long c()
    {
        Object obj = g.iterator();
        long l = 0L;
        while (((Iterator) (obj)).hasNext()) 
        {
            long l1 = ((a)((Iterator) (obj)).next()).().e();
            if (l1 >= 0L)
            {
                l += l1;
            } else
            {
                return -1L;
            }
        }
        obj = new ByteArrayOutputStream();
        int i;
        try
        {
            a(h, ((OutputStream) (obj)), false);
            i = ((ByteArrayOutputStream) (obj)).toByteArray().length;
        }
        catch (IOException ioexception)
        {
            return -1L;
        }
        return l + (long)i;
    }

    static 
    {
        a = a(f.a, ": ");
        b = a(f.a, "\r\n");
        c = a(f.a, "--");
    }
}
