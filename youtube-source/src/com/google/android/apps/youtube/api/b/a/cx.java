// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;


// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            cw, cv

final class cx
    implements Runnable
{

    final int a;
    final int b;
    final int c;
    final cw d;

    cx(cw cw1, int i, int j, int k)
    {
        d = cw1;
        a = i;
        b = j;
        c = k;
        super();
    }

    public final void run()
    {
        cv.a(d.a, a, b, c);
    }
}
