// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.graphics.Point;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.kui.uicontrols.data.PageDetectMode;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.squareup.otto.Bus;
import java.util.Vector;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            l, s, IPageDetector, Utility

public class ICaptureConstraint_PageDetect
    implements l
{

    private final Bus a;
    private final IPageDetector b;
    private boolean c;
    private boolean d;
    private boolean e;
    private l f;
    private PageDetectMode g;

    public ICaptureConstraint_PageDetect(Context context, Bus bus, IPageDetector ipagedetector)
    {
        g = PageDetectMode.OFF;
        if (ipagedetector == null)
        {
            throw new IllegalArgumentException("pageDetect cannot be null");
        }
        Object obj = bus;
        if (bus == null)
        {
            obj = s.a(context);
        }
        a = ((Bus) (obj));
        a.register(this);
        b = ipagedetector;
    }

    public boolean isMet(BusEvents.PreviewImageReadyBusEvent previewimagereadybusevent)
    {
        Object obj;
        int i;
        int j;
        l l1 = f;
        byte abyte0[];
        android.graphics.Bitmap bitmap;
        int k;
        if (g == PageDetectMode.OFF)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (g == PageDetectMode.CONTINUOUS || g == PageDetectMode.AUTOMATIC && c && d && e)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        k = i;
        if (j == 0) goto _L2; else goto _L1
_L1:
        obj = b;
        abyte0 = previewimagereadybusevent.imageData;
        previewimagereadybusevent.getClass();
        k = i;
        if (!((IPageDetector) (obj)).doPageDetect(abyte0, 17, previewimagereadybusevent.width, previewimagereadybusevent.height)) goto _L2; else goto _L3
_L3:
        i = previewimagereadybusevent.width;
        j = previewimagereadybusevent.height;
        k = previewimagereadybusevent.rotation;
        obj = b.getDocumentBounds();
        obj = new BoundingTetragon((Point)((Vector) (obj)).get(0), (Point)((Vector) (obj)).get(1), (Point)((Vector) (obj)).get(2), (Point)((Vector) (obj)).get(3));
        k;
        JVM INSTR lookupswitch 6: default 240
    //                   -270: 340
    //                   -180: 312
    //                   -90: 326
    //                   90: 340
    //                   180: 312
    //                   270: 326;
           goto _L4 _L5 _L6 _L7 _L5 _L6 _L7
_L4:
        bitmap = Utility.Rotate(b.getProcessedImage(), previewimagereadybusevent.rotation);
        a.post(new BusEvents.PageDetectionBusEvent(bitmap, ((BoundingTetragon) (obj))));
        k = 1;
_L2:
        return k != 0 && (l1 == null || l1.isMet(previewimagereadybusevent));
_L6:
        ((BoundingTetragon) (obj)).rotate(i, j, com.kofax.kmc.ken.engines.data.BoundingTetragon.Rotation.FLIP);
        continue; /* Loop/switch isn't completed */
_L7:
        ((BoundingTetragon) (obj)).rotate(i, j, com.kofax.kmc.ken.engines.data.BoundingTetragon.Rotation.LEFT);
        continue; /* Loop/switch isn't completed */
_L5:
        ((BoundingTetragon) (obj)).rotate(i, j, com.kofax.kmc.ken.engines.data.BoundingTetragon.Rotation.RIGHT);
        if (true) goto _L4; else goto _L8
_L8:
    }

    public void onFocusChanged(BusEvents.FocusChangedEvent focuschangedevent)
    {
        e = focuschangedevent.focused;
    }

    public void onLevelChanged(BusEvents.LevelChangedEvent levelchangedevent)
    {
        d = levelchangedevent.level;
    }

    public void onPageAreaForDetectionChanged(BusEvents.PageAreaThresholdChangedEvent pageareathresholdchangedevent)
    {
        int i = pageareathresholdchangedevent.threshold;
        if (i <= 0 || i >= 100)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_PAGE_THRESHOLD_ARGUMENT);
        } else
        {
            b.setPageAreaForDetection(i);
            return;
        }
    }

    public void onPageDetectModeChanged(BusEvents.PageDetectModeChangedEvent pagedetectmodechangedevent)
    {
        g = pagedetectmodechangedevent.mode;
    }

    public void onStabilityChanged(BusEvents.StabilityChangedEvent stabilitychangedevent)
    {
        c = stabilitychangedevent.stable;
    }

    public void setNext(l l1)
    {
        f = l1;
    }
}
