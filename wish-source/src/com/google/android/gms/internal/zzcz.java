// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.zza;
import java.util.Date;
import java.util.HashSet;

public final class zzcz
{

    public static int zza(com.google.ads.AdRequest.ErrorCode errorcode)
    {
        static class _cls1
        {

            static final int zzvg[];
            static final int zzvh[];

            static 
            {
                zzvh = new int[com.google.ads.AdRequest.ErrorCode.values().length];
                try
                {
                    zzvh[com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    zzvh[com.google.ads.AdRequest.ErrorCode.INVALID_REQUEST.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    zzvh[com.google.ads.AdRequest.ErrorCode.NETWORK_ERROR.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    zzvh[com.google.ads.AdRequest.ErrorCode.NO_FILL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                zzvg = new int[com.google.ads.AdRequest.Gender.values().length];
                try
                {
                    zzvg[com.google.ads.AdRequest.Gender.FEMALE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    zzvg[com.google.ads.AdRequest.Gender.MALE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    zzvg[com.google.ads.AdRequest.Gender.UNKNOWN.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.zzvh[errorcode.ordinal()])
        {
        default:
            return 0;

        case 2: // '\002'
            return 1;

        case 3: // '\003'
            return 2;

        case 4: // '\004'
            return 3;
        }
    }

    public static AdSize zzb(AdSizeParcel adsizeparcel)
    {
        int i = 0;
        AdSize aadsize[] = new AdSize[6];
        aadsize[0] = AdSize.SMART_BANNER;
        aadsize[1] = AdSize.BANNER;
        aadsize[2] = AdSize.IAB_MRECT;
        aadsize[3] = AdSize.IAB_BANNER;
        aadsize[4] = AdSize.IAB_LEADERBOARD;
        aadsize[5] = AdSize.IAB_WIDE_SKYSCRAPER;
        for (; i < aadsize.length; i++)
        {
            if (aadsize[i].getWidth() == adsizeparcel.width && aadsize[i].getHeight() == adsizeparcel.height)
            {
                return aadsize[i];
            }
        }

        return new AdSize(com.google.android.gms.ads.zza.zza(adsizeparcel.width, adsizeparcel.height, adsizeparcel.zzpX));
    }

    public static MediationAdRequest zzd(AdRequestParcel adrequestparcel)
    {
        HashSet hashset;
        if (adrequestparcel.zzpK != null)
        {
            hashset = new HashSet(adrequestparcel.zzpK);
        } else
        {
            hashset = null;
        }
        return new MediationAdRequest(new Date(adrequestparcel.zzpI), zzn(adrequestparcel.zzpJ), hashset, adrequestparcel.zzpL, adrequestparcel.zzpQ);
    }

    public static com.google.ads.AdRequest.Gender zzn(int i)
    {
        switch (i)
        {
        default:
            return com.google.ads.AdRequest.Gender.UNKNOWN;

        case 2: // '\002'
            return com.google.ads.AdRequest.Gender.FEMALE;

        case 1: // '\001'
            return com.google.ads.AdRequest.Gender.MALE;
        }
    }
}
