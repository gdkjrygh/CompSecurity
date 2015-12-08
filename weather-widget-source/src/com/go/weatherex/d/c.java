// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.d;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.gau.go.launcherex.gowidget.weather.viewframe.viewholder.ScrollViewEx;

// Referenced classes of package com.go.weatherex.d:
//            a

class c
    implements android.view.View.OnTouchListener
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (view.equals(com.go.weatherex.d.a.a(a)))
        {
            com.go.weatherex.d.a.b(a);
            if (motionevent.getAction() == 1)
            {
                com.go.weatherex.d.a.c(a).requestDisallowInterceptTouchEvent(false);
                com.go.weatherex.d.a.a(a).clearFocus();
            } else
            if (com.go.weatherex.d.a.a(a).isFocused())
            {
                com.go.weatherex.d.a.c(a).requestDisallowInterceptTouchEvent(true);
                return false;
            }
        }
        return false;
    }
}
