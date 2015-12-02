// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import android.text.TextUtils;
import duj;
import gpq;
import java.util.Locale;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_RiderAccount

public abstract class RiderAccount
    implements Parcelable
{

    private static final String FAKE_EMAIL_DOMAIN_LOWER_CASE = "@fake.uberx.org";
    private static final String ROLE_CLIENT = "client";

    public RiderAccount()
    {
    }

    public static RiderAccount create()
    {
        return new Shape_RiderAccount();
    }

    public static RiderAccount create(String s, String s1, String s2)
    {
        return create().setFirstName(s).setLastName(s1).setPictureUrl(s2);
    }

    public static RiderAccount create(String s, String s1, String s2, String s3)
    {
        return create().setFirstName(s).setLastName(s1).setEmail(s2).setMobileLocal(s3);
    }

    public static RiderAccount create(String s, String s1, String s2, String s3, String s4)
    {
        return create().setFirstName(s).setLastName(s1).setEmail(s2).setMobileCountryIso2(s3).setMobile(s4);
    }

    public static boolean isFakedEmail(String s)
    {
        return s != null && s.toLowerCase().endsWith("@fake.uberx.org");
    }

    public abstract String getClaimedMobileLocal();

    public String getCurrentMobile()
    {
        if (!TextUtils.isEmpty(getMobile()))
        {
            return getMobile();
        } else
        {
            return duj.d(getClaimedMobileLocal(), getMobileCountryIso2());
        }
    }

    public abstract String getEmail();

    public abstract String getFirstName();

    public String getFullName()
    {
        return gpq.a(getFirstName(), getLastName(), Locale.getDefault());
    }

    public abstract String getLastName();

    public abstract String getMobile();

    public abstract String getMobileCountryIso2();

    public abstract String getMobileLocal();

    public abstract String getPictureUrl();

    public abstract String getProfileType();

    public abstract String getRole();

    public boolean isClient()
    {
        return "client".equals(getRole());
    }

    public abstract RiderAccount setClaimedMobileLocal(String s);

    public abstract RiderAccount setEmail(String s);

    public abstract RiderAccount setFirstName(String s);

    public abstract RiderAccount setLastName(String s);

    public abstract RiderAccount setMobile(String s);

    public abstract RiderAccount setMobileCountryIso2(String s);

    public abstract RiderAccount setMobileLocal(String s);

    public abstract RiderAccount setPictureUrl(String s);

    public abstract RiderAccount setProfileType(String s);

    public abstract RiderAccount setRole(String s);
}
