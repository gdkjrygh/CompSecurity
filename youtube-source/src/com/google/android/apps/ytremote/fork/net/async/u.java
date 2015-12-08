// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import java.nio.channels.SelectableChannel;

// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            ai, d, c, b, 
//            af, an, o

public interface u
    extends ai, d
{

    public abstract b a(long l, Object obj, c c1);

    public abstract void a(SelectableChannel selectablechannel);

    public abstract void a(SelectableChannel selectablechannel, af af);

    public abstract void a(SelectableChannel selectablechannel, an an);

    public abstract void a(SelectableChannel selectablechannel, o o);

    public abstract void b(SelectableChannel selectablechannel);

    public abstract void c(SelectableChannel selectablechannel);

    public abstract void execute(Runnable runnable);
}
