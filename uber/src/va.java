// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class va
{

    private final Account a;
    private final Set b;
    private final Set c;
    private final Map d;
    private final int e;
    private final View f;
    private final String g;
    private final String h;
    private final anh i;
    private Integer j;

    public va(Account account, Collection collection, Map map, int l, View view, String s, String s1, 
            anh anh)
    {
        a = account;
        if (collection == null)
        {
            account = Collections.EMPTY_SET;
        } else
        {
            account = Collections.unmodifiableSet(new HashSet(collection));
        }
        b = account;
        account = map;
        if (map == null)
        {
            account = Collections.EMPTY_MAP;
        }
        d = account;
        f = view;
        e = l;
        g = s;
        h = s1;
        i = anh;
        account = new HashSet(b);
        for (collection = d.values().iterator(); collection.hasNext(); account.addAll(((vb)collection.next()).a)) { }
        c = Collections.unmodifiableSet(account);
    }

    public final String a()
    {
        if (a != null)
        {
            return a.name;
        } else
        {
            return null;
        }
    }

    public final Set a(se se)
    {
        se = (vb)d.get(se);
        if (se == null || ((vb) (se)).a.isEmpty())
        {
            return b;
        } else
        {
            HashSet hashset = new HashSet(b);
            hashset.addAll(((vb) (se)).a);
            return hashset;
        }
    }

    public final void a(Integer integer)
    {
        j = integer;
    }

    public final Account b()
    {
        return a;
    }

    public final String c()
    {
        return d().name;
    }

    public final Account d()
    {
        if (a != null)
        {
            return a;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    public final Set e()
    {
        return b;
    }

    public final Set f()
    {
        return c;
    }

    public final Map g()
    {
        return d;
    }

    public final String h()
    {
        return g;
    }

    public final String i()
    {
        return h;
    }

    public final anh j()
    {
        return i;
    }

    public final Integer k()
    {
        return j;
    }
}
