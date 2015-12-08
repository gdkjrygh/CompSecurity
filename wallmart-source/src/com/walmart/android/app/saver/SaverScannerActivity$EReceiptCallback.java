// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverScannerActivity

private class nit> extends nit>
{

    final SaverScannerActivity this$0;

    protected void dismissDialog(int i)
    {
        SaverScannerActivity.this.dismissDialog(i);
    }

    protected boolean isTop()
    {
        return !isFinishing();
    }

    protected void onNotFoundFailure()
    {
        SaverScannerActivity.access$1700(SaverScannerActivity.this, 1002);
        trackError("Error Handling - Scan Entry Not Recognized");
    }

    protected void onReceipt(com.walmartlabs.ereceipt.service.ckError ckerror)
    {
        SaverScannerActivity.access$902(SaverScannerActivity.this, ckerror._fld0);
        if (ckerror._fld0 != null)
        {
            SaverScannerActivity.access$1002(SaverScannerActivity.this, ckerror._fld0._fld0);
        }
        if (!TextUtils.isEmpty(ckerror._fld0))
        {
            MessageBus.getBus().post((new com.walmartlabs.anivia.Number("tcNumber")).Number("number", ckerror._fld0));
        }
    }

    protected void showDialog(int i)
    {
        SaverScannerActivity.access$1800(SaverScannerActivity.this, i);
    }

    protected void showDialog(int i, Bundle bundle)
    {
        SaverScannerActivity.access$1900(SaverScannerActivity.this, i, bundle);
    }

    public I(Handler handler)
    {
        this$0 = SaverScannerActivity.this;
        super(handler);
    }
}
