// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.os.Handler;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            CameraManager, ICameraSource

class a
    implements ctureCallback
{

    final CameraManager a;

    public void onPictureTaken(byte abyte0[])
    {
        rameters rameters = CameraManager.b(a).getParameters();
        Point point = rameters.getPictureSize();
        int i = rameters.getPictureFormat();
        class _cls1
            implements Runnable
        {

            final byte a[];
            final Point b;
            final int c;
            final CameraManager._cls2 d;

            public void run()
            {
                android.graphics.Bitmap bitmap = Utility.imageDataToBitmap(a, b.x, b.y, c, CameraManager.c(d.a));
                CameraManager.d(d.a).post(new BusEvents.ImageCapturedBusEvent(bitmap));
            }

            _cls1(byte abyte0[], Point point, int i)
            {
                d = CameraManager._cls2.this;
                a = abyte0;
                b = point;
                c = i;
                super();
            }
        }

        (new Handler(CameraManager.e(a).getMainLooper())).post(new _cls1(abyte0, point, i));
    }

    _cls1(CameraManager cameramanager)
    {
        a = cameramanager;
        super();
    }
}
