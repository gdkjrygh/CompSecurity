// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a.a;

import com.android.a.ab;
import com.android.a.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

// Referenced classes of package com.android.a.a:
//            d

class e
{

    public long a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public Map g;

    private e()
    {
    }

    public e(String s, c c1)
    {
        b = s;
        a = c1.a.length;
        c = c1.b;
        d = c1.c;
        e = c1.d;
        f = c1.e;
        g = c1.f;
    }

    public static e a(InputStream inputstream)
    {
        e e1 = new e();
        if (com.android.a.a.d.a(inputstream) != 0x20120504)
        {
            throw new IOException();
        }
        e1.b = com.android.a.a.d.c(inputstream);
        e1.c = com.android.a.a.d.c(inputstream);
        if (e1.c.equals(""))
        {
            e1.c = null;
        }
        e1.d = com.android.a.a.d.b(inputstream);
        e1.e = com.android.a.a.d.b(inputstream);
        e1.f = com.android.a.a.d.b(inputstream);
        e1.g = com.android.a.a.d.d(inputstream);
        return e1;
    }

    public c a(byte abyte0[])
    {
        c c1 = new c();
        c1.a = abyte0;
        c1.b = c;
        c1.c = d;
        c1.d = e;
        c1.e = f;
        c1.f = g;
        return c1;
    }

    public boolean a(OutputStream outputstream)
    {
        com.android.a.a.d.a(outputstream, 0x20120504);
        com.android.a.a.d.a(outputstream, b);
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        String s = "";
_L1:
        try
        {
            com.android.a.a.d.a(outputstream, s);
            com.android.a.a.d.a(outputstream, d);
            com.android.a.a.d.a(outputstream, e);
            com.android.a.a.d.a(outputstream, f);
            com.android.a.a.d.a(g, outputstream);
            outputstream.flush();
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            ab.b("%s", new Object[] {
                outputstream.toString()
            });
            return false;
        }
        return true;
        s = c;
          goto _L1
    }
}
