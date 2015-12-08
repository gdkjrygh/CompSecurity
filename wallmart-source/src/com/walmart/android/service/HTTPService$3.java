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
    final wnloadImage val$downloadImage;
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
        byte abyte1[] = HTTPService.access$000(HTTPService.this).getData(s);
        boolean flag = false;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = HTTPService.access$500(HTTPService.this, val$imageURL);
            flag = true;
        }
        if (abyte0 != null)
        {
            Object obj = val$downloadImage.processData(abyte0);
            if (obj != null)
            {
                val$asyncCallback.onSuccess(val$downloadImage.convertToReturnType(obj));
                if (flag)
                {
                    HTTPService.access$000(HTTPService.this).cacheData(s, abyte0, val$expiry);
                    HTTPService.access$200(HTTPService.this);
                }
                return;
            } else
            {
                val$asyncCallback.onFailure(Integer.valueOf(0), null);
                return;
            }
        } else
        {
            val$asyncCallback.onFailure(Integer.valueOf(0), null);
            return;
        }
    }

    wnloadImage()
    {
        this$0 = final_httpservice;
        val$imageURL = s;
        val$downloadImage = wnloadimage;
        val$asyncCallback = asynccallback;
        val$expiry = J.this;
        super();
    }
}
