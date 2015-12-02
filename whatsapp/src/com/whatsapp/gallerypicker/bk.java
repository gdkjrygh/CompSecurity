// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview

final class bk extends LruCache
{

    bk(int i)
    {
        super(i);
    }

    protected int a(String s, Bitmap bitmap)
    {
        int i;
label0:
        {
            if (android.os.Build.VERSION.SDK_INT < 12)
            {
                i = (bitmap.getRowBytes() * bitmap.getHeight()) / 1024;
                if (ImagePreview.B == 0)
                {
                    break label0;
                }
            }
            i = bitmap.getByteCount() / 1024;
        }
        return i;
    }

    protected int sizeOf(Object obj, Object obj1)
    {
        return a((String)obj, (Bitmap)obj1);
    }
}
