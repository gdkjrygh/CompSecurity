// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class sr
{

    private Account a;
    private final Set b = new HashSet();
    private int c;
    private View d;
    private String e;
    private String f;
    private final Map g = new HashMap();
    private final Context h;
    private final Map i = new HashMap();
    private FragmentActivity j;
    private int k;
    private int l;
    private st m;
    private Looper n;
    private sk o;
    private final Set p = new HashSet();
    private final Set q = new HashSet();
    private ani r;

    public sr(Context context)
    {
        k = -1;
        l = -1;
        r = new ani();
        h = context;
        n = context.getMainLooper();
        e = context.getPackageName();
        f = context.getClass().getName();
        o = ane.b;
    }

    private sq c()
    {
        tu tu1 = tu.a(j);
        tl tl1 = new tl(h.getApplicationContext(), n, a(), o, i, p, q, k, -1);
        tu1.a(k, tl1, m);
        return tl1;
    }

    private sq d()
    {
        tx tx1 = tx.a(j);
        sq sq = tx1.a(l);
        Object obj = sq;
        if (sq == null)
        {
            obj = new tl(h.getApplicationContext(), n, a(), o, i, p, q, -1, l);
        }
        tx1.a(l, ((sq) (obj)), m);
        return ((sq) (obj));
    }

    public final sr a(Scope scope)
    {
        b.add(scope);
        return this;
    }

    public final sr a(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            s = new Account(s, "com.google");
        }
        a = s;
        return this;
    }

    public final sr a(se se1)
    {
        i.put(se1, null);
        b.addAll(se1.c());
        return this;
    }

    public final sr a(se se1, sg sg)
    {
        wn.a(sg, "Null options are not permitted for this Api");
        i.put(se1, sg);
        b.addAll(se1.c());
        return this;
    }

    public final sr a(ss ss)
    {
        p.add(ss);
        return this;
    }

    public final sr a(st st)
    {
        q.add(st);
        return this;
    }

    public final va a()
    {
        return new va(a, b, g, c, d, e, f, r.a());
    }

    public final sq b()
    {
        boolean flag;
        if (!i.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.b(flag, "must call addApi() to add at least one API");
        if (k >= 0)
        {
            return c();
        }
        if (l >= 0)
        {
            return d();
        } else
        {
            return new tl(h, n, a(), o, i, p, q, -1, -1);
        }
    }
}
