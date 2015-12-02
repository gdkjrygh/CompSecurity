// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.vehicleview;


// Referenced classes of package com.ubercab.client.core.model.vehicleview:
//            VehicleViewTagline

final class Shape_VehicleViewTagline extends VehicleViewTagline
{

    private String detail;
    private String title;

    Shape_VehicleViewTagline()
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
            obj = (VehicleViewTagline)obj;
            if (((VehicleViewTagline) (obj)).getDetail() == null ? getDetail() != null : !((VehicleViewTagline) (obj)).getDetail().equals(getDetail()))
            {
                return false;
            }
            if (((VehicleViewTagline) (obj)).getTitle() == null ? getTitle() != null : !((VehicleViewTagline) (obj)).getTitle().equals(getTitle()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getDetail()
    {
        return detail;
    }

    public final String getTitle()
    {
        return title;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (detail == null)
        {
            i = 0;
        } else
        {
            i = detail.hashCode();
        }
        if (title != null)
        {
            j = title.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final VehicleViewTagline setDetail(String s)
    {
        detail = s;
        return this;
    }

    final VehicleViewTagline setTitle(String s)
    {
        title = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("VehicleViewTagline{detail=")).append(detail).append(", title=").append(title).append("}").toString();
    }
}
