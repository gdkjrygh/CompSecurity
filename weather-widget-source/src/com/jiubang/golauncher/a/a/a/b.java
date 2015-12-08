// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.golauncher.a.a.a;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

// Referenced classes of package com.jiubang.golauncher.a.a.a:
//            a, f

class b extends a
{

    private HashMap a;
    private String b;
    private String c;

    public b(Activity activity, String s)
    {
        super(activity);
        a = new HashMap();
        b = s;
        h();
    }

    private String f()
    {
        return (new StringBuilder()).append(b()).append(b).toString();
    }

    private String g()
    {
        return (new StringBuilder()).append(f()).append(".version").toString();
    }

    private void h()
    {
        String as[] = b(f(), "").split(Pattern.quote("#####"));
        int i1 = as.length;
        for (int l = 0; l < i1; l++)
        {
            String s = as[l];
            if (TextUtils.isEmpty(s))
            {
                continue;
            }
            String as1[] = s.split(Pattern.quote(">>>>>"));
            if (as1.length > 2)
            {
                a.put(as1[0], new f(as1[1], as1[2]));
            }
        }

        c = j();
    }

    private void i()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        f f1;
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext(); arraylist.add((new StringBuilder()).append(s).append(">>>>>").append(f1.a).append(">>>>>").append(f1.b).toString()))
        {
            s = (String)iterator.next();
            f1 = (f)a.get(s);
        }

        a(f(), TextUtils.join("#####", arraylist));
        c = Long.toString((new Date()).getTime());
        a(g(), c);
    }

    private String j()
    {
        return b(g(), "0");
    }

    private void k()
    {
        if (!c.equalsIgnoreCase(j()))
        {
            a.clear();
            h();
        }
    }

    public void a(String s, String s1, String s2)
    {
        k();
        if (!a.containsKey(s))
        {
            a.put(s, new f(s1, s2));
            i();
        }
    }

    public boolean a(String s)
    {
        k();
        return a.containsKey(s);
    }

    public f b(String s)
    {
        k();
        if (a.containsKey(s))
        {
            return (f)a.get(s);
        } else
        {
            return null;
        }
    }

    public void d()
    {
        k();
        a.clear();
        i();
    }

    public List e()
    {
        return new ArrayList(a.keySet());
    }

    public String toString()
    {
        return TextUtils.join(", ", a.keySet());
    }
}
