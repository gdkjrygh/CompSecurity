// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import com.wf.wellsfargomobile.util.a;

// Referenced classes of package com.wf.wellsfargomobile:
//            QRCodeScanActivity

class ak
    implements Runnable
{

    final QRCodeScanActivity a;

    ak(QRCodeScanActivity qrcodescanactivity)
    {
        a = qrcodescanactivity;
        super();
    }

    public void run()
    {
        if (com.wf.wellsfargomobile.QRCodeScanActivity.a(a) != null)
        {
            com.wf.wellsfargomobile.QRCodeScanActivity.a(a).a();
        }
        a.g();
    }
}
