// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.detail.a;

import android.support.v4.view.PagerAdapter;

// Referenced classes of package com.jiubang.playsdk.detail.a:
//            d

public abstract class c extends PagerAdapter
{

    protected d a;
    protected boolean b;
    protected boolean c;

    public c()
    {
        b = true;
        c = true;
    }

    public void a(d d)
    {
        a = d;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public void b(boolean flag)
    {
        c = flag;
    }
}
