// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            ReorderGridRecyclerView

class val.toY
    implements ViewPropertyAnimatorListener
{

    final mating this$1;
    final mating val$dragHolder;
    final android.support.v7.widget.nimating val$holder;
    final int val$toX;
    final int val$toY;

    public void onAnimationCancel(View view)
    {
        ViewCompat.setX(view, val$toX);
        ViewCompat.setY(view, val$toY);
        spatchMoveFinished(val$dragHolder);
        val$dragHolder.mating(false);
        unningAnimations.remove(val$holder);
        ViewCompat.setTranslationX(val$dragHolder.ew, 0.0F);
        ViewCompat.setTranslationY(val$dragHolder.ew, 0.0F);
    }

    public void onAnimationEnd(View view)
    {
        spatchMoveFinished(val$dragHolder);
        val$dragHolder.mating(false);
        unningAnimations.remove(val$holder);
        ViewCompat.setTranslationX(val$dragHolder.ew, 0.0F);
        ViewCompat.setTranslationY(val$dragHolder.ew, 0.0F);
    }

    public void onAnimationStart(View view)
    {
        spatchMoveStarting(val$dragHolder);
        val$dragHolder.mating(true);
    }

    Q()
    {
        this$1 = final_q;
        val$dragHolder = q1;
        val$holder = _pcls1;
        val$toX = i;
        val$toY = I.this;
        super();
    }
}
