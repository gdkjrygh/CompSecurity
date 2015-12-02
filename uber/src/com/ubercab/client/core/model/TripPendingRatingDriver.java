// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class TripPendingRatingDriver
    implements com.ubercab.rider.realtime.model.TripPendingRatingDriver
{

    Boolean displayCompany;
    String id;
    String mobile;
    String name;
    String partnerCompany;
    String pictureUrl;
    String rating;
    String status;

    public TripPendingRatingDriver()
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
            obj = (TripPendingRatingDriver)obj;
            if (displayCompany == null ? ((TripPendingRatingDriver) (obj)).displayCompany != null : !displayCompany.equals(((TripPendingRatingDriver) (obj)).displayCompany))
            {
                return false;
            }
            if (id == null ? ((TripPendingRatingDriver) (obj)).id != null : !id.equals(((TripPendingRatingDriver) (obj)).id))
            {
                return false;
            }
            if (mobile == null ? ((TripPendingRatingDriver) (obj)).mobile != null : !mobile.equals(((TripPendingRatingDriver) (obj)).mobile))
            {
                return false;
            }
            if (name == null ? ((TripPendingRatingDriver) (obj)).name != null : !name.equals(((TripPendingRatingDriver) (obj)).name))
            {
                return false;
            }
            if (partnerCompany == null ? ((TripPendingRatingDriver) (obj)).partnerCompany != null : !partnerCompany.equals(((TripPendingRatingDriver) (obj)).partnerCompany))
            {
                return false;
            }
            if (pictureUrl == null ? ((TripPendingRatingDriver) (obj)).pictureUrl != null : !pictureUrl.equals(((TripPendingRatingDriver) (obj)).pictureUrl))
            {
                return false;
            }
            if (rating == null ? ((TripPendingRatingDriver) (obj)).rating != null : !rating.equals(((TripPendingRatingDriver) (obj)).rating))
            {
                return false;
            }
            if (status == null ? ((TripPendingRatingDriver) (obj)).status != null : !status.equals(((TripPendingRatingDriver) (obj)).status))
            {
                return false;
            }
        }
        return true;
    }

    public String getId()
    {
        return id;
    }

    public String getMobile()
    {
        return mobile;
    }

    public String getName()
    {
        return name;
    }

    public String getPartnerCompany()
    {
        return partnerCompany;
    }

    public String getPictureUrl()
    {
        return pictureUrl;
    }

    public String getRating()
    {
        return rating;
    }

    public String getStatus()
    {
        return status;
    }

    public int hashCode()
    {
        int l1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        if (id != null)
        {
            i = id.hashCode();
        } else
        {
            i = 0;
        }
        if (name != null)
        {
            j = name.hashCode();
        } else
        {
            j = 0;
        }
        if (mobile != null)
        {
            k = mobile.hashCode();
        } else
        {
            k = 0;
        }
        if (status != null)
        {
            l = status.hashCode();
        } else
        {
            l = 0;
        }
        if (rating != null)
        {
            i1 = rating.hashCode();
        } else
        {
            i1 = 0;
        }
        if (pictureUrl != null)
        {
            j1 = pictureUrl.hashCode();
        } else
        {
            j1 = 0;
        }
        if (partnerCompany != null)
        {
            k1 = partnerCompany.hashCode();
        } else
        {
            k1 = 0;
        }
        if (displayCompany != null)
        {
            l1 = displayCompany.hashCode();
        }
        return (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31 + l1;
    }

    public boolean isDisplayCompany()
    {
        if (displayCompany == null)
        {
            return false;
        } else
        {
            return displayCompany.booleanValue();
        }
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPictureUrl(String s)
    {
        pictureUrl = s;
    }
}
