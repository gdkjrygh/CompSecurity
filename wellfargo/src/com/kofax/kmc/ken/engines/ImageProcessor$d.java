// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import android.util.Log;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.QuickAnalysisFeedback;
import com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            ImageProcessor

class <init>
    implements com.kofax.kmc.kut.utilities.async.mpletedListener
{

    final ImageProcessor a;
    private ImageProcessor b;
    private ProcessPageOutRep c;

    static ImageProcessor a(stener stener, ImageProcessor imageprocessor)
    {
        stener.b = imageprocessor;
        return imageprocessor;
    }

    static ProcessPageOutRep a(OutRep outrep, ProcessPageOutRep processpageoutrep)
    {
        outrep.c = processpageoutrep;
        return processpageoutrep;
    }

    public void onTaskCompleted(com.kofax.kmc.kut.utilities.async.mpletedEvent mpletedevent)
    {
        Object obj;
        com.kofax.kmc.ken.engines.service.ncementResults ncementresults;
        Object obj1 = null;
        long l = mpletedevent.getTaskID();
        Log.i("ImageProcessor", (new StringBuilder()).append("Task ").append(l).append(" completed.").toString());
        obj = mpletedevent.getTaskError();
        QuickAnalysisFeedback quickanalysisfeedback;
        if (obj == ErrorInfo.KMC_SUCCESS)
        {
            Log.i("ImageProcessor", "No Task Error. Good.");
            if (ImageProcessor.a() != l)
            {
                Log.i("ImageProcessor", (new StringBuilder()).append("Unexpected: Task ").append(ImageProcessor.a()).append(" was running.").toString());
            }
        } else
        {
            Log.i("ImageProcessor", (new StringBuilder()).append("Task Error: ").append(((ErrorInfo) (obj)).toString()).toString());
        }
        ImageProcessor.a(0L);
        ncementresults = (com.kofax.kmc.ken.engines.service.ncementResults)mpletedevent.getTaskReturnValue();
        if (!c.isQuickAnalysisEnabled()) goto _L2; else goto _L1
_L1:
        if (obj != ErrorInfo.KMC_SUCCESS || ncementresults.image == null) goto _L4; else goto _L3
_L3:
        quickanalysisfeedback = new QuickAnalysisFeedback();
        obj = ncementresults.image.getImageMetaData();
        quickanalysisfeedback.getClass();
        mpletedevent = new com.kofax.kmc.ken.engines.data.back.FriendQAF(quickanalysisfeedback, "com.kofax");
        mpletedevent.setMetadata(((String) (obj)));
_L5:
        obj = obj1;
        if (ImageProcessor.a(a))
        {
            obj = ncementresults.image.getImageBitmap();
        }
        mpletedevent.setViewBoundariesImage(((android.graphics.Bitmap) (obj)));
        try
        {
            mpletedevent = ncementresults.originalImage;
            mpletedevent.getClass();
            mpletedevent = new com.kofax.kmc.ken.engines.data.it>(mpletedevent, "com.kofax");
            mpletedevent.ImageQuickAnalysisFeedBack(quickanalysisfeedback);
            mpletedevent.ImageMetaData(ncementresults.image.getImageMetaData());
        }
        // Misplaced declaration of an exception variable
        catch (com.kofax.kmc.kut.utilities.async.mpletedEvent mpletedevent)
        {
            mpletedevent.printStackTrace();
        }
        b.b(ncementresults.errorInfo, ncementresults.originalImage);
        return;
        obj;
        mpletedevent = null;
_L6:
        ((KmcException) (obj)).printStackTrace();
          goto _L5
_L4:
        mpletedevent = ncementresults.errorInfo;
        b.b(mpletedevent, null);
        return;
_L2:
        if (obj == ErrorInfo.KMC_SUCCESS)
        {
            b.a(ncementresults.errorInfo, ncementresults.image);
            return;
        } else
        {
            b.a(((ErrorInfo) (obj)), null);
            return;
        }
        obj;
          goto _L6
    }

    private ion(ImageProcessor imageprocessor)
    {
        a = imageprocessor;
        super();
    }

    a(ImageProcessor imageprocessor, a a1)
    {
        this(imageprocessor);
    }
}
