// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.view.MotionEvent;
import android.view.View;
import com.gtp.go.weather.sharephoto.d.p;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class m
    implements android.view.View.OnTouchListener
{

    final PhotoDetailActivity a;

    m(PhotoDetailActivity photodetailactivity)
    {
        a = photodetailactivity;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 51
    //                   2 36
    //                   3 51;
           goto _L1 _L2 _L3 _L1 _L3
_L1:
        return false;
_L2:
        PhotoDetailActivity.b(a).f();
        continue; /* Loop/switch isn't completed */
_L3:
        PhotoDetailActivity.b(a).g();
        if (true) goto _L1; else goto _L4
_L4:
    }
}
