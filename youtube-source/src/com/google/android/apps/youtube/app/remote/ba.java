// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            RemoteControl, ax

abstract class ba
    implements b
{

    protected final RemoteControl b;
    protected final int c;
    protected final boolean d;
    final ax e;

    private ba(ax ax, RemoteControl remotecontrol, int i, boolean flag)
    {
        e = ax;
        super();
        c = i;
        b = remotecontrol;
        d = flag;
    }

    ba(ax ax, RemoteControl remotecontrol, int i, boolean flag, byte byte0)
    {
        this(ax, remotecontrol, i, flag);
    }
}
