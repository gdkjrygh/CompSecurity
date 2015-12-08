// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.weather.dal.locations:
//            PointerList, LbsState, LocationItem, PointerId, 
//            Pointer, FollowMeStatus, TwcLocation

public final class SavedLocationsData
    implements Serializable
{

    private static final String TAG = "SavedLocationsData";
    private static final long serialVersionUID = 0xb57b4f54b9881e65L;
    private FollowMeStatus followMeStatus;
    private LbsState lbsState;
    private List locationsList;
    private PointerList pointers;
    private FollowMeStatus zombieFollowMeStatus;

    public SavedLocationsData()
    {
        Log.i("SavedLocationsData", "Constructor");
        pointers = new PointerList();
        locationsList = new LinkedList();
        followMeStatus = null;
        zombieFollowMeStatus = null;
        lbsState = new LbsState();
    }

    SavedLocationsData(SavedLocationsData savedlocationsdata)
    {
        pointers = new PointerList(savedlocationsdata.pointers);
        LinkedList linkedlist = new LinkedList();
        for (Iterator iterator = savedlocationsdata.getLocationsList().iterator(); iterator.hasNext(); linkedlist.add(new LocationItem((LocationItem)iterator.next()))) { }
        locationsList = linkedlist;
        followMeStatus = savedlocationsdata.getFollowMeStatus();
        zombieFollowMeStatus = savedlocationsdata.getZombieFollowMeStatus();
        lbsState = new LbsState(savedlocationsdata.lbsState);
    }

    private static SavedLocationsData newInstance(int i, int j, List list, FollowMeStatus followmestatus)
    {
        SavedLocationsData savedlocationsdata = new SavedLocationsData();
        savedlocationsdata.pointers.set(PointerId.CURRENT, new Pointer(PointerId.CURRENT, i));
        savedlocationsdata.pointers.set(PointerId.HOME, new Pointer(PointerId.HOME, j));
        savedlocationsdata.setLocationsList(list);
        savedlocationsdata.followMeStatus = followmestatus;
        savedlocationsdata.lbsState = new LbsState();
        return savedlocationsdata;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (SavedLocationsData)obj;
        if (followMeStatus == null)
        {
            if (((SavedLocationsData) (obj)).followMeStatus != null)
            {
                return false;
            }
        } else
        if (!followMeStatus.equals(((SavedLocationsData) (obj)).followMeStatus))
        {
            return false;
        }
        if (zombieFollowMeStatus == null)
        {
            if (((SavedLocationsData) (obj)).zombieFollowMeStatus != null)
            {
                return false;
            }
        } else
        if (!zombieFollowMeStatus.equals(((SavedLocationsData) (obj)).zombieFollowMeStatus))
        {
            return false;
        }
        if (locationsList == null)
        {
            if (((SavedLocationsData) (obj)).locationsList != null)
            {
                return false;
            }
        } else
        if (!locationsList.equals(((SavedLocationsData) (obj)).locationsList))
        {
            return false;
        }
        if (pointers != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((SavedLocationsData) (obj)).pointers == null) goto _L1; else goto _L3
_L3:
        return false;
        if (pointers.equals(((SavedLocationsData) (obj)).pointers)) goto _L1; else goto _L4
_L4:
        return false;
    }

    int findFirstIndex(TwcLocation twclocation)
    {
        int i = findIndexInFixedLocations(twclocation);
        if (i != -1)
        {
            return i;
        }
        return followMeStatus == null || !followMeStatus.getLocation().equals(twclocation) ? -1 : -2;
    }

    int findIndexInFixedLocations(TwcLocation twclocation)
    {
        int i = 0;
        for (Iterator iterator = getLocationsList().iterator(); iterator.hasNext();)
        {
            if (((LocationItem)iterator.next()).getLocation().equals(twclocation))
            {
                return i;
            }
            i++;
        }

        return -1;
    }

    List findIndexes(TwcLocation twclocation)
    {
        ArrayList arraylist = new ArrayList();
        int i = findIndexInFixedLocations(twclocation);
        if (i != -1)
        {
            arraylist.add(Integer.valueOf(i));
        }
        FollowMeStatus followmestatus = getFollowMeStatus();
        if (followmestatus != null && followmestatus.getLocation().equals(twclocation))
        {
            arraylist.add(Integer.valueOf(-2));
        }
        return arraylist;
    }

    public int getCount()
    {
        return locationsList.size();
    }

    public FollowMeStatus getFollowMeStatus()
    {
        return followMeStatus;
    }

    public LbsState getLbsState()
    {
        return lbsState;
    }

    public List getLocationsList()
    {
        return locationsList;
    }

    public PointerList getPointers()
    {
        return pointers;
    }

    public FollowMeStatus getZombieFollowMeStatus()
    {
        return zombieFollowMeStatus;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (followMeStatus == null)
        {
            i = 0;
        } else
        {
            i = followMeStatus.hashCode();
        }
        if (zombieFollowMeStatus == null)
        {
            j = 0;
        } else
        {
            j = zombieFollowMeStatus.hashCode();
        }
        if (locationsList == null)
        {
            k = 0;
        } else
        {
            k = locationsList.hashCode();
        }
        if (pointers != null)
        {
            l = pointers.hashCode();
        }
        return (((i + 31) * 31 + j) * 31 + k) * 31 + l;
    }

    boolean isValid()
    {
        while (locationsList.isEmpty() && followMeStatus == null || pointers.get(PointerId.CURRENT).get() == -1) 
        {
            return false;
        }
        return true;
    }

    public void setFollowMeStatus(FollowMeStatus followmestatus)
    {
        followMeStatus = followmestatus;
    }

    public void setLocationsList(List list)
    {
        locationsList = list;
    }

    public void setZombieFollowMeStatus(FollowMeStatus followmestatus)
    {
        zombieFollowMeStatus = followmestatus;
    }

    public String toString()
    {
        boolean flag1 = true;
        StringBuilder stringbuilder = (new StringBuilder()).append("List:").append(getLocationsList()).append(", ").append(pointers).append(", FM:");
        boolean flag;
        if (followMeStatus != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder = stringbuilder.append(flag).append(", ZFM:");
        if (zombieFollowMeStatus != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return stringbuilder.append(flag).toString();
    }
}
