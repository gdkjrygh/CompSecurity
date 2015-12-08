// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ListAdapter;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.apps.youtube.core.a.j;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.youtube.p;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.client.HttpResponseException;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            j, PagedView, k, m, 
//            i

public class l
    implements android.view.View.OnClickListener, b, d, com.google.android.apps.youtube.core.ui.j
{

    private final af a;
    private final aw b;
    protected final Activity c;
    final Handler d;
    protected final PagedView e;
    protected final j f;
    private final com.google.android.apps.youtube.common.a.a g;
    private final a h;
    private final k i;
    private LinkedList j;
    private GDataRequest k;
    private int l;
    private boolean m;
    private Uri n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;

    public l(Activity activity, PagedView pagedview, a a1, af af1, aw aw1)
    {
        c = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        e = (PagedView)com.google.android.apps.youtube.common.fromguava.c.a(pagedview);
        a = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
        b = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        h = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        i = pagedview.h();
        f = com.google.android.apps.youtube.core.a.j.a(a1, i.a(), false);
        e.setAdapter(f);
        e.setOnScrollListener(this);
        e.setOnRetryClickListener(this);
        i.a(this);
        j = new LinkedList();
        g = com.google.android.apps.youtube.common.a.a.a(activity, this);
        d = new m(this, activity.getMainLooper());
    }

    private void a(GDataRequest gdatarequest)
    {
        boolean flag = true;
        m = true;
        k = gdatarequest;
        if (f.getWrappedAdapter().isEmpty())
        {
            flag = false;
        }
        if (flag)
        {
            i.b();
            f.b();
            e.d();
        } else
        {
            e.e();
        }
        a.a(gdatarequest, g);
    }

    static void a(l l1)
    {
        l1.i();
    }

    private void a(String s1, boolean flag, boolean flag1)
    {
        boolean flag2;
        if (!flag1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2)
        {
            i.a(s1);
            f.b();
            e.d();
            return;
        }
        h.a();
        if (flag)
        {
            e.b(s1);
            return;
        } else
        {
            e.a(s1);
            return;
        }
    }

    private void i()
    {
        if (!m)
        {
            if (n == null)
            {
                j();
                return;
            }
            if (k.a != n)
            {
                if (f.getWrappedAdapter().getCount() < e.a())
                {
                    GDataRequest gdatarequest = GDataRequest.a(n, k);
                    n = null;
                    a(gdatarequest);
                    return;
                } else
                {
                    n = null;
                    n_();
                    return;
                }
            }
        }
    }

    private void j()
    {
        if (j.isEmpty())
        {
            n_();
            return;
        } else
        {
            n = null;
            o = 0;
            a((GDataRequest)j.removeFirst());
            return;
        }
    }

    protected void a()
    {
        e.c();
    }

    public final void a(int i1, int j1, int k1)
    {
        if (i1 + j1 == k1)
        {
            d.sendEmptyMessage(0);
        }
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            p = bundle.getInt("required_items_count");
        }
    }

    public void a(GDataRequest gdatarequest, Page page)
    {
        m = false;
        if (gdatarequest != k)
        {
            return;
        }
        int j1 = f.getWrappedAdapter().getCount();
        int l1 = e.a();
        l = page.totalResults;
        List list = page.entries;
        ArrayList arraylist = new ArrayList(list.size());
        int i1 = Math.max(0, (o - page.startIndex) + 1);
        int i2 = list.size();
        while (i1 < i2 && j1 < l1) 
        {
            Object obj = list.get(i1);
            int k1;
            if (r > 0)
            {
                r = r - 1;
                k1 = j1;
            } else
            {
                k1 = j1;
                if (a(obj))
                {
                    arraylist.add(obj);
                    k1 = j1 + 1;
                    s = s + 1;
                }
            }
            i1++;
            j1 = k1;
        }
        o = Math.max(o, (page.startIndex + list.size()) - 1);
        q = q + arraylist.size();
        L.f((new StringBuilder("Received ")).append(list.size()).append(" entries; after filtering ").append(arraylist.size()).append("; realLastIndex = ").append(o).toString());
        if (!arraylist.isEmpty())
        {
            f.a(arraylist);
            n = page.nextUri;
            a(gdatarequest, ((List) (arraylist)));
        } else
        {
            n = null;
        }
        if (q == 0 && j.isEmpty())
        {
            a();
        } else
        {
            g();
            e.d();
        }
        if (s < e.b() || q < p)
        {
            i();
            return;
        } else
        {
            s = 0;
            return;
        }
    }

    public void a(GDataRequest gdatarequest, Exception exception)
    {
        L.c((new StringBuilder("Error for request ")).append(gdatarequest).append(" : ").append(exception).toString());
        m = false;
        boolean flag = f.getWrappedAdapter().isEmpty();
        if (exception instanceof HttpResponseException)
        {
            if (((HttpResponseException)exception).getStatusCode() == 403)
            {
                a(c.getString(p.bm), false, flag);
                return;
            }
        } else
        if (exception instanceof IllegalArgumentException)
        {
            i.c();
            return;
        }
        a(b.a(exception), true, flag);
    }

    protected void a(GDataRequest gdatarequest, List list)
    {
    }

    public final void a(i i1)
    {
        e.setOnPagedViewStateChangeListener(i1);
    }

    public volatile void a(Object obj, Exception exception)
    {
        a((GDataRequest)obj, exception);
    }

    public volatile void a(Object obj, Object obj1)
    {
        a((GDataRequest)obj, (Page)obj1);
    }

    public final transient void a(GDataRequest agdatarequest[])
    {
        int i1 = 0;
        com.google.android.apps.youtube.common.fromguava.c.a(agdatarequest);
        boolean flag;
        if (agdatarequest.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "requests cannot be empty");
        c();
        for (; i1 < agdatarequest.length; i1++)
        {
            j.add(com.google.android.apps.youtube.common.fromguava.c.a(agdatarequest[i1]));
        }

        j();
    }

    public boolean a(Object obj)
    {
        return true;
    }

    public final void b(Object obj)
    {
        f.a(0, obj);
        r = r + 1;
    }

    public void c()
    {
        n = null;
        k = null;
        o = 0;
        l = 0;
        r = 0;
        s = 0;
        q = 0;
        j.clear();
        f.a();
    }

    public final Bundle d()
    {
        Bundle bundle = new Bundle();
        bundle.putInt("required_items_count", e.i());
        return bundle;
    }

    public final void e()
    {
        c();
        e.e();
    }

    public final void f()
    {
        c();
        e.c();
    }

    protected final void g()
    {
        f.c();
        i.a(null);
        i.d();
    }

    public final PagedView.State h()
    {
        return e.f();
    }

    protected void n_()
    {
    }

    public void onClick(View view)
    {
        if (k != null)
        {
            a(k);
        }
    }
}
