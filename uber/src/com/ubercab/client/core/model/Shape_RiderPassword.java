// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            RiderPassword

public final class Shape_RiderPassword extends RiderPassword
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final RiderPassword createFromParcel(Parcel parcel)
        {
            return new Shape_RiderPassword(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final RiderPassword[] newArray(int i)
        {
            return new RiderPassword[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_RiderPassword.getClassLoader();
    private String app;
    private String device;
    private String password;

    Shape_RiderPassword()
    {
    }

    private Shape_RiderPassword(Parcel parcel)
    {
        app = (String)parcel.readValue(PARCELABLE_CL);
        device = (String)parcel.readValue(PARCELABLE_CL);
        password = (String)parcel.readValue(PARCELABLE_CL);
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
            obj = (RiderPassword)obj;
            if (((RiderPassword) (obj)).getApp() == null ? getApp() != null : !((RiderPassword) (obj)).getApp().equals(getApp()))
            {
                return false;
            }
            if (((RiderPassword) (obj)).getDevice() == null ? getDevice() != null : !((RiderPassword) (obj)).getDevice().equals(getDevice()))
            {
                return false;
            }
            if (((RiderPassword) (obj)).getPassword() == null ? getPassword() != null : !((RiderPassword) (obj)).getPassword().equals(getPassword()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getApp()
    {
        return app;
    }

    public final String getDevice()
    {
        return device;
    }

    public final String getPassword()
    {
        return password;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (app == null)
        {
            i = 0;
        } else
        {
            i = app.hashCode();
        }
        if (device == null)
        {
            j = 0;
        } else
        {
            j = device.hashCode();
        }
        if (password != null)
        {
            k = password.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    final RiderPassword setApp(String s)
    {
        app = s;
        return this;
    }

    final RiderPassword setDevice(String s)
    {
        device = s;
        return this;
    }

    final RiderPassword setPassword(String s)
    {
        password = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("RiderPassword{app=")).append(app).append(", device=").append(device).append(", password=").append(password).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(app);
        parcel.writeValue(device);
        parcel.writeValue(password);
    }

}
