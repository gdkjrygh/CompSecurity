// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmart.android.service.saver.SaverManager;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverManualReceiptPresenter

class this._cls0
    implements com.walmart.android.wmservice.this._cls0
{

    final SaverManualReceiptPresenter this$0;

    public void onFailure(int i)
    {
        if (isTop())
        {
            SaverManualReceiptPresenter.access$1800(SaverManualReceiptPresenter.this, 1001);
            SaverManualReceiptPresenter.access$400(SaverManualReceiptPresenter.this);
        }
    }

    public void onSuccess()
    {
        SaverManager savermanager = SaverManager.get();
        String s1 = SaverManualReceiptPresenter.access$600(SaverManualReceiptPresenter.this);
        java.util.Date date = SaverManualReceiptPresenter.access$700(SaverManualReceiptPresenter.this);
        String s;
        if (SaverManualReceiptPresenter.access$1600(SaverManualReceiptPresenter.this))
        {
            s = "tc-manual";
        } else
        {
            s = "tc-scan";
        }
        savermanager.addReceiptToSaverByTc(s1, date, s, new erCallback(SaverManualReceiptPresenter.this, SaverManualReceiptPresenter.access$1700(SaverManualReceiptPresenter.this)));
    }

    erCallback()
    {
        this$0 = SaverManualReceiptPresenter.this;
        super();
    }
}
