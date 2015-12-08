// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.support.v4.view.GestureDetectorCompat;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile:
//            MainActivity

class aa
    implements android.view.View.OnTouchListener
{

    final MainActivity a;

    aa(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return MainActivity.b(a).onTouchEvent(motionevent);
    }
}
