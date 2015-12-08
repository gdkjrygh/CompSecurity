// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import com.squareup.otto.Bus;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            CameraManager

class a
    implements FocusMoveCallback
{

    final sMoveCallbackEvent a;

    public void onAutoFocusMoving(boolean flag)
    {
        CameraManager.d(a.a).post(new sMoveCallbackEvent(flag));
    }

    sMoveCallbackEvent(sMoveCallbackEvent smovecallbackevent)
    {
        a = smovecallbackevent;
        super();
    }
}
