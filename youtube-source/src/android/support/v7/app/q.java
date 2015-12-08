// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.b.b;
import android.support.v7.b.c;
import android.support.v7.b.d;
import android.support.v7.b.e;
import android.support.v7.media.ad;
import android.support.v7.media.s;
import android.support.v7.media.u;
import android.view.Window;
import android.widget.ListView;

// Referenced classes of package android.support.v7.app:
//            ab, r, s

public final class q extends Dialog
{

    private final u a;
    private final r b;
    private s c;
    private android.support.v7.app.s d;
    private ListView e;
    private boolean f;

    public q(Context context)
    {
        this(context, 0);
    }

    private q(Context context, int i)
    {
        super(ab.a(context, true), 0);
        c = s.a;
        a = u.a(getContext());
        b = new r(this, (byte)0);
    }

    static u a(q q1)
    {
        return q1.a;
    }

    public final void a()
    {
        if (f)
        {
            d.a();
        }
    }

    public final void a(s s1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (!c.equals(s1))
        {
            c = s1;
            if (f)
            {
                a.a(b);
                a.a(s1, b, 1);
            }
            a();
        }
    }

    public final boolean a(ad ad1)
    {
        return !ad1.f() && ad1.c() && ad1.a(c);
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        f = true;
        a.a(c, b, 1);
        a();
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().requestFeature(3);
        setContentView(d.a);
        setTitle(e.a);
        getWindow().setFeatureDrawableResource(3, ab.a(getContext(), b.d));
        d = new android.support.v7.app.s(this, getContext());
        e = (ListView)findViewById(c.c);
        e.setAdapter(d);
        e.setOnItemClickListener(d);
        e.setEmptyView(findViewById(0x1020004));
    }

    public final void onDetachedFromWindow()
    {
        f = false;
        a.a(b);
        super.onDetachedFromWindow();
    }
}
