// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            ab, p, v, x

class ac
    implements ab
{

    private ac()
    {
    }

    ac(byte byte0)
    {
        this();
    }

    public final void a(p p1)
    {
        try
        {
            p1.a();
            v.a(p1);
            x.b().info((new StringBuilder("EventDispatcher.loop() normal exit by ")).append(Thread.currentThread()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (p p1)
        {
            x.b().log(Level.SEVERE, (new StringBuilder("EventDispatcher.loop() error exit by ")).append(Thread.currentThread()).toString(), p1);
        }
        a(((Throwable) (p1)));
    }

    protected void a(Throwable throwable)
    {
        throw new RuntimeException(throwable);
    }
}
