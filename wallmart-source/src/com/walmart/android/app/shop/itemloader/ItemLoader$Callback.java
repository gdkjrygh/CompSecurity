// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;

import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            ItemLoader

public static interface rror
{

    public static final int UNKNOWN_TOTAL_COUNT = -1;

    public abstract void onFirstPageLoaded(List list, int i);

    public abstract void onPageLoaded(List list);

    public abstract void onPageLoadingFailed(rror rror, int i);
}
