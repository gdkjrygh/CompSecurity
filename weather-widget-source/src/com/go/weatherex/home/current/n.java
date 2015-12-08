// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.go.weatherex.home.current:
//            l, m

class n
{

    View a;
    ImageView b;
    ImageView c;
    final l d;

    private n(l l)
    {
        d = l;
        super();
    }

    n(l l, m m)
    {
        this(l);
    }

    public void a(int i)
    {
        a.setVisibility(i);
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        a.setOnClickListener(onclicklistener);
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            b.setEnabled(false);
            c.setVisibility(0);
            return;
        } else
        {
            b.setEnabled(true);
            c.setVisibility(4);
            return;
        }
    }

    public void b(boolean flag)
    {
        b.setSelected(flag);
    }
}
