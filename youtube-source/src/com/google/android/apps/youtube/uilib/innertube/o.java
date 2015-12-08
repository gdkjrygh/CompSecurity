// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.innertube;


// Referenced classes of package com.google.android.apps.youtube.uilib.innertube:
//            q

public class o
{

    private android.view.View.OnClickListener a;
    private q b;
    private CharSequence c;
    private Object d;
    private Object e;

    public o(Object obj, android.view.View.OnClickListener onclicklistener, q q)
    {
        e = obj;
        a = onclicklistener;
        b = q;
    }

    public final CharSequence a()
    {
        return c;
    }

    public final void a(android.view.View.OnClickListener onclicklistener)
    {
        a = onclicklistener;
    }

    public final void a(CharSequence charsequence)
    {
        c = charsequence;
    }

    public final void a(Object obj)
    {
        d = obj;
    }

    public final android.view.View.OnClickListener b()
    {
        return a;
    }

    public final q c()
    {
        return b;
    }

    public final Object d()
    {
        return d;
    }

    public final Object e()
    {
        return e;
    }
}
