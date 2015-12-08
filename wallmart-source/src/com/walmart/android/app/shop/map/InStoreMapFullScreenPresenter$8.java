// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.support.v4.view.GestureDetectorCompat;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapFullScreenPresenter

class val.tapGestureDetector
    implements android.view.llScreenPresenter._cls8
{

    final InStoreMapFullScreenPresenter this$0;
    final GestureDetectorCompat val$tapGestureDetector;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        val$tapGestureDetector.onTouchEvent(motionevent);
        return false;
    }

    ()
    {
        this$0 = final_instoremapfullscreenpresenter;
        val$tapGestureDetector = GestureDetectorCompat.this;
        super();
    }
}
