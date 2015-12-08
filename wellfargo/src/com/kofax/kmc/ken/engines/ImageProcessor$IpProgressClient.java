// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import android.os.Handler;
import android.os.Looper;
import com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            ImageProcessor

public class a
    implements com.kofax.kmc.ken.engines.iplib.
{

    final ImageProcessor a;

    public void handleIpProgressUpdate(int i, Object obj)
    {
        obj = (ProcessPageOutRep)obj;
        Handler handler = new Handler(Looper.getMainLooper());
        if (((ProcessPageOutRep) (obj)).callbackOnWorkerThread)
        {
            a.a(ErrorInfo.KMC_SUCCESS, ((ProcessPageOutRep) (obj)).imageID, i);
            return;
        } else
        {
            class _cls1
                implements Runnable
            {

                final ProcessPageOutRep a;
                final int b;
                final ImageProcessor.IpProgressClient c;

                public void run()
                {
                    c.a.a(ErrorInfo.KMC_SUCCESS, a.imageID, b);
                }

            _cls1(ProcessPageOutRep processpageoutrep, int i)
            {
                c = ImageProcessor.IpProgressClient.this;
                a = processpageoutrep;
                b = i;
                super();
            }
            }

            handler.post(new _cls1(((ProcessPageOutRep) (obj)), i));
            return;
        }
    }

    public _cls1(ImageProcessor imageprocessor)
    {
        a = imageprocessor;
        super();
    }
}
