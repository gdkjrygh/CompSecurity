// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;

import android.graphics.Bitmap;

public interface CachedImageFetcherCallback
{

    public abstract void onImageLoadFailed(Object obj);

    public abstract void onImageLoaded(Object obj, Bitmap bitmap);
}
