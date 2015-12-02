// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;
import android.os.Parcelable;

class ClientTransaction
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final ClientTransaction createFromParcel(Parcel parcel)
        {
            return new ClientTransaction(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ClientTransaction[] newArray(int i)
        {
            return new ClientTransaction[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    String amount;
    String amount_string;

    public ClientTransaction()
    {
    }

    private ClientTransaction(Parcel parcel)
    {
        amount_string = parcel.readString();
        amount = parcel.readString();
    }


    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ClientTransaction)obj;
            if (amount == null ? ((ClientTransaction) (obj)).amount != null : !amount.equals(((ClientTransaction) (obj)).amount))
            {
                return false;
            }
            if (amount_string == null ? ((ClientTransaction) (obj)).amount_string != null : !amount_string.equals(((ClientTransaction) (obj)).amount_string))
            {
                return false;
            }
        }
        return true;
    }

    public String getAmount()
    {
        return amount;
    }

    public String getAmountString()
    {
        return amount_string;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (amount_string != null)
        {
            i = amount_string.hashCode();
        } else
        {
            i = 0;
        }
        if (amount != null)
        {
            j = amount.hashCode();
        }
        return i * 31 + j;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(amount_string);
        parcel.writeString(amount);
    }

}
