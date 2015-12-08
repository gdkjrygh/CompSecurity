// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.graphics.Bitmap;
import android.util.Log;
import com.kofax.kmc.ken.engines.ICheckDetector;
import com.kofax.kmc.ken.engines.data.CheckDetectionResult;
import com.kofax.kmc.ken.engines.data.CheckSide;

// Referenced classes of package com.kofax.kmc.kui.uicontrols.captureanimations:
//            CheckCaptureExperience, CheckOverlayFrameView, a

class a
    implements Runnable
{

    final Bitmap a;
    final CheckCaptureExperience b;

    public void run()
    {
        CheckDetectionResult checkdetectionresult;
        long l;
        checkdetectionresult = CheckCaptureExperience.b(b).detect(CheckSide.FRONT, CheckCaptureExperience.a(b), a);
        l = System.currentTimeMillis();
        if (checkdetectionresult == null) goto _L2; else goto _L1
_L1:
        CheckCaptureExperience.a(b, false);
        CheckCaptureExperience.a(b, l);
        CheckCaptureExperience.a(b, checkdetectionresult);
        Log.d(CheckCaptureExperience.a(), checkdetectionresult.toString());
_L3:
        if (l - CheckCaptureExperience.c(b) < 3000L)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        CheckCaptureExperience.a(b, true);
        CheckCaptureExperience.d(b).setGuidance(checkdetectionresult);
        b._captureExperienceData.a(checkdetectionresult);
_L4:
        b.b(b._captureExperienceData);
        b.a = false;
        return;
_L2:
        Log.d(CheckCaptureExperience.a(), "GUIDANCE: NULL");
          goto _L3
        Exception exception;
        exception;
        b.a = false;
        throw exception;
        CheckCaptureExperience.d(b).setGuidance(CheckCaptureExperience.e(b));
        b._captureExperienceData.a(CheckCaptureExperience.e(b));
          goto _L4
    }

    (CheckCaptureExperience checkcaptureexperience, Bitmap bitmap)
    {
        b = checkcaptureexperience;
        a = bitmap;
        super();
    }
}
