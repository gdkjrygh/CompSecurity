// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            SafetyNetDeleteContactsResponse

public final class Shape_SafetyNetDeleteContactsResponse extends SafetyNetDeleteContactsResponse
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final SafetyNetDeleteContactsResponse createFromParcel(Parcel parcel)
        {
            return new Shape_SafetyNetDeleteContactsResponse(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final SafetyNetDeleteContactsResponse[] newArray(int i)
        {
            return new SafetyNetDeleteContactsResponse[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_SafetyNetDeleteContactsResponse.getClassLoader();
    private List contacts;

    Shape_SafetyNetDeleteContactsResponse()
    {
    }

    private Shape_SafetyNetDeleteContactsResponse(Parcel parcel)
    {
        contacts = (List)parcel.readValue(PARCELABLE_CL);
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
            obj = (SafetyNetDeleteContactsResponse)obj;
            if (((SafetyNetDeleteContactsResponse) (obj)).getContacts() == null ? getContacts() != null : !((SafetyNetDeleteContactsResponse) (obj)).getContacts().equals(getContacts()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getContacts()
    {
        return contacts;
    }

    public final int hashCode()
    {
        int i;
        if (contacts == null)
        {
            i = 0;
        } else
        {
            i = contacts.hashCode();
        }
        return i ^ 0xf4243;
    }

    final SafetyNetDeleteContactsResponse setContacts(List list)
    {
        contacts = list;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("SafetyNetDeleteContactsResponse{contacts=")).append(contacts).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(contacts);
    }

}
