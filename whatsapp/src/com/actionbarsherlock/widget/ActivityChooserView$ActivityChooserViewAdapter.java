// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.actionbarsherlock.widget:
//            ActivityChooserModel, ActivityChooserView, SearchView

class <init> extends BaseAdapter
{

    private ActivityChooserModel mDataModel;
    private boolean mHighlightDefaultActivity;
    private int mMaxActivityCount;
    private boolean mShowDefaultActivity;
    private boolean mShowFooterView;
    final ActivityChooserView this$0;

    public int getActivityCount()
    {
        return mDataModel.getActivityCount();
    }

    public int getCount()
    {
        int j = mDataModel.getActivityCount();
        boolean flag = mShowDefaultActivity;
        int i = j;
        if (!flag)
        {
            ResolveInfo resolveinfo;
            IllegalArgumentException illegalargumentexception;
            boolean flag1;
            try
            {
                resolveinfo = mDataModel.getDefaultActivity();
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            i = j;
            if (resolveinfo != null)
            {
                i = j - 1;
            }
        }
        j = Math.min(i, mMaxActivityCount);
        try
        {
            flag1 = mShowFooterView;
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        i = j;
        if (flag1)
        {
            i = j + 1;
        }
        return i;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    public ActivityChooserModel getDataModel()
    {
        return mDataModel;
    }

    public ResolveInfo getDefaultActivity()
    {
        return mDataModel.getDefaultActivity();
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
            break;
        }
        boolean flag = mShowDefaultActivity;
        int j = i;
        if (!flag)
        {
            ResolveInfo resolveinfo;
            IllegalArgumentException illegalargumentexception;
            try
            {
                resolveinfo = mDataModel.getDefaultActivity();
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            j = i;
            if (resolveinfo != null)
            {
                j = i + 1;
            }
        }
        return mDataModel.getActivity(j);
        illegalargumentexception;
        throw illegalargumentexception;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        boolean flag;
        try
        {
            flag = mShowFooterView;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (i == getCount() - 1)
        {
            return 1;
        }
        return 0;
    }

    public int getMaxActivityCount()
    {
        return mMaxActivityCount;
    }

    public boolean getShowDefaultActivity()
    {
        return mShowDefaultActivity;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        getItemViewType(i);
        JVM INSTR tableswitch 0 1: default 28
    //                   0 112
    //                   1 36;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException();
_L3:
        Object obj;
label0:
        {
            if (view != null)
            {
                try
                {
                    i = view.getId();
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    throw view;
                }
                obj = view;
                if (i == 1)
                {
                    break label0;
                }
            }
            obj = LayoutInflater.from(getContext()).inflate(com.actionbarsherlock.dapter.getItemViewType, viewgroup, false);
            ((View) (obj)).setId(1);
            ((TextView)((View) (obj)).findViewById(com.actionbarsherlock.dapter.getItemViewType)).setText(ActivityChooserView.access$700(ActivityChooserView.this).getString(com.actionbarsherlock.dapter.this._fld0));
        }
_L8:
        return ((View) (obj));
_L2:
        if (view == null) goto _L5; else goto _L4
_L4:
        Object obj1;
        int j;
        int k;
        boolean flag;
        try
        {
            j = view.getId();
            k = com.actionbarsherlock.dapter.this._fld0;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (j == k) goto _L6; else goto _L5
_L5:
        view = LayoutInflater.from(getContext()).inflate(com.actionbarsherlock.dapter.this._fld0, viewgroup, false);
_L6:
        viewgroup = ActivityChooserView.access$700(ActivityChooserView.this).getPackageManager();
        obj1 = (ImageView)view.findViewById(com.actionbarsherlock.dapter.this._fld0);
        obj = (ResolveInfo)getItem(i);
        ((ImageView) (obj1)).setImageDrawable(((ResolveInfo) (obj)).loadIcon(viewgroup));
        obj1 = (TextView)view.findViewById(com.actionbarsherlock.dapter.getItem);
        ((TextView) (obj1)).setText(((ResolveInfo) (obj)).loadLabel(viewgroup));
        flag = ActivityChooserView.access$1300();
        obj = view;
        if (!flag) goto _L8; else goto _L7
_L7:
        flag = mShowDefaultActivity;
        if (!flag || i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = mHighlightDefaultActivity;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            mHighlightDefaultActivity(view, true);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        obj = view;
        if (!SearchView.a) goto _L8; else goto _L9
_L9:
        mHighlightDefaultActivity(view, false);
        return view;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public int measureContentWidth()
    {
        int i = 0;
        boolean flag = SearchView.a;
        int l = mMaxActivityCount;
        mMaxActivityCount = 0x7fffffff;
        int i1 = android.view.oserViewAdapter.mMaxActivityCount(0, 0);
        int j1 = android.view.oserViewAdapter.mMaxActivityCount(0, 0);
        int k1 = getCount();
        int j = 0;
        View view = null;
        int k;
        do
        {
            k = i;
            if (j >= k1)
            {
                break;
            }
            view = getView(j, view, null);
            view.measure(i1, j1);
            k = Math.max(i, view.getMeasuredWidth());
            j++;
            i = k;
        } while (!flag);
        mMaxActivityCount = l;
        return k;
    }

    public void setMaxActivityCount(int i)
    {
        try
        {
            if (mMaxActivityCount != i)
            {
                mMaxActivityCount = i;
                notifyDataSetChanged();
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    public void setShowDefaultActivity(boolean flag, boolean flag1)
    {
        boolean flag2;
        try
        {
            flag2 = mShowDefaultActivity;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (flag2 != flag)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        if (mHighlightDefaultActivity == flag1)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        mShowDefaultActivity = flag;
        mHighlightDefaultActivity = flag1;
        notifyDataSetChanged();
        return;
    }

    public void setShowFooterView(boolean flag)
    {
        try
        {
            if (mShowFooterView != flag)
            {
                mShowFooterView = flag;
                notifyDataSetChanged();
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    private Q()
    {
        this$0 = ActivityChooserView.this;
        super();
        mMaxActivityCount = 4;
        mShowDefaultActivity = true;
    }

    mShowDefaultActivity(mShowDefaultActivity mshowdefaultactivity)
    {
        this();
    }
}
