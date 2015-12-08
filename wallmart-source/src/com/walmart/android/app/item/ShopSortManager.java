// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;

public class ShopSortManager
{
    public static interface OnSortChangedListener
    {

        public abstract void onSortChanged(Object obj);
    }

    public static class SortGroup
    {

        private OnSortChangedListener mListener;
        private final String mName;
        private final Object mSortParamMap[];

        public String getName()
        {
            return mName;
        }

        public OnSortChangedListener getOnSortChangedListener()
        {
            return mListener;
        }

        public Object[] getSortParamMap()
        {
            return mSortParamMap;
        }

        public void setOnSortChangedListener(OnSortChangedListener onsortchangedlistener)
        {
            mListener = onsortchangedlistener;
        }

        public SortGroup(Object aobj[], String s)
        {
            this(aobj, s, null);
        }

        public SortGroup(Object aobj[], String s, OnSortChangedListener onsortchangedlistener)
        {
            mSortParamMap = aobj;
            mName = s;
            mListener = onsortchangedlistener;
        }
    }


    private static final String SELECTED_SORT_OPTION = "selected_sort_option";
    protected static final String TAG = com/walmart/android/app/item/ShopSortManager.getSimpleName();
    protected static final int TYPE_SERVICE_DESCRIPTION = 0;
    private SortGroup mActiveGroup;
    private Context mContext;
    private SharedPreferences mPrefs;
    private final HashMap mSortGroups = new HashMap();

    public ShopSortManager(Context context)
    {
        mContext = context;
    }

    private void setActive(SortGroup sortgroup)
    {
        mActiveGroup = sortgroup;
        mPrefs = mContext.getSharedPreferences(mActiveGroup.getName(), 0);
    }

    public void addSortGroup(SortGroup sortgroup)
    {
        mSortGroups.put(sortgroup.getName(), sortgroup);
    }

    public SortGroup getActive()
    {
        return mActiveGroup;
    }

    public int getSelectedOption()
    {
        return mPrefs.getInt("selected_sort_option", 0);
    }

    public Object getSelectedSortParam()
    {
        return mActiveGroup.getSortParamMap()[getSelectedOption()];
    }

    public void reset()
    {
        android.content.SharedPreferences.Editor editor = mPrefs.edit();
        editor.clear();
        editor.apply();
    }

    public boolean setActive(String s)
    {
        s = (SortGroup)mSortGroups.get(s);
        if (s != null)
        {
            setActive(((SortGroup) (s)));
            return true;
        } else
        {
            return false;
        }
    }

    public void setSelectedOption(int i)
    {
        if (i != getSelectedOption())
        {
            Object obj = mPrefs.edit();
            ((android.content.SharedPreferences.Editor) (obj)).putInt("selected_sort_option", i);
            ((android.content.SharedPreferences.Editor) (obj)).apply();
            obj = mActiveGroup.getOnSortChangedListener();
            if (obj != null)
            {
                ((OnSortChangedListener) (obj)).onSortChanged(getSelectedSortParam());
            }
        }
    }

}
