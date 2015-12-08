// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreData, FilterManager

public class StoreManager
{

    public static final String TAG = com/walmartlabs/storelocator/StoreManager.getSimpleName();
    private FilterManager mFilterManager;
    private ArrayList mFilteredStoreList;
    private ArrayList mStoreList;
    private LatLng mUserLocation;

    public StoreManager()
    {
        init();
    }

    public StoreManager(FilterManager filtermanager)
    {
        mFilterManager = filtermanager;
        init();
    }

    private void addIfPassFilter(StoreData storedata, ArrayList arraylist)
    {
        boolean flag1 = true;
        arraylist = arraylist.iterator();
        boolean flag;
        do
        {
            flag = flag1;
            if (!arraylist.hasNext())
            {
                break;
            }
            if (storedata.hasService((String)arraylist.next()))
            {
                continue;
            }
            flag = false;
            break;
        } while (true);
        if (flag)
        {
            mFilteredStoreList.add(storedata);
        }
    }

    private StoreData getClosestStore(ArrayList arraylist)
    {
        double d = 2147483647D;
        Object obj = null;
        Iterator iterator = arraylist.iterator();
        arraylist = obj;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            StoreData storedata = (StoreData)iterator.next();
            if (storedata.distanceFromSource < d)
            {
                d = storedata.distanceFromSource;
                arraylist = storedata;
            }
        } while (true);
        return arraylist;
    }

    private void init()
    {
        mStoreList = new ArrayList();
        mFilteredStoreList = new ArrayList();
    }

    public void addStores(StoreData astoredata[])
    {
        mFilteredStoreList.clear();
        for (int i = 0; i < astoredata.length; i++)
        {
            if (mUserLocation != null)
            {
                astoredata[i].setSourceCoordinates(mUserLocation.latitude, mUserLocation.longitude);
            }
        }

        int k = astoredata.length;
        for (int j = 0; j < k; j++)
        {
            StoreData storedata = astoredata[j];
            mStoreList.add(storedata);
            if (mFilterManager != null)
            {
                addIfPassFilter(storedata, mFilterManager.getActiveFilters());
            }
        }

    }

    public void clear()
    {
        mStoreList.clear();
        mFilteredStoreList.clear();
    }

    public StoreData getClosestStore()
    {
        if (mFilterManager != null && mFilterManager.isFilterActive())
        {
            return getClosestStore(mFilteredStoreList);
        } else
        {
            return getClosestStore(mStoreList);
        }
    }

    public StoreData getStore(int i)
    {
        if (mFilterManager == null || !mFilterManager.isFilterActive()) goto _L2; else goto _L1
_L1:
        if (i >= 0 && i < mFilteredStoreList.size()) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return (StoreData)mFilteredStoreList.get(i);
_L2:
        if (i >= 0 && i < mStoreList.size())
        {
            return (StoreData)mStoreList.get(i);
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public StoreData getStoreUnfiltered(int i)
    {
        return (StoreData)mStoreList.get(i);
    }

    public boolean isFilterActive()
    {
        if (mFilterManager != null)
        {
            return mFilterManager.isFilterActive();
        } else
        {
            return false;
        }
    }

    public void setStores(StoreData astoredata[])
    {
        mStoreList.clear();
        addStores(astoredata);
    }

    public void setUserLocation(LatLng latlng)
    {
        mUserLocation = latlng;
    }

    public int size()
    {
        if (mFilterManager != null && mFilterManager.isFilterActive())
        {
            return mFilteredStoreList.size();
        } else
        {
            return mStoreList.size();
        }
    }

    public int sizeUnfiltered()
    {
        return mStoreList.size();
    }

    public void updateFilter()
    {
        if (mFilterManager != null)
        {
            ArrayList arraylist = mFilterManager.getActiveFilters();
            mFilteredStoreList.clear();
            for (Iterator iterator = mStoreList.iterator(); iterator.hasNext(); addIfPassFilter((StoreData)iterator.next(), arraylist)) { }
        }
    }

}
