// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            f, g

final class h
    implements f
{

    h()
    {
    }

    public final void a()
    {
        g.a().warning("No action for the callback AsyncIO.Callback.inputStreamClosed()");
    }

    public final void a(int i)
    {
        g.a().warning((new StringBuilder("No action for the callback AsyncIO.Callback.dataReceived(")).append(i).append(")").toString());
    }

    public final void a(int i, boolean flag)
    {
        g.a().warning((new StringBuilder("No action for the callback AsyncIO.Callback.dataFlushed(")).append(i).append(", ").append(flag).append(" )").toString());
    }

    public final void a(Exception exception)
    {
        g.a().log(Level.WARNING, (new StringBuilder("No action for the callback AsyncIO.Callback.errorOccurred(")).append(exception.getMessage()).append(")").toString(), exception);
    }
}
