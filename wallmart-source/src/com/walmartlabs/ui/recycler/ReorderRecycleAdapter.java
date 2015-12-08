// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicAdapter, ReorderGridRecyclerView, BasicViewHolder

public abstract class ReorderRecycleAdapter extends BasicAdapter
{
    public abstract class DraggableViewHolder extends BasicViewHolder
    {

        public static final int STATE_DRAGGING = 1;
        public static final int STATE_NORMAL = 0;
        private boolean mIsAnimating;
        final ReorderRecycleAdapter this$0;

        boolean isAnimating()
        {
            return mIsAnimating;
        }

        public abstract boolean isViewDraggable(int i, int j);

        protected abstract void onItemDragChange(int i);

        void setAnimating(boolean flag)
        {
            mIsAnimating = flag;
        }

        public DraggableViewHolder(View view)
        {
            this$0 = ReorderRecycleAdapter.this;
            super(view);
        }
    }


    private static final String EXTRA_REARRANGED_LIST = "rearranged_list";
    private static final String EXTRA_REARRANGE_STATE = "rearrange_state";
    private int mDraggingPosition;
    private boolean mIsDragging;
    private LinkedList mRearangedPositions;
    private ReorderGridRecyclerView mRecyclerView;

    public ReorderRecycleAdapter()
    {
        mIsDragging = false;
        mDraggingPosition = -1;
    }

    public void endRearrange()
    {
        mIsDragging = false;
        notifyDataSetChanged();
    }

    protected int getRearrangedPosition(int i)
    {
        int j = i;
        if (mIsDragging)
        {
            j = ((Integer)mRearangedPositions.get(i)).intValue();
        }
        return j;
    }

    public int[] getRearrangedPositions()
    {
        int ai[] = new int[mRearangedPositions.size()];
        int i = 0;
        for (Iterator iterator = mRearangedPositions.iterator(); iterator.hasNext();)
        {
            ai[i] = ((Integer)iterator.next()).intValue();
            i++;
        }

        return ai;
    }

    public boolean isInRearrangeMode()
    {
        return mIsDragging;
    }

    public void loadBundleData(Bundle bundle)
    {
        mIsDragging = bundle.getBoolean("rearrange_state", false);
        if (mIsDragging)
        {
            mRearangedPositions = new LinkedList();
            if (bundle.containsKey("rearranged_list"))
            {
                bundle = bundle.getIntArray("rearranged_list");
                for (int i = 0; i < bundle.length; i++)
                {
                    mRearangedPositions.add(Integer.valueOf(bundle[i]));
                }

            } else
            {
                int k = getItemCount();
                for (int j = 0; j < k; j++)
                {
                    mRearangedPositions.add(Integer.valueOf(j));
                }

            }
        }
    }

    public void moveItem(int i, int j)
    {
        if (i == j)
        {
            return;
        } else
        {
            Integer integer = (Integer)mRearangedPositions.remove(i);
            mRearangedPositions.add(j, integer);
            return;
        }
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((DraggableViewHolder)viewholder, i);
    }

    public volatile void onBindViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onBindViewHolder((DraggableViewHolder)basicviewholder, i);
    }

    public void onBindViewHolder(DraggableViewHolder draggableviewholder, int i)
    {
        super.onBindViewHolder(draggableviewholder, i);
        if (i == mDraggingPosition)
        {
            draggableviewholder.onItemDragChange(1);
            mRecyclerView.upDateFloatingViewHolder(draggableviewholder);
            return;
        } else
        {
            draggableviewholder.onItemDragChange(0);
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("rearrange_state", mIsDragging);
        if (mIsDragging && mRearangedPositions != null && mRearangedPositions.size() > 0)
        {
            int ai[] = new int[mRearangedPositions.size()];
            for (ListIterator listiterator = mRearangedPositions.listIterator(); listiterator.hasNext();)
            {
                ai[0] = ((Integer)listiterator.next()).intValue();
            }

            bundle.putIntArray("rearranged_list", ai);
        }
    }

    void setDraggableRecyclerView(ReorderGridRecyclerView reordergridrecyclerview)
    {
        mRecyclerView = reordergridrecyclerview;
    }

    void setDraggingPosition(int i)
    {
        mDraggingPosition = i;
    }

    public void startRearrange()
    {
        if (!mIsDragging)
        {
            int j;
            if (mRearangedPositions == null)
            {
                mRearangedPositions = new LinkedList();
            } else
            {
                mRearangedPositions.clear();
            }
            mIsDragging = true;
            j = getItemCount();
            for (int i = 0; i < j; i++)
            {
                mRearangedPositions.add(Integer.valueOf(i));
            }

        }
    }
}
