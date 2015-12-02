// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.response.BootstrapRider;
import com.ubercab.rider.realtime.response.Status;

public final class dox
{

    private final hji a;

    public dox(hji hji1)
    {
        a = hji1;
    }

    public final BootstrapRider a()
    {
        Object obj = (hkq)a.getData();
        java.util.Map map = ((hkq) (obj)).getAppConfig();
        hky hky = ((hkq) (obj)).getCity();
        hkz hkz = ((hkq) (obj)).getClient();
        hla hla = ((hkq) (obj)).getClientStatus();
        java.util.List list = ((hkq) (obj)).getExperiments();
        hlh hlh = ((hkq) (obj)).getEyeball();
        obj = ((hkq) (obj)).getTrip();
        if (hla == null)
        {
            return null;
        } else
        {
            return BootstrapRider.create(map, hky, hkz, Status.create(map, hky, hla, list, hlh, ((com.ubercab.rider.realtime.model.Trip) (obj))));
        }
    }
}
