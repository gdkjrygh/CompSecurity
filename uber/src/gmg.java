// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.experiment.model.Experiment;
import com.ubercab.experiment.model.Experiments;
import com.ubercab.experiment.model.TreatmentGroup;
import com.ubercab.experiment.model.TreatmentGroupDefinition;
import com.ubercab.experiment.network.ExperimentApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class gmg
{

    private final Map a = new HashMap();
    private final bjw b = (new bjy()).a(new hnz()).c();
    private final Set c = new CopyOnWriteArraySet();
    private final Handler d = new Handler(Looper.getMainLooper());
    private final Map e = new HashMap();
    private final Set f = new HashSet();
    private final Set g = new HashSet();
    private final Set h = new HashSet();
    private final Application i;
    private final chp j;
    private final ExperimentApi k;
    private final gmm l;
    private final String m;
    private final String n;
    private final String o;
    private final hoi p;
    private int q;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener r = new _cls1();
    private gme s;
    private gme t;
    private gme u;
    private gmj v;
    private gmj w;

    public gmg(Application application, ExperimentApi experimentapi, gmm gmm1, String s1, String s2, String s3, chp chp1, 
            hoi hoi1, gme gme1, gme gme2, gme gme3)
    {
        q = gmn.b;
        v = gmj.a;
        w = gmj.a;
        i = application;
        k = experimentapi;
        l = gmm1;
        m = s1;
        n = s2;
        o = s3;
        j = chp1;
        p = hoi1;
        s = gme1;
        t = gme2;
        u = gme3;
        application = new gmi(this, (byte)0);
        s.a(application);
        t.a(application);
        u.a(application);
        e();
        f();
        v = gmj.a((String)s.a(), (Pair)t.a(), (String)u.a());
        d();
    }

    static Map a(gmg gmg1)
    {
        return gmg1.e;
    }

    static void a(gmg gmg1, gmj gmj1)
    {
        gmg1.a(gmj1);
    }

    private void a(gmj gmj1)
    {
        w = gmj1;
        q = gmn.c;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((gmk)iterator.next()).a(gmj1)) { }
    }

    private void a(gmv gmv1, String s1, gmh gmh1)
    {
        if (l != null && g.add(gmv1))
        {
            Object obj;
            if (s1 == null)
            {
                obj = gml.b;
            } else
            if ("control".equals(s1))
            {
                obj = gml.c;
            } else
            {
                obj = gml.a;
            }
            obj = c(((gmv) (obj)));
            if (obj != null && !"control".equals(((Experiment) (obj)).getTreatmentGroupName()))
            {
                l.a(gmv1, s1, w, gmh1);
                return;
            }
        }
    }

    static bjw b(gmg gmg1)
    {
        return gmg1.b;
    }

    static gmj b(gmg gmg1, gmj gmj1)
    {
        gmg1.v = gmj1;
        return gmj1;
    }

    private Experiment c(gmv gmv1)
    {
        String s1 = gmv1.name().toLowerCase(Locale.US);
        Experiment experiment = (Experiment)e.get(s1);
        gmv1 = experiment;
        if (experiment == null)
        {
            gmv1 = (Experiment)a.get(s1);
        }
        return gmv1;
    }

    static gmj c(gmg gmg1)
    {
        return gmg1.v;
    }

    private Object c(gmv gmv1, String s1)
    {
        gmv1 = c(gmv1);
        if (gmv1 == null)
        {
            return null;
        } else
        {
            return gmv1.getParameters().get(s1);
        }
    }

    private void d()
    {
        Double double2 = null;
        if (q == gmn.a)
        {
            return;
        }
        q = gmn.a;
        gmj gmj1 = v;
        ExperimentApi experimentapi = k;
        String s1 = n;
        String s2 = o;
        String s3 = gmo.a();
        String s4 = m;
        String s5 = gmo.a(i);
        String s6 = gmj1.a();
        Double double1;
        if (gmj1.b() != null)
        {
            double1 = (Double)gmj1.b().first;
        } else
        {
            double1 = null;
        }
        if (gmj1.b() != null)
        {
            double2 = (Double)gmj1.b().second;
        }
        experimentapi.getExperiments("android", s1, s2, s3, s4, s5, s6, double1, double2, gmj1.c(), j.e().b(), new _cls2(gmj1));
    }

    static void d(gmg gmg1)
    {
        gmg1.d();
    }

    private void d(gmv gmv1)
    {
        Experiment experiment;
        for (experiment = c(gmv1); experiment == null || !f.add(gmv1);)
        {
            return;
        }

        HashMap hashmap = new HashMap();
        hashmap.put("segment_uuid", experiment.getSegmentUuid());
        gmv1 = AnalyticsEvent.create("experiment").setName(gmv1).setTreatmentGroupId(experiment.getTreatmentGroupId()).setCustomValues(hashmap);
        j.a(gmv1);
    }

    static Handler e(gmg gmg1)
    {
        return gmg1.d;
    }

    private void e()
    {
        SharedPreferences sharedpreferences = i.getSharedPreferences(".experiment_overrides", 0);
        for (Iterator iterator = sharedpreferences.getAll().entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            try
            {
                e.put(entry.getKey(), Experiment.create((String)entry.getKey(), (TreatmentGroupDefinition)b.a(String.valueOf(entry.getValue()), com/ubercab/experiment/model/TreatmentGroupDefinition)));
            }
            catch (Exception exception) { }
        }

        sharedpreferences.registerOnSharedPreferenceChangeListener(r);
    }

    static gme f(gmg gmg1)
    {
        return gmg1.s;
    }

    private void f()
    {
        HashMap hashmap = (HashMap)p.a("com.ubercab:experiment:cache", java/util/HashMap);
        if (hashmap != null)
        {
            a.putAll(hashmap);
        }
    }

    static gme g(gmg gmg1)
    {
        return gmg1.t;
    }

    static gme h(gmg gmg1)
    {
        return gmg1.u;
    }

    public final double a(gmv gmv1, String s1, double d1)
    {
        d(gmv1);
        double d2;
        try
        {
            d2 = Double.valueOf(String.valueOf(c(gmv1, s1))).doubleValue();
        }
        // Misplaced declaration of an exception variable
        catch (gmv gmv1)
        {
            return d1;
        }
        return d2;
    }

    public final long a(gmv gmv1, String s1, long l1)
    {
        d(gmv1);
        double d1 = l1;
        try
        {
            d1 = a(gmv1, s1, d1);
        }
        // Misplaced declaration of an exception variable
        catch (gmv gmv1)
        {
            return l1;
        }
        return (long)d1;
    }

    public final ExperimentApi a()
    {
        return k;
    }

    public final String a(gmv gmv1, String s1, String s2)
    {
        d(gmv1);
        gmv1 = ((gmv) (c(gmv1, s1)));
        if (gmv1 != null)
        {
            s2 = gmv1.toString();
        }
        return s2;
    }

    final void a(Experiments experiments)
    {
        f.clear();
        g.clear();
        a.clear();
        p.a("com.ubercab:experiment:cache");
        if (experiments != null)
        {
            experiments = experiments.getExperiments().iterator();
            do
            {
                if (!experiments.hasNext())
                {
                    break;
                }
                Experiment experiment = (Experiment)experiments.next();
                if (experiment != null && !TextUtils.isEmpty(experiment.getName()))
                {
                    a.put(experiment.getName(), experiment);
                }
            } while (true);
            p.a("com.ubercab:experiment:cache", a);
        }
    }

    public final void a(gmk gmk1)
    {
        gmk1.a(w);
        c.add(gmk1);
    }

    public final boolean a(gmv gmv1)
    {
        return !b(gmv1);
    }

    public final boolean a(gmv gmv1, TreatmentGroup treatmentgroup)
    {
        return a(gmv1, treatmentgroup.name());
    }

    public final boolean a(gmv gmv1, String s1)
    {
        d(gmv1);
        h.add(Experiment.create(gmv1.name(), s1));
        Experiment experiment = c(gmv1);
        if (experiment == null)
        {
            a(gmv1, null, ((gmh) (null)));
            return "control".equalsIgnoreCase(s1);
        } else
        {
            a(gmv1, s1, gmh.a(experiment.getSegmentUuid()));
            return s1.equalsIgnoreCase(experiment.getTreatmentGroupName());
        }
    }

    public final String b(gmv gmv1, String s1)
    {
        return a(gmv1, s1, ((String) (null)));
    }

    public final List b()
    {
        return new ArrayList(a.values());
    }

    public final boolean b(gmk gmk1)
    {
        return c.remove(gmk1);
    }

    public final boolean b(gmv gmv1)
    {
        Object obj1 = null;
        d(gmv1);
        Experiment experiment = c(gmv1);
        String s1;
        Object obj;
        Set set;
        String s2;
        if (experiment == null)
        {
            s1 = null;
        } else
        {
            s1 = experiment.getTreatmentGroupName();
        }
        set = h;
        s2 = gmv1.name();
        if (s1 != null)
        {
            obj = s1;
        } else
        {
            obj = "control";
        }
        set.add(Experiment.create(s2, ((String) (obj))));
        if (experiment == null)
        {
            obj = obj1;
        } else
        {
            obj = gmh.a(experiment.getSegmentUuid());
        }
        a(gmv1, s1, ((gmh) (obj)));
        return s1 == null || "control".equals(s1);
    }

    public final Set c()
    {
        return Collections.unmodifiableSet(h);
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
