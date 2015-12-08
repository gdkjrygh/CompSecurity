// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.view.View;
import com.gau.go.launcherex.gowidget.weather.globalview.y;
import com.go.weatherex.framework.fragment.a;

// Referenced classes of package com.go.weatherex.g:
//            y, ab

class aa
    implements android.view.View.OnClickListener
{

    final com.go.weatherex.g.y a;

    aa(com.go.weatherex.g.y y1)
    {
        a = y1;
        super();
    }

    public void onClick(View view)
    {
        if (y.i(a))
        {
            com.go.weatherex.g.y.a(a, false);
            view = new y(y.f(a).getActivity());
            view.a(0x7f080258);
            view.b(0x7f080259);
            view.a(new ab(this));
            view.a();
            return;
        } else
        {
            y.k(a);
            return;
        }
    }
}
