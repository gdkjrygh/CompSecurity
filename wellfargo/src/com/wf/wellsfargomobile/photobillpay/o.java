// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.photobillpay;

import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kui.uicontrols.captureanimations.AnimatedDocumentCaptureExperience;

// Referenced classes of package com.wf.wellsfargomobile.photobillpay:
//            n, PhotoBillPayScanActivity

class o
    implements Runnable
{

    final n a;

    o(n n1)
    {
        a = n1;
        super();
    }

    public void run()
    {
        PhotoBillPayScanActivity.a(a.a).stopCapture();
        PhotoBillPayScanActivity.b(a.a).setVisibility(4);
    }
}
