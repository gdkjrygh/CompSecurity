// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.graphics.Bitmap;
import android.os.AsyncTask;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptImagePresenter

class this._cls0 extends AsyncTask
{

    final SaverReceiptImagePresenter this$0;

    protected transient Bitmap doInBackground(String as[])
    {
        as = as[0];
        return SaverReceiptImagePresenter.access$200(SaverReceiptImagePresenter.this, as);
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
            SaverReceiptImagePresenter.access$000(SaverReceiptImagePresenter.this, bitmap);
            SaverReceiptImagePresenter.access$100(SaverReceiptImagePresenter.this);
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }

    ()
    {
        this$0 = SaverReceiptImagePresenter.this;
        super();
    }
}
