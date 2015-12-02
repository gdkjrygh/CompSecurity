// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            fe

class aog
    implements android.view.View.OnTouchListener
{

    final fe a;

    aog(fe fe1)
    {
        a = fe1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 4)
        {
            a.dismiss();
            return true;
        } else
        {
            return false;
        }
    }
}
