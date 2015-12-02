// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.mobileapptracker.MobileAppTracker;
import com.security.class1.Class1;
import com.security.class3.Class3;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.AppConfig;
import com.ubercab.client.core.model.City;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.CnLocation;
import com.ubercab.client.core.model.Note;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.ProductGroup;
import com.ubercab.client.core.model.RiderAppConfig;
import com.ubercab.client.core.model.ThirdPartyIdentity;
import com.ubercab.client.core.model.surge.Surge;
import com.ubercab.client.core.model.vehicleview.Shape_VehicleView;
import com.ubercab.rider.realtime.model.DropNotification;
import com.ubercab.rider.realtime.model.DynamicPickup;
import com.ubercab.rider.realtime.model.FareInfo;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.MobileMessage;
import com.ubercab.rider.realtime.model.MobileMessageDisplayProperties;
import com.ubercab.rider.realtime.model.MobileMessageModule;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import com.ubercab.rider.realtime.model.UpfrontFare;
import com.ubercab.rider.realtime.model.VehicleView;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dko
    implements dkn, gqk, gqm
{

    private cev a;
    private Context b;
    private dal c;
    private gqd d;
    private MobileAppTracker e;
    private daj f;
    private hjn g;
    private dak h;
    private czf i;
    private efa j;
    private Class1 k;
    private Class3 l;
    private dao m;
    private cyy n;
    private String o;

    public dko(cev cev, Application application, gqd gqd1, daj daj1, dak dak1, czf czf1, dal dal1, 
            MobileAppTracker mobileapptracker, efa efa1, Class1 class1, Class3 class3, dao dao1, cyy cyy1, hjn hjn1)
    {
        a = cev;
        b = application;
        d = gqd1;
        g = hjn1;
        e = mobileapptracker;
        c = dal1;
        f = daj1;
        i = czf1;
        h = dak1;
        j = efa1;
        k = class1;
        l = class3;
        m = dao1;
        n = cyy1;
        d.a(this);
        d.a(this);
    }

    static cev a(dko dko1)
    {
        return dko1.a;
    }

    private static String a(String s, String s1, String s2)
    {
        return (new JSONObject(gkg.a("alipay_id", s, "alipay_mobile", s1, "ack_type", s2))).toString();
    }

    private void a(Ping ping)
    {
        e(ping);
        g(ping);
        f(ping);
        d(ping);
        h(ping);
        c(ping);
        b(ping);
    }

    private static void a(Object obj, String s, Object obj1)
    {
        try
        {
            s = obj.getClass().getDeclaredField(s);
            s.setAccessible(true);
            s.set(obj, obj1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
    }

    private void a(List list, String s, int i1, int j1)
    {
        try
        {
            a(list, s, gkq.c(b.getResources().openRawResource(i1)), gkq.c(b.getResources().openRawResource(j1)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            return;
        }
    }

    private static void a(List list, String s, String s1, String s2)
    {
        MobileMessageDisplayProperties mobilemessagedisplayproperties = new MobileMessageDisplayProperties() {

            public final Long getExpandHeaderNPixelsWhenOpenedInDrawer()
            {
                return null;
            }

            public final String getShowAfterRequestingVehicleViewId()
            {
                return null;
            }

            public final String getShowAsFareEstimateInfoForVehicleViewId()
            {
                return null;
            }

            public final Boolean getShowAsModalOverRequestView()
            {
                return Boolean.valueOf(true);
            }

            public final Boolean getShowAsPersistentInEatsLookingView()
            {
                return null;
            }

            public final Long getShowAsPersistentOverRequestWithTimeout()
            {
                return Long.valueOf(0L);
            }

            public final String getShowAsVehicleOptionInfoForVehicleViewId()
            {
                return null;
            }

            public final String getShowAtBottomOfRequestViewString()
            {
                return null;
            }

            public final Boolean getShowForDynamicPickupsSummary()
            {
                return null;
            }

            public final Boolean getShowHeaderOnFullScreen()
            {
                return Boolean.valueOf(true);
            }

            public final Boolean getShowInDrawer()
            {
                return Boolean.valueOf(true);
            }

            public final Boolean getShowPageControlIndicator()
            {
                return Boolean.valueOf(false);
            }

            public final Boolean getShowWhileSurgeIsActive()
            {
                return Boolean.valueOf(true);
            }

        };
        list.add(new MobileMessage(s, new MobileMessageModule(s1) {

            final String a;

            public final List getContent()
            {
                return gke.a(a);
            }

            public final MobileMessageDisplayProperties getDisplayProps()
            {
                return null;
            }

            
            {
                a = s;
                super();
            }
        }, new MobileMessageModule(s2) {

            final String a;

            public final List getContent()
            {
                return gke.a(a, a, a);
            }

            public final MobileMessageDisplayProperties getDisplayProps()
            {
                return null;
            }

            
            {
                a = s;
                super();
            }
        }, mobilemessagedisplayproperties) {

            SimpleDateFormat a;
            final String b;
            final String c;
            final MobileMessageModule d;
            final MobileMessageModule e;
            final MobileMessageDisplayProperties f;

            public final MobileMessageDisplayProperties getDisplayProps()
            {
                return f;
            }

            public final String getETag()
            {
                return b;
            }

            public final String getId()
            {
                return (new StringBuilder()).append(c).append(b).toString();
            }

            public final List getModules()
            {
                return gke.a(d, e);
            }

            public final String getVehicleViewId()
            {
                return "1";
            }

            
            {
                c = s;
                d = mobilemessagemodule;
                e = mobilemessagemodule1;
                f = mobilemessagedisplayproperties;
                super();
                a = new SimpleDateFormat("yyyyMMddHHmm");
                b = a.format(new Date());
            }
        });
    }

    private void b(Ping ping)
    {
        if (i.g())
        {
            if ((ping = ping.getTrip()) != null && ping.getPickupLocation() != null)
            {
                a(ping, "pickupLocation", ping.getDestination());
                a(ping, "dynamicPickup", new DynamicPickup(ping) {

                    final Trip a;
                    final dko b;

                    public final Location getOriginalPickupLocation()
                    {
                        return a.getPickupLocation();
                    }

            
            {
                b = dko.this;
                a = trip;
                super();
            }
                });
                return;
            }
        }
    }

    private void c(Ping ping)
    {
        if (i.j() && dul.d(ping))
        {
            Object obj = ping.getCity();
            ArrayList arraylist = new ArrayList();
            ping = new ProductGroup();
            ping.setUuid("uuid1");
            ping.setName("Ride");
            ping.setDescription("Ride");
            ping.setIconUrl("http://...");
            ping.setGroupType("ride");
            ProductGroup productgroup = new ProductGroup();
            productgroup.setUuid("uuid2");
            productgroup.setName("Uber Eats");
            productgroup.setDescription("Eat");
            productgroup.setIconUrl("http://...");
            productgroup.setGroupType("eats");
            ProductGroup productgroup1 = new ProductGroup();
            productgroup1.setUuid("uuid3");
            productgroup1.setName("Uber Rush");
            productgroup1.setDescription("Deliver");
            productgroup1.setIconUrl("http://...");
            productgroup1.setGroupType("rush");
            arraylist.add(ping);
            arraylist.add(productgroup);
            arraylist.add(productgroup1);
            ((City) (obj)).setProductGroups(arraylist);
            obj = ((City) (obj)).getVehicleViews().values().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                VehicleView vehicleview = (VehicleView)((Iterator) (obj)).next();
                if (vehicleview.getEnableVehicleInventoryView())
                {
                    ((Shape_VehicleView)vehicleview).setProductGroupUuid(productgroup.getUuid());
                } else
                {
                    ((Shape_VehicleView)vehicleview).setProductGroupUuid(ping.getUuid());
                }
            }
        }
    }

    private void d(Ping ping)
    {
        if (i.w() && dul.h(ping))
        {
            Iterator iterator = ping.getCity().getVehicleViews().keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (String)iterator.next();
                obj = (VehicleView)ping.getCity().getVehicleViews().get(obj);
                if (obj instanceof Shape_VehicleView)
                {
                    ((Shape_VehicleView)obj).setDestinationEntry(i.x());
                }
            } while (true);
        }
    }

    private void e(Ping ping)
    {
        if (ping != null && ping.getAppConfig() != null)
        {
            RiderAppConfig riderappconfig1 = ping.getAppConfig().getRiderConfig();
            RiderAppConfig riderappconfig = riderappconfig1;
            if (riderappconfig1 == null)
            {
                riderappconfig = new RiderAppConfig();
                ping.getAppConfig().setRiderConfig(riderappconfig);
            }
            ping = i.A();
            if (!TextUtils.isEmpty(ping))
            {
                ijg.a("Overriding slider style from [%s] to [%s]", new Object[] {
                    riderappconfig.getSliderStyle(), ping
                });
                riderappconfig.setSliderStyle(ping);
            }
            if (i.b())
            {
                riderappconfig.setUnisonEnabled(true);
            }
            if (i.C())
            {
                riderappconfig.setSafetyNetEnabled(true);
                return;
            }
        }
    }

    private void f(Ping ping)
    {
        while (ping == null || !i.h()) 
        {
            return;
        }
        ping = ping.getClient().getThirdPartyIdentities();
        ping.clear();
        ping.put(esf.a.a(), new ThirdPartyIdentity());
    }

    private String g()
    {
        String s = c.u();
        if (TextUtils.isEmpty(s))
        {
            ijg.d(new IllegalStateException(), "Token is required", new Object[0]);
        }
        return s;
    }

    private void g(Ping ping)
    {
        if (dul.h(ping)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator = ping.getCity().getVehicleViews().keySet().iterator();
_L5:
        if (!iterator.hasNext()) goto _L1; else goto _L3
_L3:
        Object obj = (String)iterator.next();
        if (!i.d(((String) (obj)))) goto _L5; else goto _L4
_L4:
        obj = (VehicleView)ping.getCity().getVehicleViews().get(obj);
        if (obj instanceof Shape_VehicleView)
        {
            obj = ((Shape_VehicleView)obj).getSurge();
        } else
        {
            obj = null;
        }
        if (obj == null) goto _L1; else goto _L6
_L6:
        obj = (Surge)obj;
        if (((Surge) (obj)).getMultiplier() == 1.0F)
        {
            ((Surge) (obj)).setMultiplier(1.75F);
            ((Surge) (obj)).setExpirationTime(120L);
            ((Surge) (obj)).setFareId(12345L);
            ((Surge) (obj)).setSpeedThresholdMps("5.0");
            ((Surge) (obj)).setPerMinute("$1.23");
            ((Surge) (obj)).setBase("$12");
            ((Surge) (obj)).setPerDistanceUnit("4.56");
            ((Surge) (obj)).setDistanceUnit("mile");
            ((Surge) (obj)).setMinimum("$23.45");
            ((Surge) (obj)).setShowRates(true);
            ((Surge) (obj)).setDropNotification(new DropNotification() {

                final dko a;

                public final long getDefaultExpirationTime()
                {
                    return 1800L;
                }

                public final boolean isEnabled()
                {
                    return true;
                }

            
            {
                a = dko.this;
                super();
            }
            });
            ((Surge) (obj)).setScreenType(i.l());
        }
          goto _L5
    }

    private String h()
    {
        if (o == null)
        {
            o = cwt.f(b);
        }
        return o;
    }

    private void h(Ping ping)
    {
        if (!dul.d(ping) || !i.a())
        {
            return;
        }
        ping = ping.getCity();
        ArrayList arraylist = new ArrayList();
        int i1 = b.getResources().getIdentifier("mobile_message_header_test", "raw", b.getPackageName());
        int j1 = b.getResources().getIdentifier("mobile_message_body_test", "raw", b.getPackageName());
        if (i1 > 0 && j1 > 0)
        {
            a(arraylist, "test1_", i1, j1);
        }
        ping.setMessages(arraylist);
    }

    private static String l(String s, String s1)
    {
        return (new JSONObject(gkg.a("paytm_email", s, "paytm_mobile", s1))).toString();
    }

    private static gkg m(String s, String s1)
    {
        return gkg.a("paymentProfileId", s, "payPalCorrelationId", s1);
    }

    public final void a()
    {
        a(false);
    }

    public final void a(int i1, long l1, CnLocation cnlocation, CnLocation cnlocation1, FareInfo fareinfo, int j1)
    {
        String s = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dnf(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dnf(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dnf(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        cnlocation = (new gqh()).a(gqi.b).a("SetDestination").a().a("token", s).a("vehicleViewId", Integer.valueOf(i1)).a("performFareEstimate", Boolean.valueOf(true)).a("pickupLocation", cnlocation).a("destination", cnlocation1).a("fareId", Long.valueOf(l1)).a(gql);
        if (l1 > 0L)
        {
            cnlocation.a("fareId", Long.valueOf(l1));
        }
        if (fareinfo != null)
        {
            cnlocation.a("fareInfo", fareinfo);
        }
        if (j1 > 0)
        {
            cnlocation.a("capacity", Integer.valueOf(j1));
        }
        d.b(cnlocation.b());
    }

    public final void a(CnLocation cnlocation, CnLocation cnlocation1, CnLocation cnlocation2, int i1, long l1, String s, 
            boolean flag, boolean flag1, boolean flag2, TripExpenseInfo tripexpenseinfo, String s1, List list, boolean flag3, 
            UpfrontFare upfrontfare, int j1, Profile profile, Note note, boolean flag4)
    {
        String s2 = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dmq(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dmq(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dmq(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        cnlocation = (new gqh()).a(gqi.b).a("Pickup").a().a(gql).a("token", s2).a("pickupLocation", cnlocation1).a("destination", cnlocation2).a("paymentProfileId", s).a("useCredits", Boolean.valueOf(flag1)).a("vehicleViewId", Integer.valueOf(i1)).a("userLocation", cnlocation).a("isGoogleWalletRequest", Boolean.valueOf(flag)).a("expenseInfo", tripexpenseinfo).a("deviceData", g.a()).a("enableDynamicPickup", Boolean.valueOf(flag4));
        if (flag3)
        {
            cnlocation.a("ridePoolEnabled", Boolean.valueOf(flag3));
        }
        if (l1 > 0L)
        {
            cnlocation.a("fareId", Long.valueOf(l1));
        }
        if (upfrontfare != null)
        {
            cnlocation.a("upfrontFare", upfrontfare);
        }
        if (j1 > 0)
        {
            cnlocation.a("capacity", Integer.valueOf(j1));
        }
        if (profile != null)
        {
            if (profile.getUuid() != null)
            {
                cnlocation.a("profileUUID", profile.getUuid());
            }
            if (profile.getType() != null)
            {
                cnlocation.a("profileType", profile.getType());
            }
        }
        if (!TextUtils.isEmpty(s1))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (flag2 || i1 != 0)
        {
            cnlocation1 = new HashMap();
            cnlocation1.put("paymentProfileId", s);
            if (flag2)
            {
                cnlocation1.put("useAmexReward", Boolean.valueOf(true));
            }
            if (i1 != 0)
            {
                cnlocation1.put("payPalCorrelationId", s1);
            }
            cnlocation.a("extraPaymentData", cnlocation1);
        }
        if (list != null && !list.isEmpty())
        {
            cnlocation1 = new HashMap();
            cnlocation1.put("items", list);
            cnlocation.a("shoppingCart", cnlocation1);
        }
        if (note != null)
        {
            cnlocation.a("note", note);
        }
        d.b(cnlocation.b());
    }

    public final void a(Profile profile)
    {
        gql gql = new gql() {

            final dko a;

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                dko.a(a).c(new dnk(gqj, response));
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dnk(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                dko.a(a).c(new dnk(gqj, response));
            }

            
            {
                a = dko.this;
                super();
            }
        };
        String s = g();
        profile = (new gqh()).a(gqi.b).a("SwitchRiderProfile").a().a("token", s).a("profileUUID", profile.getUuid()).a("profileType", profile.getType()).a(gql);
        d.b(profile.b());
    }

    public final void a(TripExpenseInfo tripexpenseinfo)
    {
        String s = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dle(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dle(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dle(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        tripexpenseinfo = (new gqh()).a(gqi.b).a("AddExpenseInfo").a().a(gql).a("expenseTrip", Boolean.valueOf(tripexpenseinfo.isExpenseTrip())).a("code", tripexpenseinfo.getCode()).a("memo", tripexpenseinfo.getMemo()).a("token", s).b();
        d.b(tripexpenseinfo);
    }

    public final void a(gqg gqg1)
    {
        gqg1 = gqg1.d();
        gqg1.put("app", cyy.b());
        Object obj;
        Object obj1;
        if (m.q())
        {
            gqg1.put("version", m.r());
        } else
        {
            gqg1.put("version", cyy.a());
        }
        obj = h.b();
        obj1 = h.c();
        if (obj != null)
        {
            gqg1.put("latitude", Double.valueOf(((RiderLocation) (obj)).getUberLatLng().a()));
            gqg1.put("longitude", Double.valueOf(((RiderLocation) (obj)).getUberLatLng().b()));
        } else
        if (obj1 != null)
        {
            gqg1.put("altitude", Double.valueOf(((RiderLocation) (obj1)).getAltitude()));
            gqg1.put("course", Float.valueOf(((RiderLocation) (obj1)).getBearing()));
            gqg1.put("horizontalAccuracy", Float.valueOf(((RiderLocation) (obj1)).getAccuracy()));
            gqg1.put("latitude", Double.valueOf(((RiderLocation) (obj1)).getUberLatLng().a()));
            gqg1.put("longitude", Double.valueOf(((RiderLocation) (obj1)).getUberLatLng().b()));
            gqg1.put("speed", Float.valueOf(((RiderLocation) (obj1)).getSpeed()));
        }
        obj = new HashMap();
        try
        {
            obj1 = h();
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                ((Map) (obj)).put("deviceImei", obj1);
            }
            obj1 = l.Method5();
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                ((Map) (obj)).put("permId", obj1);
            }
            obj1 = k.Method5();
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                ((Map) (obj)).put("authId", obj1);
            }
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror) { }
        catch (SecurityException securityexception) { }
        obj1 = e.getGoogleAdvertisingId();
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            ((Map) (obj)).put("googleAdvertisingId", obj1);
        }
        if (!((Map) (obj)).isEmpty())
        {
            gqg1.put("deviceIds", new JSONObject(((Map) (obj))));
        }
        obj = j.b();
        if (obj != null)
        {
            gqg1.put("cachedMessages", obj);
        }
    }

    public final void a(gqg gqg1, gqj gqj, Response response)
    {
    }

    public final void a(gqg gqg1, RetrofitError retrofiterror)
    {
    }

    public final void a(gqj gqj)
    {
    }

    public final void a(String s)
    {
        String s1 = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dlp(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dlp(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dlp(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        HashMap hashmap = new HashMap();
        hashmap.put("token", s1);
        s = (new gqh()).a(gqi.b).a("ApiCommand").a().a(gql).a("token", s1).a("apiUrl", (new StringBuilder("/payment_profiles/")).append(s).toString()).a("apiMethod", "DELETE").a("apiParameters", hashmap).b();
        d.b(s);
    }

    public final void a(String s, int i1, int j1, String s1)
    {
        String s2 = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dmu(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dmu(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dmu(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        s = (new gqh()).a(gqi.b).a("RatingDriver").a().a(gql).a("token", s2).a("tripId", s).a("rating", Integer.valueOf(i1));
        if (j1 > 0)
        {
            s.a("feedbackId", Integer.valueOf(j1));
        }
        if (!TextUtils.isEmpty(s1))
        {
            s.a("feedback", s1);
        }
        d.b(s.b());
    }

    public final void a(String s, gqk gqk1)
    {
        String s1 = g();
        s = gkg.a("token", s1, "mobile_token", s);
        String s2 = String.format("/clients/%s/confirm_mobile", new Object[] {
            c.z()
        });
        s = (new gqh()).a(gqi.b).a("ApiCommand").a().a("token", s1).a("apiMethod", "PUT").a("apiUrl", s2).a("apiParameters", s).a(gqk1).b();
        d.b(s);
    }

    public final void a(String s, Boolean boolean1, Boolean boolean2)
    {
        String s1 = g();
        gql gql = null;
        HashMap hashmap = new HashMap();
        hashmap.put("type", "amex_reward");
        if (boolean1 != null)
        {
            hashmap.put("enroll", boolean1);
            gql = new gql() {

                final dko a;

                private void a(Ping ping, Response response)
                {
                    dko.a(a).c(new dmy(ping, response));
                }

                private void b(Ping ping, Response response)
                {
                    dko.a(a).c(new dmy(ping, response));
                }

                public final void a(gqg gqg1, gqj gqj, Response response)
                {
                    b((Ping)gqj, response);
                }

                public final void a(gqg gqg1, RetrofitError retrofiterror)
                {
                    dko.a(a).c(new dmy(retrofiterror));
                }

                public final void b(gqg gqg1, gqj gqj, Response response)
                {
                    a((Ping)gqj, response);
                }

            
            {
                a = dko.this;
                super();
            }
            };
        }
        if (boolean2 != null)
        {
            hashmap.put("enable", boolean2);
        }
        int i1 = dug.a(s, -1);
        boolean1 = (new gqh()).a(gqi.b).a("PaymentRewardUpdate").a().a("token", s1);
        if (i1 != -1)
        {
            s = Integer.valueOf(i1);
        }
        s = boolean1.a("paymentProfileId", s).a("rewardData", hashmap);
        if (gql != null)
        {
            s.a(gql);
        }
        d.b(s.b());
    }

    public final void a(String s, String s1)
    {
        String s2 = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dlo(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dlo(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dlo(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        HashMap hashmap = new HashMap();
        hashmap.put("token", s2);
        hashmap.put("token_type", "paypal");
        hashmap.put("token_data", s);
        hashmap.put("paypal_correlation_id", s1);
        s = (new gqh()).a(gqi.b).a("ApiCommand").a().a(gql).a("token", s2).a("apiMethod", "POST").a("apiUrl", "/payment_profiles").a("apiParameters", hashmap).b();
        d.b(s);
    }

    public final void a(String s, String s1, gqk gqk1)
    {
        String s2 = g();
        s = (new gqh()).a(gqi.a).a("RegisterPushToken").a("token", s2).a("deviceTokenType", s).a("deviceToken", s1).a("certificate", "enterprise").a(gqk1).b();
        d.b(s);
    }

    public final void a(String s, String s1, String s2, gqk gqk1)
    {
        s = (new gqh()).a(gqi.a).a("UnregisterPushToken").a("token", s).a("deviceTokenType", s1).a("deviceToken", s2).a("certificate", "enterprise").a(gqk1).b();
        d.b(s);
    }

    public final void a(String s, String s1, String s2, String s3)
    {
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dld(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dld(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dld(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        s = gkg.a("type", s, "accessToken", s1, "authString", s2, "redirectUri", s3);
        s = (new gqh()).a(gqi.b).a("AuthenticateThirdParty").a().a(gql).a("credentials", s).b();
        d.b(s);
    }

    public final void a(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        String s7 = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dnr(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dnr(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dnr(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        HashMap hashmap = new HashMap();
        hashmap.put("token", s7);
        hashmap.put("card_code", s3);
        hashmap.put("use_case", s6);
        hashmap.put("billing_zip", s5);
        hashmap.put("card_expiration_year", s2);
        hashmap.put("card_expiration_month", s1);
        hashmap.put("billing_country_iso2", s4.toUpperCase(Locale.US));
        s = (new gqh()).a(gqi.b).a("ApiCommand").a().a(gql).a("token", s7).a("apiMethod", "PUT").a("apiUrl", (new StringBuilder("/payment_profiles/")).append(s).toString()).a("apiParameters", hashmap).b();
        d.b(s);
    }

    public final void a(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            boolean flag, boolean flag1)
    {
        String s7 = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dlo(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dlo(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dlo(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        HashMap hashmap = new HashMap();
        hashmap.put("token", s7);
        hashmap.put("card_code", s3);
        hashmap.put("use_case", s6);
        hashmap.put("card_number", s);
        hashmap.put("billing_zip", s5);
        hashmap.put("card_expiration_year", s2);
        hashmap.put("card_expiration_month", s1);
        hashmap.put("billing_country_iso2", s4.toUpperCase(Locale.US));
        hashmap.put("is_google_wallet", Boolean.valueOf(flag));
        hashmap.put("cardio", Boolean.valueOf(flag1));
        s = (new gqh()).a(gqi.b).a("ApiCommand").a().a(gql).a("token", s7).a("apiMethod", "POST").a("apiUrl", "/payment_profiles").a("apiParameters", hashmap).b();
        d.b(s);
    }

    public final void a(String s, String s1, boolean flag)
    {
        String s2 = g();
        Object obj;
        if (flag)
        {
            obj = new gql() {

                final dko a;

                private void a(Ping ping, Response response)
                {
                    dko.a(a).c(new dla(ping, response));
                }

                private void b(Ping ping, Response response)
                {
                    dko.a(a).c(new dla(ping, response));
                }

                public final void a(gqg gqg1, gqj gqj, Response response)
                {
                    b((Ping)gqj, response);
                }

                public final void a(gqg gqg1, RetrofitError retrofiterror)
                {
                    dko.a(a).c(new dla(retrofiterror));
                }

                public final void b(gqg gqg1, gqj gqj, Response response)
                {
                    a((Ping)gqj, response);
                }

            
            {
                a = dko.this;
                super();
            }
            };
        } else
        {
            obj = new gql() {

                final dko a;

                private void a(Ping ping, Response response)
                {
                    dko.a(a).c(new dlr(ping, response));
                }

                private void b(Ping ping, Response response)
                {
                    dko.a(a).c(new dlr(ping, response));
                }

                public final void a(gqg gqg1, gqj gqj, Response response)
                {
                    b((Ping)gqj, response);
                }

                public final void a(gqg gqg1, RetrofitError retrofiterror)
                {
                    dko.a(a).c(new dlr(retrofiterror));
                }

                public final void b(gqg gqg1, gqj gqj, Response response)
                {
                    a((Ping)gqj, response);
                }

            
            {
                a = dko.this;
                super();
            }
            };
        }
        obj = (new gqh()).a(gqi.b).a("FareSplitAccept").a().a(((gqk) (obj))).a("token", s2).a("useCredits", Boolean.valueOf(true));
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            ((gqh) (obj)).a("extraPaymentData", m(s, s1));
        }
        d.b(((gqh) (obj)).b());
    }

    public final void a(String s, boolean flag)
    {
        String s1 = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dlg(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dlg(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dlg(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        s = gkg.a("token", s1, "code", s, "confirmed", Boolean.valueOf(flag));
        s = (new gqh()).a(gqi.b).a("ApiCommand").a().a("token", s1).a("apiUrl", "/clients_promotions").a("apiMethod", "POST").a("apiParameters", s).a(gql).b();
        d.b(s);
    }

    public final void a(String s, boolean flag, String s1)
    {
        Object obj = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dne(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dne(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dne(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        obj = (new gqh()).a(gqi.b).a("SelectPaymentProfile").a().a(gql).a("token", obj).a("paymentProfileId", s).a("isGoogleWalletRequest", Boolean.valueOf(flag));
        if (!TextUtils.isEmpty(s1))
        {
            ((gqh) (obj)).a("extraPaymentData", m(s, s1));
        }
        d.b(((gqh) (obj)).b());
    }

    public final void a(List list)
    {
        String s = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dlt(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dlt(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dlt(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        list = (new gqh()).a(gqi.b).a("FareSplitInvite").a().a(gql).a("token", s).a("invitees", list).b();
        d.b(list);
    }

    public final void a(boolean flag)
    {
        String s = g();
        Object obj;
        if (flag)
        {
            obj = new gql() {

                final dko a;

                private void a(Ping ping, Response response)
                {
                    dko.a(a).c(new dlb(ping, response));
                }

                private void b(Ping ping, Response response)
                {
                    dko.a(a).c(new dlb(ping, response));
                }

                public final void a(gqg gqg1, gqj gqj, Response response)
                {
                    b((Ping)gqj, response);
                }

                public final void a(gqg gqg1, RetrofitError retrofiterror)
                {
                    dko.a(a).c(new dlb(retrofiterror));
                }

                public final void b(gqg gqg1, gqj gqj, Response response)
                {
                    a((Ping)gqj, response);
                }

            
            {
                a = dko.this;
                super();
            }
            };
        } else
        {
            obj = new gql() {

                final dko a;

                private void a(Ping ping, Response response)
                {
                    dko.a(a).c(new dls(ping, response));
                }

                private void b(Ping ping, Response response)
                {
                    dko.a(a).c(new dls(ping, response));
                }

                public final void a(gqg gqg1, gqj gqj, Response response)
                {
                    b((Ping)gqj, response);
                }

                public final void a(gqg gqg1, RetrofitError retrofiterror)
                {
                    dko.a(a).c(new dls(retrofiterror));
                }

                public final void b(gqg gqg1, gqj gqj, Response response)
                {
                    a((Ping)gqj, response);
                }

            
            {
                a = dko.this;
                super();
            }
            };
        }
        obj = (new gqh()).a(gqi.b).a("FareSplitDecline").a().a(((gqk) (obj))).a("token", s).b();
        d.b(((gqg) (obj)));
    }

    public final void b()
    {
        Object obj = g();
        gkg gkg1 = gkg.a("token", obj);
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dli(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dli(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dli(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        obj = (new gqh()).a(gqi.b).a("ApiCommand").a().a("token", obj).a("apiUrl", String.format("/clients/%s", new Object[] {
            c.z()
        })).a("apiMethod", "PUT").a("apiParameters", gkg1).a(gql).b();
        d.b(((gqg) (obj)));
    }

    public final void b(gqg gqg1, gqj gqj, Response response)
    {
        if (gqj instanceof Ping)
        {
            gqj = (Ping)gqj;
            a(gqj);
            if (gqg1.c())
            {
                f.a(gqj);
                return;
            }
        }
    }

    public final void b(String s)
    {
        String s1 = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dlu(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dlu(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dlu(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        s = (new gqh()).a(gqi.b).a("FareSplitUninvite").a().a(gql).a("token", s1).a("invitee", s).b();
        d.b(s);
    }

    public final void b(String s, String s1)
    {
        String s2 = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dlo(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dlo(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dlo(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        HashMap hashmap = new HashMap();
        hashmap.put("token", s2);
        hashmap.put("token_type", "alipay");
        hashmap.put("token_data", a(s, s1, "M"));
        s = (new gqh()).a(gqi.b).a("ApiCommand").a().a(gql).a("token", s2).a("apiMethod", "POST").a("apiUrl", "/payment_profiles").a("apiParameters", hashmap).b();
        d.b(s);
    }

    public final void b(boolean flag)
    {
        Object obj = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dng(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dng(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dng(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        obj = (new gqh()).a(gqi.b).a("SetUseCredits").a().a(gql).a("token", obj).a("useCredits", Boolean.valueOf(flag)).b();
        d.b(((gqg) (obj)));
    }

    public final void c()
    {
        Object obj = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dmp(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dmp(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dmp(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        obj = (new gqh()).a(gqi.b).a("PickupCanceledClient").a().a(gql).a("token", obj).b();
        d.b(((gqg) (obj)));
    }

    public final void c(String s)
    {
        String s1 = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dnn(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dnn(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dnn(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        gkg gkg1 = gkg.a("token", s1);
        s = (new gqh()).a(gqi.b).a("ApiCommand").a().a("apiMethod", "DELETE").a("apiUrl", (new StringBuilder("/third_party_identities/")).append(s).toString()).a("token", s1).a("apiParameters", gkg1).a(gql).b();
        d.b(s);
    }

    public final void c(String s, String s1)
    {
        String s2 = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dlo(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dlo(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dlo(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        HashMap hashmap = new HashMap();
        hashmap.put("token", s2);
        hashmap.put("token_type", "paytm");
        hashmap.put("token_data", l(s, s1));
        s = (new gqh()).a(gqi.b).a("ApiCommand").a().a(gql).a("token", s2).a("apiMethod", "POST").a("apiUrl", "/payment_profiles").a("apiParameters", hashmap).b();
        d.b(s);
    }

    public final void d()
    {
        Object obj = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dmr(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dmr(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dmr(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        obj = (new gqh()).a(gqi.c).a("PingClient").a().a(gql).a("token", obj);
        d.b(((gqh) (obj)).b());
    }

    public final void d(String s)
    {
        String s1 = g();
        s = gkg.a("token", s1, "name", s);
        s = (new gqh()).a(gqi.b).a("ApiCommand").a().a("apiMethod", "POST").a("apiUrl", "/user_tags_public").a("token", s1).a("apiParameters", s).b();
        d.b(s);
    }

    public final void d(String s, String s1)
    {
        a(s, s1, false);
    }

    public final void e()
    {
        Object obj = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dnh(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dnh(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dnh(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        obj = (new gqh()).a("ShareYoRide").a().a("token", obj).a(gql).b();
        d.b(((gqg) (obj)));
    }

    public final void e(String s)
    {
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dnw(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dnw(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dnw(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        HashMap hashmap = new HashMap();
        hashmap.put("promotion_code", s);
        hashmap.put("confirmed", Integer.valueOf(0));
        s = h.c();
        if (s != null)
        {
            hashmap.put("latitude", Double.valueOf(s.getUberLatLng().a()));
            hashmap.put("longitude", Double.valueOf(s.getUberLatLng().b()));
        }
        s = (new gqh()).a(gqi.b).a("ApiCommand").a("apiUrl", "/validate/promotion").a("apiMethod", "GET").a("apiParameters", hashmap).a(gql).b();
        d.b(s);
    }

    public final void e(String s, String s1)
    {
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dmj(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dmj(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dmj(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        s = (new gqh()).a(gqi.b).a("Login").a().a(gql).a("email", s).a("password", s1).a("deviceData", g.a()).b();
        d.b(s);
    }

    public final void f()
    {
        Object obj = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dmv(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dmv(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dmv(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        gkg gkg1 = gkg.a("token", obj);
        String s = String.format("/clients/%s/request_mobile_confirmation", new Object[] {
            c.z()
        });
        obj = (new gqh()).a(gqi.b).a("ApiCommand").a().a("token", obj).a("apiMethod", "PUT").a("apiUrl", s).a("apiParameters", gkg1).a(gql).b();
        d.b(((gqg) (obj)));
    }

    public final void f(String s)
    {
        a(s, new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dlm(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dlm(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dlm(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        });
    }

    public final void f(String s, String s1)
    {
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dmj(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dmj(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dmj(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        s = (new gqh()).a(gqi.b).a("Login").a().a(gql).a("phoneNumberE164", s).a("isPhoneNumberSignin", Boolean.valueOf(true)).a("password", s1).a("deviceData", g.a()).b();
        d.b(s);
    }

    public final void g(String s, String s1)
    {
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dnm(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dnm(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dnm(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        s = gkg.a("type", s, "accessToken", s1, "authString", null, "redirectUri", null);
        s = (new gqh()).a(gqi.b).a("AuthenticateThirdParty").a().a(gql).a("credentials", s).b();
        d.b(s);
    }

    public final void h(String s, String s1)
    {
        String s2 = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dnm(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dnm(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dnm(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        s = gkg.a("token", s2, "identity_type", s, "access_token_code", s1);
        s = (new gqh()).a(gqi.b).a("ApiCommand").a().a("apiMethod", "POST").a("apiUrl", "/third_party_identities").a("token", s2).a("apiParameters", s).a(gql).b();
        d.b(s);
    }

    public final void i(String s, String s1)
    {
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dmi(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dmi(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dmi(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        s = (new gqh()).a(gqi.b).a("Login").a().a(gql).a("email", s).a("googleOauthToken", s1).a("googleOauthTokenType", "jwt").a("deviceData", g.a()).b();
        d.b(s);
    }

    public final void j(String s, String s1)
    {
        String s2 = g();
        s = gkg.a("token", s2, "mobile", s, "mobileCountryIso2", s1);
        s1 = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dli(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dli(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dli(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        s = (new gqh()).a(gqi.b).a("ApiCommand").a().a("token", s2).a("apiUrl", String.format("/clients/%s", new Object[] {
            c.z()
        })).a("apiMethod", "PUT").a("apiParameters", s).a(s1).b();
        d.b(s);
    }

    public final void k(String s, String s1)
    {
        String s2 = g();
        gql gql = new gql() {

            final dko a;

            private void a(Ping ping, Response response)
            {
                dko.a(a).c(new dmk(ping, response));
            }

            private void b(Ping ping, Response response)
            {
                dko.a(a).c(new dmk(ping, response));
            }

            public final void a(gqg gqg1, gqj gqj, Response response)
            {
                b((Ping)gqj, response);
            }

            public final void a(gqg gqg1, RetrofitError retrofiterror)
            {
                dko.a(a).c(new dmk(retrofiterror));
            }

            public final void b(gqg gqg1, gqj gqj, Response response)
            {
                a((Ping)gqj, response);
            }

            
            {
                a = dko.this;
                super();
            }
        };
        s1 = gkg.a("token", s2, "payment_profile_id", s1);
        s = (new gqh()).a(gqi.b).a("ApiCommand").a().a("token", s2).a("apiMethod", "PUT").a("apiUrl", (new StringBuilder("/client_bills/")).append(s).toString()).a("apiParameters", s1).a(gql).b();
        d.b(s);
    }
}
