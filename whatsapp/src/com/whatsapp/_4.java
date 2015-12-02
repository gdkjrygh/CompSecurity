// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            App, RegisterName

class _4
    implements android.view.View.OnTouchListener
{

    final RegisterName a;

    _4(RegisterName registername)
    {
        a = registername;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 52
    //                   2 36
    //                   3 52;
           goto _L1 _L2 _L3 _L1 _L3
_L1:
        return false;
_L2:
        ((TextView)view).setTextColor(-1);
        if (App.am == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        ((TextView)view).setTextColor(0xff94b3b5);
        if (true) goto _L1; else goto _L4
_L4:
    }
}
