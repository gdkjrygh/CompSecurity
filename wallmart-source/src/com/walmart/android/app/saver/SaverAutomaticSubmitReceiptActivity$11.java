// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;


// Referenced classes of package com.walmart.android.app.saver:
//            SaverAutomaticSubmitReceiptActivity

class this._cls0
    implements com.walmart.android.wmservice.this._cls0
{

    final SaverAutomaticSubmitReceiptActivity this$0;

    public void onFailure(int i)
    {
        if (SaverAutomaticSubmitReceiptActivity.access$600(SaverAutomaticSubmitReceiptActivity.this))
        {
            dismissDialog(1001);
            SaverAutomaticSubmitReceiptActivity.access$000(SaverAutomaticSubmitReceiptActivity.this);
        }
    }

    public void onSuccess()
    {
        SaverAutomaticSubmitReceiptActivity.access$500(SaverAutomaticSubmitReceiptActivity.this);
    }

    ()
    {
        this$0 = SaverAutomaticSubmitReceiptActivity.this;
        super();
    }
}
