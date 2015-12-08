// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.support.v7.internal.widget.ActivityChooserModel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.walmart.android.wmui:
//            WalmartActivityChooserView

private class <init> extends BaseAdapter
{

    private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
    private static final int ITEM_VIEW_TYPE_COUNT = 3;
    private static final int ITEM_VIEW_TYPE_FOOTER = 1;
    public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
    public static final int MAX_ACTIVITY_COUNT_UNLIMITED = 0x7fffffff;
    private ActivityChooserModel mDataModel;
    private int mMaxActivityCount;
    private boolean mShowFooterView;
    final WalmartActivityChooserView this$0;

    public int getActivityCount()
    {
        return mDataModel.getActivityCount();
    }

    public int getCount()
    {
        int j = Math.min(mDataModel.getActivityCount(), mMaxActivityCount);
        int i = j;
        if (mShowFooterView)
        {
            i = j + 1;
        }
        return i;
    }

    public ActivityChooserModel getDataModel()
    {
        return mDataModel;
    }

    public int getHistorySize()
    {
        return mDataModel.getHistorySize();
    }

    public Object getItem(int i)
    {
        switch (getItemViewType(i))
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            return null;

        case 0: // '\0'
            return mDataModel.getActivity(i);
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return !mShowFooterView || i != getCount() - 1 ? 0 : 1;
    }

    public int getMaxActivityCount()
    {
        return mMaxActivityCount;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        getItemViewType(i);
        JVM INSTR tableswitch 0 1: default 28
    //                   0 104
    //                   1 36;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException();
_L3:
        if (view == null) goto _L5; else goto _L4
_L4:
        View view1 = view;
        if (view.getId() == 1) goto _L6; else goto _L5
_L5:
        view1 = LayoutInflater.from(getContext()).inflate(0x7f040009, viewgroup, false);
        view1.setId(1);
        ((TextView)view1.findViewById(0x7f10004f)).setText(getContext().getString(0x7f090005));
_L6:
        return view1;
_L2:
        if (view == null) goto _L8; else goto _L7
_L7:
        view1 = view;
        if (view.getId() == 0x7f10004d) goto _L9; else goto _L8
_L8:
        view1 = LayoutInflater.from(getContext()).inflate(0x7f040009, viewgroup, false);
_L9:
        view = getContext().getPackageManager();
        viewgroup = (ImageView)view1.findViewById(0x7f10004e);
        ResolveInfo resolveinfo = (ResolveInfo)getItem(i);
        viewgroup.setImageDrawable(resolveinfo.loadIcon(view));
        ((TextView)view1.findViewById(0x7f10004f)).setText(resolveinfo.loadLabel(view));
        return view1;
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public int measureContentWidth()
    {
        int k = mMaxActivityCount;
        mMaxActivityCount = 0x7fffffff;
        int j = 0;
        View view = null;
        int l = android.view.ViewAdapter.mMaxActivityCount(0, 0);
        int i1 = android.view.ViewAdapter.mMaxActivityCount(0, 0);
        int j1 = getCount();
        for (int i = 0; i < j1; i++)
        {
            view = getView(i, view, null);
            view.measure(l, i1);
            j = Math.max(j, view.getMeasuredWidth());
        }

        mMaxActivityCount = k;
        return j;
    }

    public void setDataModel(ActivityChooserModel activitychoosermodel)
    {
        ActivityChooserModel activitychoosermodel1 = WalmartActivityChooserView.access$000(WalmartActivityChooserView.this).getDataModel();
        if (activitychoosermodel1 != null && isShown())
        {
            activitychoosermodel1.unregisterObserver(WalmartActivityChooserView.access$800(WalmartActivityChooserView.this));
        }
        mDataModel = activitychoosermodel;
        if (activitychoosermodel != null && isShown())
        {
            activitychoosermodel.registerObserver(WalmartActivityChooserView.access$800(WalmartActivityChooserView.this));
        }
        notifyDataSetChanged();
    }

    public void setMaxActivityCount(int i)
    {
        if (mMaxActivityCount != i)
        {
            mMaxActivityCount = i;
            notifyDataSetChanged();
        }
    }

    public void setShowFooterView(boolean flag)
    {
        if (mShowFooterView != flag)
        {
            mShowFooterView = flag;
            notifyDataSetChanged();
        }
    }

    private ()
    {
        this$0 = WalmartActivityChooserView.this;
        super();
        mMaxActivityCount = 4;
    }

    mMaxActivityCount(mMaxActivityCount mmaxactivitycount)
    {
        this();
    }
}
