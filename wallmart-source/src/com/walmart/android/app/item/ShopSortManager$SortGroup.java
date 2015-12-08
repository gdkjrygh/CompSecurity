// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;


// Referenced classes of package com.walmart.android.app.item:
//            ShopSortManager

public static class mListener
{

    private gedListener mListener;
    private final String mName;
    private final Object mSortParamMap[];

    public String getName()
    {
        return mName;
    }

    public gedListener getOnSortChangedListener()
    {
        return mListener;
    }

    public Object[] getSortParamMap()
    {
        return mSortParamMap;
    }

    public void setOnSortChangedListener(gedListener gedlistener)
    {
        mListener = gedlistener;
    }

    public gedListener(Object aobj[], String s)
    {
        this(aobj, s, null);
    }

    public gedListener(Object aobj[], String s, gedListener gedlistener)
    {
        mSortParamMap = aobj;
        mName = s;
        mListener = gedlistener;
    }
}
