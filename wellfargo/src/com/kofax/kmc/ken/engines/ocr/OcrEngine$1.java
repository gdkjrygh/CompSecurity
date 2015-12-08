// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.ocr;

import android.util.Log;
import com.kofax.kmc.ken.engines.appstats.OCRResults;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;

// Referenced classes of package com.kofax.kmc.ken.engines.ocr:
//            OcrEngine

class a
    implements com.kofax.kmc.ken.engines.or.ImageOutListener
{

    final OcrEngine a;

    public void imageOut(com.kofax.kmc.ken.engines.or.ImageOutEvent imageoutevent)
    {
        Object obj = imageoutevent.getStatus();
        if (ErrorInfo.KMC_SUCCESS == obj)
        {
            String s = imageoutevent.getImage().getImageMetaData();
            s = OcrEngine.a(a, s);
            Log.i(OcrEngine.a(a), (new StringBuilder()).append("Parsed Data = ").append(s).toString());
        }
        OcrEngine.a(a, ((ErrorInfo) (obj)));
        obj = new OCRResults();
        ((OCRResults) (obj)).setResultCode(imageoutevent.getStatus().getErr());
        ((OCRResults) (obj)).setOCREventType(OcrEngine.b(a));
    }

    mageOutEvent(OcrEngine ocrengine)
    {
        a = ocrengine;
        super();
    }
}
