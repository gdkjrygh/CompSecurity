// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.pager;

import android.graphics.Bitmap;

public abstract class PageProvider
{
    static interface PageProviderObserver
    {

        public abstract void onDatasetChanged();
    }


    private PageProviderObserver mObserver;

    public PageProvider()
    {
    }

    public abstract void createPages(int ai[], int i);

    public abstract void destroyPage(int i);

    public abstract Bitmap getPage(int i);

    public abstract int getPageCount();

    public abstract boolean isFirstPageCover();

    public void notifyDatasetChanged()
    {
        if (mObserver != null)
        {
            mObserver.onDatasetChanged();
        }
    }

    public void setPageProviderObserver(PageProviderObserver pageproviderobserver)
    {
        mObserver = pageproviderobserver;
    }
}
