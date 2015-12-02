// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.alipay.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.vendor.alipay.model:
//            AlipayAuthResult

public final class Shape_AlipayAuthResult extends AlipayAuthResult
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final AlipayAuthResult createFromParcel(Parcel parcel)
        {
            return new Shape_AlipayAuthResult(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final AlipayAuthResult[] newArray(int i)
        {
            return new AlipayAuthResult[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/vendor/alipay/model/Shape_AlipayAuthResult.getClassLoader();
    private String alipayOpenId;
    private String authCode;
    private String memo;
    private String result;
    private String resultCode;
    private String resultStatus;

    Shape_AlipayAuthResult()
    {
    }

    private Shape_AlipayAuthResult(Parcel parcel)
    {
        alipayOpenId = (String)parcel.readValue(PARCELABLE_CL);
        authCode = (String)parcel.readValue(PARCELABLE_CL);
        memo = (String)parcel.readValue(PARCELABLE_CL);
        result = (String)parcel.readValue(PARCELABLE_CL);
        resultCode = (String)parcel.readValue(PARCELABLE_CL);
        resultStatus = (String)parcel.readValue(PARCELABLE_CL);
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
            obj = (AlipayAuthResult)obj;
            if (((AlipayAuthResult) (obj)).getAlipayOpenId() == null ? getAlipayOpenId() != null : !((AlipayAuthResult) (obj)).getAlipayOpenId().equals(getAlipayOpenId()))
            {
                return false;
            }
            if (((AlipayAuthResult) (obj)).getAuthCode() == null ? getAuthCode() != null : !((AlipayAuthResult) (obj)).getAuthCode().equals(getAuthCode()))
            {
                return false;
            }
            if (((AlipayAuthResult) (obj)).getMemo() == null ? getMemo() != null : !((AlipayAuthResult) (obj)).getMemo().equals(getMemo()))
            {
                return false;
            }
            if (((AlipayAuthResult) (obj)).getResult() == null ? getResult() != null : !((AlipayAuthResult) (obj)).getResult().equals(getResult()))
            {
                return false;
            }
            if (((AlipayAuthResult) (obj)).getResultCode() == null ? getResultCode() != null : !((AlipayAuthResult) (obj)).getResultCode().equals(getResultCode()))
            {
                return false;
            }
            if (((AlipayAuthResult) (obj)).getResultStatus() == null ? getResultStatus() != null : !((AlipayAuthResult) (obj)).getResultStatus().equals(getResultStatus()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getAlipayOpenId()
    {
        return alipayOpenId;
    }

    public final String getAuthCode()
    {
        return authCode;
    }

    public final String getMemo()
    {
        return memo;
    }

    public final String getResult()
    {
        return result;
    }

    public final String getResultCode()
    {
        return resultCode;
    }

    public final String getResultStatus()
    {
        return resultStatus;
    }

    public final int hashCode()
    {
        int j1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (alipayOpenId == null)
        {
            i = 0;
        } else
        {
            i = alipayOpenId.hashCode();
        }
        if (authCode == null)
        {
            j = 0;
        } else
        {
            j = authCode.hashCode();
        }
        if (memo == null)
        {
            k = 0;
        } else
        {
            k = memo.hashCode();
        }
        if (result == null)
        {
            l = 0;
        } else
        {
            l = result.hashCode();
        }
        if (resultCode == null)
        {
            i1 = 0;
        } else
        {
            i1 = resultCode.hashCode();
        }
        if (resultStatus != null)
        {
            j1 = resultStatus.hashCode();
        }
        return (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ j1;
    }

    public final AlipayAuthResult setAlipayOpenId(String s)
    {
        alipayOpenId = s;
        return this;
    }

    public final AlipayAuthResult setAuthCode(String s)
    {
        authCode = s;
        return this;
    }

    public final AlipayAuthResult setMemo(String s)
    {
        memo = s;
        return this;
    }

    public final AlipayAuthResult setResult(String s)
    {
        result = s;
        return this;
    }

    public final AlipayAuthResult setResultCode(String s)
    {
        resultCode = s;
        return this;
    }

    public final AlipayAuthResult setResultStatus(String s)
    {
        resultStatus = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("AlipayAuthResult{alipayOpenId=")).append(alipayOpenId).append(", authCode=").append(authCode).append(", memo=").append(memo).append(", result=").append(result).append(", resultCode=").append(resultCode).append(", resultStatus=").append(resultStatus).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(alipayOpenId);
        parcel.writeValue(authCode);
        parcel.writeValue(memo);
        parcel.writeValue(result);
        parcel.writeValue(resultCode);
        parcel.writeValue(resultStatus);
    }

}
