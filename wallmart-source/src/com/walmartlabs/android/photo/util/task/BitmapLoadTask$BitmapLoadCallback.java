// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.task;

import android.graphics.Bitmap;
import com.walmartlabs.android.photo.view.PhotoDrawable;

// Referenced classes of package com.walmartlabs.android.photo.util.task:
//            BitmapLoadTask

public static interface 
{

    public abstract void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj);

    public abstract void onTaskCancelled(Bitmap bitmap);
}
