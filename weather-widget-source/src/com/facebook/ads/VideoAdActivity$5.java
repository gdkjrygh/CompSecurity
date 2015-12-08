// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.ads:
//            VideoAdActivity

class a
    implements android.view.er
{

    final VideoAdActivity a;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        view.setAlpha(0.5F);
_L4:
        return false;
_L2:
        if (motionevent.getAction() == 1)
        {
            view.setAlpha(1.0F);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    (VideoAdActivity videoadactivity)
    {
        a = videoadactivity;
        super();
    }
}
