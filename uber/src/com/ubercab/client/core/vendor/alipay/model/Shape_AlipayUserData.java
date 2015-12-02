// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.alipay.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.vendor.alipay.model:
//            AlipayUserData

public final class Shape_AlipayUserData extends AlipayUserData
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final AlipayUserData createFromParcel(Parcel parcel)
        {
            return new Shape_AlipayUserData(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final AlipayUserData[] newArray(int i)
        {
            return new AlipayUserData[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/vendor/alipay/model/Shape_AlipayUserData.getClassLoader();
    private Long expireIn;
    private AlipayUserData.SignupRequired signupRequired;
    private String thirdPartyToken;
    private String thirdPartyType;

    Shape_AlipayUserData()
    {
    }

    private Shape_AlipayUserData(Parcel parcel)
    {
        expireIn = (Long)parcel.readValue(PARCELABLE_CL);
        signupRequired = (AlipayUserData.SignupRequired)parcel.readValue(PARCELABLE_CL);
        thirdPartyToken = (String)parcel.readValue(PARCELABLE_CL);
        thirdPartyType = (String)parcel.readValue(PARCELABLE_CL);
    }


    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AlipayUserData)obj;
            if (((AlipayUserData) (obj)).getExpireIn() == null ? getExpireIn() != null : !((AlipayUserData) (obj)).getExpireIn().equals(getExpireIn()))
            {
                return false;
            }
            if (((AlipayUserData) (obj)).getSignupRequired() == null ? getSignupRequired() != null : !((AlipayUserData) (obj)).getSignupRequired().equals(getSignupRequired()))
            {
                return false;
            }
            if (((AlipayUserData) (obj)).getThirdPartyToken() == null ? getThirdPartyToken() != null : !((AlipayUserData) (obj)).getThirdPartyToken().equals(getThirdPartyToken()))
            {
                return false;
            }
            if (((AlipayUserData) (obj)).getThirdPartyType() == null ? getThirdPartyType() != null : !((AlipayUserData) (obj)).getThirdPartyType().equals(getThirdPartyType()))
            {
                return false;
            }
        }
        return true;
    }

    public final Long getExpireIn()
    {
        return expireIn;
    }

    public final AlipayUserData.SignupRequired getSignupRequired()
    {
        return signupRequired;
    }

    public final String getThirdPartyToken()
    {
        return thirdPartyToken;
    }

    public final String getThirdPartyType()
    {
        return thirdPartyType;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (expireIn == null)
        {
            i = 0;
        } else
        {
            i = expireIn.hashCode();
        }
        if (signupRequired == null)
        {
            j = 0;
        } else
        {
            j = signupRequired.hashCode();
        }
        if (thirdPartyToken == null)
        {
            k = 0;
        } else
        {
            k = thirdPartyToken.hashCode();
        }
        if (thirdPartyType != null)
        {
            l = thirdPartyType.hashCode();
        }
        return (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l;
    }

    final AlipayUserData setExpireIn(Long long1)
    {
        expireIn = long1;
        return this;
    }

    final AlipayUserData setSignupRequired(AlipayUserData.SignupRequired signuprequired)
    {
        signupRequired = signuprequired;
        return this;
    }

    final AlipayUserData setThirdPartyToken(String s)
    {
        thirdPartyToken = s;
        return this;
    }

    final AlipayUserData setThirdPartyType(String s)
    {
        thirdPartyType = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("AlipayUserData{expireIn=")).append(expireIn).append(", signupRequired=").append(signupRequired).append(", thirdPartyToken=").append(thirdPartyToken).append(", thirdPartyType=").append(thirdPartyType).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(expireIn);
        parcel.writeValue(signupRequired);
        parcel.writeValue(thirdPartyToken);
        parcel.writeValue(thirdPartyType);
    }

}
