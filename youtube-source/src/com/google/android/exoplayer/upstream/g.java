// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;


// Referenced classes of package com.google.android.exoplayer.upstream:
//            a, f

final class g
    implements a
{

    final f a;
    private byte b[][];

    public g(f f1, byte abyte0[][])
    {
        a = f1;
        super();
        b = abyte0;
    }

    public final byte[][] a()
    {
        return b;
    }

    public final int b()
    {
        return a.a;
    }

    public final void c()
    {
        if (b != null)
        {
            a.a(this);
            b = null;
        }
    }
}
