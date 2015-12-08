// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import com.weather.ads2.util.AdUtils;
import com.weather.ads2.util.AndroidIdUtils;
import com.weather.util.TwcPreconditions;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.RmidUtils;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.ui.UIUtil;

// Referenced classes of package com.weather.ads2.targeting:
//            UserIdQuerier

public final class UserIdQueriers
{
    private static final class GooglePlayQuerier
        implements UserIdQuerier
    {

        public String getDid()
        {
            return getId();
        }

        public String getFilteredId()
        {
            String s = AdUtils.getAdvertisingId();
            TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.ADVERTISING_ID, s);
            if (s == null)
            {
                s = null;
            } else
            {
                s = RmidUtils.getSHA1((new StringBuilder()).append(s).append("TWC").toString());
            }
            TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.FILTERED_ID, s);
            return s;
        }

        public String getId()
        {
            return AdUtils.getAdvertisingId();
        }

        public String getObfuscatedId()
        {
            return AdUtils.getObfuscatedAdvertisingId();
        }

        public String getSha1Id()
        {
            String s = AdUtils.getAdvertisingId();
            if (s == null)
            {
                return null;
            } else
            {
                return RmidUtils.getSHA1(s);
            }
        }

        public String getShortSha1Id()
        {
            String s = AdUtils.getAdvertisingIdWithoutDashes();
            if (s == null)
            {
                return null;
            } else
            {
                return RmidUtils.getSHA1(s);
            }
        }

        private GooglePlayQuerier()
        {
        }

    }

    private static final class KindleQuerier
        implements UserIdQuerier
    {

        public String getDid()
        {
            return getId();
        }

        public String getFilteredId()
        {
            TwcPreconditions.checkNotOnMainThread();
            String s = AndroidIdUtils.getHashedAndroidId();
            TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.FILTERED_ID, s);
            return s;
        }

        public String getId()
        {
            TwcPreconditions.checkNotOnMainThread();
            return AdUtils.getSha1AndroidId();
        }

        public String getObfuscatedId()
        {
            TwcPreconditions.checkNotOnMainThread();
            return AndroidIdUtils.getObfuscatedAndroidId();
        }

        public String getSha1Id()
        {
            TwcPreconditions.checkNotOnMainThread();
            return getId();
        }

        public String getShortSha1Id()
        {
            TwcPreconditions.checkNotOnMainThread();
            return getId();
        }

        private KindleQuerier()
        {
        }

    }


    private static final UserIdQuerier GOOGLE_PLAY_QUERIER = new GooglePlayQuerier();
    private static final UserIdQuerier KINDLE_QUERIER = new KindleQuerier();
    private static final String TWC_SALT = "TWC";

    private UserIdQueriers()
    {
    }

    public static UserIdQuerier getQuerier()
    {
        if (UIUtil.isAmazon(AbstractTwcApplication.getRootContext()))
        {
            return KINDLE_QUERIER;
        } else
        {
            return GOOGLE_PLAY_QUERIER;
        }
    }

}
