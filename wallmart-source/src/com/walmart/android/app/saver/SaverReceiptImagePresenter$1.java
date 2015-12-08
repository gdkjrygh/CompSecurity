// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;


// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptImagePresenter

class this._cls0
    implements com.walmartlabs.ereceipt.service.k
{

    final SaverReceiptImagePresenter this$0;

    public volatile void onResult(Object obj)
    {
        onResult((String)obj);
    }

    public void onResult(String s)
    {
        (new codeBitmapTask(SaverReceiptImagePresenter.this)).execute(new String[] {
            s
        });
    }

    codeBitmapTask()
    {
        this$0 = SaverReceiptImagePresenter.this;
        super();
    }
}
