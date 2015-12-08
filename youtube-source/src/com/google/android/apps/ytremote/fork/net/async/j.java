// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;


// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            f

final class j
    implements f
{

    j()
    {
    }

    public final void a()
    {
        throw new UnsupportedOperationException("No action for the callback AsyncIO.Callback.inputStreamClosed()");
    }

    public final void a(int i)
    {
        throw new UnsupportedOperationException((new StringBuilder("No action for the callback AsyncIO.Callback.dataReceived(")).append(i).append(")").toString());
    }

    public final void a(int i, boolean flag)
    {
        throw new UnsupportedOperationException((new StringBuilder("No action for the callback AsyncIO.Callback.dataFlushed(")).append(i).append(", ").append(flag).append(" )").toString());
    }

    public final void a(Exception exception)
    {
        throw new UnsupportedOperationException((new StringBuilder("No action for the callback AsyncIO.Callback.errorOccurred(")).append(exception.getMessage()).append(")").toString(), exception);
    }
}
