// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.a.a;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.a.a.d;
import com.a.a.s;
import junit.framework.Assert;

// Referenced classes of package com.jiubang.a.a:
//            c, b

public abstract class a extends c
{

    private SparseArray b;
    private long c;
    private int d;
    private boolean e;
    private int f;

    public a(BaseAdapter baseadapter)
    {
        super(baseadapter);
        f = 0;
        b = new SparseArray();
        c = -1L;
        d = -1;
        if (baseadapter instanceof a)
        {
            ((a)baseadapter).a(true);
        }
    }

    private void a(int i, View view, ViewGroup viewgroup)
    {
        if (i > d && !e)
        {
            a(i, viewgroup, view);
            d = i;
        }
    }

    private void a(int i, ViewGroup viewgroup, View view)
    {
        if (c == -1L)
        {
            c = System.currentTimeMillis();
        }
        if (f < 12)
        {
            a(view);
            com.a.a.a aa[];
            s s1;
            d d1;
            if (a instanceof a)
            {
                aa = ((a)a).a(viewgroup, view);
            } else
            {
                aa = new com.a.a.a[0];
            }
            viewgroup = a(viewgroup, view);
            s1 = s.a(view, "alpha", new float[] {
                0.0F, 1.0F
            });
            d1 = new d();
            d1.a(a(aa, ((com.a.a.a []) (viewgroup)), ((com.a.a.a) (s1))));
            d1.b(f());
            d1.c(b());
            d1.a();
            b.put(view.hashCode(), new b(this, i, d1));
        }
        f = f + 1;
    }

    private void a(View view)
    {
        view = s.a(view, "alpha", new float[] {
            0.0F
        });
        d d1 = new d();
        d1.a(view);
        d1.c(0L);
        d1.a();
    }

    private com.a.a.a[] a(com.a.a.a aa[], com.a.a.a aa1[], com.a.a.a a1)
    {
        boolean flag = false;
        com.a.a.a aa2[] = new com.a.a.a[aa.length + aa1.length + 1];
        int i = 0;
        int j;
        int k;
        do
        {
            j = i;
            k = ((flag) ? 1 : 0);
            if (i >= aa1.length)
            {
                break;
            }
            aa2[i] = aa1[i];
            i++;
        } while (true);
        for (; k < aa.length; k++)
        {
            aa2[j] = aa[k];
            j++;
        }

        aa2[aa2.length - 1] = a1;
        return aa2;
    }

    private long f()
    {
        long l;
        if ((d().getLastVisiblePosition() - d().getFirstVisiblePosition()) + 1 < d)
        {
            l = a();
        } else
        {
            l = ((long)(d + 1) * a() + (c + c())) - System.currentTimeMillis();
        }
        return Math.max(0L, l);
    }

    protected abstract long a();

    public void a(boolean flag)
    {
        e = flag;
    }

    public abstract com.a.a.a[] a(ViewGroup viewgroup, View view);

    protected abstract long b();

    protected abstract long c();

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (e) goto _L2; else goto _L1
_L1:
        Assert.assertNotNull("Call setListView() on this AnimationAdapter before setAdapter()!", d());
        if (view == null) goto _L2; else goto _L3
_L3:
        b b1;
        int j;
        j = view.hashCode();
        b1 = (b)b.get(j);
        if (b1 == null) goto _L2; else goto _L4
_L4:
        boolean flag;
        if (b1.a != i)
        {
            b1.b.c();
            b.remove(j);
            flag = false;
        } else
        {
            flag = true;
        }
_L6:
        view = super.getView(i, view, viewgroup);
        if (!e && !flag)
        {
            a(i, view, viewgroup);
        }
        return view;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
