// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.a.a;

import java.io.OutputStream;

// Referenced classes of package org.a.c.b.a.a:
//            d

class f extends d
{

    public final int a;
    public final byte b[];
    public final byte c[];
    public final byte d[];

    public f(int i, byte abyte0[], byte abyte1[], byte abyte2[])
    {
        super((byte)0);
        a = i;
        b = abyte0;
        c = abyte1;
        d = abyte2;
    }

    protected final void a(OutputStream outputstream)
    {
        outputstream.write(b);
        outputstream.write(c);
        outputstream.write(d);
    }
}
