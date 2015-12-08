// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmartlabs.ui:
//            ImageAdapter

class allbackOnThread extends AsyncCallbackOnThread
{

    final ImageAdapter this$0;
    final String val$imageUrl;
    final int val$imageViewId;
    final View val$listEntryView;
    final int val$position;

    public void onFailureSameThread(Integer integer, Bitmap bitmap)
    {
        onFailedImageDownload(val$position, val$listEntryView, val$imageViewId, val$imageUrl);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (Bitmap)obj1);
    }

    public void onSuccessSameThread(Bitmap bitmap)
    {
        setAndCacheImage(bitmap, val$position, val$listEntryView, val$imageViewId, val$imageUrl);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((Bitmap)obj);
    }

    allbackOnThread(int j)
    {
        this$0 = final_imageadapter;
        val$imageUrl = s;
        val$position = i;
        val$listEntryView = View.this;
        val$imageViewId = j;
        super(final_handler);
    }
}
