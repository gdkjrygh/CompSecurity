// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.a;

import android.support.v4.app.FragmentActivity;
import com.go.weatherex.sidebar.b;

// Referenced classes of package com.go.weatherex.a:
//            a

class c
    implements Runnable
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public void run()
    {
        if (a.getActivity() != null)
        {
            b.b(a.getActivity().getApplicationContext(), 2, 1);
            a.h();
        }
    }
}
