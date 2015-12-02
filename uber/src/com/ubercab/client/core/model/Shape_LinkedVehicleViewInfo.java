// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.FareInfo;

// Referenced classes of package com.ubercab.client.core.model:
//            LinkedVehicleViewInfo

public final class Shape_LinkedVehicleViewInfo extends LinkedVehicleViewInfo
{

    private FareInfo fareInfo;
    private String linkedVehicleViewId;

    Shape_LinkedVehicleViewInfo()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LinkedVehicleViewInfo)obj;
            if (((LinkedVehicleViewInfo) (obj)).getLinkedVehicleViewId() == null ? getLinkedVehicleViewId() != null : !((LinkedVehicleViewInfo) (obj)).getLinkedVehicleViewId().equals(getLinkedVehicleViewId()))
            {
                return false;
            }
            if (((LinkedVehicleViewInfo) (obj)).getFareInfo() == null ? getFareInfo() != null : !((LinkedVehicleViewInfo) (obj)).getFareInfo().equals(getFareInfo()))
            {
                return false;
            }
        }
        return true;
    }

    public final FareInfo getFareInfo()
    {
        return fareInfo;
    }

    public final String getLinkedVehicleViewId()
    {
        return linkedVehicleViewId;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (linkedVehicleViewId == null)
        {
            i = 0;
        } else
        {
            i = linkedVehicleViewId.hashCode();
        }
        if (fareInfo != null)
        {
            j = fareInfo.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    public final LinkedVehicleViewInfo setFareInfo(FareInfo fareinfo)
    {
        fareInfo = fareinfo;
        return this;
    }

    public final LinkedVehicleViewInfo setLinkedVehicleViewId(String s)
    {
        linkedVehicleViewId = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("LinkedVehicleViewInfo{linkedVehicleViewId=")).append(linkedVehicleViewId).append(", fareInfo=").append(fareInfo).append("}").toString();
    }
}
