// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

// Referenced classes of package com.whatsapp:
//            cq

class hk
    implements android.view.View.OnTouchListener
{

    final cq a;

    hk(cq cq1)
    {
        a = cq1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int j = (int)motionevent.getX();
        int i = (int)motionevent.getY();
        motionevent = new int[2];
        view.getLocationOnScreen(motionevent);
        int k = motionevent[0];
        i += motionevent[1];
        view = new int[2];
        cq.a(a).getLocationOnScreen(view);
        j = (j + k) - view[0];
        k = i - view[1];
        if (j >= 0 && j < cq.a(a).getWidth() && k >= 0 && k < cq.a(a).getHeight())
        {
            cq.a(a, true);
        } else
        {
            view = new int[2];
            cq.c(a).getLocationOnScreen(view);
            i -= view[1];
            if (i >= 0 && i < cq.c(a).getHeight())
            {
                return true;
            }
        }
        return false;
    }
}
