// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;


// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            p, w

public final class v
{

    public static void a(p p1)
    {
        if (!p1.e())
        {
            throw new IllegalThreadStateException("Only the network thread of an EventDispatcher can dispatch events for it");
        } else
        {
            w.a(p1, 0L);
            p1.a();
            return;
        }
    }
}
