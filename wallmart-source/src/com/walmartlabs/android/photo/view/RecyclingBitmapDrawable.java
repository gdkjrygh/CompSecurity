// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view;

import android.content.res.Resources;
import android.graphics.Bitmap;

// Referenced classes of package com.walmartlabs.android.photo.view:
//            PhotoDrawable

public class RecyclingBitmapDrawable extends PhotoDrawable
{

    private static final String TAG = com/walmartlabs/android/photo/view/RecyclingBitmapDrawable.getSimpleName();
    private int mCacheRefCount;
    private int mDisplayRefCount;
    private boolean mHasBeenDisplayed;

    public RecyclingBitmapDrawable(Resources resources, Bitmap bitmap)
    {
        super(resources, bitmap);
        mCacheRefCount = 0;
        mDisplayRefCount = 0;
    }

    private void checkState()
    {
        this;
        JVM INSTR monitorenter ;
        if (mCacheRefCount <= 0 && mDisplayRefCount <= 0 && mHasBeenDisplayed && hasValidBitmap())
        {
            getBitmap().recycle();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean hasValidBitmap()
    {
        this;
        JVM INSTR monitorenter ;
        Bitmap bitmap = getBitmap();
        if (bitmap == null) goto _L2; else goto _L1
_L1:
        boolean flag = bitmap.isRecycled();
        if (flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void setIsCached(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        mCacheRefCount = mCacheRefCount + 1;
_L1:
        this;
        JVM INSTR monitorexit ;
        checkState();
        return;
        mCacheRefCount = mCacheRefCount - 1;
          goto _L1
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setIsDisplayed(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        mDisplayRefCount = mDisplayRefCount + 1;
        mHasBeenDisplayed = true;
_L1:
        this;
        JVM INSTR monitorexit ;
        checkState();
        return;
        mDisplayRefCount = mDisplayRefCount - 1;
          goto _L1
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
