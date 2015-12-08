// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

// Referenced classes of package com.contextlogic.wish.cache:
//            TransientCache

class this._cls0 extends LruCache
{

    final TransientCache this$0;

    protected volatile int sizeOf(Object obj, Object obj1)
    {
        return sizeOf((String)obj, (ckedBitmapContainer)obj1);
    }

    protected int sizeOf(String s, ckedBitmapContainer ckedbitmapcontainer)
    {
        return ckedbitmapcontainer.bitmap.getWidth() * ckedbitmapcontainer.bitmap.getHeight();
    }

    ckedBitmapContainer(int i)
    {
        this$0 = TransientCache.this;
        super(i);
    }
}
