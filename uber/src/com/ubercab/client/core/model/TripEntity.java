// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class TripEntity
    implements com.ubercab.rider.realtime.model.TripEntity
{

    String pictureUrl;
    String title;
    String type;
    String uuid;

    public TripEntity()
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
            obj = (TripEntity)obj;
            if (uuid == null ? ((TripEntity) (obj)).uuid != null : !uuid.equals(((TripEntity) (obj)).uuid))
            {
                return false;
            }
            if (pictureUrl == null ? ((TripEntity) (obj)).pictureUrl != null : !pictureUrl.equals(((TripEntity) (obj)).pictureUrl))
            {
                return false;
            }
            if (title == null ? ((TripEntity) (obj)).title != null : !title.equals(((TripEntity) (obj)).title))
            {
                return false;
            }
            if (type == null ? ((TripEntity) (obj)).type != null : !type.equals(((TripEntity) (obj)).type))
            {
                return false;
            }
        }
        return true;
    }

    public String getPictureUrl()
    {
        return pictureUrl;
    }

    public String getTitle()
    {
        return title;
    }

    public String getType()
    {
        return type;
    }

    public String getUuid()
    {
        return uuid;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (uuid != null)
        {
            i = uuid.hashCode();
        } else
        {
            i = 0;
        }
        if (pictureUrl != null)
        {
            j = pictureUrl.hashCode();
        } else
        {
            j = 0;
        }
        if (title != null)
        {
            k = title.hashCode();
        } else
        {
            k = 0;
        }
        if (type != null)
        {
            l = type.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }
}
