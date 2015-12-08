// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui.animation;

import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.walmart.android.wmui.animation:
//            ListAnimator, DismissibleAdapter, BackgroundContainer

class val.view
    implements Runnable
{

    final ListAnimator this$0;
    final boolean val$remove;
    final View val$view;

    public void run()
    {
        if (!val$remove) goto _L2; else goto _L1
_L1:
        if (val$view.getParent() != null)
        {
            int i = mListView.getPositionForView(val$view);
            if (i - mListView.getHeaderViewsCount() >= 0)
            {
                mAdapter.dismiss(i - mListView.getHeaderViewsCount());
            }
        }
_L4:
        mSwiping = false;
        mAnimating = false;
        mListView.setEnabled(true);
        return;
_L2:
        if (mBackgroundContainer != null)
        {
            mBackgroundContainer.hideBackground();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    iner()
    {
        this$0 = final_listanimator;
        val$remove = flag;
        val$view = View.this;
        super();
    }
}
