// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;


// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            u

final class w
    implements Runnable
{

    final u a;

    private w(u u1)
    {
        a = u1;
        super();
    }

    w(u u1, byte byte0)
    {
        this(u1);
    }

    public final void run()
    {
        a.m();
    }
}
