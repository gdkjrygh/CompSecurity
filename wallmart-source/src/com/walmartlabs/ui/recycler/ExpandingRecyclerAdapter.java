// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.util.SparseBooleanArray;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicAdapter, BasicViewHolder

public abstract class ExpandingRecyclerAdapter extends BasicAdapter
{
    public static final class ItemType extends Enum
    {

        private static final ItemType $VALUES[];
        public static final ItemType SECTION_HEADER;
        public static final ItemType SECTION_ITEM;

        public static ItemType valueOf(String s)
        {
            return (ItemType)Enum.valueOf(com/walmartlabs/ui/recycler/ExpandingRecyclerAdapter$ItemType, s);
        }

        public static ItemType[] values()
        {
            return (ItemType[])$VALUES.clone();
        }

        static 
        {
            SECTION_HEADER = new ItemType("SECTION_HEADER", 0);
            SECTION_ITEM = new ItemType("SECTION_ITEM", 1);
            $VALUES = (new ItemType[] {
                SECTION_HEADER, SECTION_ITEM
            });
        }

        private ItemType(String s, int i)
        {
            super(s, i);
        }
    }


    private SparseBooleanArray mExpandedSections;
    private int mLastSelectedPos;

    public ExpandingRecyclerAdapter()
    {
        mExpandedSections = new SparseBooleanArray();
        mLastSelectedPos = -1;
        registerAdapterDataObserver(new android.support.v7.widget.RecyclerView.AdapterDataObserver() {

            final ExpandingRecyclerAdapter this$0;

            public void onChanged()
            {
                mLastSelectedPos = -1;
            }

            public void onItemRangeInserted(int i, int j)
            {
                if (mLastSelectedPos >= i)
                {
                    mLastSelectedPos = mLastSelectedPos + j;
                }
            }

            public void onItemRangeMoved(int i, int j, int k)
            {
                if (mLastSelectedPos > i)
                {
                    if (mLastSelectedPos < i + k)
                    {
                        mLastSelectedPos = (mLastSelectedPos - i) + j;
                    } else
                    if (mLastSelectedPos <= j)
                    {
                        mLastSelectedPos = mLastSelectedPos - k;
                        return;
                    }
                }
            }

            public void onItemRangeRemoved(int i, int j)
            {
                if (mLastSelectedPos >= i && mLastSelectedPos < i + j)
                {
                    mLastSelectedPos = -1;
                } else
                if (mLastSelectedPos >= i + j)
                {
                    mLastSelectedPos = mLastSelectedPos - j;
                    return;
                }
            }

            
            {
                this$0 = ExpandingRecyclerAdapter.this;
                super();
            }
        });
    }

    private int getNbrVisibleItemsInSection(int i)
    {
        if (mExpandedSections.get(i))
        {
            return getItemCountInSection(i);
        } else
        {
            return 0;
        }
    }

    public int getHeaderType(int i)
    {
        return 0;
    }

    public int getItemCount()
    {
        int k = getSectionCount();
        int j = k;
        for (int i = 0; i < k; i++)
        {
            j += getNbrVisibleItemsInSection(i);
        }

        return j;
    }

    public abstract int getItemCountInSection(int i);

    public int getItemType(int i, int j)
    {
        return 0;
    }

    public final int getItemViewType(int i)
    {
        int i1 = getSectionCount();
        int l = 0;
        int k = 0;
        for (int j = 0; j < i1; j++)
        {
            if (l == i)
            {
                return getHeaderType(j);
            }
            l += getNbrVisibleItemsInSection(j);
            if (l >= i)
            {
                return getItemType(j, i - k - 1);
            }
            l++;
            k = l;
        }

        throw new IndexOutOfBoundsException((new StringBuilder()).append("Position ").append(i).append(" is grater that the adapter size ").append(l).toString());
    }

    public int getLastSelectedPosition()
    {
        return mLastSelectedPos;
    }

    public int getPositionInSection(int i)
    {
        return i - getSectionPosition(getSection(i)) - 1;
    }

    public int getSection(int i)
    {
        int l = getSectionCount();
        int k = 0;
        for (int j = 0; j < l; j++)
        {
            k += getNbrVisibleItemsInSection(j);
            if (k >= i)
            {
                return j;
            }
            k++;
        }

        throw new IndexOutOfBoundsException((new StringBuilder()).append("Position ").append(i).append(" is grater that the adapter size ").append(k).toString());
    }

    public abstract int getSectionCount();

    public int getSectionPosition(int i)
    {
        int l = getSectionCount();
        int k = 0;
        for (int j = 0; j < l && j <= i; j++)
        {
            if (j == i)
            {
                return k;
            }
            k += getNbrVisibleItemsInSection(j) + 1;
        }

        throw new IndexOutOfBoundsException((new StringBuilder()).append("Position ").append(i).append(" is grater that the section count ").append(l).toString());
    }

    public boolean isSectionExpanded(int i)
    {
        return mExpandedSections.get(i);
    }

    public boolean isSectionHeader(int i)
    {
        int l = getSectionCount();
        int k = 0;
        for (int j = 0; j < l; j++)
        {
            if (k == i)
            {
                return true;
            }
            k += getNbrVisibleItemsInSection(j);
            if (k >= i)
            {
                return false;
            }
            k++;
        }

        throw new IndexOutOfBoundsException((new StringBuilder()).append("Position ").append(i).append(" is grater that the adapter size ").append(k).toString());
    }

    public abstract void onPopulateItemViewHolder(BasicViewHolder basicviewholder, int i, int j, int k);

    public abstract void onPopulateSectionViewHolder(BasicViewHolder basicviewholder, int i, int j);

    public final void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        ItemType itemtype1;
        int j;
        int k;
        int l;
        int i1;
        i1 = getSectionCount();
        itemtype1 = ItemType.SECTION_ITEM;
        l = 0;
        k = 0;
        j = 0;
_L2:
        ItemType itemtype = itemtype1;
        if (j < i1)
        {
            if (l == i)
            {
                itemtype = ItemType.SECTION_HEADER;
            } else
            {
label0:
                {
                    l += getNbrVisibleItemsInSection(j);
                    if (l < i)
                    {
                        break label0;
                    }
                    itemtype = ItemType.SECTION_ITEM;
                }
            }
        }
        if (itemtype == ItemType.SECTION_HEADER)
        {
            onPopulateSectionViewHolder(basicviewholder, i, j);
            return;
        } else
        {
            onPopulateItemViewHolder(basicviewholder, i, j, i - k - 1);
            return;
        }
        l++;
        k = l;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public abstract void onSectionExpansionChanged(int i, int j, boolean flag, BasicViewHolder basicviewholder);

    void setLastSelected(int i)
    {
        mLastSelectedPos = i;
    }

    int setSectionExpandedState(int i, boolean flag, BasicViewHolder basicviewholder)
    {
        int j = getSection(i);
        mExpandedSections.put(j, flag);
        onSectionExpansionChanged(i, j, flag, basicviewholder);
        notifyItemChanged(j);
        i = getItemCountInSection(j);
        if (flag)
        {
            return i;
        } else
        {
            return -i;
        }
    }



/*
    static int access$002(ExpandingRecyclerAdapter expandingrecycleradapter, int i)
    {
        expandingrecycleradapter.mLastSelectedPos = i;
        return i;
    }

*/
}
