// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.WidgetSettingBean;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service:
//            e, g, c

public abstract class f extends Binder
    implements e
{

    public f()
    {
        attachInterface(this, "com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
    }

    public static e a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
        if (iinterface != null && (iinterface instanceof e))
        {
            return (e)iinterface;
        } else
        {
            return new g(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag1 = false;
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
            a(c.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
            b(c.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
            parcel = a();
            parcel1.writeNoException();
            parcel1.writeTypedList(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
            parcel = b();
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 5: // '\005'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
            parcel = a(parcel.readString());
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
            parcel = c();
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 7: // '\007'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
            parcel = a(parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
            boolean flag2 = d();
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag2)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
            boolean flag3 = e();
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            if (flag3)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
            a(parcel.readInt(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
            b(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.gau.go.launcherex.gowidget.weather.service.IWeatherService");
            a(parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;
        }
    }
}
