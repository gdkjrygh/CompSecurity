// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicRecyclerView, ExpandingRecyclerAdapter, BasicViewHolder, BasicAdapter

public class ExpandingRecyclerView extends BasicRecyclerView
{
    public class DefaultOnSelectedItemChangeListener
        implements OnSelectedItemChangeListener
    {

        final ExpandingRecyclerView this$0;

        public boolean onSelectedItemChange(int i, BasicViewHolder basicviewholder, BasicViewHolder basicviewholder1)
        {
            if (basicviewholder1 != null)
            {
                basicviewholder1.itemView.setSelected(false);
            }
            if (basicviewholder != null)
            {
                basicviewholder.itemView.setSelected(true);
            }
            return true;
        }

        public DefaultOnSelectedItemChangeListener()
        {
            this$0 = ExpandingRecyclerView.this;
            super();
        }
    }

    public static interface OnSectionExpansionChangeListener
    {

        public abstract void onExpansionChanged(int i, boolean flag);
    }

    public static interface OnSelectedItemChangeListener
    {

        public abstract boolean onSelectedItemChange(int i, BasicViewHolder basicviewholder, BasicViewHolder basicviewholder1);
    }


    private BasicRecyclerView.OnItemClickListener mClickListener;
    private OnSectionExpansionChangeListener mExpansionListener;
    private int mLastExpandedSection;
    private OnSelectedItemChangeListener mSelectedItemListener;
    private boolean mSingleExpanded;

    public ExpandingRecyclerView(Context context)
    {
        super(context, null);
        mSelectedItemListener = new DefaultOnSelectedItemChangeListener();
        mLastExpandedSection = -1;
        init();
    }

    public ExpandingRecyclerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
        mSelectedItemListener = new DefaultOnSelectedItemChangeListener();
        mLastExpandedSection = -1;
        init();
    }

    public ExpandingRecyclerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mSelectedItemListener = new DefaultOnSelectedItemChangeListener();
        mLastExpandedSection = -1;
        init();
    }

    private void enforceAdapter(android.support.v7.widget.RecyclerView.Adapter adapter)
    {
        if (!(adapter instanceof ExpandingRecyclerAdapter))
        {
            throw new IllegalArgumentException("ExpandingRecyclerView requires a ExpandingRecyclerAdapter");
        } else
        {
            return;
        }
    }

    private void handleItemSelection(int i)
    {
        BasicViewHolder basicviewholder = (BasicViewHolder)findViewHolderForPosition(i);
        setSelection(i);
        if (mClickListener != null)
        {
            mClickListener.onItemClick(basicviewholder, i);
        }
    }

    private void handleSectionExpansion(int i, int j, boolean flag)
    {
        ExpandingRecyclerAdapter expandingrecycleradapter = getAdapter();
        BasicViewHolder basicviewholder = (BasicViewHolder)findViewHolderForPosition(j);
        byte byte0 = -1;
        int k = byte0;
        int l = j;
        if (mSingleExpanded)
        {
            k = byte0;
            l = j;
            if (flag)
            {
                k = byte0;
                l = j;
                if (i != mLastExpandedSection)
                {
                    k = byte0;
                    l = j;
                    if (mLastExpandedSection != -1)
                    {
                        int i1 = expandingrecycleradapter.getSectionPosition(mLastExpandedSection);
                        BasicViewHolder basicviewholder1 = (BasicViewHolder)findViewHolderForPosition(i1);
                        k = i1;
                        l = j;
                        if (expandingrecycleradapter.isSectionExpanded(mLastExpandedSection))
                        {
                            int j1 = expandingrecycleradapter.setSectionExpandedState(i1, false, basicviewholder1);
                            k = i1;
                            l = j;
                            if (i1 < j)
                            {
                                l = j + j1;
                                k = i1;
                            }
                        }
                    }
                }
            }
        }
        expandingrecycleradapter.setSectionExpandedState(l, flag, basicviewholder);
        if (mExpansionListener != null)
        {
            mExpansionListener.onExpansionChanged(i, flag);
            if (k != -1)
            {
                mExpansionListener.onExpansionChanged(k, false);
            }
        }
        if (flag)
        {
            mLastExpandedSection = i;
        }
        setSelection(l);
        if (mClickListener != null)
        {
            mClickListener.onItemClick(basicviewholder, l);
        }
    }

    private void init()
    {
        super.setOnItemClickListener(new BasicRecyclerView.OnItemClickListener() {

            final ExpandingRecyclerView this$0;

            public void onItemClick(BasicViewHolder basicviewholder, int i)
            {
                ExpandingRecyclerAdapter expandingrecycleradapter = getAdapter();
                if (expandingrecycleradapter == null) goto _L2; else goto _L1
_L1:
                if (!expandingrecycleradapter.isSectionHeader(i)) goto _L4; else goto _L3
_L3:
                int j = expandingrecycleradapter.getSection(i);
                boolean flag;
                if (!expandingrecycleradapter.isSectionExpanded(j))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                handleSectionExpansion(j, i, flag);
_L6:
                return;
_L4:
                handleItemSelection(i);
                return;
_L2:
                if (mClickListener != null)
                {
                    mClickListener.onItemClick(basicviewholder, i);
                    return;
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                this$0 = ExpandingRecyclerView.this;
                super();
            }
        });
    }

    private void setSelection(int i)
    {
        ExpandingRecyclerAdapter expandingrecycleradapter = getAdapter();
        if (mSelectedItemListener != null)
        {
            BasicViewHolder basicviewholder1 = (BasicViewHolder)findViewHolderForPosition(i);
            BasicViewHolder basicviewholder = null;
            int j = expandingrecycleradapter.getLastSelectedPosition();
            if (j != -1)
            {
                basicviewholder = (BasicViewHolder)findViewHolderForPosition(j);
            }
            if (mSelectedItemListener.onSelectedItemChange(i, basicviewholder1, basicviewholder))
            {
                expandingrecycleradapter.setLastSelected(i);
            }
            return;
        } else
        {
            expandingrecycleradapter.setLastSelected(i);
            return;
        }
    }

    public void collapseAllSections()
    {
        ExpandingRecyclerAdapter expandingrecycleradapter = getAdapter();
        if (!mSingleExpanded && expandingrecycleradapter != null)
        {
            int j = expandingrecycleradapter.getSectionCount();
            for (int i = 0; i < j; i++)
            {
                if (expandingrecycleradapter.isSectionExpanded(i))
                {
                    handleSectionExpansion(i, expandingrecycleradapter.getSectionPosition(i), false);
                }
            }

        }
    }

    public void expandAllSections()
    {
        ExpandingRecyclerAdapter expandingrecycleradapter = getAdapter();
        if (!mSingleExpanded && expandingrecycleradapter != null)
        {
            int j = expandingrecycleradapter.getSectionCount();
            for (int i = 0; i < j; i++)
            {
                if (!expandingrecycleradapter.isSectionExpanded(i))
                {
                    handleSectionExpansion(i, expandingrecycleradapter.getSectionPosition(i), true);
                }
            }

        }
    }

    public volatile android.support.v7.widget.RecyclerView.Adapter getAdapter()
    {
        return getAdapter();
    }

    public volatile BasicAdapter getAdapter()
    {
        return getAdapter();
    }

    public ExpandingRecyclerAdapter getAdapter()
    {
        return (ExpandingRecyclerAdapter)super.getAdapter();
    }

    public boolean getSingleExpandedMode()
    {
        return mSingleExpanded;
    }

    public void selectItemInSection(int i, int j)
    {
label0:
        {
            ExpandingRecyclerAdapter expandingrecycleradapter = getAdapter();
            if (expandingrecycleradapter != null)
            {
                if (!expandingrecycleradapter.isSectionExpanded(i))
                {
                    break label0;
                }
                handleItemSelection(expandingrecycleradapter.getSectionPosition(i) + j + 1);
            }
            return;
        }
        throw new IllegalArgumentException((new StringBuilder()).append("Only items in expanded sections can be selected. Section ").append(i).append(" is not expanded").toString());
    }

    public void selectSection(int i)
    {
        ExpandingRecyclerAdapter expandingrecycleradapter = getAdapter();
        if (expandingrecycleradapter != null)
        {
            handleSectionExpansion(i, expandingrecycleradapter.getSectionPosition(i), true);
        }
    }

    public void setAdapter(android.support.v7.widget.RecyclerView.Adapter adapter)
    {
        enforceAdapter(adapter);
        super.setAdapter(adapter);
    }

    public void setOnItemClickListener(BasicRecyclerView.OnItemClickListener onitemclicklistener)
    {
        mClickListener = onitemclicklistener;
    }

    public void setOnSectionExpansionListener(OnSectionExpansionChangeListener onsectionexpansionchangelistener)
    {
        mExpansionListener = onsectionexpansionchangelistener;
    }

    public void setOnSelectedItemChangeListener(OnSelectedItemChangeListener onselecteditemchangelistener)
    {
        mSelectedItemListener = onselecteditemchangelistener;
    }

    public void setSingleExpandedMode(boolean flag)
    {
        mSingleExpanded = flag;
    }



}
