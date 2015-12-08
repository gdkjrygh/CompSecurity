// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            d, q

public class p extends d
{

    private ArrayList h;
    private int i;

    public p(int j)
    {
        super(j);
        h = new ArrayList();
    }

    public int a()
    {
        return i;
    }

    public q a(int j)
    {
        if (j >= 0 && j < i)
        {
            return (q)h.get(j);
        } else
        {
            return null;
        }
    }

    public q a(String s, int j, int k, int l)
    {
        q q1 = new q(this);
        q1.a = s;
        q1.b = j;
        q1.c = k;
        q1.d = l;
        h.add(q1);
        return q1;
    }

    public void a(p p1, p p2)
    {
        super.a(p1, p2);
        p1.b(p2.a());
        for (int j = 0; j < p2.a(); j++)
        {
            q q1 = p2.a(j);
            p1.a(q1.a, q1.b, q1.c, q1.d);
        }

    }

    public void b(int j)
    {
        i = j;
    }

    public String toString()
    {
        String s = (new StringBuilder()).append("frame\n").append("amount : ").append(i).append("\n").toString();
        for (int j = 0; j < i; j++)
        {
            q q1 = (q)h.get(j);
            s = (new StringBuilder()).append(s).append("img : ").append(q1.a).append(", startTime : ").append(q1.b).append(", endTime : ").append(q1.c).append(", visibility : ").append(q1.d).append("\n").toString();
        }

        return (new StringBuilder()).append(s).append("frame\n").toString();
    }
}
