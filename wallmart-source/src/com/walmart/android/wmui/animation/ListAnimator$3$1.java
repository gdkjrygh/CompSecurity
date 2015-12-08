// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui.animation;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import java.util.HashMap;

// Referenced classes of package com.walmart.android.wmui.animation:
//            ListAnimator, BackgroundContainer, DismissibleAdapter

class this._cls1
    implements Runnable
{

    final tView this$1;

    public void run()
    {
        if (mBackgroundContainer != null)
        {
            mBackgroundContainer.hideBackground();
        }
        mSwiping = false;
        mAnimating = false;
        mListView.setEnabled(true);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/wmui/animation/ListAnimator$3

/* anonymous class */
    class ListAnimator._cls3
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final ListAnimator this$0;

        public boolean onPreDraw()
        {
            mListView.getViewTreeObserver().removeOnPreDrawListener(this);
            int j = 1;
            boolean flag = true;
            int l = mListView.getFirstVisiblePosition();
            int i1 = mListView.getHeaderViewsCount();
            int i = 0;
            while (i < mListView.getChildCount()) 
            {
                View view = mListView.getChildAt(i);
                view.setPressed(false);
                int k = l + i;
                Object obj;
                Integer integer;
                int j1;
                if (k < i1)
                {
                    obj = (Integer)mHeaderTopMap.get(Integer.valueOf(k));
                } else
                {
                    long l1 = mAdapter.getItemId(k - i1);
                    obj = (Integer)mItemIdTopMap.get(Long.valueOf(l1));
                }
                j1 = view.getTop();
                integer = ((Integer) (obj));
                if (obj == null)
                {
                    k = view.getHeight() + mListView.getDividerHeight();
                    if (i <= 0)
                    {
                        k = -k;
                    }
                    integer = Integer.valueOf(j1 + k);
                }
                j1 = integer.intValue() - j1;
                k = j;
                if (j1 != 0)
                {
                    if (j != 0)
                    {
                        obj = new ListAnimator._cls3._cls1();
                    } else
                    {
                        obj = null;
                    }
                    k = 0;
                    ListAnimator.access$000(ListAnimator.this, view, 0.0F, 0.0F, j1, 0.0F, ((Runnable) (obj)));
                    flag = false;
                }
                i++;
                j = k;
            }
            if (flag)
            {
                if (mBackgroundContainer != null)
                {
                    mBackgroundContainer.hideBackground();
                }
                mSwiping = false;
                mAnimating = false;
                mListView.setEnabled(true);
            }
            mItemIdTopMap.clear();
            mHeaderTopMap.clear();
            return true;
        }

            
            {
                this$0 = ListAnimator.this;
                super();
            }
    }

}
