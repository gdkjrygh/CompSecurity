// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.payment;


// Referenced classes of package com.walmart.android.app.payment:
//            MobilePayScannerActivity

class this._cls0
    implements com.walmartlabs.payment.controller.mpay.lback
{

    final MobilePayScannerActivity this$0;

    public void disableScan()
    {
        if (!isFinishing())
        {
            MobilePayScannerActivity.access$100(MobilePayScannerActivity.this);
        }
    }

    public void enableScan()
    {
        if (!isFinishing())
        {
            MobilePayScannerActivity.access$000(MobilePayScannerActivity.this);
        }
    }

    public void onCancel()
    {
        if (!isFinishing())
        {
            finish();
            setResult(0);
        }
    }

    ller.Callback()
    {
        this$0 = MobilePayScannerActivity.this;
        super();
    }
}
