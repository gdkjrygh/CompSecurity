// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.location.Location;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class MediationAdRequest
{

    private final Date zzi;
    private final com.google.ads.AdRequest.Gender zzj;
    private final Set zzk;
    private final boolean zzl;
    private final Location zzm;

    public MediationAdRequest(Date date, com.google.ads.AdRequest.Gender gender, Set set, boolean flag, Location location)
    {
        zzi = date;
        zzj = gender;
        zzk = set;
        zzl = flag;
        zzm = location;
    }

    public Integer getAgeInYears()
    {
label0:
        {
            Integer integer;
label1:
            {
                if (zzi == null)
                {
                    break label0;
                }
                Calendar calendar = Calendar.getInstance();
                Calendar calendar1 = Calendar.getInstance();
                calendar.setTime(zzi);
                Integer integer1 = Integer.valueOf(calendar1.get(1) - calendar.get(1));
                if (calendar1.get(2) >= calendar.get(2))
                {
                    integer = integer1;
                    if (calendar1.get(2) != calendar.get(2))
                    {
                        break label1;
                    }
                    integer = integer1;
                    if (calendar1.get(5) >= calendar.get(5))
                    {
                        break label1;
                    }
                }
                integer = Integer.valueOf(integer1.intValue() - 1);
            }
            return integer;
        }
        return null;
    }

    public Date getBirthday()
    {
        return zzi;
    }

    public com.google.ads.AdRequest.Gender getGender()
    {
        return zzj;
    }

    public Set getKeywords()
    {
        return zzk;
    }

    public Location getLocation()
    {
        return zzm;
    }

    public boolean isTesting()
    {
        return zzl;
    }
}
