// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

// Referenced classes of package com.walmartlabs.ui:
//            ImageAdapter

class init> extends LruCache
{

    final ImageAdapter this$0;

    protected volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        entryRemoved(flag, (String)obj, (Bitmap)obj1, (Bitmap)obj2);
    }

    protected void entryRemoved(boolean flag, String s, Bitmap bitmap, Bitmap bitmap1)
    {
        if (bitmap != bitmap1)
        {
            if (ImageAdapter.access$000(ImageAdapter.this) && bitmap != null && !bitmap.isRecycled())
            {
                bitmap.recycle();
            }
            onRemovedFromCache(s);
        }
    }

    (int i)
    {
        this$0 = ImageAdapter.this;
        super(i);
    }
}
