// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.a.a;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package org.a.c.b.a.a:
//            d

class e extends d
{

    public final byte a[];
    public final byte b[] = null;
    public final InputStream c;

    public e(byte abyte0[], InputStream inputstream)
    {
        super((byte)0);
        a = abyte0;
        c = inputstream;
    }

    protected final void a(OutputStream outputstream)
    {
        outputstream.write(a);
        if (b != null)
        {
            outputstream.write(b);
            return;
        }
        byte abyte0[] = new byte[1024];
        do
        {
            int i = c.read(abyte0);
            if (i <= 0)
            {
                try
                {
                    c.close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (OutputStream outputstream)
                {
                    return;
                }
            }
            outputstream.write(abyte0, 0, i);
        } while (true);
    }
}
