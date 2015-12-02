// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.security.class1.Class1;
import com.security.class3.Class3;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.rider.realtime.request.param.DeviceData;
import java.util.HashMap;
import java.util.Map;

public final class dcb
{

    public dcb()
    {
    }

    static DeviceData a(Application application, Class1 class1, Class3 class3)
    {
        DeviceData devicedata = DeviceData.create().setAndroidId(cwt.i(application));
        cwv.a(application);
        devicedata = devicedata.setEmulator(cww.a()).setCarrier(cwt.k(application)).setCarrierMcc(cwt.b(application)).setCarrierMnc(cwt.c(application)).setPhoneNumber(cwt.d(application)).setCpuAbi(cwt.d()).setRooted(cxd.a(application).a()).setDeviceModel(cwt.f()).setDeviceOs(cwt.e());
        HashMap hashmap = new HashMap();
        try
        {
            hashmap.put("permId", class3.Method5());
            hashmap.put("authId", class1.Method5());
        }
        // Misplaced declaration of an exception variable
        catch (Class1 class1) { }
        // Misplaced declaration of an exception variable
        catch (Class1 class1) { }
        hashmap.put("deviceImei", cwt.f(application));
        devicedata.setDeviceIds(hashmap).setImsi(cwt.g(application)).setSimSerial(cwt.h(application));
        return devicedata;
    }

    final hjn a(Application application, dak dak, dao dao, hsq hsq)
    {
        return new hjn(hsq, application, dao, dak) {

            final hsq a;
            final Application b;
            final dao c;
            final dak d;
            final dcb e;

            private DeviceData b()
            {
                double d2 = 0.0D;
                DeviceData devicedata = ((DeviceData)a.a()).setIpAddress(cwt.o(b)).setWifiConnected(cwt.n(b)).setBatteryStatus(cwt.p(b)).setBatteryLevel(cwt.q(b));
                Object obj;
                if (c.q())
                {
                    obj = c.r();
                } else
                {
                    obj = "3.76.4";
                }
                devicedata.setVersion(((String) (obj)));
                obj = d.c();
                if (obj != null)
                {
                    double d1;
                    if (((RiderLocation) (obj)).getUberLatLng() != null)
                    {
                        d1 = ((RiderLocation) (obj)).getUberLatLng().a();
                        d2 = ((RiderLocation) (obj)).getUberLatLng().b();
                    } else
                    {
                        d1 = 0.0D;
                    }
                    ((DeviceData)a.a()).setHorizontalAccuracy(((RiderLocation) (obj)).getAccuracy()).setDeviceAltitude(((RiderLocation) (obj)).getAltitude()).setCourse(((RiderLocation) (obj)).getBearing()).setDeviceLatitude(d1).setDeviceLongitude(d2).setSpeed(((RiderLocation) (obj)).getSpeed());
                }
                ((DeviceData)a.a()).setMockGpsOn(cwt.r(b)).setUnknownSources(cwt.m(b)).setLocationServiceEnabled(dxf.a(b));
                return (DeviceData)a.a();
            }

            public final Object a()
            {
                return b();
            }

            
            {
                e = dcb.this;
                a = hsq1;
                b = application;
                c = dao1;
                d = dak1;
                super();
            }
        };
    }
}
