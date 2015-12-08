// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            Request, s

final class k
    implements Runnable
{

    final String a;
    final long b;
    final Request c;

    k(Request request, String s1, long l)
    {
        c = request;
        a = s1;
        b = l;
        super();
    }

    public final void run()
    {
        Request.a(c).a(a, b);
        Request.a(c).a(toString());
    }
}
