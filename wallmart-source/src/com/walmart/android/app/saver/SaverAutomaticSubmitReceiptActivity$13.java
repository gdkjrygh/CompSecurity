// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverAutomaticSubmitReceiptActivity

class this._cls0
    implements com.walmart.android.service.saver.._cls0
{

    final SaverAutomaticSubmitReceiptActivity this$0;

    public void onResult(SaverReceipt saverreceipt)
    {
        if (saverreceipt != null)
        {
            SaverAutomaticSubmitReceiptActivity.access$102(SaverAutomaticSubmitReceiptActivity.this, saverreceipt.uuid);
            if (saverreceipt.store != null)
            {
                SaverAutomaticSubmitReceiptActivity.access$402(SaverAutomaticSubmitReceiptActivity.this, saverreceipt.store._fld0);
            }
            if (saverreceipt.hasSummary)
            {
                if (SaverAutomaticSubmitReceiptActivity.access$600(SaverAutomaticSubmitReceiptActivity.this))
                {
                    onShowReceipt(SaverAutomaticSubmitReceiptActivity.access$100(SaverAutomaticSubmitReceiptActivity.this), SaverAutomaticSubmitReceiptActivity.access$200(SaverAutomaticSubmitReceiptActivity.this), SaverAutomaticSubmitReceiptActivity.access$300(SaverAutomaticSubmitReceiptActivity.this), SaverAutomaticSubmitReceiptActivity.access$400(SaverAutomaticSubmitReceiptActivity.this), true);
                }
                return;
            } else
            {
                SaverManager.get().addReceiptToSaver(saverreceipt, SaverAutomaticSubmitReceiptActivity.access$700(SaverAutomaticSubmitReceiptActivity.this), new erCallback(SaverAutomaticSubmitReceiptActivity.this, SaverAutomaticSubmitReceiptActivity.access$800(SaverAutomaticSubmitReceiptActivity.this)));
                return;
            }
        } else
        {
            SaverManager.get().retrieveReceiptByTc(SaverAutomaticSubmitReceiptActivity.access$200(SaverAutomaticSubmitReceiptActivity.this), SaverAutomaticSubmitReceiptActivity.access$300(SaverAutomaticSubmitReceiptActivity.this), SaverAutomaticSubmitReceiptActivity.access$700(SaverAutomaticSubmitReceiptActivity.this), new ceiptCallback(SaverAutomaticSubmitReceiptActivity.this, SaverAutomaticSubmitReceiptActivity.access$800(SaverAutomaticSubmitReceiptActivity.this)), new erCallback(SaverAutomaticSubmitReceiptActivity.this, SaverAutomaticSubmitReceiptActivity.access$800(SaverAutomaticSubmitReceiptActivity.this)));
            return;
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((SaverReceipt)obj);
    }

    ceiptCallback()
    {
        this$0 = SaverAutomaticSubmitReceiptActivity.this;
        super();
    }
}
