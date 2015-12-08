// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.a;

import android.content.Context;

// Referenced classes of package com.go.weatherex.a:
//            f, e

public class d
{

    private e a;

    public d()
    {
    }

    static e a(d d1)
    {
        return d1.a;
    }

    public void a()
    {
        if (a != null)
        {
            a = null;
        }
    }

    public void a(Context context, String s, String s1)
    {
        (new f(this, context, s, s1)).execute(new Object[0]);
    }

    public void a(e e)
    {
        a = e;
    }
}
