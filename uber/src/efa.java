// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.mobilemessage.MobileMessageModuleView;
import com.ubercab.client.feature.mobilemessage.model.MobileMessageDataHolder;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.MobileMessage;
import com.ubercab.rider.realtime.model.MobileMessageDisplayProperties;
import com.ubercab.rider.realtime.model.MobileMessageModule;
import com.ubercab.rider.realtime.model.ProductGroup;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class efa
{

    private static final Map b = (new gkh()).a("supportVersion", "0.1").a();
    final Map a = new LinkedHashMap();
    private final cev c;
    private final Context d;
    private final hkr e;
    private final hji f;
    private final hku g;
    private final daj h;
    private final dpg i;
    private final dal j;
    private Map k;
    private MobileMessage l;
    private final Set m = new HashSet();
    private final Set n = new HashSet();
    private final Map o = new HashMap();

    public efa(cev cev1, Context context, hkr hkr1, hji hji1, hku hku1, daj daj1, dpg dpg1, 
            dal dal1)
    {
        c = cev1;
        d = context;
        e = hkr1;
        f = hji1;
        g = hku1;
        h = daj1;
        i = dpg1;
        j = dal1;
    }

    static Set a(efa efa1)
    {
        return efa1.m;
    }

    static boolean a(efa efa1, MobileMessage mobilemessage)
    {
        return efa1.c(mobilemessage);
    }

    static Set b(efa efa1)
    {
        return efa1.n;
    }

    static boolean b(MobileMessage mobilemessage)
    {
        return g(mobilemessage);
    }

    static boolean b(efa efa1, MobileMessage mobilemessage)
    {
        return efa1.d(mobilemessage);
    }

    static long c(efa efa1, MobileMessage mobilemessage)
    {
        return efa1.f(mobilemessage);
    }

    private boolean c(MobileMessage mobilemessage)
    {
        Object obj = e.b();
        if (obj != null)
        {
            obj = ((City) (obj)).getMessages();
        } else
        {
            obj = null;
        }
        return obj != null && ((List) (obj)).contains(mobilemessage);
    }

    private boolean d(MobileMessage mobilemessage)
    {
        return mobilemessage != null && g().contains(mobilemessage.getId());
    }

    private void e(MobileMessage mobilemessage)
    {
        MobileMessageDisplayProperties mobilemessagedisplayproperties;
        if (mobilemessage.getModules() != null && !mobilemessage.getModules().isEmpty())
        {
            if ((mobilemessagedisplayproperties = mobilemessage.getDisplayProps()) != null && (mobilemessagedisplayproperties.getShowAfterRequestingVehicleViewId() != null || mobilemessagedisplayproperties.getShowAsFareEstimateInfoForVehicleViewId() != null))
            {
                MobileMessageModuleView mobilemessagemoduleview = new MobileMessageModuleView(d);
                mobilemessagemoduleview.a(new efe(mobilemessagemoduleview) {

                    final MobileMessageModuleView a;
                    final efa b;

                    public final void a(String s)
                    {
                    }

                    public final void e_()
                    {
                        efa.a(b).remove(a);
                        efa.b(b).add(a.a());
                    }

            
            {
                b = efa.this;
                a = mobilemessagemoduleview;
                super();
            }
                });
                m.add(mobilemessagemoduleview);
                MobileMessageDataHolder mobilemessagedataholder = new MobileMessageDataHolder(e.b(), e.c(), e.f());
                mobilemessagemoduleview.a(mobilemessage.getId(), (MobileMessageModule)mobilemessage.getModules().get(0), mobilemessagedataholder);
                return;
            }
        }
    }

    private long f()
    {
        if (!i.n())
        {
            return h.c();
        }
        Long long1 = f.getLastTransactionTimeMillis();
        if (long1 != null)
        {
            return long1.longValue();
        } else
        {
            return 0L;
        }
    }

    private long f(MobileMessage mobilemessage)
    {
        if (mobilemessage == null || mobilemessage.getDisplayProps() == null)
        {
            return 0L;
        } else
        {
            return k().getLong((new StringBuilder("message.lastrequest.")).append(mobilemessage.getId()).toString(), 0L);
        }
    }

    private Set g()
    {
        return k().getStringSet("messages.seen.ids", Collections.emptySet());
    }

    private static boolean g(MobileMessage mobilemessage)
    {
        mobilemessage = mobilemessage.getDisplayProps().getShowAsPersistentInEatsLookingView();
        return mobilemessage != null && mobilemessage.booleanValue();
    }

    private boolean g(String s)
    {
        if (s == null)
        {
            return false;
        } else
        {
            HashSet hashset = new HashSet(g());
            hashset.add(s);
            android.content.SharedPreferences.Editor editor = k().edit();
            editor.putStringSet("messages.seen.ids", hashset);
            editor.putLong((new StringBuilder("message.lastrequest.")).append(s).toString(), f());
            editor.apply();
            return true;
        }
    }

    private void h()
    {
        k = null;
    }

    private boolean h(String s)
    {
        City city = e.b();
        List list;
        if (city != null)
        {
            list = city.getProductGroups();
        } else
        {
            list = null;
        }
        if (list != null && !list.isEmpty())
        {
            s = city.findVehicleViewById(s);
            if (s != null && s.getProductGroupUuid() != null)
            {
                return fte.b(city.findProductGroupByUuid(s.getProductGroupUuid()).getGroupType());
            }
        }
        return false;
    }

    private boolean i()
    {
        return k().getBoolean("messages.migrated", true);
    }

    private void j()
    {
        for (Iterator iterator = l().getStringSet("mobile_messages_viewed", new HashSet()).iterator(); iterator.hasNext(); g((String)iterator.next())) { }
        k().edit().putBoolean("messages.migrated", false).apply();
    }

    private SharedPreferences k()
    {
        return d.getSharedPreferences(".mobile_messages", 0);
    }

    private SharedPreferences l()
    {
        return d.getSharedPreferences("mobile_messages", 0);
    }

    public final MobileMessage a(String s)
    {
        return (MobileMessage)a.get(s);
    }

    public final List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                MobileMessage mobilemessage = a(((MobileMessage)list.next()).getId());
                if (mobilemessage.getModules() != null)
                {
                    MobileMessageDisplayProperties mobilemessagedisplayproperties = mobilemessage.getDisplayProps();
                    if (mobilemessagedisplayproperties.getShowInDrawer() != null && mobilemessagedisplayproperties.getShowInDrawer().booleanValue())
                    {
                        arraylist.add(mobilemessage);
                    }
                }
            } while (true);
        }
        return arraylist;
    }

    public final void a()
    {
        c.a(this);
        if (i())
        {
            j();
        }
        g.b().c(new efb(this, (byte)0));
    }

    final void a(gjy gjy1)
    {
        Object obj = null;
        if (gjy1.b())
        {
            gjy1 = ((City)gjy1.c()).getMessages();
        } else
        {
            gjy1 = null;
        }
        if (gjy1 != null && !gjy1.isEmpty())
        {
            Iterator iterator = gjy1.iterator();
            gjy1 = obj;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                MobileMessage mobilemessage = (MobileMessage)iterator.next();
                if (mobilemessage.getModules() == null)
                {
                    continue;
                }
                Object obj1 = mobilemessage.getDisplayProps();
                boolean flag;
                if (((MobileMessageDisplayProperties) (obj1)).getShowAsModalOverRequestView() != null && ((MobileMessageDisplayProperties) (obj1)).getShowAsModalOverRequestView().booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = gjy1;
                if (gjy1 == null)
                {
                    obj1 = gjy1;
                    if (flag)
                    {
                        obj1 = gjy1;
                        if (!d(mobilemessage))
                        {
                            obj1 = gjy1;
                            if (!h(mobilemessage.getVehicleViewId()))
                            {
                                if (j.i())
                                {
                                    continue;
                                }
                                obj1 = mobilemessage;
                            }
                        }
                    }
                }
                h();
                a.put(mobilemessage.getId(), mobilemessage);
                e(mobilemessage);
                gjy1 = ((gjy) (obj1));
            } while (true);
            if (gjy1 != null)
            {
                l = gjy1;
                c.c(new efm(l));
                return;
            }
        }
    }

    public final void a(Collection collection)
    {
        o.clear();
        if (collection != null)
        {
            gee gee1;
            for (collection = collection.iterator(); collection.hasNext(); o.put(gee1.d(), gee1))
            {
                gee1 = (gee)collection.next();
            }

        }
    }

    final boolean a(long l1, long l2)
    {
        while (l1 <= 0L || l2 <= 0L || f() > l1 + l2) 
        {
            return true;
        }
        return false;
    }

    public final boolean a(MobileMessage mobilemessage)
    {
        return mobilemessage != null && g(mobilemessage.getId());
    }

    public final MobileMessage b(String s)
    {
        return (MobileMessage)gki.d(a.values(), new gka(s) {

            final String a;
            final boolean b = true;
            final efa c;

            private boolean a(MobileMessage mobilemessage)
            {
                return efa.a(c, mobilemessage) && a.equals(mobilemessage.getVehicleViewId()) && (!b || !efa.b(c, mobilemessage));
            }

            public final boolean apply(Object obj)
            {
                return a((MobileMessage)obj);
            }

            
            {
                c = efa.this;
                a = s;
                super();
            }
        }).d();
    }

    public final Map b()
    {
        if (k == null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("version", "0.1");
            hashmap.put("displayProps", b);
            hashmap.put("eTags", c());
            k = hashmap;
        }
        return k;
    }

    public final MobileMessage c(String s)
    {
        return (MobileMessage)gki.d(a.values(), new gka(s) {

            final String a;
            final efa b;

            private boolean a(MobileMessage mobilemessage)
            {
                if (!efa.a(b, mobilemessage))
                {
                    return false;
                }
                MobileMessageDisplayProperties mobilemessagedisplayproperties = mobilemessage.getDisplayProps();
                if (mobilemessagedisplayproperties == null)
                {
                    return false;
                }
                long l1;
                long l2;
                if (mobilemessagedisplayproperties.getShowAsPersistentOverRequestWithTimeout() != null)
                {
                    l1 = mobilemessagedisplayproperties.getShowAsPersistentOverRequestWithTimeout().longValue();
                } else
                {
                    l1 = 0L;
                }
                l2 = efa.c(b, mobilemessage);
                return a.equals(mobilemessagedisplayproperties.getShowAfterRequestingVehicleViewId()) && b.a(l2, l1);
            }

            public final boolean apply(Object obj)
            {
                return a((MobileMessage)obj);
            }

            
            {
                b = efa.this;
                a = s;
                super();
            }
        }).d();
    }

    public final Map c()
    {
        HashMap hashmap = new HashMap();
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            String s1 = ((MobileMessage)a.get(s)).getETag();
            try
            {
                hashmap.put(s, Long.valueOf(Long.parseLong(s1)));
            }
            catch (NumberFormatException numberformatexception) { }
        }

        return hashmap;
    }

    public final MobileMessage d()
    {
        return (MobileMessage)gki.d(a.values(), new gka() {

            final efa a;

            private static boolean a(MobileMessage mobilemessage)
            {
                mobilemessage = mobilemessage.getDisplayProps();
                return mobilemessage != null && mobilemessage.getShowForDynamicPickupsSummary() != null && mobilemessage.getShowForDynamicPickupsSummary().booleanValue();
            }

            public final boolean apply(Object obj)
            {
                return a((MobileMessage)obj);
            }

            
            {
                a = efa.this;
                super();
            }
        }).d();
    }

    public final MobileMessage d(String s)
    {
        return (MobileMessage)gki.d(a.values(), new gka(s) {

            final String a;
            final efa b;

            private boolean a(MobileMessage mobilemessage)
            {
                mobilemessage = mobilemessage.getDisplayProps();
                if (mobilemessage == null)
                {
                    mobilemessage = null;
                } else
                {
                    mobilemessage = mobilemessage.getShowAsFareEstimateInfoForVehicleViewId();
                }
                return mobilemessage != null && a.equals(mobilemessage);
            }

            public final boolean apply(Object obj)
            {
                return a((MobileMessage)obj);
            }

            
            {
                b = efa.this;
                a = s;
                super();
            }
        }).d();
    }

    public final MobileMessage e(String s)
    {
        return (MobileMessage)gki.d(a.values(), new gka(s) {

            final String a;
            final efa b;

            private boolean a(MobileMessage mobilemessage)
            {
                while (!efa.a(b, mobilemessage) || !efa.b(mobilemessage) || !a.equals(mobilemessage.getVehicleViewId())) 
                {
                    return false;
                }
                return true;
            }

            public final boolean apply(Object obj)
            {
                return a((MobileMessage)obj);
            }

            
            {
                b = efa.this;
                a = s;
                super();
            }
        }).d();
    }

    public final void e()
    {
        android.content.SharedPreferences.Editor editor = k().edit();
        editor.remove("messages.seen.ids");
        editor.apply();
        h();
        a.clear();
        l = null;
    }

    public final boolean f(String s)
    {
        return n.contains(s);
    }

    public final void onPingEvent(dar dar1)
    {
        if (i.n())
        {
            return;
        }
        dar1 = dar1.a();
        if (dar1 != null)
        {
            dar1 = dar1.getCity();
        } else
        {
            dar1 = null;
        }
        a(gjy.c(dar1));
    }

    public final efm produceMobileMessageForLookingEvent()
    {
        if (l != null && !d(l))
        {
            return new efm(l);
        } else
        {
            return null;
        }
    }

    public final gef produceVehiclePositions()
    {
        return new gef(o);
    }

}
