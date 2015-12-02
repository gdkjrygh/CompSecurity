// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.RiderTripExpenseInfo;
import com.ubercab.client.core.vendor.google.GoogleWalletActivity;
import com.ubercab.rider.realtime.model.Balance;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.RewardInfo;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class fsx
{

    private final cev a;
    private final Context b;
    private final hkr c;
    private final hku d;
    private final gmg e;
    private final dpg f;
    private final eyy g;
    private final dal h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private String o;
    private String p;
    private RiderTripExpenseInfo q;
    private icl r;

    public fsx(cev cev1, Context context, hkr hkr1, hku hku1, gmg gmg1, dpg dpg1, dal dal1, 
            eyy eyy1)
    {
        l = true;
        a = cev1;
        b = context;
        c = hkr1;
        d = hku1;
        e = gmg1;
        f = dpg1;
        h = dal1;
        g = eyy1;
    }

    private static boolean a(Client client)
    {
        while (client == null || client.getThirdPartyIdentities() == null || client.getLastExpenseInfo() == null || !a(client.getThirdPartyIdentities()) || !client.getLastExpenseInfo().isExpenseTrip()) 
        {
            return false;
        }
        return true;
    }

    private static boolean a(Map map)
    {
        for (map = map.keySet().iterator(); map.hasNext();)
        {
            if (esf.a((String)map.next()))
            {
                return true;
            }
        }

        return false;
    }

    private boolean p()
    {
        return a() != null && "PayPal".equals(a().getCardType());
    }

    private boolean q()
    {
        return n || GoogleWalletActivity.a(b, null);
    }

    public final PaymentProfile a()
    {
        if (!TextUtils.isEmpty(p))
        {
            if (com.ubercab.client.core.model.PaymentProfile.GOOGLE_WALLET.getUuid().equals(p))
            {
                return com.ubercab.client.core.model.PaymentProfile.GOOGLE_WALLET;
            }
            Client client = c.c();
            if (client != null)
            {
                return client.findPaymentProfileByUuid(p);
            }
        }
        return null;
    }

    public final String a(Activity activity)
    {
        if (p())
        {
            return dxg.a(activity);
        } else
        {
            return null;
        }
    }

    public final void a(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            bundle.putBoolean("com.ubercab.IS_USING_CREDITS", l);
            bundle.putBoolean("com.ubercab.IS_USING_POINTS", m);
            bundle.putString("com.ubercab.SELECTED_PAYMENT_PROFILE_UUID", p);
            bundle.putParcelable("com.ubercab.PAYMENT_EXPENSE_INFO", RiderTripExpenseInfo.create(q));
            return;
        }
    }

    final void a(Client client, Trip trip)
    {
label0:
        {
label1:
            {
                {
                    String s = null;
                    if (!TextUtils.isEmpty(p))
                    {
                        break label1;
                    }
                    if (client != null && client.getLastSelectedPaymentProfileIsGoogleWallet())
                    {
                        p = com.ubercab.client.core.model.PaymentProfile.GOOGLE_WALLET.getUuid();
                    } else
                    if (client != null && client.getPaymentProfiles() != null && client.getPaymentProfiles().isEmpty() && q() && (h.a() || e.b(dbf.V)))
                    {
                        p = com.ubercab.client.core.model.PaymentProfile.GOOGLE_WALLET.getUuid();
                    } else
                    {
                        Object obj;
                        if (client != null)
                        {
                            boolean flag;
                            if (g.f() && trip != null && !TextUtils.isEmpty(trip.getPaymentProfileUUID()) && client.findPaymentProfileByUuid(trip.getPaymentProfileUUID()) != null)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            if (flag)
                            {
                                obj = client.findPaymentProfileByUuid(trip.getPaymentProfileUUID());
                            } else
                            {
                                obj = client.getLastSelectedPaymentProfile();
                            }
                        } else
                        {
                            obj = null;
                        }
                        if (obj != null)
                        {
                            obj = ((PaymentProfile) (obj)).getUuid();
                        } else
                        {
                            obj = null;
                        }
                        p = ((String) (obj));
                    }
                }
                if (!i && q == null)
                {
                    i = true;
                    if (g.f())
                    {
                        break label0;
                    }
                    q = RiderTripExpenseInfo.create();
                    q.setExpenseTrip(a(client));
                    if (a() != null && dui.d(a()))
                    {
                        l = false;
                    }
                }
                return;
            }
            if (a() == null || !i() && trip != null && !g.f() && !f.o())
            {
                if (client != null)
                {
                    obj = client.getLastSelectedPaymentProfile();
                } else
                {
                    obj = null;
                }
                if (f.n())
                {
                    if (trip != null)
                    {
                        obj = trip.getPaymentProfileUUID();
                    } else
                    {
                        obj = null;
                    }
                    if (client != null)
                    {
                        obj = client.findPaymentProfileByUuid(((String) (obj)));
                    } else
                    {
                        obj = null;
                    }
                }
                if (obj != null)
                {
                    s = ((PaymentProfile) (obj)).getUuid();
                }
                p = s;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (trip != null)
        {
            q = RiderTripExpenseInfo.create(trip.getExpenseInfo());
            l = trip.getUseCredits();
            return;
        }
        q = RiderTripExpenseInfo.create();
        return;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_36;
_L1:
    }

    public final void a(TripExpenseInfo tripexpenseinfo)
    {
        q = RiderTripExpenseInfo.create(tripexpenseinfo);
    }

    public final void a(String s)
    {
        p = s;
    }

    public final void a(boolean flag)
    {
        j = flag;
    }

    public final TripExpenseInfo b()
    {
        return q;
    }

    public final void b(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            l = bundle.getBoolean("com.ubercab.IS_USING_CREDITS", true);
            m = bundle.getBoolean("com.ubercab.IS_USING_POINTS", false);
            q = (RiderTripExpenseInfo)bundle.getParcelable("com.ubercab.PAYMENT_EXPENSE_INFO");
            p = bundle.getString("com.ubercab.SELECTED_PAYMENT_PROFILE_UUID", null);
            return;
        }
    }

    public final void b(String s)
    {
        o = s;
    }

    public final void b(boolean flag)
    {
        l = flag;
    }

    public final void c(boolean flag)
    {
        m = flag;
    }

    public final boolean c()
    {
        return j;
    }

    public final boolean d()
    {
        return l;
    }

    public final boolean e()
    {
        return m;
    }

    public final boolean f()
    {
        PaymentProfile paymentprofile = a();
        return paymentprofile != null && dui.d(paymentprofile);
    }

    public final RewardInfo g()
    {
        if (a() != null)
        {
            return a().getRewardInfo();
        } else
        {
            return null;
        }
    }

    public final String h()
    {
        PaymentProfile paymentprofile = a();
        if (paymentprofile != null)
        {
            return paymentprofile.getUuid();
        } else
        {
            return null;
        }
    }

    public final boolean i()
    {
        return com.ubercab.client.core.model.PaymentProfile.GOOGLE_WALLET.getUuid().equals(p);
    }

    public final boolean j()
    {
        return a() != null && dui.b(a());
    }

    public final Balance k()
    {
        RewardInfo rewardinfo;
        if (e())
        {
            if ((rewardinfo = g()) != null)
            {
                return rewardinfo.getBalance();
            }
        }
        return null;
    }

    public final boolean l()
    {
        return b() != null && b().isExpenseTrip();
    }

    public final String m()
    {
        return o;
    }

    public final void n()
    {
        if (!k)
        {
            k = true;
            a.a(this);
            if (r == null || r.c())
            {
                r = ica.a(d.d(), d.h(), new fsz((byte)0)).a(ico.a()).c(new fsy(this, (byte)0));
                return;
            }
        }
    }

    public final void o()
    {
        if (k)
        {
            k = false;
            a.b(this);
            if (r != null)
            {
                r.b();
                return;
            }
        }
    }

    public final void onPingEvent(dar dar1)
    {
        if (f.n())
        {
            return;
        } else
        {
            dar1 = dar1.a();
            a(dar1.getClient(), dar1.getTrip());
            return;
        }
    }
}
