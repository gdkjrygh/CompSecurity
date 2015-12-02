// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.whatsapp.protocol:
//            b8, b1, bj, c4

public class bu extends OutputStream
{

    bj a;
    b1 b;
    OutputStream c;

    public bu(bj bj1)
    {
        b = new b8(this);
        a = bj1;
    }

    public int a(InputStream inputstream, int i)
    {
        if (c != null)
        {
            byte abyte0[] = new byte[i];
            i = inputstream.read(abyte0, 0, i);
            if (i > 0)
            {
                c.write(abyte0, 0, i);
            }
            return i;
        } else
        {
            return b.a(inputstream, i);
        }
    }

    public void a(bj bj1)
    {
        a = bj1;
    }

    public byte[] a()
    {
        return b.a();
    }

    public void b()
    {
        try
        {
            e();
        }
        catch (IOException ioexception) { }
        c = null;
        b.reset();
    }

    public void c()
    {
        if (c != null)
        {
            return;
        } else
        {
            c = a.a(b);
            return;
        }
    }

    public void close()
    {
label0:
        {
            if (c != null)
            {
                c.close();
                if (c4.F == 0)
                {
                    break label0;
                }
            }
            b.close();
        }
    }

    public boolean d()
    {
        return c != null;
    }

    public void e()
    {
        if (c == null)
        {
            return;
        } else
        {
            c.close();
            c = null;
            return;
        }
    }

    public int f()
    {
        return b.b();
    }

    public void flush()
    {
label0:
        {
            if (c != null)
            {
                c.flush();
                if (c4.F == 0)
                {
                    break label0;
                }
            }
            b.flush();
        }
    }

    public void write(int i)
    {
label0:
        {
            if (c != null)
            {
                c.write(i);
                if (c4.F == 0)
                {
                    break label0;
                }
            }
            b.write(i);
        }
    }

    public void write(byte abyte0[])
    {
label0:
        {
            if (c != null)
            {
                c.write(abyte0);
                if (c4.F == 0)
                {
                    break label0;
                }
            }
            b.write(abyte0);
        }
    }

    public void write(byte abyte0[], int i, int j)
    {
label0:
        {
            if (c != null)
            {
                c.write(abyte0, i, j);
                if (c4.F == 0)
                {
                    break label0;
                }
            }
            b.write(abyte0, i, j);
        }
    }
}
