// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            h, i, j, k, 
//            u, f

public final class g
{

    public static final f a = new h();
    public static final f b = new i();
    public static final f c = new j();
    private static final Logger d = Logger.getLogger(com/google/android/apps/ytremote/fork/net/async/g.getName());

    private g()
    {
    }

    static Logger a()
    {
        return d;
    }

    static void a(f f, Exception exception, u u1)
    {
        u1.a(0L, null, new k(f, exception));
    }

}
