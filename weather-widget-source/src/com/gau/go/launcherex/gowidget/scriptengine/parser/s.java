// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            r

public class s
{

    private ArrayList a;
    private int b;
    private int c;
    private String d;

    public s()
    {
        a = new ArrayList();
    }

    public r a()
    {
        r r1 = new r(1);
        a.add(r1);
        return r1;
    }

    public r a(int i)
    {
        if (i >= 0 && i < a.size())
        {
            return (r)a.get(i);
        } else
        {
            return null;
        }
    }

    public int b()
    {
        return a.size();
    }

    public String toString()
    {
        String s1 = (new StringBuilder()).append("ImageBeans areaX = ").append(b).append(", areaY = ").append(c).append(", src = ").append(d).append("\n").toString();
        int j = a.size();
        for (int i = 0; i < j; i++)
        {
            s1 = (new StringBuilder()).append(s1).append("\t").append(((r)a.get(i)).toString()).toString();
        }

        return (new StringBuilder()).append(s1).append("ImageBeans\n").toString();
    }
}
