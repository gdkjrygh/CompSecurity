// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.shop;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.shop:
//            ImageUrlAdapter

class Thread extends AsyncCallbackOnThread
{

    final ImageUrlAdapter this$0;
    final int val$position;
    final String val$url;

    public void onFailureSameThread(Integer integer, Bitmap bitmap)
    {
        Log.w(ImageUrlAdapter.access$000(), (new StringBuilder()).append("Failed to download image : ").append(val$url).toString());
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (Bitmap)obj1);
    }

    public void onSuccessSameThread(Bitmap bitmap)
    {
        ImageUrlAdapter.access$100(ImageUrlAdapter.this).put(val$position, bitmap);
        bitmap = (View)ImageUrlAdapter.access$200(ImageUrlAdapter.this).get(val$position);
        if (bitmap != null)
        {
            ImageUrlAdapter.access$300(ImageUrlAdapter.this, val$position, bitmap);
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((Bitmap)obj);
    }

    Thread(int i)
    {
        this$0 = final_imageurladapter;
        val$url = String.this;
        val$position = i;
        super(final_handler);
    }
}
