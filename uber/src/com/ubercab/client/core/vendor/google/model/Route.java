// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.google.model;


// Referenced classes of package com.ubercab.client.core.vendor.google.model:
//            OverviewPolyline

public final class Route
{

    private OverviewPolyline mOverviewPolyline;

    public Route()
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
            obj = (Route)obj;
            if (mOverviewPolyline == null ? ((Route) (obj)).mOverviewPolyline != null : !mOverviewPolyline.equals(((Route) (obj)).mOverviewPolyline))
            {
                return false;
            }
        }
        return true;
    }

    public final OverviewPolyline getOverviewPolyline()
    {
        return mOverviewPolyline;
    }

    public final int hashCode()
    {
        if (mOverviewPolyline != null)
        {
            return mOverviewPolyline.hashCode();
        } else
        {
            return 0;
        }
    }
}
