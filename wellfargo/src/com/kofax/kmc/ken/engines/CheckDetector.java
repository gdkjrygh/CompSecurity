// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.CheckDetectionResult;
import com.kofax.kmc.ken.engines.data.CheckDetectionSettings;
import com.kofax.kmc.ken.engines.data.CheckSide;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            ICheckDetector, a

public class CheckDetector
    implements ICheckDetector
{

    private final ICheckDetector a;

    public CheckDetector()
    {
        this(null, null);
    }

    CheckDetector(ICheckDetector icheckdetector, ICheckDetector icheckdetector1)
    {
        icheckdetector1 = icheckdetector;
        if (icheckdetector == null)
        {
            icheckdetector1 = new a();
        }
        a = icheckdetector1;
    }

    public final CheckDetectionResult detect(CheckSide checkside, CheckDetectionSettings checkdetectionsettings, Bitmap bitmap)
    {
        return a.detect(checkside, checkdetectionsettings, bitmap);
    }
}
