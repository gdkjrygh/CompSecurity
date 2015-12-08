// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            DescriptionBean, r, t, s, 
//            aa, b, o

public class z
{

    private DescriptionBean a;
    private b b;
    private o c;
    private aa d;
    private ArrayList e;
    private String f;

    public z(String s1)
    {
        a = new DescriptionBean();
        e = new ArrayList();
        f = s1;
    }

    public t a(int k)
    {
        switch (k)
        {
        default:
            return null;

        case 1: // '\001'
            r r1 = new r(k);
            e.add(r1);
            return r1;

        case 0: // '\0'
            t t1 = new t(k);
            e.add(t1);
            return t1;
        }
    }

    public String a()
    {
        return f;
    }

    public void a(s s1)
    {
        int l = s1.b();
        for (int k = 0; k < l; k++)
        {
            e.add(s1.a(k));
        }

    }

    public DescriptionBean b()
    {
        return a;
    }

    public t b(int k)
    {
        if (k < 0 || k >= e.size())
        {
            return null;
        } else
        {
            return (t)e.get(k);
        }
    }

    public aa c()
    {
        return d;
    }

    public aa d()
    {
        d = new aa();
        return d;
    }

    public b e()
    {
        return b;
    }

    public b f()
    {
        b = new b();
        return b;
    }

    public o g()
    {
        return c;
    }

    public o h()
    {
        c = new o();
        return c;
    }

    public int i()
    {
        return e.size();
    }

    public void j()
    {
        b = null;
        d = null;
        c = null;
        e.clear();
    }

    public String toString()
    {
        String s1 = "ScriptBean\n";
        if (b != null)
        {
            s1 = (new StringBuilder()).append("ScriptBean\n").append("\t").append(b.toString()).toString();
        }
        String s2 = s1;
        if (d != null)
        {
            s2 = (new StringBuilder()).append(s1).append("\t").append(d.toString()).toString();
        }
        int l = e.size();
        for (int k = 0; k < l; k++)
        {
            s2 = (new StringBuilder()).append(s2).append("\t").append(((t)e.get(k)).toString()).toString();
        }

        s1 = s2;
        if (c != null)
        {
            s1 = (new StringBuilder()).append(s2).append("\t").append(c.toString()).toString();
        }
        return (new StringBuilder()).append(s1).append("ScriptBean\n").toString();
    }
}
