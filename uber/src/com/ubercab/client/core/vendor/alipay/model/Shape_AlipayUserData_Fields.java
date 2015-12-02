// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.alipay.model;


public final class Shape_AlipayUserData_Fields extends AlipayUserData.Fields
{

    private boolean isIdAuth;
    private String mobile;
    private String mobileCountryIso2;
    private String userId;

    Shape_AlipayUserData_Fields()
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
            obj = (AlipayUserData.Fields)obj;
            if (((AlipayUserData.Fields) (obj)).getIsIdAuth() != getIsIdAuth())
            {
                return false;
            }
            if (((AlipayUserData.Fields) (obj)).getMobile() == null ? getMobile() != null : !((AlipayUserData.Fields) (obj)).getMobile().equals(getMobile()))
            {
                return false;
            }
            if (((AlipayUserData.Fields) (obj)).getMobileCountryIso2() == null ? getMobileCountryIso2() != null : !((AlipayUserData.Fields) (obj)).getMobileCountryIso2().equals(getMobileCountryIso2()))
            {
                return false;
            }
            if (((AlipayUserData.Fields) (obj)).getUserId() == null ? getUserId() != null : !((AlipayUserData.Fields) (obj)).getUserId().equals(getUserId()))
            {
                return false;
            }
        }
        return true;
    }

    public final boolean getIsIdAuth()
    {
        return isIdAuth;
    }

    public final String getMobile()
    {
        return mobile;
    }

    public final String getMobileCountryIso2()
    {
        return mobileCountryIso2;
    }

    public final String getUserId()
    {
        return userId;
    }

    public final int hashCode()
    {
        int k = 0;
        char c;
        int i;
        int j;
        if (isIdAuth)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (mobile == null)
        {
            i = 0;
        } else
        {
            i = mobile.hashCode();
        }
        if (mobileCountryIso2 == null)
        {
            j = 0;
        } else
        {
            j = mobileCountryIso2.hashCode();
        }
        if (userId != null)
        {
            k = userId.hashCode();
        }
        return (j ^ (i ^ (c ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    final AlipayUserData.Fields setIsIdAuth(boolean flag)
    {
        isIdAuth = flag;
        return this;
    }

    final AlipayUserData.Fields setMobile(String s)
    {
        mobile = s;
        return this;
    }

    final AlipayUserData.Fields setMobileCountryIso2(String s)
    {
        mobileCountryIso2 = s;
        return this;
    }

    final AlipayUserData.Fields setUserId(String s)
    {
        userId = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("AlipayUserData.Fields{isIdAuth=")).append(isIdAuth).append(", mobile=").append(mobile).append(", mobileCountryIso2=").append(mobileCountryIso2).append(", userId=").append(userId).append("}").toString();
    }
}
