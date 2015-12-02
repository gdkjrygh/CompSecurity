// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.location.LocationManager;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mobileapptracker.MobileAppTracker;
import com.security.class1.Class1;
import com.security.class3.Class3;
import com.squareup.okhttp.OkHttpClient;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.network.AccountApi;
import com.ubercab.client.core.network.AccountBalanceApi;
import com.ubercab.client.core.network.EmergencyApi;
import com.ubercab.client.core.network.InvitationsApi;
import com.ubercab.client.core.network.LocationApi;
import com.ubercab.client.core.network.PaymentApi;
import com.ubercab.client.core.network.PhoneNumberAnonymizationApi;
import com.ubercab.client.core.network.SafetyNetApi;
import com.ubercab.client.core.network.ShoppingApi;
import com.ubercab.client.core.network.SignupApi;
import com.ubercab.client.core.network.TroyProfileApi;
import com.ubercab.client.core.network.TunesApi;
import com.ubercab.client.feature.pickup.network.GuidedPickupApi;
import com.ubercab.experiment.network.ExperimentApi;
import com.ubercab.network.uspout.UspoutClient;
import com.ubercab.rds.core.network.SupportApi;
import com.ubercab.rider.realtime.object.ObjectTypeAdapterFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import retrofit.android.MainThreadExecutor;
import retrofit.converter.GsonConverter;

public final class dfq
{

    private final RiderApplication a;

    public dfq(RiderApplication riderapplication)
    {
        a = riderapplication;
    }

    protected static crc A()
    {
        return new crc();
    }

    protected static cra B()
    {
        return new cra();
    }

    protected static cgh a(OkHttpClient okhttpclient, Application application, ExecutorService executorservice)
    {
        return (new cgi(application)).a(executorservice).a(new cgg(okhttpclient)).a();
    }

    protected static cix a(cev cev)
    {
        cev = new cix(cev);
        cev.a();
        return cev;
    }

    protected static SignupApi a(grs grs1)
    {
        return (SignupApi)grs1.a(com/ubercab/client/core/network/SignupApi);
    }

    protected static cos a(MobileAppTracker mobileapptracker)
    {
        return new elu(mobileapptracker);
    }

    protected static cpv a(dol dol1)
    {
        return dol1;
    }

    protected static cpw a(gob gob)
    {
        return new dcf(gob);
    }

    protected static cyh a(chp chp, cev cev, cig cig, RiderApplication riderapplication, ici ici, dao dao1)
    {
        return new cyh(chp, cev, cig, riderapplication, ici, dao1);
    }

    protected static cys a(Application application, chp chp)
    {
        application = new cys(application);
        application.a(new dob(chp));
        return application;
    }

    protected static daj a(cev cev, gju gju1)
    {
        cev = new daj(cev, gju1);
        cev.e();
        return cev;
    }

    protected static dak a(cev cev, cix cix1)
    {
        cev = new dak(cix1, cev);
        cev.a();
        return cev;
    }

    protected static dao a(bjw bjw, Application application)
    {
        return new dao(application, bjw);
    }

    protected static dcr a(cxu cxu, gmg gmg1, gro gro, dal dal1)
    {
        return new dcr(cxu, gmg1, gro, dal1);
    }

    protected static dcs a(chp chp, dqt dqt, Application application, cev cev, gqd gqd, gmg gmg1, bjw bjw, cix cix1, 
            dpb dpb, dqx dqx, dpg dpg, gob gob, dce dce1, dkn dkn, ScheduledExecutorService scheduledexecutorservice, 
            dal dal1, dcu dcu, dao dao1, hkp hkp)
    {
        return new dcs(chp, dqt, application, cev, gqd, gmg1, bjw, cix1, dpb, dpg, gob, dce1, dkn, scheduledexecutorservice, dqx, dal1, dcu, dao1, hkp);
    }

    protected static djv a(cix cix1, UspoutClient uspoutclient, cyy cyy1)
    {
        return new djv(cix1, uspoutclient, cyy1);
    }

    protected static djw a(cev cev, grs grs1)
    {
        return new djw(cev, (AccountBalanceApi)grs1.a(com/ubercab/client/core/network/AccountBalanceApi));
    }

    protected static djz a(gju gju1, gqn gqn1, bjw bjw, ExecutorService executorservice, dak dak1)
    {
        gqn1.a(new gre(5));
        return new djz(gju1, (EmergencyApi)(new grt(gqn1)).a(new GsonConverter(bjw)).a(executorservice, new MainThreadExecutor()).a().a(com/ubercab/client/core/network/EmergencyApi), dak1);
    }

    protected static dkd a(cev cev, grs grs1, gmg gmg1, dal dal1)
    {
        return new dke(cev, (LocationApi)grs1.a(com/ubercab/client/core/network/LocationApi), gmg1, dal1);
    }

    protected static dki a(cev cev, dal dal1, PaymentApi paymentapi)
    {
        return new dki(cev, dal1, paymentapi);
    }

    protected static dkj a(grs grs1, cev cev, cyy cyy1, dak dak1)
    {
        return new dkj(cev, (PhoneNumberAnonymizationApi)grs1.a(com/ubercab/client/core/network/PhoneNumberAnonymizationApi), cyy1, dak1);
    }

    protected static dkv a(cev cev, grs grs1, dak dak1, gmg gmg1)
    {
        return new dkw(cev, (TunesApi)grs1.a(com/ubercab/client/core/network/TunesApi), dak1, gmg1);
    }

    protected static dor a(dkn dkn, don don, chp chp, czf czf1)
    {
        return new dor(dkn, don, chp, czf1);
    }

    static dzi a(cev cev, gju gju1, hkr hkr, djz djz1, gmg gmg1, hkm hkm, dak dak1, ici ici, 
            dal dal1)
    {
        return new dzi(cev, gju1, hkr, djz1, gmg1, hkm, dak1, ici, dal1);
    }

    static dzw a(cev cev, fte fte)
    {
        return new dzw(cev, fte);
    }

    protected static eww a(cev cev, grs grs1, gju gju1, gmg gmg1)
    {
        return new ewx((GuidedPickupApi)grs1.a(com/ubercab/client/feature/pickup/network/GuidedPickupApi), cev, gju1, gmg1);
    }

    protected static eyy a(cev cev, grs grs1, gmg gmg1, dal dal1, hsq hsq, hkl hkl)
    {
        return new eyy(new dkm(cev, (TroyProfileApi)grs1.a(com/ubercab/client/core/network/TroyProfileApi)), hkl, cev, gmg1, dal1, hsq);
    }

    protected static fei a(chp chp, drc drc, cev cev, hkr hkr, hku hku, dpg dpg, dkn dkn, hko hko, 
            czf czf1, dkp dkp1)
    {
        return new fei(chp, drc, cev, hkr, hku, dpg, dkn, hko, czf1, dkp1);
    }

    protected static fim a(cev cev, dkq dkq1)
    {
        return new fim(cev, dkq1);
    }

    protected static foz a(hkn hkn, dak dak1, dal dal1, gju gju1, gmg gmg1, cev cev)
    {
        return new foz(hkn, dak1, dal1, gju1, gmg1, cev);
    }

    protected static fqg a(cev cev, hkr hkr, hku hku, gmg gmg1, dpg dpg, fte fte)
    {
        return new fqg(cev, hkr, hku, gmg1, dpg, fte);
    }

    protected static gob a(Application application, dao dao1)
    {
        if (dao1.i())
        {
            return new dzv(dao1.h());
        } else
        {
            dao1 = new gnx(application);
            dao1.a("CHINA", "china", "china_approximate");
            dao1.a("INDIA", "india", "india_approximate");
            dao1.a("JAPAN", "japan", "japan_approximate");
            dao1.a("SOUTH_KOREA", "south_korea", "south_korea_approximate");
            return new gnz(gke.a(dao1, new gny(application)));
        }
    }

    protected static gpt a(Application application, djv djv1)
    {
        return new gpt(application, djv1);
    }

    static hck a(dal dal1)
    {
        return dal1;
    }

    protected static hoi a(Application application)
    {
        try
        {
            if (cxc.a(application))
            {
                return new hoj(application, "rider");
            }
            application = new hoh(application, "rider");
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            throw new IllegalStateException("Unable to create the rider key-value store.", application);
        }
        return application;
    }

    static ijj a(cyo cyo)
    {
        return cyo;
    }

    protected static PaymentApi b(grs grs1)
    {
        return (PaymentApi)grs1.a(com/ubercab/client/core/network/PaymentApi);
    }

    protected static djx b(cev cev, grs grs1)
    {
        return new djx(cev, (AccountApi)grs1.a(com/ubercab/client/core/network/AccountApi));
    }

    static SupportApi c(grs grs1)
    {
        return (SupportApi)grs1.a(com/ubercab/rds/core/network/SupportApi);
    }

    static dkc c(cev cev, grs grs1)
    {
        return new dkc(cev, (InvitationsApi)grs1.a(com/ubercab/client/core/network/InvitationsApi));
    }

    static Class c()
    {
        return com/ubercab/client/core/model/Ping;
    }

    protected static dkq d(cev cev, grs grs1)
    {
        return new dkq(cev, (ShoppingApi)grs1.a(com/ubercab/client/core/network/ShoppingApi));
    }

    static dkp e(cev cev, grs grs1)
    {
        return new dkp(cev, (SafetyNetApi)grs1.a(com/ubercab/client/core/network/SafetyNetApi));
    }

    protected static doq f()
    {
        return new doq();
    }

    protected static cyy k()
    {
        return new cyy();
    }

    protected static dce o()
    {
        return new dce();
    }

    static bjw p()
    {
        return (new bjy()).a(new hnz()).c();
    }

    protected static cev q()
    {
        return new dfr((byte)0);
    }

    protected static chx r()
    {
        return new chx();
    }

    protected static gju t()
    {
        return new gju();
    }

    protected static cor w()
    {
        return new eln();
    }

    protected static cps x()
    {
        return new elo();
    }

    protected static cpu y()
    {
        return new elp();
    }

    protected static cqx z()
    {
        return new cqx();
    }

    final Application a()
    {
        return a;
    }

    protected final bjw a(Class class1)
    {
        bjy bjy1 = (new bjy()).a(new ObjectTypeAdapterFactory()).a(new hnz()).a().b();
        bjy1.a(new bkr(class1) {

            final Class a;
            final dfq b;

            public final bkq create(bjw bjw1, bmj bmj1)
            {
                if (bmj1.getRawType() == gqj)
                {
                    return new bkq(this, bjw1.a(this, bmj1), bjw1) {

                        final bkq a;
                        final bjw b;
                        final _cls2 c;

                        public final Object a(JsonReader jsonreader)
                        {
                            return b.a(jsonreader, c.a);
                        }

                        public final void a(JsonWriter jsonwriter, Object obj)
                        {
                            a.a(jsonwriter, obj);
                        }

            
            {
                c = _pcls2;
                a = bkq1;
                b = bjw1;
                super();
            }
                    };
                } else
                {
                    return null;
                }
            }

            
            {
                b = dfq.this;
                a = class1;
                super();
            }
        });
        return bjy1.c();
    }

    protected final dal a(bjw bjw)
    {
        return new dal(a.getSharedPreferences(".session", 0), bjw);
    }

    protected final dkn a(cev cev, gqd gqd, daj daj1, dak dak1, czf czf1, dal dal1, MobileAppTracker mobileapptracker, 
            efa efa1, Class1 class1, Class3 class3, dao dao1, cyy cyy1, hjn hjn)
    {
        return new dko(cev, a, gqd, daj1, dak1, czf1, dal1, mobileapptracker, efa1, class1, class3, dao1, cyy1, hjn);
    }

    protected final dkr a(cev cev, hjn hjn, cyy cyy1, dak dak1, MobileAppTracker mobileapptracker, dao dao1, SignupApi signupapi, 
            gju gju1, chp chp)
    {
        return new dkr(cev, a, hjn, cyy1, signupapi, dak1, mobileapptracker, dao1, gju1, chp);
    }

    protected final dod a(cyy cyy1)
    {
        return new dod(a, cyy1);
    }

    protected final dol a(dom dom1, hki hki, chp chp, gmg gmg1)
    {
        return new dol(a, dom1, hki, chp, gmg1);
    }

    protected final don a(ExecutorService executorservice)
    {
        return new dwr(a, executorservice);
    }

    protected final efa a(cev cev, hkr hkr, hji hji, hku hku, daj daj1, dpg dpg, dal dal1)
    {
        return new efa(cev, a, hkr, hji, hku, daj1, dpg, dal1);
    }

    final eku a(cgh cgh)
    {
        return new eku(a, cgh);
    }

    protected final eky a(chp chp, drc drc, cev cev, hkr hkr, hku hku, ExecutorService executorservice, gmg gmg1, 
            bjw bjw, NotificationManager notificationmanager, eku eku1, dpg dpg, czf czf1, dal dal1)
    {
        return new eky(chp, drc, cev, a, hkr, hku, executorservice, gmg1, bjw, notificationmanager, eku1, dpg, czf1, dal1);
    }

    protected final gmg a(chp chp, Application application, cev cev, hku hku, ExecutorService executorservice, bjw bjw, gqn gqn1, 
            hoi hoi, LocationManager locationmanager, dal dal1, UspoutClient uspoutclient, hkr hkr, daj daj1)
    {
        gqn1.a(10000L, TimeUnit.MILLISECONDS);
        executorservice = (ExperimentApi)(new grt(gqn1)).a(new GsonConverter(bjw)).a(executorservice, null).a().a(com/ubercab/experiment/network/ExperimentApi);
        bjw = cwt.a(a);
        gqn1 = cwt.f();
        dal1 = new daz(dal1);
        locationmanager = new dbc(cev, application, hku, locationmanager);
        application = new dby(cev, application, hku, hkr, daj1);
        chp = new gmg(a, executorservice, new dbb(uspoutclient), "rider", bjw, gqn1, chp, hoi, dal1, locationmanager, application);
        chp.a(new gmk(chp) {

            final gmg a;
            final dfq b;

            public final void a(gmj gmj1)
            {
                if (gmj1.a() != null)
                {
                    a.b(dbf.cR);
                    return;
                } else
                {
                    a.b(dbf.cP);
                    a.b(dbf.cQ);
                    return;
                }
            }

            
            {
                b = dfq.this;
                a = gmg1;
                super();
            }
        });
        return chp;
    }

    protected final RiderApplication b()
    {
        return a;
    }

    protected final cqn b(dal dal1)
    {
        return new ely(dal1, a);
    }

    protected final dai b(bjw bjw)
    {
        return new dai(a.getSharedPreferences(".storage", 0), bjw);
    }

    protected final cyl d()
    {
        return new cyl(a);
    }

    protected final dom e()
    {
        return new dom(a);
    }

    protected final czf g()
    {
        android.content.SharedPreferences sharedpreferences = a.getSharedPreferences(".rider_preferences", 0);
        return new czf(a, sharedpreferences);
    }

    protected final hch h()
    {
        return new hch(a.getSharedPreferences("com.ubercab.rds.SHARED_PREFERENCES", 0));
    }

    protected final MobileAppTracker i()
    {
        Object obj = a.getString(0x7f07077b);
        String s1 = a.getString(0x7f07077c);
        MobileAppTracker.init(a, ((String) (obj)), s1);
        obj = MobileAppTracker.getInstance();
        ((MobileAppTracker) (obj)).setAllowDuplicates(true);
        ((MobileAppTracker) (obj)).setDebugMode(false);
        return ((MobileAppTracker) (obj));
    }

    final ContentResolver j()
    {
        return a.getContentResolver();
    }

    protected final Class1 l()
    {
        Class1 class1 = Class1.Method1();
        class1.Method2(a);
        return class1;
    }

    protected final Class3 m()
    {
        Class3 class3 = Class3.Method1();
        class3.Method2(a);
        return class3;
    }

    final cyg n()
    {
        return new cyg(a);
    }

    protected final dcu s()
    {
        return new dcu() {

            final dfq a;

            public final cis a(Application application, cit cit)
            {
                return new cis(application, cit);
            }

            
            {
                a = dfq.this;
                super();
            }
        };
    }

    protected final LocationManager u()
    {
        return (LocationManager)a.getSystemService("location");
    }

    protected final NotificationManager v()
    {
        return (NotificationManager)a.getSystemService("notification");
    }
}
