// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.content.Context;
import com.walmartlabs.android.photo.util.task.BitmapLoadTask;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            CropFragment

class ck extends BitmapLoadTask
{

    final CropFragment this$0;

    protected boolean shouldCache()
    {
        return false;
    }

    ck(Context context, int i, int j, int k, com.walmartlabs.android.photo.util.task.BitmapLoadCallback bitmaploadcallback)
    {
        this$0 = CropFragment.this;
        super(context, i, j, k, bitmaploadcallback);
    }
}
