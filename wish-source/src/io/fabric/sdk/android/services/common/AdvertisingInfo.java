// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;


class AdvertisingInfo
{

    public final String advertisingId;
    public final boolean limitAdTrackingEnabled;

    AdvertisingInfo(String s, boolean flag)
    {
        advertisingId = s;
        limitAdTrackingEnabled = flag;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AdvertisingInfo)obj;
            if (limitAdTrackingEnabled != ((AdvertisingInfo) (obj)).limitAdTrackingEnabled)
            {
                return false;
            }
            if (advertisingId == null ? ((AdvertisingInfo) (obj)).advertisingId != null : !advertisingId.equals(((AdvertisingInfo) (obj)).advertisingId))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (advertisingId != null)
        {
            i = advertisingId.hashCode();
        } else
        {
            i = 0;
        }
        if (limitAdTrackingEnabled)
        {
            j = 1;
        }
        return i * 31 + j;
    }
}
