// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.a;

import java.io.UnsupportedEncodingException;
import org.a.c.b.b.b.a;
import org.a.c.b.b.b.b;
import org.a.c.b.b.b.c;
import org.a.c.b.b.i;

// Referenced classes of package org.a.c.b.b.a:
//            e, h, l

public final class g extends e
{

    private static final h f;
    private static final h g;
    private static final h h;
    private static final h i;
    private static final h j[];

    public g(String s, int k, a aa[], l l)
    {
        super(s, k, aa, -1, l);
    }

    public g(String s, a a1, l l)
    {
        super(s, 37510, a1, 1, l);
    }

    public final Object a(i k)
    {
        if (k.e == E_.b)
        {
            return E_.c(k);
        }
        if (k.e != J_.b && k.e != D_.b)
        {
            org.a.c.c.a.a("entry.type", k.e);
            org.a.c.c.a.a("entry.directoryType", k.d);
            org.a.c.c.a.a("entry.type", k.b());
            org.a.c.c.a.a("entry.type", k.b);
            throw new org.a.c.b("Text field not encoded as bytes.");
        }
        k = k.b.b(k);
        if (k.length < 8)
        {
            try
            {
                k = new String(k, "US-ASCII");
            }
            // Misplaced declaration of an exception variable
            catch (i k)
            {
                throw new org.a.c.b("Text field missing encoding prefix.");
            }
            return k;
        }
        int l = 0;
        do
        {
            if (l >= j.length)
            {
                try
                {
                    k = new String(k, "US-ASCII");
                }
                // Misplaced declaration of an exception variable
                catch (i k)
                {
                    throw new org.a.c.b("Unknown text encoding prefix.");
                }
                return k;
            }
            h h1 = j[l];
            if (org.a.c.a.a.a(k, h1.a, h1.a.length))
            {
                try
                {
                    k = new String(k, h1.a.length, k.length - h1.a.length, h1.b);
                }
                // Misplaced declaration of an exception variable
                catch (i k)
                {
                    throw new org.a.c.b(k.getMessage(), k);
                }
                return k;
            }
            l++;
        } while (true);
    }

    public final byte[] a(a a1, Object obj, int k)
    {
        if (!(obj instanceof String))
        {
            throw new org.a.c.c((new StringBuilder("Text value not String: ")).append(obj).append(" (").append(org.a.c.c.a.a(obj)).append(")").toString());
        }
        obj = (String)obj;
        a1 = ((String) (obj)).getBytes(f.b);
        if (!(new String(a1, f.b)).equals(obj))
        {
            break MISSING_BLOCK_LABEL_134;
        }
        obj = new byte[a1.length + f.a.length];
        System.arraycopy(f.a, 0, obj, 0, f.a.length);
        System.arraycopy(a1, 0, obj, f.a.length, a1.length);
        return ((byte []) (obj));
        try
        {
            a1 = ((String) (obj)).getBytes(h.b);
            obj = new byte[a1.length + h.a.length];
            System.arraycopy(h.a, 0, obj, 0, h.a.length);
            System.arraycopy(a1, 0, obj, h.a.length, a1.length);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new org.a.c.c(a1.getMessage(), a1);
        }
        return ((byte []) (obj));
    }

    static 
    {
        byte abyte0[] = new byte[8];
        abyte0[0] = 65;
        abyte0[1] = 83;
        abyte0[2] = 67;
        abyte0[3] = 73;
        abyte0[4] = 73;
        f = new h(abyte0, "US-ASCII");
        abyte0 = new byte[8];
        abyte0[0] = 74;
        abyte0[1] = 73;
        abyte0[2] = 83;
        g = new h(abyte0, "JIS");
        abyte0 = new byte[8];
        abyte0[0] = 85;
        abyte0[1] = 78;
        abyte0[2] = 73;
        abyte0[3] = 67;
        abyte0[4] = 79;
        abyte0[5] = 68;
        abyte0[6] = 69;
        h = new h(abyte0, "UTF-8");
        i = new h(new byte[8], "ISO-8859-1");
        j = (new h[] {
            f, g, h, i
        });
    }
}
