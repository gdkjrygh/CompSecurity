// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.google.model;


public final class OverviewPolyline
{

    private String mPoints;

    public OverviewPolyline()
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
            obj = (OverviewPolyline)obj;
            if (mPoints == null ? ((OverviewPolyline) (obj)).mPoints != null : !mPoints.equals(((OverviewPolyline) (obj)).mPoints))
            {
                return false;
            }
        }
        return true;
    }

    public final String getPoints()
    {
        return mPoints;
    }

    public final int hashCode()
    {
        if (mPoints != null)
        {
            return mPoints.hashCode();
        } else
        {
            return 0;
        }
    }
}
