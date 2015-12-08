// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.go.weatherex.g:
//            s

class u
    implements android.view.View.OnClickListener
{

    final int a;
    final s b;

    u(s s1, int i)
    {
        b = s1;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        if (!s.a(b).equals(s.f(b)))
        {
            s.a(b, s.f(b));
            int i = s.g(b).getChildCount() - a - 1;
            if (i > 0)
            {
                s.g(b).removeViews(a + 1, i);
            }
        }
    }
}
