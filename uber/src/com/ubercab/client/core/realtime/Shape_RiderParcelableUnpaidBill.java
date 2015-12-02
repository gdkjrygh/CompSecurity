// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.realtime;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.realtime:
//            RiderParcelableUnpaidBill

public final class Shape_RiderParcelableUnpaidBill extends RiderParcelableUnpaidBill
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static RiderParcelableUnpaidBill a(Parcel parcel)
        {
            return new Shape_RiderParcelableUnpaidBill(parcel, (byte)0);
        }

        private static RiderParcelableUnpaidBill[] a(int i)
        {
            return new RiderParcelableUnpaidBill[i];
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public final Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private static final ClassLoader a = com/ubercab/client/core/realtime/Shape_RiderParcelableUnpaidBill.getClassLoader();
    private String b;
    private String c;
    private String d;
    private String e;

    Shape_RiderParcelableUnpaidBill()
    {
    }

    private Shape_RiderParcelableUnpaidBill(Parcel parcel)
    {
        b = (String)parcel.readValue(a);
        c = (String)parcel.readValue(a);
        d = (String)parcel.readValue(a);
        e = (String)parcel.readValue(a);
    }

    Shape_RiderParcelableUnpaidBill(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    final RiderParcelableUnpaidBill a(String s)
    {
        b = s;
        return this;
    }

    final RiderParcelableUnpaidBill b(String s)
    {
        c = s;
        return this;
    }

    final RiderParcelableUnpaidBill c(String s)
    {
        d = s;
        return this;
    }

    final RiderParcelableUnpaidBill d(String s)
    {
        e = s;
        return this;
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
            obj = (RiderParcelableUnpaidBill)obj;
            if (((RiderParcelableUnpaidBill) (obj)).getAmount() == null ? getAmount() != null : !((RiderParcelableUnpaidBill) (obj)).getAmount().equals(getAmount()))
            {
                return false;
            }
            if (((RiderParcelableUnpaidBill) (obj)).getAmountString() == null ? getAmountString() != null : !((RiderParcelableUnpaidBill) (obj)).getAmountString().equals(getAmountString()))
            {
                return false;
            }
            if (((RiderParcelableUnpaidBill) (obj)).getCreatedAt() == null ? getCreatedAt() != null : !((RiderParcelableUnpaidBill) (obj)).getCreatedAt().equals(getCreatedAt()))
            {
                return false;
            }
            if (((RiderParcelableUnpaidBill) (obj)).getUuid() == null ? getUuid() != null : !((RiderParcelableUnpaidBill) (obj)).getUuid().equals(getUuid()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getAmount()
    {
        return b;
    }

    public final String getAmountString()
    {
        return c;
    }

    public final String getCreatedAt()
    {
        return d;
    }

    public final String getUuid()
    {
        return e;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.hashCode();
        }
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.hashCode();
        }
        if (e != null)
        {
            l = e.hashCode();
        }
        return (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l;
    }

    public final String toString()
    {
        return (new StringBuilder("RiderParcelableUnpaidBill{amount=")).append(b).append(", amountString=").append(c).append(", createdAt=").append(d).append(", uuid=").append(e).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(b);
        parcel.writeValue(c);
        parcel.writeValue(d);
        parcel.writeValue(e);
    }

}
