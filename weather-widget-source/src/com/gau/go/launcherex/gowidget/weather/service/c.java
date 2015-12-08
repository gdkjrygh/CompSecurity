// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service:
//            b, d

public abstract class c extends Binder
    implements b
{

    public c()
    {
        attachInterface(this, "com.gau.go.launcherex.gowidget.weather.service.IRemoteServiceCallback");
    }

    public static b a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.gau.go.launcherex.gowidget.weather.service.IRemoteServiceCallback");
        if (iinterface != null && (iinterface instanceof b))
        {
            return (b)iinterface;
        } else
        {
            return new d(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        WeatherBean weatherbean = null;
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.gau.go.launcherex.gowidget.weather.service.IRemoteServiceCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IRemoteServiceCallback");
            a(parcel.readInt(), parcel.createTypedArrayList(WeatherBean.CREATOR));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IRemoteServiceCallback");
            a(parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IRemoteServiceCallback");
            a(parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IRemoteServiceCallback");
            if (parcel.readInt() != 0)
            {
                weatherbean = (WeatherBean)WeatherBean.CREATOR.createFromParcel(parcel);
            }
            a(weatherbean);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IRemoteServiceCallback");
            a(parcel.createStringArrayList());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IRemoteServiceCallback");
            WeatherBean weatherbean1 = obj;
            if (parcel.readInt() != 0)
            {
                weatherbean1 = (WeatherBean)WeatherBean.CREATOR.createFromParcel(parcel);
            }
            b(weatherbean1);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IRemoteServiceCallback");
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IRemoteServiceCallback");
            break;
        }
        if (parcel.readInt() != 0)
        {
            flag = true;
        }
        b(flag);
        parcel1.writeNoException();
        return true;
    }
}
