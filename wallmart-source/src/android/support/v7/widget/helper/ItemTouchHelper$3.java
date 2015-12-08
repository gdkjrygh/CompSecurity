// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.support.v4.animation.ValueAnimatorCompat;
import java.util.List;

// Referenced classes of package android.support.v7.widget.helper:
//            ItemTouchHelper

class coverAnimation extends coverAnimation
{

    final ItemTouchHelper this$0;
    final android.support.v7.widget.older val$prevSelected;
    final int val$swipeDir;

    public void onAnimationEnd(ValueAnimatorCompat valueanimatorcompat)
    {
        super.onAnimationEnd(valueanimatorcompat);
        if (!mOverridden) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (val$swipeDir > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        mCallback.clearView(ItemTouchHelper.access$300(ItemTouchHelper.this), val$prevSelected);
_L4:
        if (ItemTouchHelper.access$1600(ItemTouchHelper.this) == val$prevSelected.itemView)
        {
            ItemTouchHelper.access$1700(ItemTouchHelper.this, val$prevSelected.itemView);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        mPendingCleanup.add(val$prevSelected.itemView);
        mIsPendingCleanup = true;
        if (val$swipeDir > 0)
        {
            ItemTouchHelper.access$1500(ItemTouchHelper.this, this, val$swipeDir);
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    llback(int j, float f, float f1, float f2, 
            float f3, int k, android.support.v7.widget.older older1)
    {
        this$0 = final_itemtouchhelper;
        val$swipeDir = k;
        val$prevSelected = older1;
        super(final_itemtouchhelper, final_older, I.this, j, f, f1, f2, f3);
    }
}
