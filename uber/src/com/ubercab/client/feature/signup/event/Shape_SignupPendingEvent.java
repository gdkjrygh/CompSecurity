// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.event;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.feature.signup.event:
//            SignupPendingEvent

public final class Shape_SignupPendingEvent extends SignupPendingEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static SignupPendingEvent a(Parcel parcel)
        {
            return new Shape_SignupPendingEvent(parcel, (byte)0);
        }

        private static SignupPendingEvent[] a(int i)
        {
            return new SignupPendingEvent[i];
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
    private static final ClassLoader a = com/ubercab/client/feature/signup/event/Shape_SignupPendingEvent.getClassLoader();
    private String b;

    Shape_SignupPendingEvent()
    {
    }

    private Shape_SignupPendingEvent(Parcel parcel)
    {
        b = (String)parcel.readValue(a);
    }

    Shape_SignupPendingEvent(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    final SignupPendingEvent a(String s)
    {
        b = s;
        return this;
    }

    public final String a()
    {
        return b;
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
            obj = (SignupPendingEvent)obj;
            if (((SignupPendingEvent) (obj)).a() == null ? a() != null : !((SignupPendingEvent) (obj)).a().equals(a()))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        return i ^ 0xf4243;
    }

    public final String toString()
    {
        return (new StringBuilder("SignupPendingEvent{email=")).append(b).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(b);
    }

}
