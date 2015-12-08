// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.google.a.a.a.a.uv;
import com.google.android.apps.youtube.app.offline.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hj, ik, il, im, 
//            is, ip, LikeAction, in, 
//            ir

public final class ij
    implements v
{

    private final Activity a;
    private final hj b;
    private uv c;
    private String d;
    private final Map e = new WeakHashMap();
    private final android.view.View.OnClickListener f = new ik(this);
    private final android.view.View.OnClickListener g = new il(this);
    private final android.view.View.OnClickListener h = new im(this);
    private final ir i;
    private boolean j;

    public ij(Activity activity, hj hj1, ir ir1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (hj)com.google.android.apps.youtube.common.fromguava.c.a(hj1);
        i = ir1;
    }

    static Activity a(ij ij1)
    {
        return ij1.a;
    }

    static android.view.View.OnClickListener b(ij ij1)
    {
        return ij1.h;
    }

    static android.view.View.OnClickListener c(ij ij1)
    {
        return ij1.f;
    }

    static android.view.View.OnClickListener d(ij ij1)
    {
        return ij1.g;
    }

    static hj e(ij ij1)
    {
        return ij1.b;
    }

    static String f(ij ij1)
    {
        return ij1.d;
    }

    static ir g(ij ij1)
    {
        return ij1.i;
    }

    public final void a()
    {
        boolean flag;
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        for (Iterator iterator = e.values().iterator(); iterator.hasNext(); ((is)iterator.next()).b(j)) { }
    }

    public final void a(View view)
    {
        ip ip1 = new ip(this, view);
        e.put(view, ip1);
        b.a(ip.a(ip1), com.google.android.apps.youtube.app.ui.ip.b(ip1));
    }

    public final void a(uv uv1, x x, String s, boolean flag)
    {
        c = (uv)com.google.android.apps.youtube.common.fromguava.c.a(uv1);
        d = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        j = false;
        android.text.Spanned spanned = com.google.android.apps.youtube.datalib.innertube.a.b.a(uv1.f);
        s = spanned;
        if (uv1.k != null)
        {
            s = com.google.android.apps.youtube.datalib.innertube.a.b.a(uv1.k);
            if (spanned != null)
            {
                s = TextUtils.concat(new CharSequence[] {
                    s, " \267 ", spanned
                });
            }
        }
        spanned = com.google.android.apps.youtube.datalib.innertube.a.b.a(uv1.b);
        android.text.Spanned spanned1 = com.google.android.apps.youtube.datalib.innertube.a.b.a(uv1.d);
        android.text.Spanned spanned2 = com.google.android.apps.youtube.datalib.innertube.a.b.a(uv1.e);
        android.text.Spanned spanned3 = com.google.android.apps.youtube.datalib.innertube.a.b.a(uv1.c);
        is is1;
        for (Iterator iterator = e.values().iterator(); iterator.hasNext(); is1.a(uv1.i))
        {
            is1 = (is)iterator.next();
            is1.a(spanned);
            is1.b(s);
            is1.a(spanned3, spanned1, spanned2);
            is1.b(j);
            is1.a(flag, x);
        }

    }

    public final void a(LikeAction likeaction)
    {
        android.text.Spanned spanned;
        android.text.Spanned spanned1;
        if (likeaction == LikeAction.LIKE)
        {
            spanned = com.google.android.apps.youtube.datalib.innertube.a.b.a(c.g);
            likeaction = com.google.android.apps.youtube.datalib.innertube.a.b.a(c.e);
        } else
        if (likeaction == LikeAction.DISLIKE)
        {
            spanned = com.google.android.apps.youtube.datalib.innertube.a.b.a(c.d);
            likeaction = com.google.android.apps.youtube.datalib.innertube.a.b.a(c.h);
        } else
        if (likeaction == LikeAction.REMOVE_LIKE)
        {
            spanned = com.google.android.apps.youtube.datalib.innertube.a.b.a(c.d);
            likeaction = com.google.android.apps.youtube.datalib.innertube.a.b.a(c.e);
        } else
        {
            likeaction = null;
            spanned = null;
        }
        spanned1 = com.google.android.apps.youtube.datalib.innertube.a.b.a(c.c);
        for (Iterator iterator = e.values().iterator(); iterator.hasNext(); ((is)iterator.next()).a(spanned1, spanned, likeaction)) { }
    }

    public final void a(x x)
    {
        for (Iterator iterator = e.values().iterator(); iterator.hasNext(); ((is)iterator.next()).a(true, x)) { }
    }

    public final void a(String s, com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult offlineaddresult)
    {
        if (d != null && d.equals(s) && offlineaddresult == com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ADDING)
        {
            for (s = e.values().iterator(); s.hasNext(); ((is)s.next()).a()) { }
        }
    }

    public final void b(View view)
    {
        in in1 = new in(this, view);
        e.put(view, in1);
    }

    public final void c(View view)
    {
        if (i != null)
        {
            i.E();
        }
    }
}
