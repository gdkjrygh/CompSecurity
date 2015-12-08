// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.weather.dal.locations:
//            SavedLocationsData, Pointer, FollowMeStatus, LocationItem, 
//            TwcLocation, LocationItemOptions, PointerId, PointerList, 
//            LbsState, LocationType

public class SavedLocationsSnapshot
    implements Serializable
{

    private static final String TAG = "SavedLocationsSnapshot";
    private static final long serialVersionUID = 0x269d5e246f1a9556L;
    private final SavedLocationsData data;

    SavedLocationsSnapshot(SavedLocationsData savedlocationsdata)
    {
        data = new SavedLocationsData(savedlocationsdata);
    }

    private TwcLocation getPointerLocation(Pointer pointer)
    {
        if (!pointer.isEmpty())
        {
            if (pointer.isFollowMe())
            {
                if ((pointer = data.getFollowMeStatus()) != null)
                {
                    return pointer.getItem().getLocation();
                }
            } else
            {
                return ((LocationItem)data.getLocationsList().get(pointer.get())).getLocation();
            }
        }
        return null;
    }

    private boolean validIndex(int i)
    {
        return i >= 0 && i < data.getCount() || i == -2;
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
        obj = (SavedLocationsSnapshot)obj;
        if (data != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((SavedLocationsSnapshot) (obj)).data == null) goto _L1; else goto _L3
_L3:
        return false;
        if (data.equals(((SavedLocationsSnapshot) (obj)).data)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public boolean exists(TwcLocation twclocation)
    {
        Preconditions.checkNotNull(twclocation);
        return data.findFirstIndex(twclocation) != -1;
    }

    public int findFirstIndex(TwcLocation twclocation)
    {
        Preconditions.checkNotNull(twclocation);
        return data.findFirstIndex(twclocation);
    }

    public int findIndexInFixedLocations(TwcLocation twclocation)
    {
        Preconditions.checkNotNull(twclocation);
        return data.findIndexInFixedLocations(twclocation);
    }

    public List findIndexes(TwcLocation twclocation)
    {
        Preconditions.checkNotNull(twclocation);
        return data.findIndexes(twclocation);
    }

    public int findUserIndex(TwcLocation twclocation)
    {
        int i = 0;
        for (Iterator iterator = data.getLocationsList().iterator(); iterator.hasNext();)
        {
            if (((LocationItem)iterator.next()).getLocation().equals(twclocation))
            {
                return i;
            }
            i++;
        }

        return -1;
    }

    public boolean followMeLocationHasNotifications()
    {
        Object obj = data.getFollowMeStatus();
        if (obj != null)
        {
            for (obj = ((FollowMeStatus) (obj)).getItem(); ((LocationItem) (obj)).getOptions().hasTemperatureNotification() || ((LocationItem) (obj)).getOptions().getSevereNotification() != null;)
            {
                return true;
            }

        }
        return false;
    }

    public boolean followMeWidgetExists()
    {
label0:
        {
            Object obj = data.getFollowMeStatus();
            if (obj == null)
            {
                break label0;
            }
            obj = ((FollowMeStatus) (obj)).getItem().getWidgetIds().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (((Integer)((Iterator) (obj)).next()).equals(Integer.valueOf(-1)));
            return true;
        }
        return false;
    }

    public boolean fromWidget(TwcLocation twclocation)
    {
label0:
        {
            Preconditions.checkNotNull(twclocation);
            twclocation = data.findIndexes(twclocation);
            Object obj;
            boolean flag;
            if (!twclocation.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            twclocation = twclocation.iterator();
label1:
            do
            {
                do
                {
                    if (!twclocation.hasNext())
                    {
                        break label0;
                    }
                    obj = (Integer)twclocation.next();
                    if (((Integer) (obj)).intValue() != -2)
                    {
                        continue label1;
                    }
                    obj = data.getFollowMeStatus();
                } while (obj == null || !((FollowMeStatus) (obj)).getItem().fromWidget());
                return true;
            } while (!((LocationItem)data.getLocationsList().get(((Integer) (obj)).intValue())).fromWidget());
            return true;
        }
        return false;
    }

    public List getAllLocations()
    {
        ArrayList arraylist = new ArrayList(data.getLocationsList().size());
        for (Iterator iterator = data.getLocationsList().iterator(); iterator.hasNext(); arraylist.add(((LocationItem)iterator.next()).getLocation())) { }
        return arraylist;
    }

    public int getCount()
    {
        return data.getLocationsList().size();
    }

    public TwcLocation getCurrentLocation()
    {
        Pointer pointer = data.getPointers().get(PointerId.CURRENT);
        FollowMeStatus followmestatus = data.getFollowMeStatus();
        if (pointer.isFollowMe() && followmestatus != null)
        {
            return followmestatus.getItem().getLocation();
        }
        if (!pointer.isEmpty())
        {
            return ((LocationItem)data.getLocationsList().get(pointer.get())).getLocation();
        } else
        {
            throw new IllegalStateException("SavedLocationsSnapshot: getCurrentLocation(): Current Location is null.");
        }
    }

    public int getCurrentLocationIndex()
    {
        return data.getPointers().get(PointerId.CURRENT).get();
    }

    public FollowMeStatus getFollowMeStatus()
    {
        return data.getFollowMeStatus();
    }

    public int getHomeIndex()
    {
        return data.getPointers().get(PointerId.HOME).get();
    }

    public TwcLocation getHomeLocation()
    {
        return getPointerLocation(data.getPointers().get(PointerId.HOME));
    }

    public long getLastUpdatedTime(int i)
    {
        Preconditions.checkArgument(validIndex(i), (new StringBuilder()).append("index:").append(i).append(", count:").append(data.getCount()).toString());
        if (i == -2)
        {
            FollowMeStatus followmestatus = data.getFollowMeStatus();
            if (followmestatus == null)
            {
                throw new IllegalStateException("FOLLOW_ME_INDEX is not valid when followMe is not active");
            } else
            {
                return followmestatus.getItem().getLastUpdated();
            }
        } else
        {
            return ((LocationItem)data.getLocationsList().get(i)).getLastUpdated();
        }
    }

    public LbsState getLbsState()
    {
        return data.getLbsState();
    }

    public TwcLocation getLocationByWidgetId(Integer integer)
    {
        for (Iterator iterator = data.getLocationsList().iterator(); iterator.hasNext();)
        {
            LocationItem locationitem = (LocationItem)iterator.next();
            if (locationitem.getWidgetIds().contains(integer))
            {
                return locationitem.getLocation();
            }
        }

        FollowMeStatus followmestatus = data.getFollowMeStatus();
        if (followmestatus != null && followmestatus.getItem().getWidgetIds().contains(integer))
        {
            return followmestatus.getLocation();
        } else
        {
            return null;
        }
    }

    public TwcLocation getLocationFromList(int i)
    {
        Preconditions.checkArgument(validIndex(i), (new StringBuilder()).append("index:").append(i).append(", count:").append(data.getCount()).toString());
        if (i == -2)
        {
            FollowMeStatus followmestatus = data.getFollowMeStatus();
            if (followmestatus == null)
            {
                throw new IllegalStateException("FOLLOW_ME_INDEX is not valid when followMe is not active");
            } else
            {
                return followmestatus.getLocation();
            }
        } else
        {
            return ((LocationItem)data.getLocationsList().get(i)).getLocation();
        }
    }

    public TwcLocation getLocationFromList(String s)
    {
        Preconditions.checkNotNull(s);
        for (Iterator iterator = data.getLocationsList().iterator(); iterator.hasNext();)
        {
            LocationItem locationitem = (LocationItem)iterator.next();
            if (locationitem.getOptions().getNickname().equals(s))
            {
                return locationitem.getLocation();
            }
        }

        FollowMeStatus followmestatus = data.getFollowMeStatus();
        if (followmestatus != null && followmestatus.getOptions().getNickname().equals(s))
        {
            return followmestatus.getLocation();
        } else
        {
            return null;
        }
    }

    public TwcLocation getLocationFromList(String s, LocationType locationtype)
    {
        Iterator iterator;
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(locationtype);
        iterator = data.getLocationsList().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = ((LocationItem)iterator.next()).getLocation();
        if (!((TwcLocation) (obj)).getKey().equals(s) || ((TwcLocation) (obj)).getType() != locationtype) goto _L4; else goto _L3
_L3:
        s = ((String) (obj));
_L6:
        return s;
_L2:
        obj = data.getFollowMeStatus();
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((FollowMeStatus) (obj)).getLocation();
        if (!((TwcLocation) (obj)).getKey().equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        s = ((String) (obj));
        if (((TwcLocation) (obj)).getType() == locationtype) goto _L6; else goto _L5
_L5:
        return null;
    }

    public int[] getNotificationIndexes()
    {
        Pointer pointer = data.getPointers().get(PointerId.NOTIFICATION1);
        Pointer pointer1 = data.getPointers().get(PointerId.NOTIFICATION2);
        if (pointer.isEmpty())
        {
            if (pointer1.isEmpty())
            {
                return new int[0];
            } else
            {
                return (new int[] {
                    pointer1.get()
                });
            }
        }
        if (pointer1.isEmpty())
        {
            return (new int[] {
                pointer.get()
            });
        } else
        {
            return (new int[] {
                pointer.get(), pointer1.get()
            });
        }
    }

    public LocationItemOptions getOptions(int i)
    {
        Preconditions.checkArgument(validIndex(i), (new StringBuilder()).append("index:").append(i).append(", count:").append(data.getCount()).toString());
        if (i == -2)
        {
            FollowMeStatus followmestatus = data.getFollowMeStatus();
            if (followmestatus == null)
            {
                throw new IllegalStateException("FOLLOW_ME_INDEX is not valid when followMe is not active");
            } else
            {
                return followmestatus.getItem().getOptions();
            }
        } else
        {
            return ((LocationItem)data.getLocationsList().get(i)).getOptions();
        }
    }

    public LocationItemOptions getOptions(TwcLocation twclocation)
    {
        Preconditions.checkNotNull(twclocation);
        return getOptions(data.findFirstIndex(twclocation));
    }

    public int getSchoolIndex()
    {
        return data.getPointers().get(PointerId.SCHOOL).get();
    }

    public TwcLocation getSchoolLocation()
    {
        return getPointerLocation(data.getPointers().get(PointerId.SCHOOL));
    }

    public List getWidgetIds(int i)
    {
        Preconditions.checkArgument(validIndex(i), (new StringBuilder()).append("index:").append(i).append(", count:").append(data.getCount()).toString());
        if (i == -2)
        {
            FollowMeStatus followmestatus = data.getFollowMeStatus();
            if (followmestatus == null)
            {
                followmestatus = data.getZombieFollowMeStatus();
                if (followmestatus != null)
                {
                    return followmestatus.getItem().getWidgetIds();
                } else
                {
                    return new ArrayList();
                }
            } else
            {
                return followmestatus.getItem().getWidgetIds();
            }
        } else
        {
            return ((LocationItem)data.getLocationsList().get(i)).getWidgetIds();
        }
    }

    public Set getWidgetIds(TwcLocation twclocation)
    {
        Preconditions.checkNotNull(twclocation);
        java.util.HashSet hashset = Sets.newHashSet();
        Object obj = data.getLocationsList().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            LocationItem locationitem = (LocationItem)((Iterator) (obj)).next();
            if (locationitem.getLocation().equals(twclocation))
            {
                hashset.addAll(locationitem.getWidgetIds());
            }
        } while (true);
        obj = getFollowMeStatus();
        if (obj != null && ((FollowMeStatus) (obj)).getLocation().equals(twclocation))
        {
            hashset.addAll(((FollowMeStatus) (obj)).getItem().getWidgetIds());
        }
        return hashset;
    }

    public int getWorkIndex()
    {
        return data.getPointers().get(PointerId.WORK).get();
    }

    public TwcLocation getWorkLocation()
    {
        return getPointerLocation(data.getPointers().get(PointerId.WORK));
    }

    public boolean hasLocations()
    {
        return data.getCount() > 0 || data.getFollowMeStatus() != null;
    }

    public int hashCode()
    {
        int i;
        if (data == null)
        {
            i = 0;
        } else
        {
            i = data.hashCode();
        }
        return i + 31;
    }

    public boolean isFixedLocation(TwcLocation twclocation)
    {
        return findIndexInFixedLocations(twclocation) != -1;
    }

    public boolean isFollowMeLocation(TwcLocation twclocation)
    {
        FollowMeStatus followmestatus = getFollowMeStatus();
        return followmestatus != null && followmestatus.getState() == FollowMeStatus.State.LOCATION_DETERMINED && followmestatus.getLocation().equals(twclocation);
    }

    public String toString()
    {
        return data.toString();
    }
}
