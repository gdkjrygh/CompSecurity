// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.vehicleview;


// Referenced classes of package com.ubercab.client.core.model.vehicleview:
//            VehicleViewImage

public final class Shape_VehicleViewImage extends VehicleViewImage
{

    private int height;
    private String url;
    private int width;

    Shape_VehicleViewImage()
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
            obj = (VehicleViewImage)obj;
            if (((VehicleViewImage) (obj)).getHeight() != getHeight())
            {
                return false;
            }
            if (((VehicleViewImage) (obj)).getWidth() != getWidth())
            {
                return false;
            }
            if (((VehicleViewImage) (obj)).getUrl() == null ? getUrl() != null : !((VehicleViewImage) (obj)).getUrl().equals(getUrl()))
            {
                return false;
            }
        }
        return true;
    }

    public final int getHeight()
    {
        return height;
    }

    public final String getUrl()
    {
        return url;
    }

    public final int getWidth()
    {
        return width;
    }

    public final int hashCode()
    {
        int j = height;
        int k = width;
        int i;
        if (url == null)
        {
            i = 0;
        } else
        {
            i = url.hashCode();
        }
        return i ^ ((j ^ 0xf4243) * 0xf4243 ^ k) * 0xf4243;
    }

    final VehicleViewImage setHeight(int i)
    {
        height = i;
        return this;
    }

    final VehicleViewImage setUrl(String s)
    {
        url = s;
        return this;
    }

    final VehicleViewImage setWidth(int i)
    {
        width = i;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("VehicleViewImage{height=")).append(height).append(", width=").append(width).append(", url=").append(url).append("}").toString();
    }
}
