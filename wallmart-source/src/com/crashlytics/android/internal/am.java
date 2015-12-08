// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


// Referenced classes of package com.crashlytics.android.internal:
//            aa, al

final class am extends aa
{

    private Runnable a;

    am(al al, Runnable runnable)
    {
        a = runnable;
        super();
    }

    public final void a()
    {
        a.run();
    }
}
