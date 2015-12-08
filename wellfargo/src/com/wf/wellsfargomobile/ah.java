// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.view.MotionEvent;

// Referenced classes of package com.wf.wellsfargomobile:
//            MainActivity

public class ah extends android.view.GestureDetector.SimpleOnGestureListener
{

    final MainActivity a;

    public ah(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public boolean onDown(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        MainActivity.a(a);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        MainActivity.a(a);
        return super.onSingleTapUp(motionevent);
    }
}
