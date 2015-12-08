// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;


// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            PagingLoader

public static interface I
{

    public abstract void onBatchLoaded();

    public abstract void onFirstBatchLoaded(int i);

    public abstract void onLoadFailed(I i, int j);
}
