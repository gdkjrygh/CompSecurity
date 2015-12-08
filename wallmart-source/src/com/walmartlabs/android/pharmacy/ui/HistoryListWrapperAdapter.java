// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.HistoryListAdapter;
import java.util.ArrayList;
import java.util.List;

public class HistoryListWrapperAdapter extends BaseAdapter
{

    private static final int INVALID_POSITION = -1;
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_OTHER = 1;
    private HistoryListAdapter mActive;
    private Context mContext;
    private int mFirstHeaderPosition;
    private List mHeaders;
    private int mMaxActivePosition;
    private int mMaxProcessedPosition;
    private int mMinActivePosition;
    private int mMinProcessedPosition;
    private HistoryListAdapter mProcessed;
    private int mSecondHeaderPosition;

    public HistoryListWrapperAdapter(Context context)
    {
        mFirstHeaderPosition = -1;
        mMinActivePosition = -1;
        mMaxActivePosition = -1;
        mSecondHeaderPosition = -1;
        mMinProcessedPosition = -1;
        mMaxProcessedPosition = -1;
        mContext = context;
        mActive = new HistoryListAdapter(context);
        mActive.setShowSections(false);
        mProcessed = new HistoryListAdapter(context);
        mProcessed.setShowSections(true);
        mHeaders = new ArrayList();
    }

    public int getCount()
    {
        return mHeaders.size() + mActive.getCount() + mProcessed.getCount();
    }

    public Object getItem(int i)
    {
        if (i != mFirstHeaderPosition)
        {
            if (mMinActivePosition <= i && i <= mMaxActivePosition)
            {
                return mActive.getItem(i - mMinActivePosition);
            }
            if (i != mSecondHeaderPosition && mMinProcessedPosition <= i && i <= mMaxProcessedPosition)
            {
                return mProcessed.getItem(i - mMinProcessedPosition);
            }
        }
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public int getItemViewType(int i)
    {
        return i != mFirstHeaderPosition && i != mSecondHeaderPosition ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (i == mFirstHeaderPosition)
        {
            return (View)mHeaders.get(0);
        }
        if (mMinActivePosition <= i && i <= mMaxActivePosition)
        {
            return mActive.getView(i - mMinActivePosition, view, viewgroup);
        }
        if (i == mSecondHeaderPosition)
        {
            return (View)mHeaders.get(1);
        }
        if (mMinProcessedPosition <= i && i <= mMaxProcessedPosition)
        {
            return mProcessed.getView(i - mMinProcessedPosition, view, viewgroup);
        } else
        {
            return null;
        }
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public void setItems(com.walmartlabs.android.pharmacy.service.RefillHistory.RxFill arxfill[])
    {
        boolean flag = false;
        byte byte0 = -1;
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        int j = arxfill.length;
        int i = 0;
        while (i < j) 
        {
            com.walmartlabs.android.pharmacy.service.RefillHistory.RxFill rxfill = arxfill[i];
            if (rxfill.isActive())
            {
                arraylist.add(rxfill);
            } else
            {
                arraylist1.add(rxfill);
            }
            i++;
        }
        mActive.setItems(arraylist);
        mProcessed.setItems(arraylist1);
        mHeaders.clear();
        if (mActive.getCount() > 0)
        {
            arxfill = (TextView)ViewUtil.inflate(mContext, com.walmartlabs.android.pharmacy.R.layout.pharmacy_history_list_header);
            arxfill.setText(com.walmartlabs.android.pharmacy.R.string.pharmacy_order_history_active_header);
            mHeaders.add(arxfill);
        }
        if (mProcessed.getCount() > 0)
        {
            arxfill = (TextView)ViewUtil.inflate(mContext, com.walmartlabs.android.pharmacy.R.layout.pharmacy_history_list_header);
            arxfill.setText(com.walmartlabs.android.pharmacy.R.string.pharmacy_order_history_processed_header);
            mHeaders.add(arxfill);
        }
        i = ((flag) ? 1 : 0);
        if (mHeaders.isEmpty())
        {
            i = -1;
        }
        mFirstHeaderPosition = i;
        mMinActivePosition = 1;
        mMaxActivePosition = (mMinActivePosition + mActive.getCount()) - 1;
        i = byte0;
        if (mHeaders.size() > 1)
        {
            i = mMaxActivePosition + 1;
        }
        mSecondHeaderPosition = i;
        mMinProcessedPosition = mHeaders.size() + mActive.getCount();
        mMaxProcessedPosition = (mMinProcessedPosition + mProcessed.getCount()) - 1;
        notifyDataSetChanged();
    }
}
