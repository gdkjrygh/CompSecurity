// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;


// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            d

final class g
    implements Runnable
{

    final boolean a;
    final d b;

    g(d d1, boolean flag)
    {
        b = d1;
        a = flag;
        super();
    }

    public final void run()
    {
        d.a(b, a);
    }
}
