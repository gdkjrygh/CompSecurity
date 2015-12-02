// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.location;

import android.os.Parcel;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.location:
//            RiderAddressComponent

public final class Shape_RiderAddressComponent extends RiderAddressComponent
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static RiderAddressComponent a(Parcel parcel)
        {
            return new Shape_RiderAddressComponent(parcel, (byte)0);
        }

        private static RiderAddressComponent[] a(int i)
        {
            return new RiderAddressComponent[i];
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
    private static final ClassLoader a = com/ubercab/client/core/location/Shape_RiderAddressComponent.getClassLoader();
    private String b;
    private String c;
    private List d;

    Shape_RiderAddressComponent()
    {
    }

    private Shape_RiderAddressComponent(Parcel parcel)
    {
        b = (String)parcel.readValue(a);
        c = (String)parcel.readValue(a);
        d = (List)parcel.readValue(a);
    }

    Shape_RiderAddressComponent(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public final RiderAddressComponent a(String s)
    {
        b = s;
        return this;
    }

    public final RiderAddressComponent a(List list)
    {
        d = list;
        return this;
    }

    public final RiderAddressComponent b(String s)
    {
        c = s;
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
            obj = (RiderAddressComponent)obj;
            if (((RiderAddressComponent) (obj)).getLongName() == null ? getLongName() != null : !((RiderAddressComponent) (obj)).getLongName().equals(getLongName()))
            {
                return false;
            }
            if (((RiderAddressComponent) (obj)).getShortName() == null ? getShortName() != null : !((RiderAddressComponent) (obj)).getShortName().equals(getShortName()))
            {
                return false;
            }
            if (((RiderAddressComponent) (obj)).getTypes() == null ? getTypes() != null : !((RiderAddressComponent) (obj)).getTypes().equals(getTypes()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getLongName()
    {
        return b;
    }

    public final String getShortName()
    {
        return c;
    }

    public final List getTypes()
    {
        return d;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
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
        if (d != null)
        {
            k = d.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    public final String toString()
    {
        return (new StringBuilder("RiderAddressComponent{longName=")).append(b).append(", shortName=").append(c).append(", types=").append(d).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(b);
        parcel.writeValue(c);
        parcel.writeValue(d);
    }

}
