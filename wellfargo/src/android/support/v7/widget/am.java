// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            ab, ac

class am
    implements android.view.View.OnTouchListener
{

    final ab a;

    private am(ab ab1)
    {
        a = ab1;
        super();
    }

    am(ab ab1, ac ac)
    {
        this(ab1);
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int i;
        int j;
        int k;
        i = motionevent.getAction();
        j = (int)motionevent.getX();
        k = (int)motionevent.getY();
        if (i != 0 || ab.b(a) == null || !ab.b(a).isShowing() || j < 0 || j >= ab.b(a).getWidth() || k < 0 || k >= ab.b(a).getHeight()) goto _L2; else goto _L1
_L1:
        ab.d(a).postDelayed(ab.c(a), 250L);
_L4:
        return false;
_L2:
        if (i == 1)
        {
            ab.d(a).removeCallbacks(ab.c(a));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
