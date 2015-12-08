// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.a;


// Referenced classes of package com.google.android.exoplayer.a:
//            b

final class d
    implements Runnable
{

    final b a;

    d(b b1)
    {
        a = b1;
        super();
    }

    public final void run()
    {
        b.b(a);
        b.a(a);
    }
}
