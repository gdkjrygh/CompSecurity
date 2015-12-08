// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;


// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            cw, cv

final class cy
    implements Runnable
{

    final cw a;

    cy(cw cw1)
    {
        a = cw1;
        super();
    }

    public final void run()
    {
        cv.a(a.a, null);
        cv.b(a.a);
    }
}
