// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.eta;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.CnLocation;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.safetynet.SafetyNetShareTripActivity;
import com.ubercab.client.feature.search.LocationSearchActivity;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripVehicle;
import cxf;
import czj;
import czk;
import czq;
import dbf;
import dfe;
import dfp;
import dkn;
import dnf;
import dnh;
import dpg;
import drc;
import ebd;
import ebe;
import ebf;
import ebg;
import ebh;
import gmg;
import hko;
import hkr;
import ica;
import icl;
import ico;
import java.util.Collection;
import java.util.Collections;
import l;
import n;

public class ShareEtaActivity extends RiderActivity
    implements android.content.DialogInterface.OnCancelListener
{

    public chp h;
    public drc i;
    public hkr j;
    public gmg k;
    public czq l;
    public dpg m;
    public dkn n;
    public hko o;
    private boolean p;
    private RiderLocation q;
    private icl r;
    private icl s;

    public ShareEtaActivity()
    {
    }

    private Intent a(String s1, int i1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return null;
        }
        int j1 = i1 / 60;
        String s2 = getString(0x7f070415);
        boolean flag = k.a(dbf.bT);
        Object obj;
        if (j1 > 0 && flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        obj = getResources().getQuantityString(0x7f0f0001, j1, new Object[] {
            Integer.valueOf(j1), s1
        });
        if (i1 != 0)
        {
            s1 = ((String) (obj));
        } else
        {
            s1 = getString(0x7f07040e, new Object[] {
                s1
            });
        }
        s1 = cxf.b(s1);
        obj = new Intent("android.intent.action.SEND");
        ((Intent) (obj)).putExtra("sms", s1);
        ((Intent) (obj)).putExtra("android.intent.extra.TEXT", s1);
        ((Intent) (obj)).putExtra("android.intent.extra.SUBJECT", s2);
        ((Intent) (obj)).setType("text/plain");
        return Intent.createChooser(((Intent) (obj)), getString(0x7f070416));
    }

    public static RiderLocation a(ShareEtaActivity shareetaactivity)
    {
        shareetaactivity.q = null;
        return null;
    }

    public static void a(ShareEtaActivity shareetaactivity, String s1, int i1)
    {
        shareetaactivity.b(s1, i1);
    }

    private void a(ebg ebg1)
    {
        ebg1.a(this);
    }

    private ebg b(dfp dfp)
    {
        return ebd.a().a(new dfe(this)).a(dfp).a();
    }

    private void b(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            setResult(0);
            finish();
            return;
        } else
        {
            startActivity(new Intent(this, com/ubercab/client/feature/safetynet/SafetyNetShareTripActivity));
            setResult(-1);
            finish();
            return;
        }
    }

    private void b(String s1, int i1)
    {
        if (i.g())
        {
            b(s1);
            return;
        } else
        {
            c(s1, i1);
            return;
        }
    }

    private void c(String s1, int i1)
    {
        s1 = a(s1, i1);
        if (s1 == null)
        {
            setResult(0);
            finish();
            return;
        } else
        {
            startActivity(s1);
            setResult(-1);
            finish();
            h.a(n.fi);
            return;
        }
    }

    private void f()
    {
        if (i.g())
        {
            a(getString(0x7f070296), this);
            return;
        } else
        {
            a(getString(0x7f07040d), this);
            return;
        }
    }

    private void g()
    {
        if (i.g())
        {
            b(getString(0x7f070296), null);
            return;
        } else
        {
            b(getString(0x7f07040d), null);
            return;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(Trip trip)
    {
        if (trip == null)
        {
            setResult(0);
            finish();
            return;
        }
        if (q == null) goto _L2; else goto _L1
_L1:
        String s1;
        CnLocation cnlocation;
        g();
        s1 = trip.getVehicle().getVehicleViewId();
        cnlocation = new CnLocation();
        cnlocation.setLatitude(trip.getPickupLocation().getLatitude());
        cnlocation.setLongitude(trip.getPickupLocation().getLongitude());
        if (s1 == null || m.q()) goto _L4; else goto _L3
_L3:
        n.a(Integer.valueOf(s1).intValue(), 0L, cnlocation, q.getCnLocation(), null, 0);
_L5:
        q = null;
        return;
_L4:
        if (j.f() != null)
        {
            r = o.a(j.f().getUuid(), q.getCnLocation()).a(ico.a()).a(new ebf(this, (byte)0));
        }
        if (true) goto _L5; else goto _L2
_L2:
        if (trip.getDestination() == null && !p)
        {
            if (trip.getPickupLocation() != null)
            {
                trip = RiderLocation.create(trip.getPickupLocation());
            } else
            {
                trip = null;
            }
            startActivityForResult(LocationSearchActivity.a(this, "com.ubercab.ACTION_DESTINATION_ETA", trip, null, null, false), 3005);
            return;
        }
        int i1 = trip.getEtaToDestination();
        if (!m.s())
        {
            if (TextUtils.isEmpty(trip.getShareUrl()))
            {
                f();
                n.e();
                return;
            } else
            {
                b(trip.getShareUrl(), i1);
                return;
            }
        } else
        {
            f();
            s = o.b(trip.getUuid()).a(ico.a()).a(new ebh(this, getApplicationContext(), i1, (byte)0));
            return;
        }
    }

    public final volatile void a(czj czj)
    {
        a((ebg)czj);
    }

    protected final Collection e()
    {
        return Collections.singleton(l);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
label0:
        {
label1:
            {
                super.onActivityResult(i1, j1, intent);
                if (i1 == 3005)
                {
                    switch (j1)
                    {
                    case 0: // '\0'
                    default:
                        h.a(n.fg);
                        setResult(0);
                        finish();
                        break;

                    case -1: 
                        break label1;

                    case 1: // '\001'
                        break label0;
                    }
                }
                return;
            }
            q = (RiderLocation)intent.getParcelableExtra("com.ubercab.LOCATION");
            return;
        }
        p = true;
        h.a(n.fj);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        setResult(0);
        h.a(n.fg);
        finish();
    }

    public void onPause()
    {
        super.onPause();
        if (r != null)
        {
            r.b();
        }
        if (s != null)
        {
            s.b();
        }
    }

    public void onRiderPersistentConnectionManagerReadyEvent(czk czk)
    {
        if (!isFinishing())
        {
            a(j.f());
        }
    }

    public void onSetDestinationResponseEvent(dnf dnf1)
    {
        if (!dnf1.e())
        {
            u();
            a_(dnf1.a(this));
            setResult(0);
            finish();
            return;
        }
        q = null;
        dnf1 = (Ping)dnf1.g();
        if (dnf1 != null)
        {
            dnf1 = dnf1.getTrip();
        } else
        {
            dnf1 = null;
        }
        a(dnf1);
    }

    public void onShareYoRideResponseEvent(dnh dnh1)
    {
        if (!dnh1.e())
        {
            u();
            a_(dnh1.a(this));
            dnh1 = AnalyticsEvent.create("impression").setName(l.gA).setValue(dnh1.a(this));
            h.a(dnh1);
            setResult(0);
            finish();
            return;
        }
        dnh1 = (Ping)dnh1.g();
        if (dnh1 != null)
        {
            dnh1 = dnh1.getTrip();
        } else
        {
            dnh1 = null;
        }
        a(dnh1);
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
