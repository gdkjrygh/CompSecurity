// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.walmart.android.wmui:
//            HeaderFooterGridView

private static class mAreAllFixedViewsSelectable
    implements Filterable, WrapperListAdapter
{

    private final ListAdapter mAdapter;
    boolean mAreAllFixedViewsSelectable;
    private final DataSetObservable mDataSetObservable = new DataSetObservable();
    ArrayList mFooterViewInfos;
    ArrayList mHeaderViewInfos;
    private final boolean mIsFilterable;
    private View mLastAdapterView;
    private int mNumColumns;

    private boolean areAllListInfosSelectable(ArrayList arraylist)
    {
label0:
        {
            if (arraylist == null)
            {
                break label0;
            }
            arraylist = arraylist.iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break label0;
                }
            } while (((mAreAllFixedViewsSelectable)arraylist.next()).able);
            return false;
        }
        return true;
    }

    public boolean areAllItemsEnabled()
    {
        return mAdapter == null || mAreAllFixedViewsSelectable && mAdapter.areAllItemsEnabled();
    }

    public int getCount()
    {
        int j = getHeadersCount() * mNumColumns;
        int k = getFootersCount();
        int i = j;
        if (mAdapter != null)
        {
            int l = mAdapter.getCount();
            j += l;
            i = j;
            if (k > 0)
            {
                i = j;
                if (l % mNumColumns != 0)
                {
                    i = j + (mNumColumns - l % mNumColumns);
                }
            }
        }
        return i + mNumColumns * k;
    }

    public Filter getFilter()
    {
        if (mIsFilterable)
        {
            return ((Filterable)mAdapter).getFilter();
        } else
        {
            return null;
        }
    }

    public int getFootersCount()
    {
        return mFooterViewInfos.size();
    }

    public int getHeadersCount()
    {
        return mHeaderViewInfos.size();
    }

    public Object getItem(int i)
    {
        Object obj1;
        int j;
        obj1 = null;
        j = getHeadersCount() * mNumColumns;
        if (i >= j) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = obj1;
        if (i % mNumColumns == 0)
        {
            obj = ((mNumColumns)mHeaderViewInfos.get(i / mNumColumns)).mNumColumns;
        }
_L4:
        return obj;
_L2:
        int i1;
        int k1;
        int j1 = i - j;
        j = 0;
        if (mAdapter != null)
        {
            int l = mAdapter.getCount();
            j = l;
            if (j1 < l)
            {
                return mAdapter.getItem(j1);
            }
        }
        k1 = j1 - j;
        j1 = 0;
        int l1 = getFootersCount();
        int i2 = mNumColumns;
        i1 = j1;
        if (j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = j1;
        if (l1 * i2 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = j1;
        if (j % mNumColumns == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = mNumColumns - j % mNumColumns;
        obj = obj1;
        if (k1 < i1) goto _L4; else goto _L3
_L3:
        int k = k1 - i1;
        if (k < getFootersCount() * mNumColumns)
        {
            obj = obj1;
            if (k % mNumColumns == 0)
            {
                return ((mNumColumns)mFooterViewInfos.get(k / mNumColumns)).mNumColumns;
            }
        } else
        {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public long getItemId(int i)
    {
        int j = getHeadersCount() * mNumColumns;
        if (mAdapter != null && i >= j)
        {
            i -= j;
            if (i < mAdapter.getCount())
            {
                return mAdapter.getItemId(i);
            }
        }
        return -1L;
    }

    public int getItemViewType(int i)
    {
        int j;
        boolean flag;
        flag = true;
        j = getHeadersCount() * mNumColumns;
        if (i >= j) goto _L2; else goto _L1
_L1:
        if (i % mNumColumns != 0) goto _L4; else goto _L3
_L3:
        i = -2;
_L6:
        return i;
_L4:
        i = ((flag) ? 1 : 0);
        if (mAdapter != null)
        {
            return mAdapter.getViewTypeCount();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        int i1 = i - j;
        j = 0;
        if (mAdapter != null)
        {
            int k = mAdapter.getCount();
            j = k;
            if (i1 < k)
            {
                return mAdapter.getItemViewType(i1);
            }
        }
        int j1 = i1 - j;
        i1 = 0;
        int k1 = getFootersCount();
        int l1 = mNumColumns;
        int l = i1;
        if (j > 0)
        {
            l = i1;
            if (k1 * l1 > 0)
            {
                l = i1;
                if (j % mNumColumns != 0)
                {
                    j = mNumColumns - j % mNumColumns;
                    l = j;
                    if (j1 < j)
                    {
                        return mAdapter.getViewTypeCount() + 1;
                    }
                }
            }
        }
        j = j1 - l;
        if (j < getFootersCount() * mNumColumns)
        {
            if (j % mNumColumns == 0)
            {
                return -2;
            }
            i = ((flag) ? 1 : 0);
            if (mAdapter != null)
            {
                return mAdapter.getViewTypeCount();
            }
        } else
        {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = getHeadersCount() * mNumColumns;
        if (i < j)
        {
            ViewGroup viewgroup1 = ((mNumColumns)mHeaderViewInfos.get(i / mNumColumns)).ainer;
            if (i % mNumColumns == 0)
            {
                return viewgroup1;
            }
            View view1 = view;
            if (view == null)
            {
                view1 = new View(viewgroup.getContext());
            }
            view1.setVisibility(4);
            view1.setMinimumHeight(viewgroup1.getHeight());
            return view1;
        }
        int i1 = i - j;
        j = 0;
        if (mAdapter != null)
        {
            int k = mAdapter.getCount();
            if (i1 < k - 1)
            {
                return mAdapter.getView(i1, view, viewgroup);
            }
            j = k;
            if (i1 == k - 1)
            {
                mLastAdapterView = mAdapter.getView(i1, view, viewgroup);
                return mLastAdapterView;
            }
        }
        int j1 = i1 - j;
        i1 = 0;
        int k1 = getFootersCount();
        int l1 = mNumColumns;
        int l = i1;
        if (j > 0)
        {
            l = i1;
            if (k1 * l1 > 0)
            {
                l = i1;
                if (j % mNumColumns != 0)
                {
                    j = mNumColumns - j % mNumColumns;
                    l = j;
                    if (j1 < j)
                    {
                        View view2 = view;
                        if (view == null)
                        {
                            view2 = new View(viewgroup.getContext());
                        }
                        view2.setVisibility(4);
                        if (mLastAdapterView != null)
                        {
                            view2.setMinimumHeight(mLastAdapterView.getHeight());
                        }
                        return view2;
                    }
                }
            }
        }
        j = j1 - l;
        if (j < getFootersCount() * mNumColumns)
        {
            ViewGroup viewgroup2 = ((mNumColumns)mFooterViewInfos.get(j / mNumColumns)).ainer;
            if (j % mNumColumns == 0)
            {
                return viewgroup2;
            }
            View view3 = view;
            if (view == null)
            {
                view3 = new View(viewgroup.getContext());
            }
            view3.setVisibility(4);
            view3.setMinimumHeight(viewgroup2.getHeight());
            return view3;
        } else
        {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public int getViewTypeCount()
    {
        if (mAdapter != null)
        {
            return mAdapter.getViewTypeCount() + 2;
        } else
        {
            return 2;
        }
    }

    public ListAdapter getWrappedAdapter()
    {
        return mAdapter;
    }

    public boolean hasStableIds()
    {
        if (mAdapter != null)
        {
            return mAdapter.hasStableIds();
        } else
        {
            return false;
        }
    }

    public boolean isEmpty()
    {
        return (mAdapter == null || mAdapter.isEmpty()) && getHeadersCount() == 0 && getFootersCount() == 0;
    }

    public boolean isEnabled(int i)
    {
        boolean flag = true;
        int j = getHeadersCount() * mNumColumns;
        if (i < j)
        {
            return i % mNumColumns == 0 && ((mNumColumns)mHeaderViewInfos.get(i / mNumColumns)).able;
        }
        int i1 = i - j;
        j = 0;
        if (mAdapter != null)
        {
            int k = mAdapter.getCount();
            j = k;
            if (i1 < k)
            {
                return mAdapter.isEnabled(i1);
            }
        }
        int l1 = i1 - j;
        i1 = 0;
        int k1 = getFootersCount() * mNumColumns;
        int l = i1;
        if (j > 0)
        {
            l = i1;
            if (k1 > 0)
            {
                l = i1;
                if (j % mNumColumns != 0)
                {
                    int j1 = mNumColumns - j % mNumColumns;
                    l = j1;
                    if (l1 < j1)
                    {
                        return false;
                    }
                }
            }
        }
        l = l1 - l;
        if (l < k1)
        {
            if (j % mNumColumns != 0 || !((mNumColumns)mFooterViewInfos.get(l / mNumColumns)).able)
            {
                flag = false;
            }
            return flag;
        } else
        {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public void notifyDataSetChanged()
    {
        mDataSetObservable.notifyChanged();
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        mDataSetObservable.registerObserver(datasetobserver);
        if (mAdapter != null)
        {
            mAdapter.registerDataSetObserver(datasetobserver);
        }
    }

    public boolean removeHeader(View view)
    {
        for (int i = 0; i < mHeaderViewInfos.size(); i++)
        {
            if (((mHeaderViewInfos)mHeaderViewInfos.get(i)).mHeaderViewInfos == view)
            {
                mHeaderViewInfos.remove(i);
                mAreAllFixedViewsSelectable = areAllListInfosSelectable(mHeaderViewInfos);
                mDataSetObservable.notifyChanged();
                return true;
            }
        }

        return false;
    }

    public void setNumColumns(int i)
    {
        if (i < 1)
        {
            throw new IllegalArgumentException("Number of columns must be 1 or more");
        }
        if (mNumColumns != i)
        {
            mNumColumns = i;
            notifyDataSetChanged();
        }
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        mDataSetObservable.unregisterObserver(datasetobserver);
        if (mAdapter != null)
        {
            mAdapter.unregisterDataSetObserver(datasetobserver);
        }
    }

    public I(ArrayList arraylist, ArrayList arraylist1, ListAdapter listadapter)
    {
        boolean flag = true;
        super();
        mNumColumns = 1;
        mAdapter = listadapter;
        mIsFilterable = listadapter instanceof Filterable;
        if (arraylist == null || arraylist1 == null)
        {
            throw new IllegalArgumentException("headerViewInfos or footerViewInfos cannot be null");
        }
        mHeaderViewInfos = arraylist;
        mFooterViewInfos = arraylist1;
        if (!areAllListInfosSelectable(mHeaderViewInfos) || !areAllListInfosSelectable(mFooterViewInfos))
        {
            flag = false;
        }
        mAreAllFixedViewsSelectable = flag;
    }
}
