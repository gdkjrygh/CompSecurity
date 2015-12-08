// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import com.walmart.android.search.BasicSearchManager;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.saver:
//            BasicFilterAdapter

public class BasicFilterManager extends BasicSearchManager
{
    public static interface OnFilterChangeListener
    {

        public abstract void onFilterChange(CharSequence charsequence);
    }


    private BasicFilterAdapter mBasicFilterAdapter;
    private String mCurrentFilter;
    private BaseAdapter mFilteredAdapter;
    private android.widget.AdapterView.OnItemClickListener mFilteredListener;
    private boolean mIsFilterMode;
    private OnFilterChangeListener mOnFilterChangeListener;
    private BaseAdapter mRecentAdapter;
    private android.widget.AdapterView.OnItemClickListener mRecentListener;
    private BaseAdapter mUnfilteredAdapter;
    private android.widget.AdapterView.OnItemClickListener mUnfilteredListener;

    public BasicFilterManager(ListView listview)
    {
        super(listview);
    }

    protected boolean checkState(boolean flag, String s)
    {
label0:
        {
            boolean flag2 = false;
            boolean flag3 = isFilterMode();
            boolean flag1;
            if (mCurrentFilter != null)
            {
                if (!mCurrentFilter.equals(s))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            } else
            if (s != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            mCurrentFilter = s;
            mIsFilterMode = flag;
            if (!(isFilterMode() ^ flag3))
            {
                flag = flag2;
                if (!flag1)
                {
                    break label0;
                }
            }
            switchState();
            flag = true;
        }
        return flag;
    }

    protected void close()
    {
        if (mBasicFilterAdapter != null)
        {
            mBasicFilterAdapter.close();
        }
    }

    protected CharSequence getCurrentFilter()
    {
        return mCurrentFilter;
    }

    protected ListView getListView()
    {
        return (ListView)mRootLayout;
    }

    protected void init()
    {
        mBasicFilterAdapter = new BasicFilterAdapter(mUnfilteredAdapter, mRecentAdapter, mFilteredAdapter);
        switchState();
        getListView().setAdapter(mBasicFilterAdapter);
        super.init();
    }

    protected boolean isFilterMode()
    {
        return mIsFilterMode;
    }

    public boolean onBackPressed()
    {
        if (isFilterMode() && checkState(false, getSearchText()))
        {
            clearSearchText();
            mSearchField.clearFocus();
            mRootLayout.requestFocus();
            ViewUtil.hideKeyboard(mSearchField);
            return true;
        } else
        {
            return super.onBackPressed();
        }
    }

    protected void onSearchFieldFocusChange(boolean flag)
    {
        super.onSearchFieldFocusChange(flag);
        checkState(flag, getSearchText());
    }

    protected void onSearchFieldTextChanged(CharSequence charsequence)
    {
        super.onSearchFieldTextChanged(charsequence);
        checkState(isFilterMode(), getSearchText());
        if (mOnFilterChangeListener != null)
        {
            mOnFilterChangeListener.onFilterChange(charsequence);
        }
    }

    public void setFilteredAdapter(BaseAdapter baseadapter, android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        mFilteredAdapter = baseadapter;
        mFilteredListener = onitemclicklistener;
    }

    public void setOnFilterChangeListener(OnFilterChangeListener onfilterchangelistener)
    {
        mOnFilterChangeListener = onfilterchangelistener;
    }

    public void setRecentAdapter(BaseAdapter baseadapter, android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        mRecentAdapter = baseadapter;
        mRecentListener = onitemclicklistener;
    }

    public void setUnfilteredAdapter(BaseAdapter baseadapter, android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        mUnfilteredAdapter = baseadapter;
        mUnfilteredListener = onitemclicklistener;
    }

    protected void switchState()
    {
        if (isFilterMode())
        {
            if (TextUtils.isEmpty(mCurrentFilter))
            {
                mBasicFilterAdapter.delegateToRecent();
                getListView().setOnItemClickListener(mRecentListener);
                return;
            } else
            {
                mBasicFilterAdapter.delegateToFiltered();
                getListView().setOnItemClickListener(mFilteredListener);
                return;
            }
        } else
        {
            mBasicFilterAdapter.delegateToUnfiltered();
            getListView().setOnItemClickListener(mUnfilteredListener);
            return;
        }
    }
}
