// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;


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
            SaverManualReceiptPresenter.access$1500(SaverManualReceiptPresenter.this, 1001);
            SaverManualReceiptPresenter.access$400(SaverManualReceiptPresenter.this);
        }
    }

    public void onSuccess()
    {
        SaverManualReceiptPresenter.access$1400(SaverManualReceiptPresenter.this);
    }

    ()
    {
        this$0 = SaverManualReceiptPresenter.this;
        super();
    }
}
