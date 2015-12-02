// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.TripEntity;
import com.ubercab.rider.realtime.model.TripLeg;
import com.ubercab.rider.realtime.model.TripLegAction;
import hmv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            Shape_ObjectTrip

abstract class ObjectTrip
    implements hmv
{

    private static final String TYPE_DROPOFF = "Dropoff";
    private static final String TYPE_PICKUP = "Pickup";

    ObjectTrip()
    {
    }

    public static ObjectTrip create()
    {
        return new Shape_ObjectTrip();
    }

    private static boolean legHasActionAndClient(TripLeg tripleg, String s, Map map, String s1)
    {
        if (map == null || tripleg.getActions() == null)
        {
            return false;
        }
        for (tripleg = tripleg.getActions().iterator(); tripleg.hasNext();)
        {
            TripLegAction triplegaction = (TripLegAction)tripleg.next();
            TripEntity tripentity = (TripEntity)map.get(triplegaction.getEntityRef());
            if (s.equals(triplegaction.getType()) && tripentity != null && s1.equals(tripentity.getUuid()))
            {
                return true;
            }
        }

        return false;
    }

    boolean clientPerformedActionBeforeLeg(String s, String s1, TripLeg tripleg)
    {
        Object obj = getLegs();
        if (obj == null)
        {
            return false;
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            TripLeg tripleg1 = (TripLeg)((Iterator) (obj)).next();
            if (tripleg == tripleg1)
            {
                return false;
            }
            if (legHasActionAndClient(tripleg1, s1, getEntities(), s))
            {
                return true;
            }
        }

        return false;
    }

    public TripEntity getEntity(String s)
    {
        Map map = getEntities();
        if (s != null && map != null)
        {
            return (TripEntity)map.get(s);
        } else
        {
            return null;
        }
    }

    public List getLegsBetweenCurrentLegAndPickup(String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = getRemainingLegs().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            TripLeg tripleg = (TripLeg)iterator.next();
            if (isClientPartOfTripDuringLeg(s, tripleg))
            {
                break;
            }
            arraylist.add(tripleg);
        } while (true);
        return arraylist;
    }

    public Location getLocation(String s)
    {
        Map map = getLocations();
        if (s == null || map == null)
        {
            return null;
        } else
        {
            return (Location)map.get(s);
        }
    }

    public List getRemainingLegs()
    {
        List list = getLegs();
        int i = getCurrentLegIndex();
        if (list != null && i < list.size())
        {
            return list.subList(i, list.size());
        } else
        {
            return new ArrayList();
        }
    }

    public boolean isClientPartOfTripDuringLeg(String s, TripLeg tripleg)
    {
        boolean flag = clientPerformedActionBeforeLeg(s, "Pickup", tripleg);
        boolean flag1 = clientPerformedActionBeforeLeg(s, "Dropoff", tripleg);
        return flag && !flag1;
    }

    public boolean isLegForClient(TripLeg tripleg, String s)
    {
        Map map = getEntities();
        if (tripleg.getActions() == null || map == null)
        {
            return false;
        }
        for (tripleg = tripleg.getActions().iterator(); tripleg.hasNext();)
        {
            TripEntity tripentity = (TripEntity)map.get(((TripLegAction)tripleg.next()).getEntityRef());
            if (tripentity != null && s.equals(tripentity.getUuid()))
            {
                return true;
            }
        }

        return false;
    }
}
