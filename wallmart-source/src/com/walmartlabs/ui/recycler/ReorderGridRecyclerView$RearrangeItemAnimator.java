// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            ReorderGridRecyclerView

class mRunningAnimations extends android.support.v7.widget.r
{

    ArrayList mRunningAnimations;
    final ReorderGridRecyclerView this$0;

    public boolean animateAdd(android.support.v7.widget.r r)
    {
        return false;
    }

    public boolean animateChange(android.support.v7.widget.r r, android.support.v7.widget.r r1, int i, int j, int k, int l)
    {
        return false;
    }

    public boolean animateMove(final android.support.v7.widget.r holder, int i, int j, final int toX, final int toY)
    {
        final mRunningAnimations dragHolder = (mRunningAnimations)holder;
        if (dragHolder == ReorderGridRecyclerView.access$300(ReorderGridRecyclerView.this))
        {
            dispatchMoveFinished(dragHolder);
            return false;
        } else
        {
            ViewCompat.setX(dragHolder.View, i);
            ViewCompat.setY(dragHolder.View, j);
            ViewCompat.animate(dragHolder.View).x(toX).y(toY).setListener(new ViewPropertyAnimatorListener() {

                final ReorderGridRecyclerView.RearrangeItemAnimator this$1;
                final ReorderRecycleAdapter.DraggableViewHolder val$dragHolder;
                final android.support.v7.widget.RecyclerView.ViewHolder val$holder;
                final int val$toX;
                final int val$toY;

                public void onAnimationCancel(View view)
                {
                    ViewCompat.setX(view, toX);
                    ViewCompat.setY(view, toY);
                    dispatchMoveFinished(dragHolder);
                    dragHolder.setAnimating(false);
                    mRunningAnimations.remove(holder);
                    ViewCompat.setTranslationX(dragHolder.itemView, 0.0F);
                    ViewCompat.setTranslationY(dragHolder.itemView, 0.0F);
                }

                public void onAnimationEnd(View view)
                {
                    dispatchMoveFinished(dragHolder);
                    dragHolder.setAnimating(false);
                    mRunningAnimations.remove(holder);
                    ViewCompat.setTranslationX(dragHolder.itemView, 0.0F);
                    ViewCompat.setTranslationY(dragHolder.itemView, 0.0F);
                }

                public void onAnimationStart(View view)
                {
                    dispatchMoveStarting(dragHolder);
                    dragHolder.setAnimating(true);
                }

            
            {
                this$1 = ReorderGridRecyclerView.RearrangeItemAnimator.this;
                dragHolder = draggableviewholder;
                holder = viewholder;
                toX = i;
                toY = j;
                super();
            }
            }).setDuration(getMoveDuration()).start();
            mRunningAnimations.add(holder);
            return true;
        }
    }

    public boolean animateRemove(android.support.v7.widget.r r)
    {
        return false;
    }

    public void endAnimation(android.support.v7.widget.r r)
    {
        if (mRunningAnimations.remove(r))
        {
            ViewCompat.animate(r.mRunningAnimations).cancel();
        }
    }

    public void endAnimations()
    {
        ArrayList arraylist = new ArrayList(mRunningAnimations.size());
        arraylist.addAll(mRunningAnimations);
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); ViewCompat.animate(((android.support.v7.widget.r.mRunningAnimations)iterator.next()).mRunningAnimations).cancel()) { }
        mRunningAnimations.removeAll(arraylist);
    }

    public boolean isRunning()
    {
        return mRunningAnimations.size() != 0;
    }

    public void runPendingAnimations()
    {
    }

    public _cls1.val.toY()
    {
        this$0 = ReorderGridRecyclerView.this;
        super();
        mRunningAnimations = new ArrayList();
    }
}
