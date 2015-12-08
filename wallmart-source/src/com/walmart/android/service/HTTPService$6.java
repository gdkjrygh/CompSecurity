// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.net.Uri;

// Referenced classes of package com.walmart.android.service:
//            CancellableRunnable, HTTPService, AsyncCallback, DataCache

class val.expiry
    implements CancellableRunnable
{

    final HTTPService this$0;
    final AsyncCallback val$asyncCallback;
    final long val$expiry;
    final String val$imageURL;

    public boolean cancel()
    {
        val$asyncCallback.onFailure(Integer.valueOf(0), null);
        return true;
    }

    public void run()
    {
        String s = Uri.encode(val$imageURL);
        android.graphics.Bitmap bitmap1 = HTTPService.access$000(HTTPService.this).getImage(s);
        boolean flag = false;
        android.graphics.Bitmap bitmap = bitmap1;
        if (bitmap1 == null)
        {
            bitmap = getImageFromURL(val$imageURL);
            flag = true;
        }
        if (bitmap != null)
        {
            val$asyncCallback.onSuccess(bitmap);
            if (flag)
            {
                HTTPService.access$000(HTTPService.this).cacheImage(s, bitmap, val$expiry);
                HTTPService.access$200(HTTPService.this);
            }
            return;
        } else
        {
            val$asyncCallback.onFailure(Integer.valueOf(0), null);
            return;
        }
    }

    nable()
    {
        this$0 = final_httpservice;
        val$imageURL = s;
        val$asyncCallback = asynccallback;
        val$expiry = J.this;
        super();
    }
}
