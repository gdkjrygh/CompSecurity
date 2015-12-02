// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.config.AppConfigKey;
import com.ubercab.client.core.model.AppConfig;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.RiderAppConfig;
import com.ubercab.client.core.model.TaggedLocationDistanceConstraints;

public final class drc
{

    private final dqt a;
    private final gmg b;
    private final daj c;
    private final dpg d;

    public drc(dqt dqt1, gmg gmg1, daj daj1, dpg dpg1)
    {
        a = dqt1;
        b = gmg1;
        c = daj1;
        d = dpg1;
    }

    private AppConfig l()
    {
        Ping ping = c.b();
        if (ping != null)
        {
            return ping.getAppConfig();
        } else
        {
            return null;
        }
    }

    private RiderAppConfig m()
    {
        AppConfig appconfig = l();
        if (appconfig != null)
        {
            return appconfig.getRiderConfig();
        } else
        {
            return null;
        }
    }

    private boolean n()
    {
        return !d.n() && b.a(dbf.cB);
    }

    public final Integer a()
    {
        if (n())
        {
            AppConfig appconfig = l();
            if (appconfig != null)
            {
                return appconfig.getEmergencyNumber();
            } else
            {
                return null;
            }
        } else
        {
            return a.b(AppConfigKey.e);
        }
    }

    public final String b()
    {
        String s = null;
        if (n())
        {
            RiderAppConfig riderappconfig = m();
            if (riderappconfig != null)
            {
                s = riderappconfig.getSurgeRationale();
            }
            return s;
        } else
        {
            return a.a(com.ubercab.client.core.config.AppConfigKey.Rider.d, null);
        }
    }

    public final String c()
    {
        String s = null;
        if (n())
        {
            RiderAppConfig riderappconfig = m();
            if (riderappconfig != null)
            {
                s = riderappconfig.getSliderStyle();
            }
            return s;
        } else
        {
            return a.a(com.ubercab.client.core.config.AppConfigKey.Rider.e, null);
        }
    }

    public final TaggedLocationDistanceConstraints d()
    {
        TaggedLocationDistanceConstraints taggedlocationdistanceconstraints = null;
        if (n())
        {
            RiderAppConfig riderappconfig = m();
            if (riderappconfig != null)
            {
                taggedlocationdistanceconstraints = riderappconfig.getTaggedLocationDistanceConstraints();
            }
        } else
        {
            Integer integer = a.b(com.ubercab.client.core.config.AppConfigKey.Rider.FavoriteLocationDistanceConstraints.a);
            Integer integer1 = a.b(com.ubercab.client.core.config.AppConfigKey.Rider.FavoriteLocationDistanceConstraints.b);
            Integer integer2 = a.b(com.ubercab.client.core.config.AppConfigKey.Rider.FavoriteLocationDistanceConstraints.c);
            if (integer != null || integer1 != null || integer2 != null)
            {
                TaggedLocationDistanceConstraints taggedlocationdistanceconstraints1 = new TaggedLocationDistanceConstraints();
                taggedlocationdistanceconstraints1.setMaximumDropoffDistanceInMeters(integer);
                taggedlocationdistanceconstraints1.setMaximumPickupDistanceInMeters(integer1);
                taggedlocationdistanceconstraints1.setMinimumDropoffDistanceInMeters(integer2);
                return taggedlocationdistanceconstraints1;
            }
        }
        return taggedlocationdistanceconstraints;
    }

    public final boolean e()
    {
        boolean flag1 = false;
        if (n())
        {
            AppConfig appconfig = l();
            boolean flag = flag1;
            if (appconfig != null)
            {
                flag = flag1;
                if (appconfig.isCallingDisabled())
                {
                    flag = true;
                }
            }
            return flag;
        } else
        {
            return a.a(AppConfigKey.a, false);
        }
    }

    public final boolean f()
    {
        if (n())
        {
            return false;
        } else
        {
            return a.a(AppConfigKey.f, false);
        }
    }

    public final boolean g()
    {
        boolean flag1 = false;
        if (n())
        {
            RiderAppConfig riderappconfig = m();
            boolean flag = flag1;
            if (riderappconfig != null)
            {
                flag = flag1;
                if (riderappconfig.isSafetyNetEnabled())
                {
                    flag = true;
                }
            }
            return flag;
        } else
        {
            return a.a(com.ubercab.client.core.config.AppConfigKey.Rider.a, false);
        }
    }

    public final boolean h()
    {
        boolean flag1 = false;
        if (n())
        {
            AppConfig appconfig = l();
            boolean flag = flag1;
            if (appconfig != null)
            {
                flag = flag1;
                if (appconfig.isSosIndiaEnabled())
                {
                    flag = true;
                }
            }
            return flag;
        } else
        {
            return a.a(AppConfigKey.i, false);
        }
    }

    public final boolean i()
    {
        boolean flag1 = false;
        if (n())
        {
            AppConfig appconfig = l();
            boolean flag = flag1;
            if (appconfig != null)
            {
                flag = flag1;
                if (appconfig.isTextMessagingDisabled())
                {
                    flag = true;
                }
            }
            return flag;
        } else
        {
            return a.a(AppConfigKey.c, false);
        }
    }

    public final boolean j()
    {
        boolean flag1 = false;
        if (n())
        {
            AppConfig appconfig = l();
            boolean flag = flag1;
            if (appconfig != null)
            {
                flag = flag1;
                if (appconfig.isUpfrontPricingEnabled())
                {
                    flag = true;
                }
            }
            return flag;
        } else
        {
            return a.a(AppConfigKey.j, false);
        }
    }

    public final boolean k()
    {
        boolean flag1 = false;
        if (n())
        {
            AppConfig appconfig = l();
            boolean flag = flag1;
            if (appconfig != null)
            {
                flag = flag1;
                if (appconfig.getVehicleInventoryViewDisabled())
                {
                    flag = true;
                }
            }
            return flag;
        } else
        {
            return a.a(AppConfigKey.d, false);
        }
    }
}
