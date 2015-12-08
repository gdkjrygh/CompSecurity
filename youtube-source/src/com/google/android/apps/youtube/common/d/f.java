// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.d;


// Referenced classes of package com.google.android.apps.youtube.common.d:
//            d, b

final class f
    implements Runnable
{

    final b a;
    final d b;

    f(d d1, b b1)
    {
        b = d1;
        a = b1;
        super();
    }

    public final void run()
    {
        d.a(b, a);
    }
}
