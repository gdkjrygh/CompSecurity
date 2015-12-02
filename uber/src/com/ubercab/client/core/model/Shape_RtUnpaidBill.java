// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            RtUnpaidBill

public final class Shape_RtUnpaidBill extends RtUnpaidBill
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final RtUnpaidBill createFromParcel(Parcel parcel)
        {
            return new Shape_RtUnpaidBill(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final RtUnpaidBill[] newArray(int i)
        {
            return new RtUnpaidBill[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_RtUnpaidBill.getClassLoader();
    private String amount;
    private String amountString;
    private String clientBillUuid;
    private String createdAt;
    private String tripUuid;

    Shape_RtUnpaidBill()
    {
    }

    private Shape_RtUnpaidBill(Parcel parcel)
    {
        clientBillUuid = (String)parcel.readValue(PARCELABLE_CL);
        amount = (String)parcel.readValue(PARCELABLE_CL);
        amountString = (String)parcel.readValue(PARCELABLE_CL);
        createdAt = (String)parcel.readValue(PARCELABLE_CL);
        tripUuid = (String)parcel.readValue(PARCELABLE_CL);
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
            obj = (RtUnpaidBill)obj;
            if (((RtUnpaidBill) (obj)).getClientBillUuid() == null ? getClientBillUuid() != null : !((RtUnpaidBill) (obj)).getClientBillUuid().equals(getClientBillUuid()))
            {
                return false;
            }
            if (((RtUnpaidBill) (obj)).getAmount() == null ? getAmount() != null : !((RtUnpaidBill) (obj)).getAmount().equals(getAmount()))
            {
                return false;
            }
            if (((RtUnpaidBill) (obj)).getAmountString() == null ? getAmountString() != null : !((RtUnpaidBill) (obj)).getAmountString().equals(getAmountString()))
            {
                return false;
            }
            if (((RtUnpaidBill) (obj)).getCreatedAt() == null ? getCreatedAt() != null : !((RtUnpaidBill) (obj)).getCreatedAt().equals(getCreatedAt()))
            {
                return false;
            }
            if (((RtUnpaidBill) (obj)).getTripUuid() == null ? getTripUuid() != null : !((RtUnpaidBill) (obj)).getTripUuid().equals(getTripUuid()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getAmount()
    {
        return amount;
    }

    public final String getAmountString()
    {
        return amountString;
    }

    public final String getClientBillUuid()
    {
        return clientBillUuid;
    }

    public final String getCreatedAt()
    {
        return createdAt;
    }

    public final String getTripUuid()
    {
        return tripUuid;
    }

    public final int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (clientBillUuid == null)
        {
            i = 0;
        } else
        {
            i = clientBillUuid.hashCode();
        }
        if (amount == null)
        {
            j = 0;
        } else
        {
            j = amount.hashCode();
        }
        if (amountString == null)
        {
            k = 0;
        } else
        {
            k = amountString.hashCode();
        }
        if (createdAt == null)
        {
            l = 0;
        } else
        {
            l = createdAt.hashCode();
        }
        if (tripUuid != null)
        {
            i1 = tripUuid.hashCode();
        }
        return (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ i1;
    }

    final RtUnpaidBill setAmount(String s)
    {
        amount = s;
        return this;
    }

    final RtUnpaidBill setAmountString(String s)
    {
        amountString = s;
        return this;
    }

    final RtUnpaidBill setClientBillUuid(String s)
    {
        clientBillUuid = s;
        return this;
    }

    final RtUnpaidBill setCreatedAt(String s)
    {
        createdAt = s;
        return this;
    }

    final RtUnpaidBill setTripUuid(String s)
    {
        tripUuid = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("RtUnpaidBill{clientBillUuid=")).append(clientBillUuid).append(", amount=").append(amount).append(", amountString=").append(amountString).append(", createdAt=").append(createdAt).append(", tripUuid=").append(tripUuid).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(clientBillUuid);
        parcel.writeValue(amount);
        parcel.writeValue(amountString);
        parcel.writeValue(createdAt);
        parcel.writeValue(tripUuid);
    }

}
