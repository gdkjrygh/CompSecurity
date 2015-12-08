// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.view.View;
import com.jiubang.playsdk.views.m;

// Referenced classes of package com.go.weatherex.themestore.detail:
//            m

class o
    implements android.view.View.OnClickListener
{

    final com.go.weatherex.themestore.detail.m a;

    o(com.go.weatherex.themestore.detail.m m1)
    {
        a = m1;
        super();
    }

    public void onClick(View view)
    {
        if (a.k != null)
        {
            a.k.a();
        }
    }
}
