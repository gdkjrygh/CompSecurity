// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import java.util.TimerTask;

// Referenced classes of package com.jiubang.commerce.utils:
//            s

public abstract class t extends TimerTask
{

    private s a;

    public t()
    {
    }

    public abstract void a();

    public void a(s s1)
    {
        a = s1;
    }

    public void run()
    {
        if (a != null && !a.b())
        {
            s.a(a, true);
            a();
        }
    }
}
