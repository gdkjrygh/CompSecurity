// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.graphics.Bitmap;
import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptItemComparisonPresenter

class this._cls0 extends AsyncCallbackOnThread
{

    final SaverReceiptItemComparisonPresenter this$0;

    public void onFailureSameThread(Integer integer, Bitmap bitmap)
    {
        WLog.e(SaverReceiptItemComparisonPresenter.access$400(), (new StringBuilder()).append("Failed to load detail image: ").append(integer).toString());
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (Bitmap)obj1);
    }

    public void onSuccessSameThread(Bitmap bitmap)
    {
        if (isPopped())
        {
            bitmap.recycle();
            return;
        } else
        {
            SaverReceiptItemComparisonPresenter.access$500(SaverReceiptItemComparisonPresenter.this, bitmap);
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((Bitmap)obj);
    }

    I(Handler handler)
    {
        this$0 = SaverReceiptItemComparisonPresenter.this;
        super(handler);
    }
}
