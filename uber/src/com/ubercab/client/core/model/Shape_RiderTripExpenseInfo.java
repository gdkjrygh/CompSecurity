// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            RiderTripExpenseInfo

public final class Shape_RiderTripExpenseInfo extends RiderTripExpenseInfo
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final RiderTripExpenseInfo createFromParcel(Parcel parcel)
        {
            return new Shape_RiderTripExpenseInfo(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final RiderTripExpenseInfo[] newArray(int i)
        {
            return new RiderTripExpenseInfo[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_RiderTripExpenseInfo.getClassLoader();
    private String code;
    private boolean expenseTrip;
    private String memo;

    Shape_RiderTripExpenseInfo()
    {
    }

    private Shape_RiderTripExpenseInfo(Parcel parcel)
    {
        expenseTrip = ((Boolean)parcel.readValue(PARCELABLE_CL)).booleanValue();
        code = (String)parcel.readValue(PARCELABLE_CL);
        memo = (String)parcel.readValue(PARCELABLE_CL);
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
            obj = (RiderTripExpenseInfo)obj;
            if (((RiderTripExpenseInfo) (obj)).isExpenseTrip() != isExpenseTrip())
            {
                return false;
            }
            if (((RiderTripExpenseInfo) (obj)).getCode() == null ? getCode() != null : !((RiderTripExpenseInfo) (obj)).getCode().equals(getCode()))
            {
                return false;
            }
            if (((RiderTripExpenseInfo) (obj)).getMemo() == null ? getMemo() != null : !((RiderTripExpenseInfo) (obj)).getMemo().equals(getMemo()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getCode()
    {
        return code;
    }

    public final String getMemo()
    {
        return memo;
    }

    public final int hashCode()
    {
        int j = 0;
        char c;
        int i;
        if (expenseTrip)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (code == null)
        {
            i = 0;
        } else
        {
            i = code.hashCode();
        }
        if (memo != null)
        {
            j = memo.hashCode();
        }
        return (i ^ (c ^ 0xf4243) * 0xf4243) * 0xf4243 ^ j;
    }

    public final boolean isExpenseTrip()
    {
        return expenseTrip;
    }

    public final void setCode(String s)
    {
        code = s;
    }

    public final void setExpenseTrip(boolean flag)
    {
        expenseTrip = flag;
    }

    public final void setMemo(String s)
    {
        memo = s;
    }

    public final String toString()
    {
        return (new StringBuilder("RiderTripExpenseInfo{expenseTrip=")).append(expenseTrip).append(", code=").append(code).append(", memo=").append(memo).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(Boolean.valueOf(expenseTrip));
        parcel.writeValue(code);
        parcel.writeValue(memo);
    }

}
