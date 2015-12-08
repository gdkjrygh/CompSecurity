// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            d, PasswordSpecification

public class c
{

    private final TreeSet a = new TreeSet();
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private int d;
    private int e;

    public c()
    {
        d = 12;
        e = 16;
    }

    private TreeSet a(String s, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new d((new StringBuilder()).append(s1).append(" cannot be null or empty").toString());
        }
        TreeSet treeset = new TreeSet();
        s = s.toCharArray();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            char c1 = s[i];
            if (PasswordSpecification.a(c1, 32, 126))
            {
                throw new d((new StringBuilder()).append(s1).append(" must only contain ASCII printable characters").toString());
            }
            treeset.add(Character.valueOf(c1));
        }

        return treeset;
    }

    private void b()
    {
        Iterator iterator = c.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((Integer)iterator.next()).intValue() + i) { }
        if (i > e)
        {
            throw new d("required character count cannot be greater than the max password size");
        } else
        {
            return;
        }
    }

    private void c()
    {
        boolean aflag[] = new boolean[95];
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            char ac[] = ((String)iterator.next()).toCharArray();
            int j = ac.length;
            int i = 0;
            while (i < j) 
            {
                char c1 = ac[i];
                if (aflag[c1 - 32])
                {
                    throw new d((new StringBuilder()).append("character ").append(c1).append(" occurs in more than one required character set").toString());
                }
                aflag[c1 - 32] = true;
                i++;
            }
        }

    }

    public PasswordSpecification a()
    {
        if (a.isEmpty())
        {
            throw new d("no allowed characters specified");
        } else
        {
            b();
            c();
            return new PasswordSpecification(1, PasswordSpecification.a(a), b, c, d, e);
        }
    }

    public c a(int i, int j)
    {
        if (i < 1)
        {
            throw new d("minimumSize must be at least 1");
        }
        if (i > j)
        {
            throw new d("maximumSize must be greater than or equal to minimumSize");
        } else
        {
            d = i;
            e = j;
            return this;
        }
    }

    public c a(String s)
    {
        a.addAll(a(s, "allowedChars"));
        return this;
    }

    public c a(String s, int i)
    {
        if (i < 1)
        {
            throw new d("count must be at least 1");
        } else
        {
            s = a(s, "requiredChars");
            b.add(PasswordSpecification.a(s));
            c.add(Integer.valueOf(i));
            return this;
        }
    }
}
