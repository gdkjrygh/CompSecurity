// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FilterManager
{
    public static interface Listener
    {

        public abstract void onFilterSettingsUpdated();
    }


    public static final String SERVICE_FILTER_24HR_PHARMACY = "24 Hour Pharmacy";
    public static final String SERVICE_FILTER_GAS_STATION = "Gas Station";
    public static final String SERVICE_FILTER_PHARMACY = "Pharmacy";
    public static final String SERVICE_FILTER_PHOTO = "Photo";
    public static final String SERVICE_FILTER_SITE_TO_STORE = "Site to Store";
    protected static final String TAG = com/walmartlabs/storelocator/FilterManager.getSimpleName();
    private final ArrayList mActiveFilters;
    private HashMap mEditor;
    protected Listener mListener;
    private final HashMap mPrefs;
    private final ArrayList mStoreServiceNames;

    public FilterManager()
    {
        mStoreServiceNames = new ArrayList();
        mPrefs = new HashMap();
        mActiveFilters = new ArrayList();
    }

    public FilterManager(String as[])
    {
        mStoreServiceNames = new ArrayList();
        mPrefs = new HashMap();
        mActiveFilters = new ArrayList();
        if (as != null)
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                mStoreServiceNames.add(s);
            }

        }
    }

    private void updateActiveFilter()
    {
        mActiveFilters.clear();
        Iterator iterator = mStoreServiceNames.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            boolean flag;
            if (mPrefs.get(s) == null)
            {
                flag = false;
            } else
            {
                flag = ((Boolean)mPrefs.get(s)).booleanValue();
            }
            if (flag)
            {
                mActiveFilters.add(s);
            }
        } while (true);
    }

    public void cancelEditing()
    {
        mEditor = null;
    }

    public void clearAll()
    {
        boolean flag = mActiveFilters.isEmpty();
        mActiveFilters.clear();
        mPrefs.clear();
        if (flag && mListener != null)
        {
            mListener.onFilterSettingsUpdated();
        }
    }

    public ArrayList getActiveFilters()
    {
        return mActiveFilters;
    }

    public boolean[] getServicesChecks()
    {
        boolean aflag[] = new boolean[mStoreServiceNames.size()];
        int i = 0;
        while (i < aflag.length) 
        {
            String s = (String)mStoreServiceNames.get(i);
            boolean flag;
            if (mPrefs.get(s) == null)
            {
                flag = false;
            } else
            {
                flag = ((Boolean)mPrefs.get(s)).booleanValue();
            }
            aflag[i] = flag;
            i++;
        }
        return aflag;
    }

    public String[] getServicesNames()
    {
        String as[] = new String[mStoreServiceNames.size()];
        return (String[])mStoreServiceNames.toArray(as);
    }

    public boolean isFilterActive()
    {
        return !mActiveFilters.isEmpty();
    }

    public void setListener(Listener listener)
    {
        mListener = listener;
    }

    public void setServiceCheck(int i, boolean flag)
    {
        setServiceCheck((String)mStoreServiceNames.get(i), flag);
    }

    public void setServiceCheck(String s, boolean flag)
    {
        if (mEditor != null && !TextUtils.isEmpty(s))
        {
            mEditor.put(s, Boolean.valueOf(flag));
        }
    }

    public void startEditing()
    {
        mEditor = new HashMap();
    }

    public void stopEditingAndSave()
    {
        if (mEditor != null)
        {
            boolean flag = false;
            Iterator iterator = mEditor.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (entry.getValue() != mPrefs.get(entry.getKey()))
                {
                    flag = true;
                    mPrefs.put(entry.getKey(), entry.getValue());
                }
            } while (true);
            updateActiveFilter();
            if (flag && mListener != null)
            {
                mListener.onFilterSettingsUpdated();
            }
        }
    }

}
