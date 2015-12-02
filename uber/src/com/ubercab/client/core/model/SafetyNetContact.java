// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class SafetyNetContact
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final SafetyNetContact createFromParcel(Parcel parcel)
        {
            return new SafetyNetContact(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final SafetyNetContact[] newArray(int i)
        {
            return new SafetyNetContact[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    String id;
    String name;
    String phone;

    public SafetyNetContact()
    {
    }

    private SafetyNetContact(Parcel parcel)
    {
        id = parcel.readString();
        name = parcel.readString();
        phone = parcel.readString();
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
            obj = (SafetyNetContact)obj;
            if (id == null ? ((SafetyNetContact) (obj)).id != null : !id.equals(((SafetyNetContact) (obj)).id))
            {
                return false;
            }
            if (name == null ? ((SafetyNetContact) (obj)).name != null : !name.equals(((SafetyNetContact) (obj)).name))
            {
                return false;
            }
            if (phone == null ? ((SafetyNetContact) (obj)).phone != null : !phone.equals(((SafetyNetContact) (obj)).phone))
            {
                return false;
            }
        }
        return true;
    }

    public final String getId()
    {
        return id;
    }

    public final String getName()
    {
        return name;
    }

    public final String getPhone()
    {
        return phone;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (id != null)
        {
            i = id.hashCode();
        } else
        {
            i = 0;
        }
        if (name != null)
        {
            j = name.hashCode();
        } else
        {
            j = 0;
        }
        if (phone != null)
        {
            k = phone.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(id);
        parcel.writeString(name);
        parcel.writeString(phone);
    }

}
