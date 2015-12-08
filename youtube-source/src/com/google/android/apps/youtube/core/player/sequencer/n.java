// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;


// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            k

final class n
    implements Runnable
{

    final Exception a;
    final k b;

    n(k k1, Exception exception)
    {
        b = k1;
        a = exception;
        super();
    }

    public final void run()
    {
        k.a(b, a);
    }
}
