// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            MobileVerificationRequest

public final class Shape_MobileVerificationRequest extends MobileVerificationRequest
{

    private String country_iso2;
    private String locale;
    private String strategy;
    private String user_uuid;

    Shape_MobileVerificationRequest()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (MobileVerificationRequest)obj;
            if (((MobileVerificationRequest) (obj)).getUserUuid() == null ? getUserUuid() != null : !((MobileVerificationRequest) (obj)).getUserUuid().equals(getUserUuid()))
            {
                return false;
            }
            if (((MobileVerificationRequest) (obj)).getStrategy() == null ? getStrategy() != null : !((MobileVerificationRequest) (obj)).getStrategy().equals(getStrategy()))
            {
                return false;
            }
            if (((MobileVerificationRequest) (obj)).getLocale() == null ? getLocale() != null : !((MobileVerificationRequest) (obj)).getLocale().equals(getLocale()))
            {
                return false;
            }
            if (((MobileVerificationRequest) (obj)).getCountryIso2() == null ? getCountryIso2() != null : !((MobileVerificationRequest) (obj)).getCountryIso2().equals(getCountryIso2()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getCountryIso2()
    {
        return country_iso2;
    }

    public final String getLocale()
    {
        return locale;
    }

    public final String getStrategy()
    {
        return strategy;
    }

    public final String getUserUuid()
    {
        return user_uuid;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (user_uuid == null)
        {
            i = 0;
        } else
        {
            i = user_uuid.hashCode();
        }
        if (strategy == null)
        {
            j = 0;
        } else
        {
            j = strategy.hashCode();
        }
        if (locale == null)
        {
            k = 0;
        } else
        {
            k = locale.hashCode();
        }
        if (country_iso2 != null)
        {
            l = country_iso2.hashCode();
        }
        return (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l;
    }

    final MobileVerificationRequest setCountryIso2(String s)
    {
        country_iso2 = s;
        return this;
    }

    final MobileVerificationRequest setLocale(String s)
    {
        locale = s;
        return this;
    }

    final MobileVerificationRequest setStrategy(String s)
    {
        strategy = s;
        return this;
    }

    final MobileVerificationRequest setUserUuid(String s)
    {
        user_uuid = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("MobileVerificationRequest{user_uuid=")).append(user_uuid).append(", strategy=").append(strategy).append(", locale=").append(locale).append(", country_iso2=").append(country_iso2).append("}").toString();
    }
}
