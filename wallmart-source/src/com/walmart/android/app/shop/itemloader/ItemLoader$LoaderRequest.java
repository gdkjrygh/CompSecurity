// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            ItemLoader

protected abstract class this._cls0 extends AsyncCallbackOnThread
{

    private boolean mIsCancelled;
    final ItemLoader this$0;

    protected void cancel()
    {
        mIsCancelled = true;
    }

    public abstract void onFailed(Integer integer, Object obj);

    public final void onFailureSameThread(Integer integer, Object obj)
    {
        if (!mIsCancelled)
        {
            onFailed(integer, obj);
            ItemLoader.access$002(ItemLoader.this, null);
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, obj1);
    }

    public abstract void onResponse(Object obj);

    public final void onSuccessSameThread(Object obj)
    {
        if (!mIsCancelled)
        {
            onResponse(obj);
            ItemLoader.access$102(ItemLoader.this, ItemLoader.access$100(ItemLoader.this) + ItemLoader.access$200(ItemLoader.this));
            ItemLoader.access$002(ItemLoader.this, null);
        }
    }

    protected (Handler handler)
    {
        this$0 = ItemLoader.this;
        super(handler);
    }
}
