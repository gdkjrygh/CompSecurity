// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.Image;

public class TripVehiclePictureImage
    implements Image
{

    Integer height;
    String url;
    Integer width;

    public TripVehiclePictureImage()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TripVehiclePictureImage)obj;
            if (height == null ? ((TripVehiclePictureImage) (obj)).height != null : !height.equals(((TripVehiclePictureImage) (obj)).height))
            {
                return false;
            }
            if (url == null ? ((TripVehiclePictureImage) (obj)).url != null : !url.equals(((TripVehiclePictureImage) (obj)).url))
            {
                return false;
            }
            if (width == null ? ((TripVehiclePictureImage) (obj)).width != null : !width.equals(((TripVehiclePictureImage) (obj)).width))
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        if (height == null)
        {
            return 0;
        } else
        {
            return height.intValue();
        }
    }

    public String getUrl()
    {
        return url;
    }

    public int getWidth()
    {
        if (width == null)
        {
            return 0;
        } else
        {
            return width.intValue();
        }
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (width != null)
        {
            i = width.hashCode();
        } else
        {
            i = 0;
        }
        if (height != null)
        {
            j = height.hashCode();
        } else
        {
            j = 0;
        }
        if (url != null)
        {
            k = url.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }
}
