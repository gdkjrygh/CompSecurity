// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import cjg;
import cjq;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.CnLocation;
import com.ubercab.client.core.model.Note;
import com.ubercab.client.core.model.PaymentCheckBalanceResponse;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.RiderBalance;
import com.ubercab.client.core.model.UpfrontFareDetail;
import com.ubercab.client.core.vendor.google.GmmProductSurge;
import com.ubercab.client.feature.estimate.FareEstimateActivity;
import com.ubercab.client.feature.estimate.RewardPointsFareEstimateFragment;
import com.ubercab.client.feature.mobilemessage.MobileMessagePopupWindow;
import com.ubercab.client.feature.payment.paytm.PaytmAddFundsActivity;
import com.ubercab.client.feature.payment.paytm.PaytmOtpActivity;
import com.ubercab.client.feature.promo.PromoFragment;
import com.ubercab.client.feature.safetynet.SafetyNetPopupWindow;
import com.ubercab.client.feature.search.LocationSearchActivity;
import com.ubercab.client.feature.shoppingcart.model.Store;
import com.ubercab.client.feature.surge.SurgeActivity;
import com.ubercab.client.feature.surge.SurgeActivityDeprecated;
import com.ubercab.client.feature.trip.event.PanelSlideEvent;
import com.ubercab.client.feature.trip.map.MapFragment;
import com.ubercab.client.feature.trip.map.layer.pins.PoolSurgeDialogFragment;
import com.ubercab.client.feature.trip.pickupnote.PickupNoteComposeActivity;
import com.ubercab.client.feature.trip.profiles.ProfilePickerDialogFragment;
import com.ubercab.client.feature.trip.ridepool.CapacityChangeDialogFragment;
import com.ubercab.client.feature.trip.slider.FareDetailsPopupWindow;
import com.ubercab.rider.realtime.model.Balance;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.FareInfo;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.FareSplitClient;
import com.ubercab.rider.realtime.model.FareSuggestedVehicleView;
import com.ubercab.rider.realtime.model.MobileMessage;
import com.ubercab.rider.realtime.model.MobileMessageDisplayProperties;
import com.ubercab.rider.realtime.model.RewardInfo;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.rider.realtime.request.param.DeviceData;
import com.ubercab.rider.realtime.request.param.Location;
import com.ubercab.rider.realtime.request.param.ShoppingCartItem;
import com.ubercab.rider.realtime.response.LocationDescription;
import cwm;
import cyz;
import czb;
import czj;
import dak;
import dal;
import daq;
import dar;
import dbf;
import dbn;
import dfp;
import djb;
import djw;
import dki;
import dkn;
import dku;
import dlw;
import dml;
import dmp;
import dnf;
import dnj;
import dpg;
import drc;
import drd;
import dsy;
import dtv;
import dui;
import dva;
import dzk;
import dzw;
import ecq;
import eem;
import efa;
import efl;
import efm;
import efn;
import ekk;
import erp;
import evn;
import evt;
import evv;
import ewg;
import ewh;
import ewm;
import ewr;
import eyy;
import ezd;
import ezs;
import far;
import fei;
import ffl;
import fim;
import fiv;
import fiw;
import fix;
import fiy;
import fjb;
import fjc;
import fje;
import fjf;
import fjg;
import fpu;
import fpv;
import fpy;
import fpz;
import fqa;
import fqb;
import fqc;
import fqf;
import fqg;
import fqn;
import fqp;
import frj;
import frm;
import frn;
import fro;
import frp;
import frq;
import frr;
import frs;
import fsx;
import fta;
import fte;
import fti;
import ftj;
import fuk;
import ful;
import fuy;
import fuz;
import fva;
import fvb;
import fvc;
import fvd;
import fve;
import fvh;
import fvj;
import fvk;
import fvp;
import fvq;
import fvv;
import fvw;
import fvx;
import fwf;
import fwi;
import fwj;
import fwt;
import fxc;
import fxd;
import fxe;
import fxn;
import fxo;
import fxs;
import fyc;
import fyg;
import fyh;
import fyi;
import fyj;
import fyk;
import fyl;
import fym;
import fyo;
import fyp;
import fyq;
import fyt;
import fyu;
import fyv;
import fyy;
import fyz;
import fzb;
import fzc;
import fzd;
import fze;
import fzf;
import gal;
import gdb;
import gdc;
import gfn;
import gfo;
import gjm;
import gjv;
import gjx;
import gjz;
import gki;
import gkk;
import gmg;
import hjn;
import hkm;
import hko;
import hkr;
import hku;
import ica;
import icl;
import ico;
import idi;
import idj;
import ijg;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.trip:
//            PinEducationPopupWindow, SuggestedVehicleViewBannerView, TripActivity

public class TripFragment extends czb
    implements cjq, eem, ewr, fiw, fiy, fpv, fqb, ftj, ful, fuz, fvc, fve, fvk, fvq, fvw, fwj, fxd, fxo, gdc
{

    public fsx A;
    public ezd B;
    public fta C;
    public hko D;
    public fte E;
    public fei F;
    public dal G;
    public dku H;
    public ewm I;
    public fuy J;
    public ekk K;
    public fva L;
    public fvb M;
    public fti N;
    public fpu O;
    public fuk P;
    public fvh Q;
    public fqa R;
    public fvj S;
    public gdb T;
    public fvp U;
    public fvv V;
    public fwf W;
    public gal X;
    public fwi Y;
    public fwt Z;
    private MapFragment aA;
    public dzw aa;
    public fiv ab;
    public fix ac;
    public fxc ad;
    public fxe ae;
    public gfn af;
    public fxn ag;
    public fxs ah;
    PinEducationPopupWindow ai;
    FareDetailsPopupWindow aj;
    MobileMessagePopupWindow ak;
    private final Runnable al = new Runnable() {

        final TripFragment a;

        public final void run()
        {
            TripFragment.a(a);
        }

            
            {
                a = TripFragment.this;
                super();
            }
    };
    private icl am;
    private String an;
    private RiderLocation ao;
    private String ap;
    private icl aq;
    private icl ar;
    private icl as;
    private SafetyNetPopupWindow at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private GmmProductSurge ax;
    private int ay;
    private long az;
    public djw c;
    public chp d;
    public drc e;
    public Application f;
    public cev g;
    public fvd h;
    public hkr i;
    public hku j;
    public gmg k;
    public evn l;
    public evt m;
    FrameLayout mPinView;
    ViewGroup mViewFooter;
    LinearLayout mViewHeader;
    public ewh n;
    public ewg o;
    public efa p;
    public fqc q;
    public dak r;
    public dki s;
    public fqg t;
    public hjn u;
    public dpg v;
    public eyy w;
    public dkn x;
    public hkm y;
    public fim z;

    public TripFragment()
    {
    }

    private frs N()
    {
        return fpy.a().a(new djb(this)).a((fqp)((RiderActivity)getActivity()).d()).a();
    }

    private boolean O()
    {
        if (!k.a(dbf.cK))
        {
            Object obj = i.b();
            String s1 = E.m();
            if (obj != null)
            {
                obj = ((City) (obj)).findVehicleViewById(s1);
            } else
            {
                obj = null;
            }
            if (obj != null && ((VehicleView) (obj)).getAllowRidepool() && e.j())
            {
                return true;
            }
        }
        return false;
    }

    private void P()
    {
        if (k.a(dbf.aE))
        {
            c.b(G.z());
        }
    }

    private void Q()
    {
        ac.f();
    }

    private void R()
    {
        C.a(false);
        if (isResumed())
        {
            com.ubercab.android.location.UberLatLng uberlatlng = aA.o();
            if (uberlatlng != null)
            {
                C.b(uberlatlng);
            }
        }
    }

    private void S()
    {
        E.r();
        d.a(n.E);
    }

    private void T()
    {
        (new android.app.AlertDialog.Builder(getActivity())).setTitle(getString(0x7f070440)).setMessage(getString(0x7f07043e)).setPositiveButton(getString(0x7f07043c), new android.content.DialogInterface.OnClickListener() {

            final TripFragment a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                try
                {
                    a.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(a.getString(0x7f07043f))));
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface)
                {
                    cwm.a(a.getActivity(), a.getString(0x7f0702d2));
                }
                a.d.a(n.gO);
            }

            
            {
                a = TripFragment.this;
                super();
            }
        }).setNegativeButton(getString(0x7f07007b), new android.content.DialogInterface.OnClickListener() {

            final TripFragment a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                dialoginterface.dismiss();
            }

            
            {
                a = TripFragment.this;
                super();
            }
        }).create().show();
        d.a(l.hJ);
    }

    private ica U()
    {
        if (!v.n())
        {
            return ica.a(TimeUnit.SECONDS).b(new idi() {

                final TripFragment a;

                private ica a()
                {
                    return ica.b(a.i.d());
                }

                public final volatile Object a(Object obj)
                {
                    return a();
                }

            
            {
                a = TripFragment.this;
                super();
            }
            });
        } else
        {
            return j.f();
        }
    }

    private void V()
    {
        RiderLocation riderlocation = E.h();
        RiderLocation riderlocation1 = E.i();
        String s1 = E.m();
        boolean flag = O();
        startActivityForResult(LocationSearchActivity.a(getActivity(), "com.ubercab.ACTION_DESTINATION", riderlocation, riderlocation1, s1, flag), 2008);
    }

    private void W()
    {
        RiderLocation riderlocation = r.b();
        RiderLocation riderlocation1 = E.i();
        String s1 = E.m();
        startActivityForResult(LocationSearchActivity.a(getActivity(), "com.ubercab.ACTION_PICKUP_LOCATION", riderlocation, riderlocation1, s1, false), 2007);
    }

    private void X()
    {
        View view = getView();
        if (view == null)
        {
            return;
        }
        if (view.getHeight() == 0)
        {
            view.postDelayed(new Runnable() {

                final TripFragment a;

                public final void run()
                {
                    TripFragment.c(a);
                }

            
            {
                a = TripFragment.this;
                super();
            }
            }, 100L);
            return;
        } else
        {
            int i1 = M.p() + Y.h() + X.c();
            int i2 = U.m();
            int k1 = U.n();
            int l1 = ac.h();
            ab.a(i1, i2);
            int j1 = ab.b() + i1;
            i2 += l1;
            k1 += l1;
            Y.a(j1, i2);
            aA.a(0, j1, 0, i2);
            aA.b(-k1);
            X.a(i1, i2);
            ah.a(i1, k1);
            ai();
            return;
        }
    }

    private void Y()
    {
        if (i.c() == null)
        {
            return;
        } else
        {
            getActivity().invalidateOptionsMenu();
            X();
            ad.b();
            Z();
            return;
        }
    }

    private void Z()
    {
        Trip trip = i.f();
        if (k.a(dbf.cL) && fte.b(E.g()) && trip != null && !trip.getUuid().equals(G.V()) && trip.getFareChange() != null)
        {
            CapacityChangeDialogFragment.a(d(), trip.getFareChange());
            G.n(trip.getUuid());
            d.a(l.ah);
        }
    }

    private void a(Note note, RiderLocation riderlocation)
    {
        startActivityForResult(PickupNoteComposeActivity.a(getActivity(), note, riderlocation), 6001);
    }

    static void a(TripFragment tripfragment)
    {
        tripfragment.R();
    }

    static void a(TripFragment tripfragment, int i1)
    {
        tripfragment.d(i1);
    }

    public static void a(TripFragment tripfragment, FareSplit faresplit)
    {
        tripfragment.a(faresplit);
    }

    private void a(FareSplit faresplit)
    {
        if (faresplit != null)
        {
            if ((faresplit = faresplit.getClientSelf()) != null && faresplit.getStatus().equals("Pending"))
            {
                g.c(new ecq());
                return;
            }
        }
    }

    private void a(frs frs1)
    {
        frs1.a(this);
    }

    private boolean a(MobileMessage mobilemessage)
    {
        gjz.a(mobilemessage);
        if (ak != null && (ak.isShowing() || ak.d()))
        {
            return false;
        } else
        {
            ak = new MobileMessagePopupWindow(getActivity(), d, g, p, i);
            return ak.a(mobilemessage);
        }
    }

    private void aa()
    {
        int i1 = E.g();
        if (m.g() || n.a(i1))
        {
            E.a(true, Boolean.valueOf(true));
        } else
        {
            E.d(true);
        }
        if (E.o())
        {
            n();
        }
    }

    private void ab()
    {
        if (!cwm.a(getActivity().getWindow()))
        {
            return;
        } else
        {
            at = new SafetyNetPopupWindow(getActivity(), d, g);
            at.b();
            F.l();
            return;
        }
    }

    private void ac()
    {
        if (cwm.a(getActivity().getWindow()) && (aj == null || !aj.isShowing()))
        {
            String s1 = E.m();
            if (!TextUtils.isEmpty(s1))
            {
                aj = new FareDetailsPopupWindow(getActivity(), g, i, j, v, s1);
                aj.showAtLocation(getActivity().getWindow().getDecorView(), 48, 0, 0);
                aj.setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() {

                    final TripFragment a;

                    public final void onDismiss()
                    {
                        a.d.a(n.dt);
                        a.E.a(false);
                    }

            
            {
                a = TripFragment.this;
                super();
            }
                });
                d.a(n.du);
                E.a(true);
                return;
            }
        }
    }

    private boolean ad()
    {
        boolean flag1 = true;
        if (k.a(dbf.cK) && E.l()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (U.q()) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = i.b();
        if (obj == null)
        {
            return false;
        }
        obj = ((City) (obj)).findVehicleViewById(E.m());
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((VehicleView) (obj)).getAllowRidepool()) goto _L4; else goto _L5
_L5:
        return false;
    }

    private int ae()
    {
        if (ad())
        {
            return E.k();
        } else
        {
            return 0;
        }
    }

    private View af()
    {
        return ((dva)getActivity()).a();
    }

    private void ag()
    {
        if (fte.e(E.g()) && k.a(dbf.g))
        {
            String s1 = E.m();
            MobileMessage mobilemessage = p.d(s1);
            if (mobilemessage != null && !G.a(s1))
            {
                G.b(s1);
                a(mobilemessage);
                return;
            }
        }
    }

    private void ah()
    {
        if (ap != null)
        {
            MobileMessage mobilemessage = p.a(ap);
            if (mobilemessage != null)
            {
                a(mobilemessage);
            }
            ap = null;
        }
    }

    private void ai()
    {
        if (!aw)
        {
            View view = getView();
            if (aj() && view != null)
            {
                aw = true;
                view.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(view) {

                    final View a;
                    final TripFragment b;

                    public final boolean onPreDraw()
                    {
                        if (!b.k.a(dbf.bZ, dbn.a)) goto _L2; else goto _L1
_L1:
                        TripFragment.a(b, fqf.a);
_L4:
                        a.getViewTreeObserver().removeOnPreDrawListener(this);
                        return false;
_L2:
                        if (b.k.a(dbf.bZ, dbn.b))
                        {
                            TripFragment.a(b, fqf.b);
                        }
                        if (true) goto _L4; else goto _L3
_L3:
                    }

            
            {
                b = TripFragment.this;
                a = view;
                super();
            }
                });
                return;
            }
            if (i.b() != null)
            {
                G.b(false);
                return;
            }
        }
    }

    private boolean aj()
    {
        return ai == null && G.i() && E.o() && !k.a(dbf.bZ, dbn.c) && i.b() != null;
    }

    private String ak()
    {
        Object obj2 = null;
        Object obj1 = r.b();
        Object obj = obj2;
        if (obj1 != null)
        {
            obj = obj2;
            if (((RiderLocation) (obj1)).isHotspotLocation())
            {
                obj = ((RiderLocation) (obj1)).getUberLatLng();
                obj = l.b(((com.ubercab.android.location.UberLatLng) (obj)));
                if (obj == null)
                {
                    obj1 = null;
                } else
                {
                    obj1 = ((LocationDescription) (obj)).getAddressComponent("driver_msg");
                }
                obj = obj2;
                if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    obj = getString(0x7f070271, new Object[] {
                        obj1
                    });
                }
            }
        }
        return ((String) (obj));
    }

    private void b(RiderLocation riderlocation, FareInfo fareinfo)
    {
        if (i.f() == null) goto _L2; else goto _L1
_L1:
        E.b(riderlocation);
_L4:
        a(riderlocation, fareinfo);
        return;
_L2:
        if (r.b() != null)
        {
            E.a(riderlocation);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void b(TripFragment tripfragment)
    {
        tripfragment.ac();
    }

    private void c(int i1)
    {
        Long long1 = null;
        Object obj = frj.a(i1);
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression");
        if (obj != null)
        {
            analyticsevent.setName(((cia) (obj)));
            if (i1 == 5)
            {
                obj = i.f();
                if (obj != null)
                {
                    obj = String.valueOf(((Trip) (obj)).getEta());
                } else
                {
                    obj = null;
                }
            } else
            if (i1 == 6 || i1 == 7)
            {
                long1 = m.j();
                obj = null;
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                analyticsevent.setValue(((String) (obj)));
            }
            if (long1 != null)
            {
                analyticsevent.setValuePosition(long1);
            }
            d.a(analyticsevent);
        }
    }

    static void c(TripFragment tripfragment)
    {
        tripfragment.X();
    }

    private void c(boolean flag)
    {
        Object obj = i.b();
        String s1 = E.m();
        if (obj != null)
        {
            obj = ((City) (obj)).findVehicleViewById(s1);
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            return;
        }
        if (!((VehicleView) (obj)).isDestinationEnabled())
        {
            E.q();
        }
        DynamicFare dynamicfare = f(s1);
        boolean flag1;
        if (dynamicfare != null && dynamicfare.getMultiplier() > 1.0F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 && (flag || ((VehicleView) (obj)).getAllowedToSurge()))
        {
            flag = "sobriety".equals(dynamicfare.getScreenType());
            Intent intent;
            if (k.a(dbf.aS))
            {
                intent = SurgeActivity.a(f, s1, flag, ax);
            } else
            {
                intent = SurgeActivityDeprecated.a(f, s1, flag, ax);
            }
            startActivityForResult(intent, 3001);
            return;
        } else
        {
            az = 0L;
            aa();
            return;
        }
    }

    private void d(int i1)
    {
        Point point = Y.i();
        boolean flag = cwm.a(getActivity().getWindow());
        if (ai == null && flag && point != null && point.y > 0)
        {
            ai = new PinEducationPopupWindow(getActivity(), g, point.y, i1);
            ai.setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() {

                final TripFragment a;

                public final void onDismiss()
                {
                    a.G.b(false);
                    a.ai = null;
                }

            
            {
                a = TripFragment.this;
                super();
            }
            });
            ai.b();
            return;
        } else
        {
            G.b(false);
            return;
        }
    }

    public static void d(TripFragment tripfragment)
    {
        tripfragment.ah();
    }

    public static void e(TripFragment tripfragment)
    {
        tripfragment.Y();
    }

    private DynamicFare f(String s1)
    {
        DynamicFare dynamicfare = null;
        Object obj = i.e();
        if (obj != null)
        {
            obj = ((Eyeball) (obj)).getDynamicFares();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            dynamicfare = (DynamicFare)((Map) (obj)).get(s1);
        }
        return dynamicfare;
    }

    public static TripFragment g()
    {
        return new TripFragment();
    }

    private boolean g(String s1)
    {
        City city = i.b();
        if (city != null && !e.k())
        {
            if ((s1 = city.findVehicleViewById(s1)) != null && s1.getEnableVehicleInventoryView())
            {
                return true;
            }
        }
        return false;
    }

    public final void A()
    {
        Object obj;
        if (o.i())
        {
            d.a(n.fb);
        } else
        {
            d.a(AnalyticsEvent.create("tap").setName(n.fb).setValue(m.f()));
        }
        obj = E.m();
        obj = p.c(((String) (obj)));
        if (obj != null && p.f(((MobileMessage) (obj)).getId()) && a(((MobileMessage) (obj))))
        {
            return;
        }
        obj = i.c();
        if (obj != null && ((Client) (obj)).isMobileRevoked().booleanValue())
        {
            gjm.a(d());
            return;
        }
        if (g(E.m()))
        {
            d.a(n.hB);
            Q();
            return;
        } else
        {
            c(false);
            return;
        }
    }

    public final void B()
    {
    }

    public final void C()
    {
label0:
        {
            if (3 == E.g())
            {
                if (!m.g())
                {
                    break label0;
                }
                E.a(true, Boolean.valueOf(true));
            }
            return;
        }
        S();
    }

    public final void D()
    {
        U.g();
    }

    public final void E()
    {
        t.a();
    }

    public final void F()
    {
        boolean flag;
        if (E.g() == 6 || E.g() == 7)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        U.a(flag);
    }

    final boolean G()
    {
        aA.n();
        if (ak != null && ak.isShowing())
        {
            ak.c();
        } else
        {
            if (ai != null && ai.isShowing())
            {
                ai.dismiss();
                return true;
            }
            if (!h.d() && !ag.c())
            {
                if (aj != null && aj.isShowing())
                {
                    aj.dismiss();
                    aj = null;
                    return true;
                }
                if (!U.p() && !ac.j() && !V.a())
                {
                    switch (E.g())
                    {
                    default:
                        if (at != null && at.isShowing())
                        {
                            at.dismiss();
                            at = null;
                            return true;
                        } else
                        {
                            return false;
                        }

                    case 3: // '\003'
                        break;
                    }
                    if (m.g())
                    {
                        E.a(true, Boolean.valueOf(true));
                        return true;
                    } else
                    {
                        S();
                        return true;
                    }
                }
            }
        }
        return true;
    }

    final void H()
    {
        b(getString(0x7f070080));
        if (!v.u())
        {
            x.c();
            return;
        }
        Object obj = i.f();
        if (obj != null)
        {
            obj = ((Trip) (obj)).getUuid();
        } else
        {
            obj = null;
        }
        ar = D.d(((String) (obj))).a(ico.a()).a(new frq(this, (byte)0));
    }

    final void I()
    {
        E.q();
    }

    final void J()
    {
        com.ubercab.rider.realtime.model.PaymentProfile paymentprofile = A.a();
        if (paymentprofile != null && dui.b(paymentprofile))
        {
            startActivity(PaytmAddFundsActivity.a(f, k, A.h()));
        }
    }

    final void K()
    {
        startActivity(PaytmOtpActivity.a(f, A.h(), true));
    }

    final void L()
    {
        fyv fyv1 = new fyv(A.a(), A.d(), A.e(), A.b());
        g.c(fyv1);
    }

    final void M()
    {
        U.c();
    }

    protected final czj a(dfp dfp)
    {
        return N();
    }

    public final void a(int i1)
    {
        T.a(i1);
    }

    public final void a(Rect rect)
    {
        V.a(fvx.a, rect);
    }

    public final void a(cjg cjg1)
    {
        if (E.p())
        {
            if (o.h())
            {
                if (cjg1.d() >= 14F)
                {
                    m.c();
                } else
                {
                    m.d();
                }
            }
            T.c();
            Y.a(cjg1.b());
            cjg1 = cjg1.b();
            if (cjg1 != null)
            {
                C.b(cjg1);
                return;
            }
        }
    }

    public final void a(RiderLocation riderlocation)
    {
        G.f(false);
        t.a(null);
        b(riderlocation, null);
        ag();
    }

    final void a(RiderLocation riderlocation, FareInfo fareinfo)
    {
        Object obj;
        String s2;
        int i1;
        s2 = E.m();
        if (TextUtils.isEmpty(s2) || !TextUtils.isDigitsOnly(s2))
        {
            ijg.c("Invalid vehicle view Id when attempting to set destination: %s", new Object[] {
                s2
            });
            return;
        }
        obj = E.h();
        long l1;
        if (obj != null)
        {
            obj = ((RiderLocation) (obj)).getCnLocation();
        } else
        {
            obj = null;
        }
        if (riderlocation != null)
        {
            riderlocation = riderlocation.getCnLocation();
        } else
        {
            riderlocation = null;
        }
        i1 = ae();
        l1 = az;
        if (v.q()) goto _L2; else goto _L1
_L1:
        x.a(Integer.valueOf(s2).intValue(), l1, ((CnLocation) (obj)), riderlocation, fareinfo, i1);
_L4:
        U.h();
        return;
_L2:
        String s1;
        if (i.f() != null)
        {
            s1 = i.f().getUuid();
        } else
        {
            s1 = null;
        }
        if (s1 != null)
        {
            as = D.a(s1, riderlocation).a(ico.a()).a(new frr(this, (byte)0));
        } else
        {
            if (obj != null)
            {
                obj = Location.create(((CnLocation) (obj)).getLatitude(), ((CnLocation) (obj)).getLongitude());
            } else
            {
                obj = null;
            }
            if (riderlocation != null)
            {
                riderlocation = Location.create(riderlocation.getLatitude(), riderlocation.getLongitude());
            } else
            {
                riderlocation = null;
            }
            if (obj != null && riderlocation != null)
            {
                as = y.a(Integer.valueOf(s2).intValue(), ((Location) (obj)), riderlocation, Integer.valueOf(i1), fareinfo).a(ico.a()).a(new fro(this, (byte)0));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Note note)
    {
        RiderLocation riderlocation = r.b();
        if (riderlocation == null)
        {
            return;
        } else
        {
            a(note, riderlocation);
            return;
        }
    }

    public final void a(GmmProductSurge gmmproductsurge)
    {
        ax = gmmproductsurge;
    }

    public final void a(FareSuggestedVehicleView faresuggestedvehicleview)
    {
        if (faresuggestedvehicleview == null)
        {
            ijg.d("%s Requested switch with null vehicle view", new Object[] {
                com/ubercab/client/feature/trip/SuggestedVehicleViewBannerView.getSimpleName()
            });
        } else
        {
            Trip trip = i.f();
            switch (E.g())
            {
            default:
                return;

            case 3: // '\003'
                faresuggestedvehicleview = faresuggestedvehicleview.getVehicleViewId().toString();
                E.c(faresuggestedvehicleview);
                U.i();
                return;

            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
                break;
            }
            if (trip != null)
            {
                H.a(trip.getUuid(), faresuggestedvehicleview.getFareInfo());
                return;
            }
        }
    }

    public final volatile void a(czj czj)
    {
        a((frs)czj);
    }

    public final void a(fvv fvv1, boolean flag)
    {
        if (flag)
        {
            a(U.o());
        }
        fvv1.a();
    }

    final void a(String s1, String s2)
    {
        ac.b(s1, s2);
    }

    public final void a(String s1, String s2, String s3)
    {
        (new android.app.AlertDialog.Builder(getActivity())).setMessage(s1).setPositiveButton(s2, new android.content.DialogInterface.OnClickListener(s3) {

            final String a;
            final TripFragment b;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(a));
                b.startActivity(dialoginterface);
            }

            
            {
                b = TripFragment.this;
                a = s1;
                super();
            }
        }).create().show();
    }

    final void a(String s1, boolean flag)
    {
        Object obj1 = E.m();
        Object obj;
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            if ((obj = r.b()) != null)
            {
                CnLocation cnlocation2 = ((RiderLocation) (obj)).getCnLocation();
                obj = r.c();
                Object obj2;
                Object obj3;
                Object obj4;
                CnLocation cnlocation;
                CnLocation cnlocation1;
                Note note;
                Object obj6;
                boolean flag2;
                boolean flag3;
                if (obj != null)
                {
                    cnlocation = ((RiderLocation) (obj)).getCnLocation();
                } else
                {
                    cnlocation = null;
                }
                obj = E.i();
                if (obj != null)
                {
                    cnlocation1 = ((RiderLocation) (obj)).getCnLocation();
                } else
                {
                    cnlocation1 = null;
                }
                obj = U.o();
                note = ((Note) (obj));
                if (obj == null)
                {
                    note = ((Note) (obj));
                    if (o.g())
                    {
                        String s2 = ak();
                        note = ((Note) (obj));
                        if (!TextUtils.isEmpty(s2))
                        {
                            note = Note.create().setText(s2);
                        }
                    }
                }
                flag3 = false;
                flag2 = false;
                obj3 = null;
                obj6 = null;
                obj4 = i.b();
                if (obj4 != null)
                {
                    obj = ((City) (obj4)).findVehicleViewById(((String) (obj1)));
                } else
                {
                    obj = null;
                }
                obj2 = obj1;
                if (obj != null)
                {
                    if (k.a(dbf.b) && ((VehicleView) (obj)).getLinkedVehicleViewId() != null)
                    {
                        obj3 = ((VehicleView) (obj)).getLinkedVehicleViewId();
                        obj2 = ((City) (obj4)).findVehicleViewById(((String) (obj3)));
                        Object obj5;
                        boolean flag1;
                        int i1;
                        boolean flag4;
                        boolean flag5;
                        if (obj2 == null || !G.T())
                        {
                            obj2 = obj;
                            obj3 = obj1;
                        }
                        obj5 = f(((VehicleView) (obj2)).getId());
                        obj = obj2;
                        obj1 = obj3;
                        if (obj5 != null)
                        {
                            az = ((DynamicFare) (obj5)).getFareId();
                            obj1 = obj3;
                            obj = obj2;
                        }
                    }
                    obj5 = obj;
                    obj2 = obj1;
                    if (((VehicleView) (obj)).getHijackVehicleViewId() != null)
                    {
                        obj5 = obj;
                        obj2 = obj1;
                        if (k.a(dbf.c))
                        {
                            obj2 = ((VehicleView) (obj)).getHijackVehicleViewId();
                            obj5 = ((City) (obj4)).findVehicleViewById(((String) (obj2)));
                            obj4 = obj;
                            obj3 = obj1;
                            if (obj5 != null)
                            {
                                obj4 = obj;
                                obj3 = obj1;
                                if (G.T())
                                {
                                    obj4 = obj5;
                                    obj3 = obj2;
                                }
                            }
                            obj = f(((VehicleView) (obj4)).getId());
                            obj5 = obj4;
                            obj2 = obj3;
                            if (obj != null)
                            {
                                az = ((DynamicFare) (obj)).getFareId();
                                obj2 = obj3;
                                obj5 = obj4;
                            }
                        }
                    }
                    flag2 = ((VehicleView) (obj5)).getAllowRidepool();
                    flag3 = G.U();
                    if (((VehicleView) (obj5)).isDestinationRequired() || ((VehicleView) (obj5)).isDestinationPreferred() && !flag3)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (cnlocation1 == null && (flag1 || flag2))
                    {
                        M.h();
                        return;
                    }
                    flag3 = ((VehicleView) (obj5)).getIsCashOnly();
                    obj = obj6;
                    if (g(((String) (obj2))))
                    {
                        obj1 = ((VehicleView) (obj5)).getUuid();
                        obj = obj6;
                        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                        {
                            obj3 = z.c(((String) (obj1)));
                            obj = obj6;
                            if (obj3 != null)
                            {
                                obj1 = new ArrayList();
                                obj3 = ((Store) (obj3)).getItemsForServer();
                                obj = obj1;
                                if (obj3 != null)
                                {
                                    ((List) (obj1)).addAll(((java.util.Collection) (obj3)));
                                    obj = obj1;
                                }
                            }
                        }
                    }
                    obj3 = obj;
                }
                if (flag2)
                {
                    G.f();
                    G.e(true);
                }
                i1 = ae();
                E.e(true);
                obj4 = A.a(getActivity());
                flag4 = A.d();
                if (A.e() && !flag3)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                obj5 = t.d();
                if (w.f())
                {
                    obj = w.b();
                } else
                {
                    obj = null;
                }
                flag5 = I.p();
                if (!v.l())
                {
                    x.a(cnlocation, cnlocation2, cnlocation1, Integer.parseInt(((String) (obj2))), az, s1, flag, flag4, flag3, A.b(), ((String) (obj4)), ((List) (obj3)), flag2, ((com.ubercab.rider.realtime.model.UpfrontFare) (obj5)), i1, ((com.ubercab.rider.realtime.model.Profile) (obj)), note, flag5);
                } else
                {
                    obj1 = null;
                    if (obj3 != null)
                    {
                        obj1 = gkk.a(gki.a(((Iterable) (obj3)), new gjv() {

                            final TripFragment a;

                            private static ShoppingCartItem a(Object obj7)
                            {
                                return (ShoppingCartItem)obj7;
                            }

                            public final Object apply(Object obj7)
                            {
                                return a(obj7);
                            }

            
            {
                a = TripFragment.this;
                super();
            }
                        }));
                    }
                    s1 = ica.a(y.a(Integer.parseInt(((String) (obj2))), cnlocation2, cnlocation1, Long.valueOf(az), ((com.ubercab.rider.realtime.model.UpfrontFare) (obj5)), s1, ((String) (obj4)), ((com.ubercab.rider.realtime.model.Profile) (obj)), Boolean.valueOf(flag4), Boolean.valueOf(flag), Boolean.valueOf(flag3), A.b(), Integer.valueOf(i1), note, ((List) (obj1)), Boolean.valueOf(flag5), (DeviceData)u.a()), U(), new frp()).a(ico.a());
                    obj = (TripActivity)getActivity();
                    obj.getClass();
                    aq = s1.b(new fqn(((TripActivity) (obj))));
                }
                b(false);
                return;
            }
        }
    }

    public final void a(List list)
    {
        p.a(list);
    }

    public final void a(boolean flag)
    {
        g.c(new fyo(flag));
    }

    public final boolean a(Point point)
    {
        if (X.b() && U.p())
        {
            X.a(true);
            return true;
        }
        if (!E.p())
        {
            return false;
        }
        point = getView();
        if (point != null)
        {
            point.removeCallbacks(al);
        }
        O.a();
        Y.f();
        C.a(true);
        C.h();
        if (drd.a(i.d()) && r.b() == null)
        {
            C.i();
        }
        return false;
    }

    public final boolean a(String s1)
    {
        boolean flag = g(s1);
        if (flag)
        {
            Q();
        }
        return flag;
    }

    public final void b(int i1)
    {
        S.a(i1);
        T.n();
    }

    final void b(boolean flag)
    {
        au = flag;
    }

    public final boolean b(Point point)
    {
        if (E.p())
        {
            O.b();
            Y.e();
            T.i();
            point = getView();
            if (point != null)
            {
                point.postDelayed(al, ay);
                return false;
            }
        }
        return false;
    }

    public final void d(String s1)
    {
        E.c(s1);
    }

    public final void e(String s1)
    {
        s1 = p.d(s1);
        if (s1 != null)
        {
            g.c(new efm(s1));
        }
    }

    public final cic f()
    {
        return czb.a;
    }

    public final void h()
    {
        X();
        T.k();
    }

    public final void i()
    {
        A.c(false);
        Y();
    }

    public final void j()
    {
        A.c(true);
        Y();
    }

    public final boolean j_()
    {
        T.h();
        return false;
    }

    public final void k()
    {
        onShowFareQuoteEvent(null);
    }

    public final boolean k_()
    {
        O.c();
        Y.g();
        return false;
    }

    public final void l()
    {
        Object obj = i.b();
        Object obj1;
        FragmentActivity fragmentactivity;
        if (obj != null)
        {
            if ((obj1 = ((City) (obj)).findVehicleViewById(E.m())) != null && (fragmentactivity = getActivity()) != null && (obj = r.b()) != null)
            {
                if (((VehicleView) (obj1)).getAllowFareEstimate() && ((VehicleView) (obj1)).isDestinationEnabled())
                {
                    obj1 = new Intent(fragmentactivity, com/ubercab/client/feature/estimate/FareEstimateActivity);
                    ((Intent) (obj1)).putExtra("com.ubercab.FARE_ID", az);
                    ((Intent) (obj1)).putExtra("com.ubercab.LOCATION_DESTINATION", E.i());
                    ((Intent) (obj1)).putExtra("com.ubercab.LOCATION_PICKUP", ((android.os.Parcelable) (obj)));
                    obj = A.k();
                    if (obj != null)
                    {
                        ((Intent) (obj1)).putExtra("com.ubercab.CURRENCY_TO_POINTS_RATIO", ((Balance) (obj)).getRewardsToCurrencyRatio());
                    }
                    startActivityForResult(((Intent) (obj1)), 5001);
                    d.a(n.eI);
                    return;
                } else
                {
                    (new android.app.AlertDialog.Builder(fragmentactivity)).setMessage(getString(0x7f070231, new Object[] {
                        ((VehicleView) (obj1)).getDescription()
                    })).setPositiveButton(getString(0x7f07009a), null).create().show();
                    return;
                }
            }
        }
    }

    public final void l_()
    {
        X();
    }

    public final void m()
    {
        E.a(false, null);
    }

    public final void m_()
    {
        if (getActivity() != null)
        {
            ac.i();
        }
    }

    public final void n()
    {
        Client client = i.c();
        if (client != null && client.isMobileRevoked().booleanValue())
        {
            gjm.a(d());
        } else
        {
            if (A.i())
            {
                g.c(new fyh());
                return;
            }
            if (A.a() == null)
            {
                if (getActivity() != null)
                {
                    U.l();
                    return;
                }
            } else
            if (A.f() && !au)
            {
                g.c(new erp(A.a(), A.b()));
                return;
            } else
            {
                d.a(AnalyticsEvent.create("tap").setName(n.dA).setValue(C.j()));
                a(A.h(), false);
                return;
            }
        }
    }

    public final void n_()
    {
        E.c(true);
        c(false);
    }

    public final void o()
    {
        if (getChildFragmentManager().findFragmentByTag(PromoFragment.a) == null)
        {
            PromoFragment.d().show(getChildFragmentManager(), PromoFragment.a);
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 4001)
        {
            S();
        }
        if (j1 == -1) goto _L2; else goto _L1
_L1:
        if (i1 != 3001) goto _L4; else goto _L3
_L3:
        E.r();
_L6:
        return;
_L4:
        if (i1 == 2008 && j1 == 2)
        {
            G.f(true);
            M.r();
            c(true);
            return;
        } else
        {
            ijg.c("Bad activity result [%d] for request [%d]", new Object[] {
                Integer.valueOf(j1), Integer.valueOf(i1)
            });
            return;
        }
_L2:
        if (i1 != 2007)
        {
            break; /* Loop/switch isn't completed */
        }
        intent = (RiderLocation)intent.getParcelableExtra("com.ubercab.LOCATION");
        C.a(intent);
        if (!n.a(E.g()))
        {
            E.a(false, null);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (i1 == 2008)
        {
            G.f(false);
            RiderLocation riderlocation = (RiderLocation)intent.getParcelableExtra("com.ubercab.LOCATION");
            intent = (FareInfo)intent.getParcelableExtra("com.ubercab.FAREINFO");
            t.a(intent);
            b(riderlocation, intent);
            ag();
            return;
        }
        if (i1 == 2009)
        {
            RiderLocation riderlocation1 = (RiderLocation)intent.getParcelableExtra("com.ubercab.LOCATION");
            intent = (FareInfo)intent.getParcelableExtra("com.ubercab.FAREINFO");
            t.a(intent);
            b(riderlocation1, intent);
            c(false);
            return;
        }
        if (i1 == 5001)
        {
            intent = (RiderLocation)intent.getParcelableExtra("com.ubercab.LOCATION_DESTINATION");
            E.a(intent);
            return;
        }
        if (i1 == 3001)
        {
            if (k.a(dbf.aS))
            {
                az = intent.getLongExtra("com.ubercab.FARE_ID", 0L);
            } else
            {
                az = intent.getLongExtra("com.ubercab.FARE_ID", 0L);
            }
            aa();
            return;
        }
        if (i1 == 6001)
        {
            intent = (Note)intent.getParcelableExtra("com.ubercab.PICKUPNOTE");
            U.a(intent);
            return;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void onAddDestinationEvent(fyc fyc)
    {
        V();
    }

    public void onContactDriver(gfo gfo)
    {
        gfo = i.f();
        if (gfo == null || gfo.getDriver() == null)
        {
            return;
        }
        if (k.a(dbf.ai))
        {
            Q.b();
            return;
        } else
        {
            Q.a();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ay = getResources().getInteger(0x10e0002);
        if (bundle != null)
        {
            av = bundle.getBoolean("com.ubercab.BUNDLE_GMM_IS_INTENT_CONSUMED");
            ax = (GmmProductSurge)bundle.getParcelable("com.ubercab.BUNDLE_GMM_SURGE_DISPLAYED");
            az = bundle.getLong("com.ubercab.CONFIRMATION_SURGE_FARE_ID");
            ao = (RiderLocation)bundle.getParcelable("com.ubercab.LOCATION_PREVIOUS_PICKUP");
            ap = bundle.getString("com.ubercab.BUNDLE_MOBILE_MESSAGE_MSG_ID");
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            menuinflater.inflate(0x7f100019, menu);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0301c1, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestinationChangedEvent(fyi fyi)
    {
        M.i();
        N.d();
        T.f();
        ad.a(fyi);
        U.a(fyi);
        J.c();
        Y.c();
        I.f();
        Y();
    }

    public void onDestinationPinClicked(fyj fyj)
    {
        U.d();
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (aq != null)
        {
            aq.b();
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        aA.b(this);
        aA.b(this);
        J.b(this);
        M.b(this);
        N.b(this);
        if (k.a(dbf.ai))
        {
            P.b(this);
            P.b();
        }
        R.b(this);
        T.b(this);
        S.b(this);
        ag.b(this);
        U.b(this);
        V.b(this);
        ab.b(this);
        ac.b(this);
        I.b(this);
        ButterKnife.reset(this);
        if (ak != null && ak.isShowing())
        {
            ak.dismiss();
            ak = null;
        }
        if (at != null && at.isShowing())
        {
            at.dismiss();
            at = null;
        }
        if (aj != null && aj.isShowing())
        {
            aj.dismiss();
            aj = null;
        }
        if (ai != null && ai.isShowing())
        {
            ai.dismiss();
            ai = null;
        }
        g.b(X);
    }

    public void onDismissMobileMessage(efn efn)
    {
        ak = null;
    }

    public void onFareEvent(fyk fyk1)
    {
        if (A.a() == null)
        {
            an = null;
        } else
        {
            RewardInfo rewardinfo = A.g();
            if (rewardinfo != null && rewardinfo.getBalance() != null)
            {
                double d1 = rewardinfo.getBalance().getRewardsToCurrencyRatio();
                fyk1 = fyk1.a();
                if (fyk1 != null)
                {
                    an = fqg.a(fyk1, d1);
                    return;
                }
            }
        }
    }

    public void onGetCreditBalanceResponseEvent(dlw dlw1)
    {
        if (!dlw1.i())
        {
            d().a_(getString(0x7f0703a9));
        } else
        {
            dlw1 = (RiderBalance)dlw1.g();
            if (dlw1 != null)
            {
                City city = i.b();
                if (city != null)
                {
                    boolean flag;
                    if (dtv.a(city.getCurrencyCode(), dlw1.getCreditBalanceStrings()) != null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    A.a(flag);
                    U.f();
                    return;
                }
            }
        }
    }

    public void onGetFareEstimateEvent(fyl fyl)
    {
        a(E.i(), t.b());
    }

    public void onGetMultiFareEstimateEvent(fym fym)
    {
        V();
    }

    public void onItemCountChange(fjb fjb)
    {
        ac.a(fjb);
    }

    public void onMapClickCurrentLocationEvent(fyp fyp)
    {
        Y.d();
        T.g();
    }

    public void onMobileMessageConfirmActionEvent(efl efl1)
    {
        efl1 = efl1.a();
        if (efl1.getDisplayProps() != null)
        {
            efl1 = efl1.getDisplayProps().getShowAfterRequestingVehicleViewId();
            if (E.g() == 0 && gjx.a(efl1, E.m()))
            {
                c(false);
                return;
            }
        }
    }

    public void onMobileMessageForLookingEvent(efm efm1)
    {
        while (E.c() || !fte.d(E.g())) 
        {
            return;
        }
        a(efm1.a());
    }

    public void onMultiFareEstimateEvent(fyq fyq)
    {
        U.j();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = true;
        switch (menuitem.getItemId())
        {
        default:
            flag = false;
            // fall through

        case 42: // '*'
        case 43: // '+'
            return flag;

        case 16908332: 
            getActivity().onBackPressed();
            return true;

        case 2131625670: 
            T();
            return true;

        case 44: // ','
            aa.a(getActivity());
            return true;
        }
    }

    public void onPanelSlideEvent(PanelSlideEvent panelslideevent)
    {
        T.a(panelslideevent);
    }

    public void onPause()
    {
        super.onPause();
        h.a(false);
        O.b(aA);
        O.b(this);
        m.d();
        m.b(ag);
        n.d();
        q.d();
        t.f();
        z.b();
        A.o();
        I.j();
        ah.e();
        if (am != null)
        {
            am.b();
        }
        if (ar != null)
        {
            ar.b();
        }
        if (as != null)
        {
            as.b();
        }
    }

    public void onPaymentCheckBalanceResponseEvent(dml dml1)
    {
        if (!dml1.i()) goto _L2; else goto _L1
_L1:
        A.b(((PaymentCheckBalanceResponse)dml1.g()).getDisplayAmount());
_L4:
        U.e();
        return;
_L2:
        if (dml1.n() == 403)
        {
            g.c(new fyt());
            A.b("");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPickupCancelClientResponseEvent(dmp dmp)
    {
        e();
    }

    public void onPinLocationEvent(daq daq)
    {
        T.j();
        ac.g();
        U.a(daq);
        Y.a(daq);
    }

    public void onPingEvent(dar dar1)
    {
        while (v.n() || i.c() == null) 
        {
            return;
        }
        M.m();
        N.a();
        U.a();
        X.a(dar1);
        Y.a();
        a(dar1.a().getFareSplit());
        ah();
        Y();
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        if (menu == null || getActivity() == null)
        {
            return;
        }
        if (menu.size() == 0)
        {
            getActivity().supportInvalidateOptionsMenu();
            return;
        }
        boolean flag = fte.c(E.g());
        if (i.f() != null && flag && e.h() && !dzk.a(k))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menu.findItem(0x7f0e06c6).setVisible(flag);
    }

    public void onProductGroupSelected(fyu fyu1)
    {
        if (fte.b(fyu1.a())) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1 = fyu1.c();
        MobileMessage mobilemessage = p.b(s1);
        if (mobilemessage != null)
        {
            fyu1 = mobilemessage;
            if (mobilemessage.getDisplayProps().getShowAsModalOverRequestView().booleanValue())
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        fyu1 = p.e(s1);
        if (fyu1 == null) goto _L1; else goto _L3
_L3:
        g.c(new efm(fyu1));
        return;
    }

    public void onPromoCodeAcceptedConfirmedEvent(far far)
    {
        far = (PromoFragment)getChildFragmentManager().findFragmentByTag(PromoFragment.a);
        if (far != null)
        {
            far.dismiss();
        }
    }

    public void onReminderCallFailureEvent(fjc fjc)
    {
        ac.a(fjc);
    }

    public void onResume()
    {
        super.onResume();
        R.a(getActivity().getIntent());
        O.a(aA);
        O.a(this);
        if (!o.h() || aA.p() >= 14F)
        {
            m.c();
        }
        n.c();
        m.a(ag);
        q.c();
        t.e();
        z.a();
        A.n();
        ah.d();
        I.i();
        am = j.i().a(ica.a(j.a(), j.b(), j.d(), j.f(), j.g(), j.h(), new frn((byte)0)), new idj() {

            final TripFragment a;

            private static frn a(frn frn1)
            {
                return frn1;
            }

            public final volatile Object a(Object obj, Object obj1)
            {
                return a((frn)obj1);
            }

            
            {
                a = TripFragment.this;
                super();
            }
        }).a(ico.a()).c(new frm(this, (byte)0));
        g.c(new fzb());
        h.a(true);
    }

    public void onSafetyNetSharedTripStatusUpdateEvent(ffl ffl1)
    {
        if (e.g() && ffl1.a())
        {
            ab();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.ubercab.BUNDLE_GMM_IS_INTENT_CONSUMED", av);
        bundle.putParcelable("com.ubercab.BUNDLE_GMM_SURGE_DISPLAYED", ax);
        bundle.putLong("com.ubercab.CONFIRMATION_SURGE_FARE_ID", az);
        bundle.putParcelable("com.ubercab.LOCATION_PREVIOUS_PICKUP", ao);
        if (ak != null && ak.isShowing())
        {
            bundle.putString("com.ubercab.BUNDLE_MOBILE_MESSAGE_MSG_ID", ak.b());
        }
        X.b(bundle);
    }

    public void onSetDestinationResponseEvent(dnf dnf1)
    {
        if (!dnf1.e())
        {
            c(dnf1.a(getActivity()));
            return;
        }
        Object obj = (Ping)dnf1.g();
        String s1 = ((Ping) (obj)).getUpfrontFareMessage();
        if (!TextUtils.isEmpty(s1))
        {
            c(s1);
        }
        obj = ((Ping) (obj)).getFareInfo();
        if (obj != null && ((FareInfo) (obj)).isFareElevated())
        {
            c(getString(0x7f07063c));
        }
        ad.a(dnf1);
        U.a(dnf1);
    }

    public void onShowFareDetailsEvent(fyy fyy)
    {
        ac();
    }

    public void onShowFareQuoteEvent(fyz fyz)
    {
        FareInfo fareinfo = t.b();
        if (fareinfo != null)
        {
            fyz = fareinfo.getFareDetail();
        } else
        {
            fyz = null;
        }
        if (k.a(dbf.aT) && fyz != null)
        {
            d.a(l.fe);
            fyz = PoolSurgeDialogFragment.a(UpfrontFareDetail.create(fyz));
            fyz.show(getChildFragmentManager(), fyz.getClass().getName());
        } else
        {
            fyz = E.m();
            fyz = p.d(fyz);
            if (fyz != null && p.f(fyz.getId()))
            {
                a(fyz);
                return;
            }
            if (A.e() && !TextUtils.isEmpty(an))
            {
                fyz = RewardPointsFareEstimateFragment.a(an);
                fyz.show(getChildFragmentManager(), fyz.getClass().getName());
                return;
            }
            if (getActivity() != null)
            {
                if (fareinfo == null)
                {
                    fyz = getString(0x7f070230);
                } else
                {
                    fyz = getString(0x7f070243);
                }
                (new android.app.AlertDialog.Builder(getActivity())).setMessage(fyz).setPositiveButton(getString(0x7f0702f8), null).create().show();
                return;
            }
        }
    }

    public void onShowProfilePickerEvent(ezs ezs)
    {
        ezs = ProfilePickerDialogFragment.d();
        ezs.show(getChildFragmentManager(), ezs.getClass().getName());
    }

    public void onStoreChargesUpdateFailEvent(fje fje)
    {
        ac.a(fje);
    }

    public void onStoreChargesUpdateSuccessEvent(fjf fjf)
    {
        ac.a(fjf);
    }

    public void onStoreUpdated(fjg fjg)
    {
        ac.a(fjg);
    }

    public void onSwitchProductResponseEvent(dnj dnj1)
    {
        if (!dnj1.i())
        {
            int i1;
            if (403 == dnj1.n())
            {
                i1 = 0x7f070487;
            } else
            {
                i1 = 0x7f070486;
            }
            c(getResources().getString(i1));
            return;
        } else
        {
            c(getResources().getString(0x7f070488));
            Z.a(dnj1);
            ad.a(dnj1);
            return;
        }
    }

    public void onTripUiStateChangedEvent(fzc fzc1)
    {
        int i1 = fzc1.b();
        c(i1);
        if (i1 == 4)
        {
            chp chp1 = d;
            AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression").setName(l.aL);
            String s1;
            if (E.j())
            {
                s1 = "yes";
            } else
            {
                s1 = "no";
            }
            chp1.a(analyticsevent.setValue(s1));
        }
        if (fzc1.b() == 3)
        {
            P();
            if (A.j())
            {
                s.a(A.h());
            }
        }
        if (fzc1.b() == 0)
        {
            G.e(false);
        }
        K.b();
        M.a(fzc1);
        N.c();
        T.a(fzc1);
        U.a(fzc1);
        W.a();
        Z.a();
        S.a(fzc1);
        J.a(fzc1);
        ab.a(fzc1);
        Y.a(fzc1);
        ac.a(fzc1);
        ah.f();
        Y();
    }

    public void onUpdateMapPadding(fzd fzd)
    {
        X();
    }

    public void onUpdatePinUiEvent(fze fze)
    {
        M.o();
        N.e();
        W.b();
    }

    public void onVehicleViewSelectedEvent(fzf fzf)
    {
        N.f();
        ah.g();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        aA = (MapFragment)getChildFragmentManager().findFragmentById(0x7f0e055d);
        aA.a(this);
        aA.a(this);
        ViewGroup viewgroup = (ViewGroup)view.findViewById(0x7f0e0565);
        J.a(viewgroup);
        J.a(this);
        R.a(this);
        ag.a(viewgroup);
        ag.a(M);
        ag.a(this);
        V.a(viewgroup);
        V.a(this);
        K.a(viewgroup);
        L.a(viewgroup);
        ae.a(viewgroup);
        S.a(viewgroup);
        S.a(this);
        T.a(viewgroup);
        T.a(this);
        viewgroup = (ViewGroup)view.findViewById(0x7f0e0562);
        M.a(viewgroup);
        M.a(this);
        N.a(mViewHeader);
        N.a(this);
        viewgroup = (ViewGroup)view.findViewById(0x7f0e0561);
        ad.a(viewgroup);
        ad.a(this);
        viewgroup = (ViewGroup)view.findViewById(0x7f0e0563);
        Z.a(viewgroup);
        U.a(mViewFooter);
        U.a(this);
        viewgroup = (ViewGroup)view.findViewById(0x7f0e055e);
        W.a(viewgroup);
        viewgroup = (ViewGroup)view.findViewById(0x7f0e0560);
        ac.a(viewgroup);
        ac.a(this);
        ab.a(viewgroup);
        ab.a(this);
        Y.a(mPinView);
        Y.a(this);
        Y.a(aA);
        O.a(af(), mViewHeader, mViewFooter);
        X.a(aA.getView(), mPinView, af(), mViewHeader);
        X.a(bundle);
        if (k.a(dbf.ai))
        {
            P.a(this);
            P.a();
        }
        g.a(X);
        I.a(m);
        ah.a(mPinView);
        I.a(this);
        view.addOnAttachStateChangeListener(new dsy() {

            final TripFragment a;

            public final void onViewAttachedToWindow(View view1)
            {
                if (a.E.c())
                {
                    TripFragment.b(a);
                }
            }

            
            {
                a = TripFragment.this;
                super();
            }
        });
        P();
        h.a(this);
    }

    public final void p()
    {
        V();
    }

    public final void q()
    {
        MobileMessage mobilemessage;
        if (m.e() == evv.b)
        {
            if ((mobilemessage = p.d()) != null)
            {
                a(mobilemessage);
                return;
            }
        }
    }

    public final void r()
    {
        X();
    }

    public final void s()
    {
        L();
    }

    public final void t()
    {
        d.a(n.eY);
        if (m.g() && E.g() != 1)
        {
            E.a(true, null);
            return;
        } else
        {
            W();
            return;
        }
    }

    public final void u()
    {
        RiderLocation riderlocation = r.b();
        RiderLocation riderlocation1 = E.i();
        boolean flag = O();
        startActivityForResult(LocationSearchActivity.a(getActivity(), "com.ubercab.ACTION_DESTINATION", riderlocation, riderlocation1, E.m(), flag), 2008);
    }

    public final void u_()
    {
        U.k();
    }

    public final void v()
    {
        d.a(n.eJ);
        T.d();
        V();
    }

    public final void v_()
    {
        U.k();
    }

    public final void w()
    {
        if (i.f() == null)
        {
            d.a(n.S);
            T.e();
            I();
            return;
        }
        if (E.g() == 7)
        {
            g.c(new fyg());
            return;
        } else
        {
            T.e();
            I();
            a(((RiderLocation) (null)), ((FareInfo) (null)));
            return;
        }
    }

    public final void x()
    {
        T.l();
    }

    public final void y()
    {
        T.m();
    }

    public final void z()
    {
        T.o();
    }
}
