// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.RiderTripExpenseInfo;
import com.ubercab.client.feature.profiles.EditProfileFieldActivity;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripExpenseInfo;

public final class ezd
{

    private final chp a;
    private final cev b;
    private final gju c;
    private final hkr d;
    private final Handler e = new Handler(Looper.getMainLooper());
    private final int f;
    private final dpg g;
    private final RiderActivity h;
    private final dkn i;
    private final eyy j;
    private final hkm k;
    private final fsx l;
    private final fte m;
    private ProgressDialog n;
    private TripExpenseInfo o;
    private boolean p;
    private boolean q;
    private boolean r;
    private icl s;
    private icl t;
    private long u;
    private Profile v;

    public ezd(chp chp1, RiderActivity rideractivity, cev cev1, hkr hkr1, dpg dpg1, dkn dkn1, eyy eyy1, 
            hkm hkm1, fsx fsx1, fte fte1, gju gju1)
    {
        a = chp1;
        h = rideractivity;
        b = cev1;
        c = gju1;
        g = dpg1;
        i = dkn1;
        j = eyy1;
        k = hkm1;
        l = fsx1;
        m = fte1;
        d = hkr1;
        f = rideractivity.getResources().getInteger(0x7f0b000b);
    }

    static ProgressDialog a(ezd ezd1)
    {
        return ezd1.n;
    }

    public static void a(cev cev1, Context context)
    {
        AlertDialog alertdialog = dtf.a(context);
        alertdialog.setTitle(context.getString(0x7f0703b1));
        alertdialog.setMessage(context.getString(0x7f0703b0));
        alertdialog.setButton(-1, context.getString(0x7f07008e), new android.content.DialogInterface.OnClickListener(cev1) {

            final cev a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                a.c(new ezs());
            }

            
            {
                a = cev1;
                super();
            }
        });
        alertdialog.show();
    }

    private void a(Profile profile, boolean flag, eyh eyh1)
    {
        Handler handler = e;
        profile = new Runnable(profile, eyh1) {

            final Profile a;
            final eyh b;
            final ezd c;

            public final void run()
            {
                ezd.b(c).startActivityForResult(EditProfileFieldActivity.a(ezd.b(c), a, b), 2021);
            }

            
            {
                c = ezd.this;
                a = profile;
                b = eyh1;
                super();
            }
        };
        long l1;
        if (flag)
        {
            l1 = 250L;
        } else
        {
            l1 = 0L;
        }
        handler.postDelayed(profile, l1);
    }

    private boolean a(Profile profile)
    {
        return profile != null && dum.n(profile) && h();
    }

    static RiderActivity b(ezd ezd1)
    {
        return ezd1.h;
    }

    private void b(Profile profile)
    {
        l.a(profile.getDefaultPaymentProfileUuid());
        l.b(a(profile));
        l.a(d());
        j.c(profile);
    }

    static hkr c(ezd ezd1)
    {
        return ezd1.d;
    }

    private void c()
    {
        v = null;
    }

    private TripExpenseInfo d()
    {
        RiderTripExpenseInfo ridertripexpenseinfo = RiderTripExpenseInfo.create(l.b());
        ridertripexpenseinfo.setExpenseTrip(dum.h(v));
        return ridertripexpenseinfo;
    }

    static void d(ezd ezd1)
    {
        ezd1.c();
    }

    private void e()
    {
label0:
        {
            if (n != null)
            {
                long l1 = gju.a() - u;
                if (l1 >= (long)f)
                {
                    break label0;
                }
                (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

                    final ezd a;

                    public final void run()
                    {
                        ezd.a(a).hide();
                    }

            
            {
                a = ezd.this;
                super();
            }
                }, (long)f - l1);
            }
            return;
        }
        n.hide();
    }

    static void e(ezd ezd1)
    {
        ezd1.e();
    }

    static cev f(ezd ezd1)
    {
        return ezd1.b;
    }

    private void f()
    {
        Object obj = d.c();
        if (obj == null || v == null)
        {
            j();
            return;
        }
        String s1 = v.getDefaultPaymentProfileUuid();
        obj = ((Client) (obj)).findPaymentProfileByUuid(s1);
        if (obj == null || ((PaymentProfile) (obj)).getUuid() == null || s1 == null)
        {
            j();
            return;
        }
        if (s1.equals(l.h()))
        {
            i.a(v);
            return;
        }
        s1 = dui.a(((PaymentProfile) (obj)), h);
        if (!g.o())
        {
            i.a(((PaymentProfile) (obj)).getUuid(), false, s1);
            return;
        } else
        {
            s = k.a(((PaymentProfile) (obj)).getUuid(), false, s1).a(ico.a()).a(new eze(this, (byte)0));
            return;
        }
    }

    static chp g(ezd ezd1)
    {
        return ezd1.a;
    }

    private void g()
    {
        if (k())
        {
            i.b(a(v));
            return;
        } else
        {
            e();
            return;
        }
    }

    static void h(ezd ezd1)
    {
        ezd1.j();
    }

    private boolean h()
    {
        return dtv.a(d.c(), d.b());
    }

    static Profile i(ezd ezd1)
    {
        return ezd1.v;
    }

    private void i()
    {
        h.a_(h.getString(0x7f070489));
    }

    static fsx j(ezd ezd1)
    {
        return ezd1.l;
    }

    private void j()
    {
        c();
        i();
        e();
    }

    static eyy k(ezd ezd1)
    {
        return ezd1.j;
    }

    private boolean k()
    {
        return a(v) != l.d();
    }

    private boolean l()
    {
        TripExpenseInfo tripexpenseinfo = l.b();
        boolean flag1 = dum.h(v);
        boolean flag;
        if (tripexpenseinfo != null && tripexpenseinfo.isExpenseTrip())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag1 != flag;
    }

    private void m()
    {
        boolean flag;
        if (!q && j.f() && !fte.g(m.g()) && !fte.c(m.g()) && j.b() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a(j.b(), false);
            q = true;
        }
    }

    public final void a()
    {
        if (r)
        {
            return;
        } else
        {
            r = true;
            b.a(this);
            m();
            return;
        }
    }

    final void a(Client client, Trip trip, boolean flag, String s1, boolean flag1)
    {
        if (flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        c();
        e();
        if (!flag1) goto _L2; else goto _L1
_L1:
        a(b, ((Context) (h)));
        a.a(l.dt);
_L4:
        return;
_L2:
        if (TextUtils.isEmpty(s1)) goto _L4; else goto _L3
_L3:
        h.a_(s1);
        return;
        if (trip == null || client == null || TextUtils.isEmpty(client.getUuid()) || v == null)
        {
            j();
            return;
        } else
        {
            l.a(trip.getPaymentProfileUUID());
            i.a(v);
            return;
        }
    }

    public final boolean a(int i1, Intent intent)
    {
        if (i1 == -99)
        {
            h.a_(h.getString(0x7f070631));
        } else
        if (intent != null && intent.hasExtra("com.ubercab.client.feature.payment.SELECTED_PROFILE_UUID") && intent.hasExtra("com.ubercab.PAYMENT_PROFILE_UUID") && i1 != 0)
        {
            Object obj = intent.getStringExtra("com.ubercab.client.feature.payment.SELECTED_PROFILE_UUID");
            obj = j.a(((String) (obj)));
            intent = intent.getStringExtra("com.ubercab.PAYMENT_PROFILE_UUID");
            j.a(((Profile) (obj)), intent);
            p = true;
            return true;
        }
        return false;
    }

    public final boolean a(Profile profile, boolean flag)
    {
        if (q && profile.equals(j.b()))
        {
            return false;
        }
        if (!dum.e(profile))
        {
            if (!dui.a(d.c()))
            {
                a(profile, flag, eyh.b);
                return false;
            }
            if (!dum.b(profile) || !dui.a(d.c(), profile.getDefaultPaymentProfileUuid()))
            {
                a(profile, flag, eyh.c);
                return false;
            }
        }
        v = profile;
        if (!fte.b(m.g()))
        {
            b(profile);
        } else
        {
            n = dtg.a(h, h.getString(0x7f070296));
            u = gju.a();
            n.show();
            if (!g.p())
            {
                f();
            } else
            {
                Trip trip = d.f();
                if (trip == null)
                {
                    j();
                    return false;
                }
                t = k.b(profile.getUuid(), trip.getUuid()).a(ico.a()).a(new ezf(this, (byte)0));
            }
        }
        return true;
    }

    public final void b()
    {
        if (r)
        {
            r = false;
            b.b(this);
            if (s != null)
            {
                s.b();
            }
            if (t != null)
            {
                t.b();
                return;
            }
        }
    }

    public final void onAddExpenseInfoResponseEvent(dle dle1)
    {
        if (!dle1.e())
        {
            e();
            dle1 = dle1.a(h);
            h.a_(dle1);
            return;
        }
        Object obj = (Ping)dle1.g();
        if (obj != null)
        {
            dle1 = ((Ping) (obj)).getClient();
        } else
        {
            dle1 = null;
        }
        if (obj != null)
        {
            obj = ((Ping) (obj)).getTrip();
        } else
        {
            obj = null;
        }
        if (dle1 == null || obj == null)
        {
            j();
            return;
        } else
        {
            l.a(o);
            g();
            return;
        }
    }

    public final void onSelectPaymentProfileResponseEvent(dne dne1)
    {
        Object obj = null;
        Ping ping = (Ping)dne1.g();
        com.ubercab.client.core.model.Client client;
        Trip trip;
        String s1;
        boolean flag;
        boolean flag1;
        if (ping != null)
        {
            client = ping.getClient();
        } else
        {
            client = null;
        }
        if (ping != null)
        {
            trip = ping.getTrip();
        } else
        {
            trip = null;
        }
        flag1 = dne1.e();
        s1 = dne1.a(h);
        dne1 = obj;
        if (ping != null)
        {
            dne1 = ping.getErrorCode();
        }
        if (dne1 != null && dne1.intValue() == 460)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(client, trip, flag1, s1, flag);
    }

    public final void onSetUseCreditsResponseEvent(dng dng1)
    {
        if (!dng1.e())
        {
            e();
            dng1 = dng1.a(h);
            h.a_(dng1);
            return;
        }
        Object obj = (Ping)dng1.g();
        if (obj != null)
        {
            dng1 = ((Ping) (obj)).getClient();
        } else
        {
            dng1 = null;
        }
        if (obj != null)
        {
            obj = ((Ping) (obj)).getTrip();
        } else
        {
            obj = null;
        }
        if (dng1 == null || obj == null)
        {
            j();
            return;
        } else
        {
            l.b(((Trip) (obj)).getUseCredits());
            e();
            return;
        }
    }

    public final void onSwitchRiderProfileResponseEvent(dnk dnk1)
    {
        if (v == null)
        {
            return;
        }
        if (!dnk1.e())
        {
            j();
            return;
        }
        j.c(v);
        if (l())
        {
            o = d();
            i.a(o);
            return;
        } else
        {
            g();
            return;
        }
    }

    public final void onUpdateProfileResponseEvent(dns dns1)
    {
label0:
        {
            if (p)
            {
                p = false;
                if (!dns1.k())
                {
                    break label0;
                }
                i();
            }
            return;
        }
        a(dns1.a(), false);
    }
}
