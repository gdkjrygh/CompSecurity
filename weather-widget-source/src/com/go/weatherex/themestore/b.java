// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.view.View;
import com.go.weatherex.viewex.SlidingTabStrip;

// Referenced classes of package com.go.weatherex.themestore:
//            a, c

class b
    implements android.view.View.OnClickListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void onClick(View view)
    {
        if (com.go.weatherex.themestore.a.a(a) != null)
        {
            int i = 0;
            while (i < com.go.weatherex.themestore.a.b(a).getChildCount()) 
            {
                if (view == com.go.weatherex.themestore.a.b(a).getChildAt(i))
                {
                    com.go.weatherex.themestore.a.a(a).a(view, i);
                    return;
                }
                i++;
            }
        }
    }
}
