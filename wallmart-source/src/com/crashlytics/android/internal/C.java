// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


// Referenced classes of package com.crashlytics.android.internal:
//            B, t

final class C
    implements Runnable
{

    private t a;
    private B b;

    C(B b1, t t)
    {
        b = b1;
        a = t;
        super();
    }

    public final void run()
    {
        B.a(b, a);
    }
}
