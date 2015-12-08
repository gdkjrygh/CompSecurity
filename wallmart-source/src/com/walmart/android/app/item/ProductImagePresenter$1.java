// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.graphics.Bitmap;
import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.app.item:
//            ProductImagePresenter

class it> extends AsyncCallbackOnThread
{

    final ProductImagePresenter this$0;
    final int val$position;

    public void onFailureSameThread(Integer integer, Bitmap bitmap)
    {
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (Bitmap)obj1);
    }

    public void onSuccessSameThread(Bitmap bitmap)
    {
        if (!isPopped())
        {
            ProductImagePresenter.access$000(ProductImagePresenter.this)[val$position] = bitmap;
            ProductImagePresenter.access$100(ProductImagePresenter.this, val$position);
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((Bitmap)obj);
    }

    (int i)
    {
        this$0 = final_productimagepresenter;
        val$position = i;
        super(Handler.this);
    }
}
