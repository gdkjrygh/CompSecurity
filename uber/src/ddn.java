// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.ubercab.crash.CrashlineClient;
import com.ubercab.crash.model.Carrier;
import com.ubercab.crash.model.Crash;
import com.ubercab.crash.model.Device;
import com.ubercab.experiment.model.Experiment;
import com.ubercab.network.uspout.UspoutClient;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class ddn
{

    private final Application a;

    public ddn(Application application)
    {
        a = application;
    }

    static Application a(ddn ddn1)
    {
        return ddn1.a;
    }

    public static CrashlineClient a(gqn gqn, ExecutorService executorservice)
    {
        return new CrashlineClient(gqn, executorservice);
    }

    public static Crash a(gmg gmg1)
    {
        Crash crash = Crash.create(new Bundle(), null);
        crash.addExperimentTreatment(dbf.I.toString(), Boolean.valueOf(gmg1.a(dbf.I)));
        crash.addExperimentTreatment(dbf.P.toString(), Boolean.valueOf(gmg1.a(dbf.P)));
        crash.addExperimentTreatment(dbf.J.toString(), Boolean.valueOf(gmg1.a(dbf.J)));
        crash.addExperimentTreatment(dbf.K.toString(), Boolean.valueOf(gmg1.a(dbf.K)));
        return crash;
    }

    public static das a(glf glf1, chp chp1, gmg gmg1, UspoutClient uspoutclient)
    {
        return new das(glf1, chp1, gmg1, uspoutclient);
    }

    public static dat a(hoi hoi, gld gld, gmc gmc, glr glr1, Application application, Collection collection, Crash crash)
    {
        return new dat(hoi, gld, glr1, gmc, Thread.getDefaultUncaughtExceptionHandler(), application, collection, crash);
    }

    public static gky a(dat dat1, cyy cyy, UspoutClient uspoutclient, CrashlineClient crashlineclient, chp chp1, ici ici)
    {
        return new dau(dat1, cyy, uspoutclient, crashlineclient, chp1, ici);
    }

    protected static glf a(hoi hoi, gmc gmc, glr glr1)
    {
        return new glf(Thread.getDefaultUncaughtExceptionHandler(), hoi, gmc, glr1);
    }

    public static hoi a(Application application)
    {
        try
        {
            application = new hoh(application, "crashlog.index");
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            throw new IllegalStateException("Unable to create crashlog index storable.", application);
        }
        return application;
    }

    public static glg b()
    {
        return new glg();
    }

    protected static czg c()
    {
        return new czg();
    }

    public final gld a()
    {
        return new gld() {

            final ddn a;

            public final hoi a(Application application, String s)
            {
                return new hoh(application, s);
            }

            
            {
                a = ddn.this;
                super();
            }
        };
    }

    public final gle a(dal dal)
    {
        return new gle(dal) {

            final dal a;
            final ddn b;

            public final String a()
            {
                return a.z();
            }

            
            {
                b = ddn.this;
                a = dal1;
                super();
            }
        };
    }

    public final glr a(cyy cyy, hkr hkr, cix cix, gmg gmg1)
    {
        cix = new gma(cix) {

            final cix a;
            final ddn b;

            public final Double a()
            {
                return a.d();
            }

            public final Double b()
            {
                return a.e();
            }

            
            {
                b = ddn.this;
                a = cix1;
                super();
            }
        };
        glv glv = new glv(hkr) {

            final hkr a;
            final ddn b;

            public final String a()
            {
                City city = a.b();
                if (city != null)
                {
                    return city.getCityName();
                } else
                {
                    return null;
                }
            }

            
            {
                b = ddn.this;
                a = hkr1;
                super();
            }
        };
        glw glw = new glw() {

            final ddn a;

            public final String a()
            {
                return "efa2485";
            }

            
            {
                a = ddn.this;
                super();
            }
        };
        cyy = new glx(cyy) {

            final cyy a;
            final ddn b;

            public final String a()
            {
                return cyy.a();
            }

            
            {
                b = ddn.this;
                a = cyy1;
                super();
            }
        };
        glu glu = new glu() {

            final ddn a;

            public final Carrier a()
            {
                return Carrier.create(((TelephonyManager)ddn.a(a).getSystemService("phone")).getNetworkOperatorName(), cwt.c(ddn.a(a)), cwt.b(ddn.a(a)));
            }

            
            {
                a = ddn.this;
                super();
            }
        };
        gly gly = new gly() {

            final ddn a;

            public final Device a()
            {
                return Device.create(Locale.getDefault().getLanguage(), Build.MANUFACTURER, Build.MODEL, "android", android.os.Build.VERSION.RELEASE, cwt.a(ddn.a(a)), Boolean.valueOf(cxd.a(ddn.a(a)).a()));
            }

            
            {
                a = ddn.this;
                super();
            }
        };
        hkr = new gle(hkr) {

            final hkr a;
            final ddn b;

            public final String a()
            {
                Client client = a.c();
                if (client != null)
                {
                    return client.getUuid();
                } else
                {
                    return null;
                }
            }

            
            {
                b = ddn.this;
                a = hkr1;
                super();
            }
        };
        glt glt = new glt() {

            final ddn a;

            public final String a()
            {
                return dun.a("", "release");
            }

            
            {
                a = ddn.this;
                super();
            }
        };
        gls gls = new gls() {

            final ddn a;

            public final String a()
            {
                return ddn.a(a).getPackageName();
            }

            
            {
                a = ddn.this;
                super();
            }
        };
        gmg1 = new glz(gmg1) {

            final gmg a;
            final ddn b;

            public final Set a()
            {
                Object obj = a.c();
                HashSet hashset = new HashSet(((Set) (obj)).size());
                Experiment experiment;
                for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashset.add(com.ubercab.crash.model.Experiment.create(experiment.getName(), experiment.getTreatmentGroupName())))
                {
                    experiment = (Experiment)((Iterator) (obj)).next();
                }

                if (hashset.size() > 0)
                {
                    return hashset;
                } else
                {
                    return null;
                }
            }

            
            {
                b = ddn.this;
                a = gmg1;
                super();
            }
        };
        return new glr(com.ubercab.crash.model.MetaData.ApplicationName.RIDER, cyy, glt, glw, gls, hkr, gly, glu, cix, glv, gmg1);
    }

    public final Collection a(Crash crash, gmc gmc, chp chp1, grb grb, glg glg1)
    {
        if (cxc.a(a) && !crash.isExperimentOn(dbf.I.toString()))
        {
            return Collections.EMPTY_SET;
        }
        gkf gkf1 = new gkf();
        gkf1.a(new gln(gmc));
        if (!cxc.a(a) || crash.isExperimentOn(dbf.P.toString()))
        {
            gkf1.a(new glm());
        }
        chp1.d();
        gkf1.a(new glk(chp1));
        gkf1.a(new gll(new gla(chp1)));
        gkf1.a(new gmb(grb));
        gkf1.a(new glp(glg1));
        gkf1.a(new glo(chp1));
        return gkf1.a();
    }

    protected final gmc d()
    {
        return new gmd(a);
    }
}
