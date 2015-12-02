// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.view.ViewGroup;

// Referenced classes of package com.whatsapp.util:
//            e, a5

class f
    implements Runnable
{

    final e a;
    final ViewGroup b;

    f(e e1, ViewGroup viewgroup)
    {
        a = e1;
        b = viewgroup;
        super();
    }

    public void run()
    {
        try
        {
            a5.a(a.a, b);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }
}
