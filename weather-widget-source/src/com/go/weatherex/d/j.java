// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.d;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

// Referenced classes of package com.go.weatherex.d:
//            i, k, a, h, 
//            e

class j
    implements android.view.View.OnClickListener
{

    final k a;
    final h b;
    final i c;

    j(i l, k k1, h h1)
    {
        c = l;
        a = k1;
        b = h1;
        super();
    }

    public void onClick(View view)
    {
        if (i.a(c) != null)
        {
            i.a(c).setChecked(false);
        }
        a.a.setChecked(true);
        com.go.weatherex.d.a.a(c.a, b);
        com.go.weatherex.d.a.f(c.a).setText(b.b());
        i.a(c, a.a);
        com.go.weatherex.d.a.g(c.a);
        com.go.weatherex.d.a.h(c.a);
        int l = com.go.weatherex.d.a.i(c.a).a();
        if (l == 3)
        {
            i.b(c);
            i.a(c, false);
            com.go.weatherex.d.a.j(c.a).setFocusable(true);
            com.go.weatherex.d.a.j(c.a).setCursorVisible(true);
            com.go.weatherex.d.a.j(c.a).setFocusableInTouchMode(true);
            com.go.weatherex.d.a.j(c.a).setOnClickListener(null);
            com.go.weatherex.d.a.j(c.a).setText("");
            com.go.weatherex.d.a.a(c.a, "");
            if (com.go.weatherex.d.a.k(c.a) != null)
            {
                com.go.weatherex.d.a.k(c.a).a();
            }
        } else
        if (l == 2 || l == 7 || l == 8)
        {
            i.a(c, true);
            com.go.weatherex.d.a.j(c.a).setFocusable(false);
            com.go.weatherex.d.a.j(c.a).setCursorVisible(false);
            com.go.weatherex.d.a.j(c.a).setFocusableInTouchMode(false);
            com.go.weatherex.d.a.j(c.a).setOnClickListener(c.a);
            com.go.weatherex.d.a.j(c.a).setText("");
            com.go.weatherex.d.a.a(c.a, "");
            if (com.go.weatherex.d.a.k(c.a) != null)
            {
                com.go.weatherex.d.a.k(c.a).a();
                return;
            }
        } else
        {
            com.go.weatherex.d.a.a(c.a).setText("");
            i.a(c, true);
            com.go.weatherex.d.a.j(c.a).setFocusable(true);
            com.go.weatherex.d.a.j(c.a).setCursorVisible(true);
            com.go.weatherex.d.a.j(c.a).setFocusableInTouchMode(true);
            com.go.weatherex.d.a.j(c.a).setOnClickListener(null);
            return;
        }
    }
}
