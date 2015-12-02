// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class RecentFareSplitter
    implements com.ubercab.rider.realtime.model.RecentFareSplitter
{

    private String mobileCountryIso2;
    private String mobileDigits;
    private String name;
    private String pictureUrl;

    public RecentFareSplitter()
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
            obj = (RecentFareSplitter)obj;
            if (mobileCountryIso2 == null ? ((RecentFareSplitter) (obj)).mobileCountryIso2 != null : !mobileCountryIso2.equals(((RecentFareSplitter) (obj)).mobileCountryIso2))
            {
                return false;
            }
            if (mobileDigits == null ? ((RecentFareSplitter) (obj)).mobileDigits != null : !mobileDigits.equals(((RecentFareSplitter) (obj)).mobileDigits))
            {
                return false;
            }
            if (name == null ? ((RecentFareSplitter) (obj)).name != null : !name.equals(((RecentFareSplitter) (obj)).name))
            {
                return false;
            }
            if (pictureUrl == null ? ((RecentFareSplitter) (obj)).pictureUrl != null : !pictureUrl.equals(((RecentFareSplitter) (obj)).pictureUrl))
            {
                return false;
            }
        }
        return true;
    }

    public String getMobileCountryIso2()
    {
        return mobileCountryIso2;
    }

    public String getMobileDigits()
    {
        return mobileDigits;
    }

    public String getName()
    {
        return name;
    }

    public String getPictureUrl()
    {
        return pictureUrl;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (name != null)
        {
            i = name.hashCode();
        } else
        {
            i = 0;
        }
        if (mobileDigits != null)
        {
            j = mobileDigits.hashCode();
        } else
        {
            j = 0;
        }
        if (mobileCountryIso2 != null)
        {
            k = mobileCountryIso2.hashCode();
        } else
        {
            k = 0;
        }
        if (pictureUrl != null)
        {
            l = pictureUrl.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }
}
