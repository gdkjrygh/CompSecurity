// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import java.util.TimerTask;

// Referenced classes of package com.kofax.kmc.kui.uicontrols.captureanimations:
//            a, CheckCaptureExperience, CheckOverlayFrameView

class a extends TimerTask
{

    final a a;
    final CheckCaptureExperience b;

    public void run()
    {
        if (a == null)
        {
            return;
        } else
        {
            a.g(true);
            CheckCaptureExperience.d(b).setInstructionOverlay(false);
            CheckCaptureExperience.b(b, false);
            return;
        }
    }

    (CheckCaptureExperience checkcaptureexperience, a a1)
    {
        b = checkcaptureexperience;
        a = a1;
        super();
    }
}
