// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.a;

import android.content.Context;
import com.jiubang.commerce.ad.e.ag;
import com.jiubang.commerce.utils.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c
{

    private List a;

    public c()
    {
        a = new ArrayList();
    }

    public List a()
    {
        return a;
    }

    public void a(String s)
    {
        if (s != null)
        {
            a.clear();
            s = s.split(",");
            int i = s.length;
            while (i > 0) 
            {
                a.add(s[i - 1]);
                i--;
            }
        }
    }

    public boolean a(Context context)
    {
        long l = ag.a(context).b();
        long l1 = System.currentTimeMillis() - l;
        if (j.a)
        {
            j.b("maple", (new StringBuilder()).append("lastUpdateTime: ").append(l).append("intervalUpdateTime: ").append(l1).toString());
        }
        return l1 > 0L && l1 <= 0x5265c00L;
    }

    public String b()
    {
        Object obj;
        if (a == null)
        {
            obj = null;
        } else
        {
            obj = a.iterator();
            String s;
            String s1;
            for (s = ""; ((Iterator) (obj)).hasNext(); s = (new StringBuilder()).append(s).append(s1).append(",").toString())
            {
                s1 = (String)((Iterator) (obj)).next();
            }

            obj = s;
            if (!s.isEmpty())
            {
                return s.substring(0, s.length() - 1);
            }
        }
        return ((String) (obj));
    }
}
