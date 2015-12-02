// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.google.model;

import java.util.List;

public final class DirectionsResponse
{

    private static final String STATUS_OK = "OK";
    private List mRoutes;
    private String mStatus;

    public DirectionsResponse()
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
            obj = (DirectionsResponse)obj;
            if (mRoutes == null ? ((DirectionsResponse) (obj)).mRoutes != null : !mRoutes.equals(((DirectionsResponse) (obj)).mRoutes))
            {
                return false;
            }
            if (mStatus == null ? ((DirectionsResponse) (obj)).mStatus != null : !mStatus.equals(((DirectionsResponse) (obj)).mStatus))
            {
                return false;
            }
        }
        return true;
    }

    public final List getRoutes()
    {
        return mRoutes;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (mRoutes != null)
        {
            i = mRoutes.hashCode();
        } else
        {
            i = 0;
        }
        if (mStatus != null)
        {
            j = mStatus.hashCode();
        }
        return i * 31 + j;
    }

    public final boolean isSuccess()
    {
        return mStatus.equals("OK");
    }
}
