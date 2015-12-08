// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

// Referenced classes of package com.wf.wellsfargomobile:
//            l

class m
    implements android.view.View.OnTouchListener
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return a.a.getVisibility() == 0;
    }
}
