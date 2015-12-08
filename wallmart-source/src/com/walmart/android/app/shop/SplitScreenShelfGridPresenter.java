// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.content.res.Resources;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfGridPresenter

public class SplitScreenShelfGridPresenter extends ShelfGridPresenter
{

    public SplitScreenShelfGridPresenter(Activity activity, String s)
    {
        super(activity, s);
    }

    public SplitScreenShelfGridPresenter(Activity activity, String s, int i)
    {
        super(activity, s, i);
    }

    public SplitScreenShelfGridPresenter(Activity activity, String s, String s1)
    {
        super(activity, s, s1);
    }

    public SplitScreenShelfGridPresenter(Activity activity, com.walmart.android.data.StoreQueryResult.Item aitem[], String s)
    {
        super(activity, aitem, s);
    }

    protected int getAppropriateColumnCount()
    {
        return mActivity.getResources().getInteger(0x7f0d0003);
    }

    protected int getContainerLayout()
    {
        return 0x7f040189;
    }
}
