// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.bd;
import org.whispersystems.aa;

// Referenced classes of package com.whatsapp:
//            App, ah

final class af2
    implements Runnable
{

    private final bd a[];
    private final byte b[];
    final ah c;
    private final bd d;
    private final int e;

    af2(ah ah1, int i, byte abyte0[], bd abd[], bd bd)
    {
        c = ah1;
        super();
        e = i;
        b = abyte0;
        a = abd;
        d = bd;
    }

    public void run()
    {
        App.a(b, aa.a(e), (byte)5, a, d);
        if (c.a != null)
        {
            App.a(c.a);
        }
    }
}
