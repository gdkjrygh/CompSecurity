// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;


// Referenced classes of package com.wf.wellsfargomobile:
//            QRCodeScanActivity, ak

class an extends Thread
{

    final QRCodeScanActivity a;
    private long b;

    private an(QRCodeScanActivity qrcodescanactivity)
    {
        a = qrcodescanactivity;
        super();
    }

    an(QRCodeScanActivity qrcodescanactivity, ak ak)
    {
        this(qrcodescanactivity);
    }

    public void a()
    {
        QRCodeScanActivity.a(a, true);
    }

    public void a(long l)
    {
        b = l;
    }

    public void run()
    {
        QRCodeScanActivity.a(a, false);
        long l = System.currentTimeMillis();
        long l1 = b;
        do
        {
            if (QRCodeScanActivity.b(a))
            {
                break;
            }
            if (System.currentTimeMillis() > l + l1)
            {
                QRCodeScanActivity.a(a, true);
                a.e();
            }
        } while (true);
    }
}
