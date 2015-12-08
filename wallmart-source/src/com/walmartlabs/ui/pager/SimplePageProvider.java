// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.pager;

import android.graphics.Bitmap;

// Referenced classes of package com.walmartlabs.ui.pager:
//            PageProvider

public class SimplePageProvider extends PageProvider
{

    public static final String TAG = com/walmartlabs/ui/pager/SimplePageProvider.getSimpleName();
    private boolean mFirstPageIsCover;
    private Bitmap mPages[];

    public SimplePageProvider(Bitmap abitmap[], boolean flag)
    {
        mPages = abitmap;
        mFirstPageIsCover = flag;
    }

    public void createPages(int ai[], int i)
    {
    }

    public void destroyPage(int i)
    {
    }

    public Bitmap getPage(int i)
    {
        return mPages[i];
    }

    public int getPageCount()
    {
        return mPages.length;
    }

    public boolean isFirstPageCover()
    {
        return mFirstPageIsCover;
    }

    public void recycle()
    {
        if (mPages != null)
        {
            for (int i = 0; i < mPages.length; i++)
            {
                if (mPages[i] != null && !mPages[i].isRecycled())
                {
                    mPages[i].recycle();
                    mPages[i] = null;
                }
            }

        }
    }

}
