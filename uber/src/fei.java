// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.contacts.Contact;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.SafetyNetAddContactsRequest;
import com.ubercab.client.core.model.SafetyNetAddContactsResponse;
import com.ubercab.client.core.model.SafetyNetContact;
import com.ubercab.client.core.model.SafetyNetDeleteContactsResponse;
import com.ubercab.client.core.model.SafetyNetGetContactsResponse;
import com.ubercab.client.core.model.SafetyNetGetSharedTripContactsResponse;
import com.ubercab.client.core.model.SafetyNetShareTripResponse;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.Trip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fei
{

    boolean a;
    fes b;
    String c;
    private List d;
    private icl e;
    private icl f;
    private final chp g;
    private final drc h;
    private final cev i;
    private final hkr j;
    private final hku k;
    private final dpg l;
    private final dkn m;
    private final czf n;
    private final dkp o;
    private final hko p;

    public fei(chp chp1, drc drc1, cev cev1, hkr hkr1, hku hku1, dpg dpg1, dkn dkn1, 
            hko hko1, czf czf1, dkp dkp1)
    {
        gjz.a(cev1);
        g = chp1;
        h = drc1;
        i = cev1;
        j = hkr1;
        k = hku1;
        l = dpg1;
        m = dkn1;
        p = hko1;
        n = czf1;
        o = dkp1;
    }

    static cev a(fei fei1)
    {
        return fei1.i;
    }

    private void c(List list)
    {
        o.a(p(), list);
    }

    private void d(List list)
    {
        if (list != null && d != null)
        {
            Iterator iterator = d.iterator();
            while (iterator.hasNext()) 
            {
                SafetyNetContact safetynetcontact = (SafetyNetContact)iterator.next();
                Iterator iterator1 = list.iterator();
                while (iterator1.hasNext()) 
                {
                    SafetyNetContact safetynetcontact1 = (SafetyNetContact)iterator1.next();
                    if (safetynetcontact.getId().equals(safetynetcontact1.getId()))
                    {
                        iterator.remove();
                    }
                }
            }
        }
    }

    private boolean n()
    {
        return n.E();
    }

    private void o()
    {
        if (d != null && d.size() > 0)
        {
            n.m(true);
            return;
        } else
        {
            n.m(false);
            return;
        }
    }

    private String p()
    {
        Client client = j.c();
        if (client != null)
        {
            return client.getUuid();
        } else
        {
            return "";
        }
    }

    private String q()
    {
        Trip trip = j.f();
        if (trip != null)
        {
            return trip.getUuid();
        } else
        {
            return "";
        }
    }

    public final void a()
    {
        d = null;
    }

    public final void a(SafetyNetContact safetynetcontact)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(safetynetcontact);
        c(arraylist);
    }

    public final void a(List list)
    {
        SafetyNetAddContactsRequest safetynetaddcontactsrequest = new SafetyNetAddContactsRequest();
        String s = m();
        ArrayList arraylist = new ArrayList();
        Contact contact;
        String s1;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new com.ubercab.client.core.model.SafetyNetAddContactsRequest.Contact(contact.a(), s1)))
        {
            contact = (Contact)list.next();
            s1 = duj.c(contact.b(), s);
        }

        safetynetaddcontactsrequest.mContacts = arraylist;
        o.a(p(), safetynetaddcontactsrequest);
    }

    public final void b()
    {
        i.a(this);
        e = k.e().c(new fek(this, (byte)0));
    }

    public final void b(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            SafetyNetContact safetynetcontact = (SafetyNetContact)list.next();
            if (!b.a(safetynetcontact))
            {
                arraylist.add(safetynetcontact);
            }
        } while (true);
        list = j.c();
        if (list != null)
        {
            list = list.getFormattedName();
        } else
        {
            list = "";
        }
        o.a(q(), list, i(), arraylist);
    }

    public final boolean c()
    {
        return d == null || d.size() < 5;
    }

    public final int d()
    {
        if (d == null)
        {
            return 5;
        } else
        {
            return 5 - d.size();
        }
    }

    public final int e()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.c();
        }
    }

    public final List f()
    {
        if (d == null)
        {
            g();
        }
        return d;
    }

    public final void g()
    {
        o.a(p());
    }

    public final fes h()
    {
        if (b == null)
        {
            o.b(q());
        }
        return b;
    }

    public final String i()
    {
        Trip trip = j.f();
        if (trip == null || !TextUtils.isEmpty(c))
        {
            return c;
        }
        if (!l.s())
        {
            c = trip.getShareUrl();
            if (TextUtils.isEmpty(c))
            {
                m.e();
            }
        } else
        {
            f = p.b(trip.getUuid()).a(ico.a()).a(new fej(this, (byte)0));
        }
        return c;
    }

    public final boolean j()
    {
        return a;
    }

    public final boolean k()
    {
        return n.D();
    }

    public final void l()
    {
        n.F();
    }

    public final String m()
    {
        Client client = j.c();
        if (client != null)
        {
            return client.getMobileCountryIso2();
        } else
        {
            return null;
        }
    }

    public final void onPingClientResponseEvent(dmr dmr1)
    {
        dmr1 = (Ping)dmr1.g();
        if (dmr1 != null)
        {
            dmr1 = dmr1.getClient();
        } else
        {
            dmr1 = null;
        }
        if (!h.g() || d != null || dmr1 == null || TextUtils.isEmpty(dmr1.getUuid()))
        {
            return;
        } else
        {
            g();
            return;
        }
    }

    public final void onPingEvent(dar dar1)
    {
        if (!l.n())
        {
            dar1 = dar1.a().getClient().getStatus();
            if (a && !dar1.equals("OnTrip") && !dar1.equals("WaitingForPickup"))
            {
                a = false;
                c = null;
                b = null;
                return;
            }
        }
    }

    public final void onSafetyNetAddContactsResponseEvent(dmz dmz1)
    {
        if (dmz1.i())
        {
            dmz1 = (SafetyNetAddContactsResponse)dmz1.g();
            if (d == null)
            {
                d = dmz1.getContacts();
            } else
            {
                d.addAll(dmz1.getContacts());
            }
            i.c(new ffg(1, d));
            o();
            g.a(AnalyticsEvent.create("tap").setName(n.ev).setValue(String.valueOf(dmz1.getContacts().size())));
            return;
        } else
        {
            i.c(new ffh(1));
            return;
        }
    }

    public final void onSafetyNetDeleteContactsResponseEvent(dna dna1)
    {
        if (dna1.i())
        {
            dna1 = (SafetyNetDeleteContactsResponse)dna1.g();
            d(dna1.getContacts());
            i.c(new ffg(2, d));
            o();
            g.a(AnalyticsEvent.create("tap").setName(n.ew).setValue(String.valueOf(dna1.getContacts().size())));
            return;
        } else
        {
            i.c(new ffh(2));
            return;
        }
    }

    public final void onSafetyNetGetContactsResponseEvent(dnb dnb1)
    {
        if (dnb1.i())
        {
            d = ((SafetyNetGetContactsResponse)dnb1.g()).getContacts();
            i.c(new ffg(0, d));
            o();
            return;
        } else
        {
            i.c(new ffh(0));
            return;
        }
    }

    public final void onSafetyNetGetSharedTripContactsResponseEvent(dnc dnc1)
    {
        if (dnc1.i())
        {
            b = new fes(((SafetyNetGetSharedTripContactsResponse)dnc1.g()).getContacts());
            if (b.c() > 0)
            {
                a = true;
            }
            i.c(new ffk(b));
            return;
        } else
        {
            i.c(new ffh(4));
            return;
        }
    }

    public final void onSafetyNetShareTripResponseEvent(dnd dnd1)
    {
        if (dnd1.i())
        {
            dnd1 = (SafetyNetShareTripResponse)dnd1.g();
            if (b == null)
            {
                b = new fes(dnd1.getContacts());
            } else
            {
                b.a(dnd1.getContacts());
            }
            a = true;
            i.c(new ffm());
            if (!n() && !k())
            {
                i.c(new ffl(true));
            }
            g.a(AnalyticsEvent.create("tap").setName(n.ey).setValue(String.valueOf(dnd1.getContacts().size())));
            return;
        } else
        {
            i.c(new ffh(3));
            return;
        }
    }

    public final void onShareYoRideResponseEvent(dnh dnh1)
    {
        if (dnh1.e())
        {
            dnh1 = (Ping)dnh1.g();
            if (dnh1 != null)
            {
                dnh1 = dnh1.getTrip();
            } else
            {
                dnh1 = null;
            }
            if (dnh1 != null)
            {
                c = dnh1.getShareUrl();
                i.c(new ffj(c));
            }
        }
    }

    public final ffl produceSafetyNetSharedTripStatusUpdate()
    {
        boolean flag;
        if (a && !n() && !k())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new ffl(flag);
    }
}
