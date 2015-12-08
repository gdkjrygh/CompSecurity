// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.a;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.a:
//            b

final class g
    implements Runnable
{

    final IOException a;
    final b b;

    g(b b1, IOException ioexception)
    {
        b = b1;
        a = ioexception;
        super();
    }

    public final void run()
    {
        com.google.android.exoplayer.a.b.b(b);
        com.google.android.exoplayer.a.b.a(b);
        IOException ioexception = a;
    }
}
