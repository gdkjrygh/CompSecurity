// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.a.a.b;

import android.content.Context;
import com.gau.a.a.e;

// Referenced classes of package com.gau.a.a.b:
//            l

public abstract class a
    implements l
{

    protected com.gau.a.a.d.a a;
    protected e b;
    protected Context c;
    protected boolean d;

    public a(com.gau.a.a.d.a a1, Context context)
    {
        d = true;
        if (a1 == null || context == null)
        {
            throw new IllegalArgumentException("httpRequest==null");
        } else
        {
            a = a1;
            c = context;
            b = a1.i();
            return;
        }
    }

    public a(com.gau.a.a.d.a a1, e e, Context context)
    {
        this(a1, context);
        b = e;
    }

    public com.gau.a.a.d.a a()
    {
        return a;
    }

    public boolean b()
    {
        return d;
    }
}
