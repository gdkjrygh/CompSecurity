// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;

// Referenced classes of package com.android.volley.toolbox:
//            ImageLoader

class val.cacheKey
    implements com.android.volley.ner
{

    final ImageLoader this$0;
    final String val$cacheKey;

    public void onResponse(Bitmap bitmap)
    {
        onGetImageSuccess(val$cacheKey, bitmap);
    }

    public volatile void onResponse(Object obj)
    {
        onResponse((Bitmap)obj);
    }

    ()
    {
        this$0 = final_imageloader;
        val$cacheKey = String.this;
        super();
    }
}
