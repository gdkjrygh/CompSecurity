// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.sessionm.ui:
//            SessionMViewContainer

class this._cls0
    implements android.view.._cls1
{

    final SessionMViewContainer this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        SessionMViewContainer sessionmviewcontainer = SessionMViewContainer.this;
        sessionmviewcontainer;
        JVM INSTR monitorenter ;
        if (SessionMViewContainer.access$200(SessionMViewContainer.this) == null) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 0 1: default 68
    //                   0 48
    //                   1 48;
           goto _L2 _L3 _L3
_L2:
        return false;
_L3:
        if (!view.hasFocus())
        {
            view.requestFocus();
        }
        if (true) goto _L2; else goto _L4
_L4:
        view;
        sessionmviewcontainer;
        JVM INSTR monitorexit ;
        throw view;
    }

    ()
    {
        this$0 = SessionMViewContainer.this;
        super();
    }
}
