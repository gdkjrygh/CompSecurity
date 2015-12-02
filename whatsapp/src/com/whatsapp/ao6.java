// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.bd;
import org.whispersystems.aa;

// Referenced classes of package com.whatsapp:
//            App, wm

final class ao6
    implements Runnable
{

    private final bd a[];
    final wm b;
    private final byte c[];
    private final bd d;
    private final int e;

    ao6(wm wm, byte abyte0[], int i, bd abd[], bd bd)
    {
        b = wm;
        super();
        c = abyte0;
        e = i;
        a = abd;
        d = bd;
    }

    public void run()
    {
        App.a(c, aa.a(e), (byte)5, a, d);
    }
}
