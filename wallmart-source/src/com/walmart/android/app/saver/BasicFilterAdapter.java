// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class BasicFilterAdapter extends BaseAdapter
{
    public static interface DelegateAdapter
    {

        public abstract boolean isConvertView(View view);
    }

    private class DelegateDataSetObserver extends DataSetObserver
    {

        final BasicFilterAdapter this$0;

        public void onChanged()
        {
            super.onChanged();
            notifyDataSetChanged();
        }

        public void onInvalidated()
        {
            super.onInvalidated();
            notifyDataSetInvalidated();
        }

        private DelegateDataSetObserver()
        {
            this$0 = BasicFilterAdapter.this;
            super();
        }

    }

    public static interface FilteredAdapter
    {

        public abstract void clearAll();
    }


    private final DelegateDataSetObserver mDataSetObserver = new DelegateDataSetObserver();
    private BaseAdapter mDelegate;
    private final BaseAdapter mFiltered;
    private final BaseAdapter mRecent;
    private final BaseAdapter mUnfiltered;

    public BasicFilterAdapter(BaseAdapter baseadapter, BaseAdapter baseadapter1, BaseAdapter baseadapter2)
    {
        mUnfiltered = baseadapter;
        mRecent = baseadapter1;
        mFiltered = baseadapter2;
    }

    private void setDelegate(BaseAdapter baseadapter)
    {
        if (mDelegate != baseadapter)
        {
            if (mDelegate != null)
            {
                mDelegate.unregisterDataSetObserver(mDataSetObserver);
                if ((mDelegate instanceof FilteredAdapter) && mDelegate == mFiltered && baseadapter == mRecent)
                {
                    ((FilteredAdapter)mDelegate).clearAll();
                }
            }
            mDelegate = baseadapter;
            mDelegate.registerDataSetObserver(mDataSetObserver);
            notifyDataSetChanged();
        }
    }

    public void close()
    {
        if (mDelegate != null)
        {
            mDelegate.unregisterDataSetObserver(mDataSetObserver);
            mDelegate = null;
        }
    }

    public void delegateToFiltered()
    {
        setDelegate(mFiltered);
    }

    public void delegateToRecent()
    {
        setDelegate(mRecent);
    }

    public void delegateToUnfiltered()
    {
        setDelegate(mUnfiltered);
    }

    public int getCount()
    {
        return mDelegate.getCount();
    }

    public Object getItem(int i)
    {
        return mDelegate.getItem(i);
    }

    public long getItemId(int i)
    {
        return mDelegate.getItemId(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
label0:
        {
            if (mDelegate instanceof DelegateAdapter)
            {
                view1 = view;
                if (((DelegateAdapter)mDelegate).isConvertView(view))
                {
                    break label0;
                }
            }
            view1 = null;
        }
        return mDelegate.getView(i, view1, viewgroup);
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isEnabled(int i)
    {
        return mDelegate.isEnabled(i);
    }
}
