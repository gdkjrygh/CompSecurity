// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            afn, za

class y8
    implements android.view.View.OnTouchListener
{

    final afn a;
    final Handler b;

    y8(afn afn1, Handler handler)
    {
        a = afn1;
        b = handler;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 75
    //                   2 36
    //                   3 85;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return false;
_L2:
        if (afn.d(a) != null)
        {
            afn.d(a).a();
            b.sendEmptyMessageDelayed(0, afn.c());
            return false;
        }
          goto _L1
_L3:
        b.removeMessages(0);
        return false;
_L4:
        b.removeMessages(0);
        return false;
    }
}
