// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            UnpaidBill, ClientTransaction

public final class Shape_UnpaidBill extends UnpaidBill
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final UnpaidBill createFromParcel(Parcel parcel)
        {
            return new Shape_UnpaidBill(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final UnpaidBill[] newArray(int i)
        {
            return new UnpaidBill[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_UnpaidBill.getClassLoader();
    private ClientTransaction client_transaction;
    private String uuid;

    Shape_UnpaidBill()
    {
    }

    private Shape_UnpaidBill(Parcel parcel)
    {
        uuid = (String)parcel.readValue(PARCELABLE_CL);
        client_transaction = (ClientTransaction)parcel.readValue(PARCELABLE_CL);
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
            obj = (UnpaidBill)obj;
            if (((UnpaidBill) (obj)).getUuid() == null ? getUuid() != null : !((UnpaidBill) (obj)).getUuid().equals(getUuid()))
            {
                return false;
            }
            if (((UnpaidBill) (obj)).getClientTransaction() == null ? getClientTransaction() != null : !((UnpaidBill) (obj)).getClientTransaction().equals(getClientTransaction()))
            {
                return false;
            }
        }
        return true;
    }

    final ClientTransaction getClientTransaction()
    {
        return client_transaction;
    }

    public final String getUuid()
    {
        return uuid;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (uuid == null)
        {
            i = 0;
        } else
        {
            i = uuid.hashCode();
        }
        if (client_transaction != null)
        {
            j = client_transaction.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final UnpaidBill setClientTransaction(ClientTransaction clienttransaction)
    {
        client_transaction = clienttransaction;
        return this;
    }

    final UnpaidBill setUuid(String s)
    {
        uuid = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.core.model.UnpaidBill{uuid=")).append(uuid).append(", client_transaction=").append(client_transaction).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(uuid);
        parcel.writeValue(client_transaction);
    }

}
