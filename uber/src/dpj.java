// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.os.Build;
import com.security.class1.Class1;
import com.security.class3.Class3;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.Headers;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.rider.realtime.object.ObjectTypeAdapterFactory;
import com.ubercab.rider.realtime.object.PersistedObjectDataStore;
import com.ubercab.rider.realtime.request.param.Location;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import retrofit.converter.GsonConverter;

public final class dpj
{

    private final RiderApplication a;

    public dpj(RiderApplication riderapplication)
    {
        a = riderapplication;
    }

    static PersistedObjectDataStore a(hkv hkv1, hoi hoi)
    {
        return PersistedObjectDataStore.newStore(hkv1, hoi);
    }

    static doy a(hkb hkb1, iir iir1, hji hji, gmg gmg, ici ici)
    {
        return new doy(hkb1, iir1, hji, gmg, ici);
    }

    static dpa a(iir iir1, hkm hkm1)
    {
        return new dpa(iir1, hkm1);
    }

    static dpb a(iir iir1, iir iir2)
    {
        return new dpb(iir1, iir2);
    }

    static dpg a(gmg gmg)
    {
        return new dpg(gmg);
    }

    static dqt a(hkr hkr)
    {
        return dqt.a(hkr);
    }

    private static dqy a(ica ica1, hkk hkk1)
    {
        return new dqy(new hjn(ica1, hkk1) {

            final ica a;
            final hkk b;

            private ica b()
            {
                return a.b(new idi(this) {

                    final _cls6 a;

                    private ica a(UberLatLng uberlatlng)
                    {
                        if (uberlatlng != null)
                        {
                            double d1 = uberlatlng.a();
                            double d2 = uberlatlng.b();
                            return a.b.a(d1, d2);
                        } else
                        {
                            return ica.b();
                        }
                    }

                    public final volatile Object a(Object obj)
                    {
                        return a((UberLatLng)obj);
                    }

            
            {
                a = _pcls6;
                super();
            }
                });
            }

            public final Object a()
            {
                return b();
            }

            
            {
                a = ica1;
                b = hkk1;
                super();
            }
        }, 60L, TimeUnit.SECONDS);
    }

    static dqz a(dra dra1)
    {
        return dqz.a(dra1);
    }

    static dra a(ScheduledExecutorService scheduledexecutorservice)
    {
        return dra.a(scheduledexecutorservice);
    }

    static drc a(dqt dqt1, gmg gmg, daj daj, dpg dpg1)
    {
        return new drc(dqt1, gmg, daj, dpg1);
    }

    static hji a(PersistedObjectDataStore persistedobjectdatastore)
    {
        return persistedobjectdatastore;
    }

    static hkb a(hjo hjo1)
    {
        return hkb.a(hjo1);
    }

    static hkr a(hji hji)
    {
        return hks.a(hji);
    }

    static hkr a(hkr hkr, bjw bjw, daj daj, dpg dpg1)
    {
        return new dpd(hkr, bjw, daj, dpg1);
    }

    static hku a(hku hku, dpg dpg1)
    {
        return dpe.a(hku, dpg1);
    }

    static hku a(hkv hkv1)
    {
        return hkv1;
    }

    static hkv a()
    {
        return hkv.a(ico.a());
    }

    private static ica a(dak dak)
    {
        return ica.a(new idh(dak) {

            final dak a;

            private ica a()
            {
                Object obj;
                Object obj1;
                RiderLocation riderlocation;
                obj1 = null;
                riderlocation = a.c();
                obj = a.b();
                if (obj == null || ((RiderLocation) (obj)).getUberLatLng() == null) goto _L2; else goto _L1
_L1:
                obj = ((RiderLocation) (obj)).getUberLatLng();
_L4:
                return ica.b(obj);
_L2:
                obj = obj1;
                if (riderlocation != null)
                {
                    obj = obj1;
                    if (riderlocation.getUberLatLng() != null)
                    {
                        obj = riderlocation.getUberLatLng();
                    }
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            public final Object call()
            {
                return a();
            }

            
            {
                a = dak1;
                super();
            }
        });
    }

    private static void a(gqn gqn1, Cache cache, Application application)
    {
        gqn1.a(30000L, TimeUnit.MILLISECONDS);
        gqn1.b(30000L, TimeUnit.MILLISECONDS);
        gqn1.a(cache);
        duf.a(application, gqn1);
    }

    protected static dqv b(hji hji)
    {
        return new dqv(hji);
    }

    static hjk b()
    {
        return hjk.a();
    }

    static hkc b(hjo hjo1)
    {
        return hkc.a(hjo1);
    }

    static hjm c()
    {
        return new hjm();
    }

    static hki c(hjo hjo1)
    {
        return hki.a(hjo1);
    }

    static hkl d(hjo hjo1)
    {
        return hkl.a(hjo1);
    }

    static iir d()
    {
        return iir.m();
    }

    static hkm e(hjo hjo1)
    {
        return hkm.a(hjo1);
    }

    static iir e()
    {
        return iir.m();
    }

    static hke f(hjo hjo1)
    {
        return hke.a(hjo1);
    }

    static hkn g(hjo hjo1)
    {
        return hkn.a(hjo1);
    }

    static hko h(hjo hjo1)
    {
        return hko.a(hjo1);
    }

    static hkp i(hjo hjo1)
    {
        return hkp.a(hjo1);
    }

    static hkk j(hjo hjo1)
    {
        return hkk.a(hjo1);
    }

    static hjo k(hjo hjo1)
    {
        return hjo1;
    }

    protected final dqw a(hjk hjk1, dqx dqx1)
    {
        return new dqw(hjk1, dqx1, a);
    }

    protected final dqx a(hjm hjm1, dak dak, hkk hkk1, hkm hkm1, dpa dpa1, dqz dqz1)
    {
        dak = a(dak);
        new dqy(new hjn(hkm1) {

            final hkm a;
            final dpj b;

            private ica b()
            {
                return a.a();
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dpj.this;
                a = hkm1;
                super();
            }
        }, 60L, TimeUnit.SECONDS);
        a(((ica) (dak)), hkk1);
        return new dqx(dqz1, new dqy[] {
            new dqy(new hjn(dak, dpa1, hjm1) {

                final ica a;
                final dpa b;
                final hjm c;
                final dpj d;

                private ica b()
                {
                    return a.b(new idi(this) {

                        final _cls5 a;

                        private ica a(UberLatLng uberlatlng)
                        {
                            Location location = null;
                            if (uberlatlng != null)
                            {
                                location = Location.create(uberlatlng.a(), uberlatlng.b());
                            }
                            return a.b.a(location, a.c);
                        }

                        public final volatile Object a(Object obj)
                        {
                            return a((UberLatLng)obj);
                        }

            
            {
                a = _pcls5;
                super();
            }
                    });
                }

                public final Object a()
                {
                    return b();
                }

            
            {
                d = dpj.this;
                a = ica1;
                b = dpa1;
                c = hjm1;
                super();
            }
            }, 4L, TimeUnit.SECONDS)
        });
    }

    final hjn a(Application application, dao dao, gju gju, dal dal, dak dak, Class1 class1, Class3 class3)
    {
        hjl hjl1 = hjl.a().a("com.ubercab").b("client").d("android").f(cxf.a(cwt.a(application))).g(cwt.a()).n(Build.MODEL).q(android.os.Build.VERSION.RELEASE).r(cwt.c()).t("client/android/3.76.4");
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
        class1 = hashmap.entrySet().iterator();
        do
        {
            if (!class1.hasNext())
            {
                break;
            }
            class3 = (java.util.Map.Entry)class1.next();
            if (class3.getValue() != null && !((String)class3.getValue()).isEmpty())
            {
                hjl1.a((String)class3.getKey(), (String)class3.getValue());
            }
        } while (true);
        return new hjn(hjl1, application, gju, dal, dao, dak) {

            final hjl a;
            final Application b;
            final gju c;
            final dal d;
            final dao e;
            final dak f;
            final dpj g;

            private hjl b()
            {
                a.p(cwt.e(b));
                a.o(cwt.d(b));
                a.e(String.valueOf(gju.a()));
                a.s(d.u());
                String s;
                RiderLocation riderlocation;
                if (e.q())
                {
                    s = e.r();
                } else
                {
                    s = "3.76.4";
                }
                a.c(s);
                riderlocation = f.c();
                if (riderlocation != null)
                {
                    String s1 = "";
                    s = "";
                    if (riderlocation.getUberLatLng() != null)
                    {
                        s1 = String.valueOf(riderlocation.getUberLatLng().a());
                        s = String.valueOf(riderlocation.getUberLatLng().b());
                    }
                    a.h(String.valueOf(riderlocation.getAccuracy())).i(String.valueOf(riderlocation.getAltitude())).j(String.valueOf(riderlocation.getBearing())).k(s1).l(s).m(String.valueOf(riderlocation.getSpeed()));
                }
                return a;
            }

            public final Object a()
            {
                return b();
            }

            
            {
                g = dpj.this;
                a = hjl1;
                b = application;
                c = gju1;
                d = dal1;
                e = dao1;
                f = dak1;
                super();
            }
        };
    }

    protected final hjo a(Application application, Cache cache, gqu gqu, grb grb, glg glg, Executor executor, hjn hjn, 
            hji hji, hjk hjk1, djt djt, dak dak)
    {
        dak = new gqy(dak) {

            final dak a;
            final dpj b;

            public final gqq a(gqo gqo1, gqz gqz1)
            {
                RiderLocation riderlocation = a.b();
                Object obj = gqo1;
                if (riderlocation != null)
                {
                    obj = gqo1;
                    if (riderlocation.getUberLatLng() != null)
                    {
                        obj = riderlocation.getUberLatLng();
                        obj = (new gqp(gqo1)).a(gqo1.c().newBuilder().add("x-uber-pin-location-latitude", String.format("%f", new Object[] {
                            Double.valueOf(((UberLatLng) (obj)).a())
                        })).add("x-uber-pin-location-longitude", String.format("%f", new Object[] {
                            Double.valueOf(((UberLatLng) (obj)).b())
                        })).build()).b();
                    }
                }
                return gqz1.a(((gqo) (obj)));
            }

            
            {
                b = dpj.this;
                a = dak1;
                super();
            }
        };
        gqy gqy = new gqy() {

            final dpj a;

            public final gqq a(gqo gqo1, gqz gqz1)
            {
                ijg.a(gqo1.toString(), new Object[0]);
                gqo1 = gqz1.a(gqo1);
                ijg.a(gqo1.toString(), new Object[0]);
                return gqo1;
            }

            
            {
                a = dpj.this;
                super();
            }
        };
        gqu = new gqn(gqu);
        a(((gqn) (gqu)), cache, application);
        gqu.a(grb);
        gqu.a(gqy);
        gqu.a(glg);
        gqu.a(djt);
        gqu.a(dak);
        application = new ObjectTypeAdapterFactory();
        return hjo.a(gqu, executor, new GsonConverter((new bjy()).a(application).c()), hjn, hjk1, hji);
    }
}
