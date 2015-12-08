// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;


// Referenced classes of package com.android.volley.toolbox:
//            r, m

final class s
    implements Runnable
{

    final m a;
    final r b;

    s(r r1, m m)
    {
        b = r1;
        a = m;
        super();
    }

    public final void run()
    {
        b.a(a, false);
    }
}
