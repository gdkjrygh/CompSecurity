// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.launch;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.widget.ImageView;
import butterknife.ButterKnife;
import cic;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.OnFinishedListener;
import com.adjust.sdk.ResponseData;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLocation;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.request.param.Location;
import com.ubercab.rider.realtime.response.BootstrapRider;
import com.ubercab.ui.TextView;
import cys;
import czf;
import czj;
import dak;
import dal;
import dbf;
import dcs;
import dfe;
import dfp;
import dju;
import doc;
import doy;
import dpg;
import dun;
import edp;
import edq;
import edt;
import edu;
import efa;
import gmg;
import gpt;
import gpv;
import hjm;
import ica;
import icl;
import ico;
import idd;
import ide;
import idi;
import ihq;
import ijg;
import java.util.Map;
import l;

public class LauncherActivity extends RiderActivity
{

    public doy h;
    public gmg i;
    public hjm j;
    public edt k;
    public efa l;
    public ica m;
    ImageView mImageViewSplash;
    TextView mTextViewSlogan;
    public ica n;
    public cys o;
    public dpg p;
    public dcs q;
    public dak r;
    public czf s;
    public dal t;
    public gpt u;
    ica v;
    ica w;
    ica x;
    icl y;

    public LauncherActivity()
    {
    }

    public static Intent a(Context context, Intent intent)
    {
        context = new Intent(context, com/ubercab/client/feature/launch/LauncherActivity);
        context.putExtra("extra_intent_to_relaunch", intent);
        context.addFlags(0x10000000);
        context.addFlags(32768);
        return context;
    }

    static void a(LauncherActivity launcheractivity)
    {
        launcheractivity.g();
    }

    private void a(edu edu1)
    {
        edu1.a(this);
    }

    private edu b(dfp dfp)
    {
        return edp.a().a(new dfe(this)).a(dfp).a();
    }

    static ica b(LauncherActivity launcheractivity)
    {
        return launcheractivity.k();
    }

    static ica c(LauncherActivity launcheractivity)
    {
        return launcheractivity.l();
    }

    static boolean d(LauncherActivity launcheractivity)
    {
        return launcheractivity.m();
    }

    private void f()
    {
        if (!s.s())
        {
            Adjust.onResume(this);
            Adjust.setOnFinishedListener(new OnFinishedListener() {

                final LauncherActivity a;

                public final void onFinishedTracking(ResponseData responsedata)
                {
                    if (responsedata.wasSuccess())
                    {
                        Adjust.setEnabled(Boolean.valueOf(false));
                        a.s.r();
                    }
                    Adjust.setOnFinishedListener(null);
                }

            
            {
                a = LauncherActivity.this;
                super();
            }
            });
        }
    }

    private void g()
    {
        if (t.v())
        {
            h();
            return;
        } else
        {
            i();
            return;
        }
    }

    private void h()
    {
        ica ica2 = j().b(new idi() {

            final LauncherActivity a;

            private ica a()
            {
                return LauncherActivity.b(a);
            }

            public final volatile Object a(Object obj)
            {
                return a();
            }

            
            {
                a = LauncherActivity.this;
                super();
            }
        });
        ica ica1 = j().b(new idi() {

            final LauncherActivity a;

            private ica a()
            {
                return LauncherActivity.c(a);
            }

            public final volatile Object a(Object obj)
            {
                return a();
            }

            
            {
                a = LauncherActivity.this;
                super();
            }
        });
        if (p.n())
        {
            ica1 = ica2.i();
            ica2.h();
        }
        y = ica1.a(ico.a()).c(new ide() {

            final LauncherActivity a;

            private void a(Client client)
            {
                client = client.getUuid();
                if (!client.equals(a.t.z()))
                {
                    a.t.d(client);
                }
                a.startActivity(a.k.a());
                a.finish();
            }

            public final void call(Object obj)
            {
                a((Client)obj);
            }

            
            {
                a = LauncherActivity.this;
                super();
            }
        });
    }

    private void i()
    {
        y = j().c(new ide() {

            final LauncherActivity a;

            private void a()
            {
                a.startActivity(a.k.a());
                a.finish();
            }

            public final void call(Object obj)
            {
                a();
            }

            
            {
                a = LauncherActivity.this;
                super();
            }
        });
    }

    private ica j()
    {
        if (x == null)
        {
            x = m.e().b(new idd() {

                final LauncherActivity a;

                public final void a()
                {
                    if (LauncherActivity.d(a))
                    {
                        a.u.a(gpv.a, dju.b);
                    }
                }

            
            {
                a = LauncherActivity.this;
                super();
            }
            }).a(new idd() {

                final LauncherActivity a;

                public final void a()
                {
                    a.u.b(dju.b);
                }

            
            {
                a = LauncherActivity.this;
                super();
            }
            }).a(ico.a()).b(new ide() {

                final LauncherActivity a;

                private void a(UberLocation uberlocation)
                {
                    a.mTextViewSlogan.setText(dun.a(a, uberlocation));
                }

                public final void call(Object obj)
                {
                    a((UberLocation)obj);
                }

            
            {
                a = LauncherActivity.this;
                super();
            }
            }).f().m();
        }
        return x;
    }

    private ica k()
    {
        if (w != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        RiderLocation riderlocation;
        obj = r.b();
        riderlocation = r.c();
        obj1 = null;
        if (obj == null || ((RiderLocation) (obj)).getUberLatLng() == null) goto _L4; else goto _L3
_L3:
        obj = ((RiderLocation) (obj)).getUberLatLng();
        obj = Location.create(((UberLatLng) (obj)).a(), ((UberLatLng) (obj)).b());
_L6:
        w = h.a(l.c(), ((Location) (obj)), j).d(new idi() {

            final LauncherActivity a;

            private static Client a(BootstrapRider bootstraprider)
            {
                return bootstraprider.getClient();
            }

            public final volatile Object a(Object obj2)
            {
                return a((BootstrapRider)obj2);
            }

            
            {
                a = LauncherActivity.this;
                super();
            }
        }).b(new idd() {

            final LauncherActivity a;

            public final void a()
            {
                if (LauncherActivity.d(a))
                {
                    a.u.a(gpv.a, dju.d);
                }
            }

            
            {
                a = LauncherActivity.this;
                super();
            }
        }).a(new idd() {

            final LauncherActivity a;

            public final void a()
            {
                a.u.b(dju.d);
            }

            
            {
                a = LauncherActivity.this;
                super();
            }
        }).d();
_L2:
        return w;
_L4:
        obj = obj1;
        if (riderlocation != null)
        {
            obj = obj1;
            if (riderlocation.getUberLatLng() != null)
            {
                obj = riderlocation.getUberLatLng();
                obj = Location.create(((UberLatLng) (obj)).a(), ((UberLatLng) (obj)).b());
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private ica l()
    {
        if (v == null)
        {
            v = n.e().b(new idd() {

                final LauncherActivity a;

                public final void a()
                {
                    if (LauncherActivity.d(a))
                    {
                        a.u.a(gpv.a, dju.c);
                    }
                }

            
            {
                a = LauncherActivity.this;
                super();
            }
            }).a(new idd() {

                final LauncherActivity a;

                public final void a()
                {
                    a.u.b(dju.c);
                }

            
            {
                a = LauncherActivity.this;
                super();
            }
            }).f().m();
        }
        return v;
    }

    private boolean m()
    {
        return i.a(dbf.L);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((edu)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        t.B();
        setContentView(0x7f030083);
        ButterKnife.inject(this);
        try
        {
            mImageViewSplash.setImageDrawable(ResourcesCompat.getDrawable(getResources(), 0x7f020085, getTheme()));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            System.gc();
            ijg.d(bundle, "OOM loading background in LauncherActivity", new Object[0]);
        }
        if (!cys.a(this, "android.permission.ACCESS_FINE_LOCATION"))
        {
            o.a(this, new doc() {

                final LauncherActivity a;

                public final void a(Map map, boolean flag)
                {
                    a.q.c();
                    LauncherActivity.a(a);
                }

            
            {
                a = LauncherActivity.this;
                super();
            }
            }, new String[] {
                "android.permission.ACCESS_FINE_LOCATION"
            });
            return;
        } else
        {
            q.c();
            g();
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (y != null)
        {
            y.b();
        }
    }

    public void onPause()
    {
        super.onPause();
        u.a(dju.b);
        u.a(dju.c);
        u.a(dju.d);
    }

    public void onResume()
    {
        super.onResume();
        f();
    }

    public final cic s()
    {
        return l.hK;
    }
}
