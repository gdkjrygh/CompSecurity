// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.graphics.Bitmap;
import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptImagePresenter

class this._cls0 extends AsyncCallbackOnThread
{

    final SaverReceiptImagePresenter this$0;

    public void onFailureSameThread(Integer integer, Bitmap bitmap)
    {
        if (isPopped())
        {
            if (bitmap != null)
            {
                bitmap.recycle();
            }
            return;
        } else
        {
            SaverReceiptImagePresenter.access$000(SaverReceiptImagePresenter.this, bitmap);
            SaverReceiptImagePresenter.access$100(SaverReceiptImagePresenter.this);
            return;
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (Bitmap)obj1);
    }

    public void onSuccessSameThread(Bitmap bitmap)
    {
        if (isPopped())
        {
            if (bitmap != null)
            {
                bitmap.recycle();
            }
            return;
        } else
        {
            SaverReceiptImagePresenter.access$000(SaverReceiptImagePresenter.this, bitmap);
            SaverReceiptImagePresenter.access$100(SaverReceiptImagePresenter.this);
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((Bitmap)obj);
    }

    (Handler handler)
    {
        this$0 = SaverReceiptImagePresenter.this;
        super(handler);
    }
}
