// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.graphics.Bitmap;
import android.os.AsyncTask;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptDetailPresenter

class this._cls0 extends AsyncTask
{

    final EReceiptDetailPresenter this$0;

    protected transient Bitmap doInBackground(String as[])
    {
        as = as[0];
        return EReceiptDetailPresenter.access$600(EReceiptDetailPresenter.this, as);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(Bitmap bitmap)
    {
        if (isPopped())
        {
            return;
        } else
        {
            EReceiptDetailPresenter.access$000(EReceiptDetailPresenter.this, bitmap);
            EReceiptDetailPresenter.access$100(EReceiptDetailPresenter.this);
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }

    ()
    {
        this$0 = EReceiptDetailPresenter.this;
        super();
    }
}
