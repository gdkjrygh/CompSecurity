// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverManualReceiptPresenter, SaverNotificationUtils

class this._cls0
    implements com.walmart.android.service.saver.._cls0
{

    final SaverManualReceiptPresenter this$0;

    public void onResult(SaverReceipt saverreceipt)
    {
        if (saverreceipt != null)
        {
            SaverManualReceiptPresenter.access$502(SaverManualReceiptPresenter.this, saverreceipt.uuid);
            if (saverreceipt.store != null)
            {
                SaverManualReceiptPresenter.access$802(SaverManualReceiptPresenter.this, saverreceipt.store._fld0);
            }
            if (saverreceipt.hasSummary)
            {
                if (isTop())
                {
                    SaverManualReceiptPresenter.access$300(SaverManualReceiptPresenter.this).onShowReceipt(SaverManualReceiptPresenter.access$500(SaverManualReceiptPresenter.this), SaverManualReceiptPresenter.access$600(SaverManualReceiptPresenter.this), SaverNotificationUtils.getLocalDate(SaverManualReceiptPresenter.access$700(SaverManualReceiptPresenter.this)), SaverManualReceiptPresenter.access$800(SaverManualReceiptPresenter.this), true);
                }
                return;
            }
            SaverManager savermanager1 = SaverManager.get();
            String s;
            if (SaverManualReceiptPresenter.access$1600(SaverManualReceiptPresenter.this))
            {
                s = "tc-manual";
            } else
            {
                s = "tc-scan";
            }
            savermanager1.addReceiptToSaver(saverreceipt, s, new erCallback(SaverManualReceiptPresenter.this, SaverManualReceiptPresenter.access$1700(SaverManualReceiptPresenter.this)));
            return;
        }
        SaverManager savermanager = SaverManager.get();
        String s1 = SaverManualReceiptPresenter.access$600(SaverManualReceiptPresenter.this);
        java.util.Date date = SaverManualReceiptPresenter.access$700(SaverManualReceiptPresenter.this);
        if (SaverManualReceiptPresenter.access$1600(SaverManualReceiptPresenter.this))
        {
            saverreceipt = "tc-manual";
        } else
        {
            saverreceipt = "tc-scan";
        }
        savermanager.retrieveReceiptByTc(s1, date, saverreceipt, new ceiptCallback(SaverManualReceiptPresenter.this, SaverManualReceiptPresenter.access$1700(SaverManualReceiptPresenter.this)), new erCallback(SaverManualReceiptPresenter.this, SaverManualReceiptPresenter.access$1700(SaverManualReceiptPresenter.this)));
    }

    public volatile void onResult(Object obj)
    {
        onResult((SaverReceipt)obj);
    }

    ceiptCallback()
    {
        this$0 = SaverManualReceiptPresenter.this;
        super();
    }
}
