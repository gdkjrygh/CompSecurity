// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Log;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.app.shop:
//            SimpleItemDetailsPresenter

class this._cls0 extends AsyncCallbackOnThread
{

    final SimpleItemDetailsPresenter this$0;

    public void onFailureSameThread(Integer integer, Bitmap bitmap)
    {
        Log.e(SimpleItemDetailsPresenter.TAG, (new StringBuilder()).append("Failed to load detail image: ").append(integer).toString());
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
            SimpleItemDetailsPresenter.access$100(SimpleItemDetailsPresenter.this, bitmap, false);
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((Bitmap)obj);
    }

    (Handler handler)
    {
        this$0 = SimpleItemDetailsPresenter.this;
        super(handler);
    }
}
