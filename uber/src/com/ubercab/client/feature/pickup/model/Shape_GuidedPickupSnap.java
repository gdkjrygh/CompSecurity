// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            GuidedPickupSnap

public final class Shape_GuidedPickupSnap extends GuidedPickupSnap
{

    private List data;
    private String status;

    Shape_GuidedPickupSnap()
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
            obj = (GuidedPickupSnap)obj;
            if (((GuidedPickupSnap) (obj)).getData() == null ? getData() != null : !((GuidedPickupSnap) (obj)).getData().equals(getData()))
            {
                return false;
            }
            if (((GuidedPickupSnap) (obj)).getStatus() == null ? getStatus() != null : !((GuidedPickupSnap) (obj)).getStatus().equals(getStatus()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getData()
    {
        return data;
    }

    public final String getStatus()
    {
        return status;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (data == null)
        {
            i = 0;
        } else
        {
            i = data.hashCode();
        }
        if (status != null)
        {
            j = status.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final GuidedPickupSnap setData(List list)
    {
        data = list;
        return this;
    }

    final GuidedPickupSnap setStatus(String s)
    {
        status = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupSnap{data=")).append(data).append(", status=").append(status).append("}").toString();
    }
}
