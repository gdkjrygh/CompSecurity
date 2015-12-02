// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            QuickContactActivity

class u2
    implements android.view.View.OnTouchListener
{

    final QuickContactActivity a;

    u2(QuickContactActivity quickcontactactivity)
    {
        a = quickcontactactivity;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        QuickContactActivity.a(a);
        return true;
    }
}
