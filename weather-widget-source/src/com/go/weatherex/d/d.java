// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.d;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.go.weatherex.d:
//            a

class d
    implements android.view.View.OnTouchListener
{

    final a a;

    d(a a1)
    {
        a = a1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (view.equals(com.go.weatherex.d.a.c(a)))
        {
            com.go.weatherex.d.a.b(a);
            if (motionevent.getAction() == 2)
            {
                com.go.weatherex.d.a.d(a);
                com.go.weatherex.d.a.a(a).clearFocus();
            }
        }
        return false;
    }
}
