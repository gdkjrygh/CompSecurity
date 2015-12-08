// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            d, a, x, y, 
//            ad, p, g

public class ab extends d
{

    private ArrayList h;

    public ab(int i)
    {
        super(i);
        h = new ArrayList();
    }

    public int a()
    {
        return h.size();
    }

    public d a(int i)
    {
        g g1;
        switch (i)
        {
        default:
            return null;

        case 2: // '\002'
            a a1 = new a(i);
            h.add(a1);
            return a1;

        case 4: // '\004'
            x x1 = new x(i);
            h.add(x1);
            return x1;

        case 1: // '\001'
            y y1 = new y(i);
            h.add(y1);
            return y1;

        case 3: // '\003'
            ad ad1 = new ad(i);
            h.add(ad1);
            return ad1;

        case 6: // '\006'
            ab ab1 = new ab(i);
            h.add(ab1);
            return ab1;

        case 5: // '\005'
            p p1 = new p(i);
            h.add(p1);
            return p1;

        case 7: // '\007'
            g1 = new g(i);
            break;
        }
        h.add(g1);
        return g1;
    }

    public d b(int i)
    {
        if (i < 0 || i >= h.size())
        {
            return null;
        } else
        {
            return (d)h.get(i);
        }
    }

    public String toString()
    {
        int j = h.size();
        String s = "SetBehavior \n";
        for (int i = 0; i < j; i++)
        {
            s = (new StringBuilder()).append(s).append("\t").append(((d)h.get(i)).toString()).toString();
        }

        return (new StringBuilder()).append(s).append("SetBehavior\n").toString();
    }
}
