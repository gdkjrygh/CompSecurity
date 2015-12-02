// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.os.TraceCompat;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

public abstract class hb
{

    private final hc a = new hc();
    private boolean b;

    public hb()
    {
        b = false;
    }

    private void c(hw hw1, int i)
    {
        a(hw1, i);
    }

    public abstract int a();

    public int a(int i)
    {
        return 0;
    }

    public abstract hw a(ViewGroup viewgroup, int i);

    public void a(RecyclerView recyclerview)
    {
    }

    public final void a(hd hd)
    {
        a.registerObserver(hd);
    }

    public abstract void a(hw hw1, int i);

    public final hw b(ViewGroup viewgroup, int i)
    {
        TraceCompat.beginSection("RV CreateView");
        viewgroup = a(viewgroup, i);
        viewgroup.e = i;
        TraceCompat.endSection();
        return viewgroup;
    }

    public final void b(int i)
    {
        a.a(i);
    }

    public void b(RecyclerView recyclerview)
    {
    }

    public final void b(hd hd)
    {
        a.unregisterObserver(hd);
    }

    public final void b(hw hw1, int i)
    {
        hw1.b = i;
        if (b())
        {
            hw1.d = -1L;
        }
        hw1.a(1, 519);
        TraceCompat.beginSection("RV OnBindView");
        hw1.t();
        c(hw1, i);
        hw1.s();
        TraceCompat.endSection();
    }

    public final boolean b()
    {
        return b;
    }

    public final void c()
    {
        a.a();
    }

    public final void d()
    {
        a.b();
    }
}
