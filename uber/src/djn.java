// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.mobileapptracker.MobileAppTracker;
import com.security.class1.Class1;
import com.security.class3.Class3;
import com.ubercab.client.core.network.SwitchProductApi;

public final class djn
{

    public djn()
    {
    }

    protected static dch a(cev cev, hkr hkr, hku hku, gmg gmg, dkd dkd, dpg dpg, dak dak)
    {
        return new dch(cev, hkr, hku, gmg, dkd, dpg, dak);
    }

    protected static dku a(cev cev, grs grs1, Application application, cyy cyy, gju gju, dak dak, MobileAppTracker mobileapptracker, Class1 class1, 
            Class3 class3, dao dao)
    {
        return new dku(cev, (SwitchProductApi)grs1.a(com/ubercab/client/core/network/SwitchProductApi), application, cyy, gju, dak, mobileapptracker, class1, class3, dao);
    }

    protected static fta a(chp chp, cev cev, hkr hkr, hku hku, gmg gmg, dkd dkd, dch dch1, hjm hjm, 
            dpa dpa, dpg dpg, dkn dkn, dak dak, fte fte1)
    {
        return new fta(chp, cev, hkr, hku, gmg, dkd, dch1, hjm, dpa, dpg, dkn, dak, fte1);
    }

    protected static fte a(chp chp, cyi cyi, cev cev, Application application, hkr hkr, hku hku, evt evt, ewh ewh, 
            dkd dkd, dpg dpg, dak dak, dal dal, gmg gmg)
    {
        return new fte(chp, cyi, cev, application, hkr, hku, evt, ewh, dkd, dpg, dak, dal, gmg);
    }
}
