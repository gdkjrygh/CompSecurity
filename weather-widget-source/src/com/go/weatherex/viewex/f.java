// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.viewex;

import android.view.View;

// Referenced classes of package com.go.weatherex.viewex:
//            g, d

public abstract class f
    implements g
{

    static final boolean b;
    private d a;

    public f(d d1)
    {
        if (!b && !(d1 instanceof View))
        {
            throw new AssertionError();
        } else
        {
            a = d1;
            a.a(this);
            return;
        }
    }

    public final void b()
    {
        a.invalidate();
    }

    static 
    {
        boolean flag;
        if (!com/go/weatherex/viewex/d.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
