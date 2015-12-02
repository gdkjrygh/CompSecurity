// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org;

import java.util.EventObject;

// Referenced classes of package org:
//            U, g

public class z extends EventObject
{

    private static final long serialVersionUID = 0x59a629bebd214a8L;
    private final boolean a;
    private final int b;
    private final String c;
    private final String d;

    public z(Object obj, int i, String s)
    {
        int j = U.b;
        super(obj);
        b = i;
        d = s;
        a = false;
        c = null;
        if (g.b != 0)
        {
            U.b = j + 1;
        }
    }

    public z(Object obj, String s, String s1)
    {
        super(obj);
        b = 0;
        d = s1;
        a = true;
        c = s;
    }

    public String a()
    {
        return d;
    }

    public boolean b()
    {
        return !c();
    }

    public boolean c()
    {
        return a;
    }

    public int d()
    {
        return b;
    }

    public String e()
    {
        return c;
    }
}
