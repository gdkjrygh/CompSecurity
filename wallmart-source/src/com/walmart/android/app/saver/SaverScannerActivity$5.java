// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Handler;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverScannerActivity

class val.ruid
    implements com.walmart.android.service.saver.back
{

    final SaverScannerActivity this$0;
    final Handler val$handler;
    final String val$ruid;

    public void onResult(SaverReceipt saverreceipt)
    {
        if (saverreceipt != null)
        {
            SaverScannerActivity.access$902(SaverScannerActivity.this, saverreceipt.uuid);
            if (saverreceipt.store != null)
            {
                SaverScannerActivity.access$1002(SaverScannerActivity.this, saverreceipt.store._fld0);
            }
            if (saverreceipt.hasSummary)
            {
                if (!isFinishing())
                {
                    SaverScannerActivity.access$1100(SaverScannerActivity.this);
                    finish();
                }
                return;
            } else
            {
                SaverManager.get().addReceiptToSaver(saverreceipt, "qr-scan", new verCallback(SaverScannerActivity.this, val$handler));
                return;
            }
        } else
        {
            SaverManager.get().retrieveReceipt(val$ruid, "qr-scan", new eceiptCallback(SaverScannerActivity.this, val$handler), new verCallback(SaverScannerActivity.this, val$handler));
            return;
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((SaverReceipt)obj);
    }

    eceiptCallback()
    {
        this$0 = final_saverscanneractivity;
        val$handler = handler1;
        val$ruid = String.this;
        super();
    }
}
