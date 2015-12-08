// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.jiubang.playsdk.views:
//            HorizontalListView

class a
    implements android.view.View.OnTouchListener
{

    final HorizontalListView a;

    a(HorizontalListView horizontallistview)
    {
        a = horizontallistview;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return HorizontalListView.a(a).onTouchEvent(motionevent);
    }
}
