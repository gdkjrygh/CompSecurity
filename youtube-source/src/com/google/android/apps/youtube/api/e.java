// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;


// Referenced classes of package com.google.android.apps.youtube.api:
//            f, a

final class e
    implements Runnable
{

    final f a;
    final Exception b;
    final a c;

    e(a a1, f f1, Exception exception)
    {
        c = a1;
        a = f1;
        b = exception;
        super();
    }

    public final void run()
    {
        a.a(b);
    }
}
