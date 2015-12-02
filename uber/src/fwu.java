// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.feature.profiles.ProfileContainerView;

public final class fwu
    implements eyn
{

    ProfileContainerView a;
    private final cev b;
    private final LayoutInflater c;
    private final eyy d;
    private fwv e;
    private ViewGroup f;
    private ViewGroup g;
    private boolean h;
    private boolean i;

    public fwu(cev cev1, Context context, eyy eyy1)
    {
        b = cev1;
        d = eyy1;
        c = LayoutInflater.from(context);
    }

    private void g()
    {
        a = (ProfileContainerView)c.inflate(0x7f03013f, f, false);
        f.addView(a);
        a.a(this);
    }

    public final void a()
    {
    }

    public final void a(ViewGroup viewgroup, ViewGroup viewgroup1)
    {
        g = viewgroup;
        f = viewgroup1;
        g();
    }

    public final void a(fwv fwv1)
    {
        e = fwv1;
    }

    public final void a(boolean flag, boolean flag1)
    {
        h = flag;
        i = flag1;
        a.a(flag, flag1);
    }

    public final void b()
    {
        b.c(new ezs());
    }

    public final void c()
    {
        e.k();
    }

    public final boolean d()
    {
        return d.f();
    }

    public final void e()
    {
        if (a != null)
        {
            a(h, i);
        }
    }

    public final boolean f()
    {
        return a != null && a.getVisibility() == 0;
    }
}
