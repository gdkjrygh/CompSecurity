// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import java.util.TimerTask;

// Referenced classes of package com.kofax.kmc.kui.uicontrols.captureanimations:
//            a, AnimatedDocumentCaptureExperience

class a extends TimerTask
{

    final a a;
    final AnimatedDocumentCaptureExperience b;

    public void run()
    {
        if (a == null)
        {
            return;
        } else
        {
            a.d(true);
            return;
        }
    }

    (AnimatedDocumentCaptureExperience animateddocumentcaptureexperience, a a1)
    {
        b = animateddocumentcaptureexperience;
        a = a1;
        super();
    }
}
