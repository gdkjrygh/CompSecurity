// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.ArrayList;
import java.util.List;

public class TripLeg
    implements com.ubercab.rider.realtime.model.TripLeg
{

    List actions;
    String encodedPolyline;
    String locationEndRef;
    String locationStartRef;

    public TripLeg()
    {
    }

    public static TripLeg create(String s, String s1, String s2)
    {
        TripLeg tripleg = new TripLeg();
        tripleg.locationStartRef = s;
        tripleg.locationEndRef = s1;
        tripleg.encodedPolyline = s2;
        tripleg.actions = new ArrayList();
        return tripleg;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TripLeg)obj;
            if (actions == null ? ((TripLeg) (obj)).actions != null : !actions.equals(((TripLeg) (obj)).actions))
            {
                return false;
            }
            if (encodedPolyline == null ? ((TripLeg) (obj)).encodedPolyline != null : !encodedPolyline.equals(((TripLeg) (obj)).encodedPolyline))
            {
                return false;
            }
            if (locationEndRef == null ? ((TripLeg) (obj)).locationEndRef != null : !locationEndRef.equals(((TripLeg) (obj)).locationEndRef))
            {
                return false;
            }
            if (locationStartRef == null ? ((TripLeg) (obj)).locationStartRef != null : !locationStartRef.equals(((TripLeg) (obj)).locationStartRef))
            {
                return false;
            }
        }
        return true;
    }

    public List getActions()
    {
        if (actions == null)
        {
            return null;
        } else
        {
            return new ArrayList(actions);
        }
    }

    public String getEncodedPolyline()
    {
        return encodedPolyline;
    }

    public String getLocationEndRef()
    {
        return locationEndRef;
    }

    public String getLocationStartRef()
    {
        return locationStartRef;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (actions != null)
        {
            i = actions.hashCode();
        } else
        {
            i = 0;
        }
        if (encodedPolyline != null)
        {
            j = encodedPolyline.hashCode();
        } else
        {
            j = 0;
        }
        if (locationEndRef != null)
        {
            k = locationEndRef.hashCode();
        } else
        {
            k = 0;
        }
        if (locationStartRef != null)
        {
            l = locationStartRef.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }
}
