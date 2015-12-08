// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.d;

import android.view.View;
import android.widget.RadioButton;

// Referenced classes of package com.go.weatherex.d:
//            e, k, a, g

class f
    implements android.view.View.OnClickListener
{

    final g a;
    final k b;
    final e c;

    f(e e1, g g, k k1)
    {
        c = e1;
        a = g;
        b = k1;
        super();
    }

    public void onClick(View view)
    {
        c.a(a);
        if (e.a(c) != null)
        {
            e.a(c).setChecked(false);
        }
        e.a(c, b.a);
        b.a.setChecked(true);
        com.go.weatherex.d.a.o(c.a);
    }
}
