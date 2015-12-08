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

    private final Date zzaQ;
    private final com.google.ads.AdRequest.Gender zzaR;
    private final Set zzaS;
    private final boolean zzaT;
    private final Location zzaU;

    public MediationAdRequest(Date date, com.google.ads.AdRequest.Gender gender, Set set, boolean flag, Location location)
    {
        zzaQ = date;
        zzaR = gender;
        zzaS = set;
        zzaT = flag;
        zzaU = location;
    }

    public Integer getAgeInYears()
    {
label0:
        {
            Integer integer;
label1:
            {
                if (zzaQ == null)
                {
                    break label0;
                }
                Calendar calendar = Calendar.getInstance();
                Calendar calendar1 = Calendar.getInstance();
                calendar.setTime(zzaQ);
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
        return zzaQ;
    }

    public com.google.ads.AdRequest.Gender getGender()
    {
        return zzaR;
    }

    public Set getKeywords()
    {
        return zzaS;
    }

    public Location getLocation()
    {
        return zzaU;
    }

    public boolean isTesting()
    {
        return zzaT;
    }
}
