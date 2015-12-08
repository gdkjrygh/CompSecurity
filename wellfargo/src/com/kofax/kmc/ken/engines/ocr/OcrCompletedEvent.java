// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.ocr;

import java.util.EventObject;

// Referenced classes of package com.kofax.kmc.ken.engines.ocr:
//            OcrCompleteStatus

public class OcrCompletedEvent extends EventObject
{

    private static final long serialVersionUID = 1L;
    private OcrCompleteStatus a;

    public OcrCompletedEvent(Object obj, OcrCompleteStatus ocrcompletestatus)
    {
        super(obj);
        a = ocrcompletestatus;
    }

    public OcrCompleteStatus getOCRStatus()
    {
        return a;
    }
}
