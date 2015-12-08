// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import com.walmart.android.service.saver.StatusResponse;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverScannerActivity, SaverSubmitReceiptActivity

private class nit> extends nit>
{

    final SaverScannerActivity this$0;

    protected void dismissDialog(int i)
    {
        SaverScannerActivity.this.dismissDialog(i);
    }

    protected boolean isEReceipt()
    {
        return SaverScannerActivity.access$900(SaverScannerActivity.this) != null;
    }

    protected boolean isTop()
    {
        return !isFinishing();
    }

    public void onSuccessSameThread(StatusResponse statusresponse)
    {
        Toast.makeText(SaverScannerActivity.this, 0x7f090537, 0).show();
        if (!isFinishing())
        {
            dismissDialog(1001);
            statusresponse = new Intent(SaverScannerActivity.this, com/walmart/android/app/saver/SaverSubmitReceiptActivity);
            statusresponse.addFlags(0x2000000);
            statusresponse.putExtra("EXTRA_RECEIPT_SUBMITTED", true);
            statusresponse.putExtra("EXTRA_RECEIPT_ID", SaverScannerActivity.access$900(SaverScannerActivity.this));
            statusresponse.putExtra("EXTRA_STORE_ID", SaverScannerActivity.access$1000(SaverScannerActivity.this));
            statusresponse.putExtra("EXTRA_FROM_SCANNER", true);
            startActivity(statusresponse);
            SaverScannerActivity.access$2000(SaverScannerActivity.this);
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((StatusResponse)obj);
    }

    protected void showDialog(int i)
    {
        SaverScannerActivity.access$2100(SaverScannerActivity.this, i);
    }

    protected void showDialog(int i, Bundle bundle)
    {
        SaverScannerActivity.access$2200(SaverScannerActivity.this, i, bundle);
    }

    public (Handler handler)
    {
        this$0 = SaverScannerActivity.this;
        super(handler);
    }
}
