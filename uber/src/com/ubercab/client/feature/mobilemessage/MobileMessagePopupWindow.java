// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.mobilemessage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import cev;
import chp;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.feature.mobilemessage.model.MobileMessageDataHolder;
import com.ubercab.rider.realtime.model.MobileMessage;
import com.ubercab.rider.realtime.model.MobileMessageModule;
import cwm;
import cwu;
import czd;
import dru;
import eew;
import eez;
import efa;
import efe;
import eff;
import efj;
import efk;
import efn;
import gee;
import gef;
import hkr;
import ijg;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.mobilemessage:
//            MobileMessageDraggableLayout, MobileMessageModuleView

public class MobileMessagePopupWindow extends czd
    implements efe
{

    private final chp a;
    private final cev b;
    private final hkr c;
    private final efa d;
    private FrameLayout e;
    private efk f;
    private boolean g;
    private int h;
    private boolean i;
    private MobileMessage j;
    private eff k;
    private Map l;
    MobileMessageDraggableLayout mLayoutModules;

    public MobileMessagePopupWindow(Activity activity, chp chp1, cev cev, efa efa1, hkr hkr1)
    {
        super(activity, cev);
        g = false;
        h = 0;
        i = false;
        a = chp1;
        b = cev;
        d = efa1;
        c = hkr1;
        k = new eff(cev);
        e = (FrameLayout)LayoutInflater.from(a()).inflate(0x7f0300a9, null, false);
        ButterKnife.inject(this, e);
        setContentView(e);
        setAnimationStyle(0x7f0900d2);
        setWidth(-1);
        setHeight(-1);
        mLayoutModules.setVisibility(8);
        e.setOnClickListener(new android.view.View.OnClickListener() {

            final MobileMessagePopupWindow a;

            public final void onClick(View view)
            {
                MobileMessagePopupWindow.a(a);
            }

            
            {
                a = MobileMessagePopupWindow.this;
                super();
            }
        });
        mLayoutModules.a(new eez() {

            final MobileMessagePopupWindow a;

            public final void d()
            {
                MobileMessagePopupWindow.a(a);
            }

            public final void p_()
            {
                MobileMessagePopupWindow.b(a);
            }

            public final void q_()
            {
                MobileMessagePopupWindow.b(a);
            }

            
            {
                a = MobileMessagePopupWindow.this;
                super();
            }
        });
    }

    private View a(String s, MobileMessageModule mobilemessagemodule)
    {
        MobileMessageModuleView mobilemessagemoduleview = new MobileMessageModuleView(a());
        mobilemessagemoduleview.a(this);
        mobilemessagemoduleview.a(s, mobilemessagemodule, new MobileMessageDataHolder(c.b(), c.c(), c.f()));
        return mobilemessagemoduleview;
    }

    static void a(MobileMessagePopupWindow mobilemessagepopupwindow)
    {
        mobilemessagepopupwindow.a(true);
    }

    private void a(boolean flag)
    {
        if (!g)
        {
            return;
        }
        if (flag)
        {
            k();
        }
        mLayoutModules.b();
    }

    static void b(MobileMessagePopupWindow mobilemessagepopupwindow)
    {
        mobilemessagepopupwindow.h();
    }

    static boolean c(MobileMessagePopupWindow mobilemessagepopupwindow)
    {
        mobilemessagepopupwindow.g = true;
        return true;
    }

    static boolean d(MobileMessagePopupWindow mobilemessagepopupwindow)
    {
        mobilemessagepopupwindow.i = false;
        return false;
    }

    static void e(MobileMessagePopupWindow mobilemessagepopupwindow)
    {
        mobilemessagepopupwindow.czd.dismiss();
    }

    static cev f(MobileMessagePopupWindow mobilemessagepopupwindow)
    {
        return mobilemessagepopupwindow.b;
    }

    private void f()
    {
        if (j != null && l != null)
        {
            gee gee1 = (gee)l.get(j.getVehicleViewId());
            if (gee1 != null)
            {
                mLayoutModules.a(cwu.a(a()) - gee1.c());
                f = new efk(a(), gee1);
            }
        }
    }

    private void g()
    {
        TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
        translateanimation.setDuration(450L);
        translateanimation.setStartOffset(300L);
        translateanimation.setAnimationListener(new dru() {

            final MobileMessagePopupWindow a;

            public final void onAnimationEnd(Animation animation)
            {
                MobileMessagePopupWindow.c(a);
                MobileMessagePopupWindow.d(a);
                a.e();
            }

            
            {
                a = MobileMessagePopupWindow.this;
                super();
            }
        });
        mLayoutModules.startAnimation(translateanimation);
        mLayoutModules.setVisibility(0);
    }

    private static void g(MobileMessagePopupWindow mobilemessagepopupwindow)
    {
        mobilemessagepopupwindow.czd.dismiss();
    }

    private void h()
    {
        if (!g)
        {
            return;
        }
        g = false;
        i = false;
        if (j != null)
        {
            d.a(j);
        }
        j = null;
        mLayoutModules.setVisibility(8);
        mLayoutModules.removeAllViews();
        i();
    }

    private void i()
    {
        i = false;
        (new Handler()).post(new Runnable() {

            final MobileMessagePopupWindow a;

            public final void run()
            {
                MobileMessagePopupWindow.e(a);
                MobileMessagePopupWindow.f(a).c(new efn());
            }

            
            {
                a = MobileMessagePopupWindow.this;
                super();
            }
        });
    }

    private void j()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression").setName(l.cU).setValue(j.getId());
        a.a(analyticsevent);
    }

    private void k()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.ba).setValue(j.getId());
        a.a(analyticsevent);
    }

    private void l()
    {
        showAtLocation(a().getWindow().getDecorView(), 48, 0, 0);
    }

    public final void a(String s)
    {
        if (j != null)
        {
            if (!s.startsWith("native://"))
            {
                s = new Intent("android.intent.action.VIEW", Uri.parse(s));
                a().startActivity(s);
                return;
            }
            s = s.split("&&");
            int j1 = s.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                String s1 = s[i1];
                Object obj = k.a(s1);
                if (obj != null)
                {
                    obj = ((efj) (obj)).a(a(), j, s1);
                    if (((eew) (obj)).b())
                    {
                        a.a(((eew) (obj)).a());
                    }
                    if (((eew) (obj)).c())
                    {
                        a(false);
                    }
                    if (!((eew) (obj)).d())
                    {
                        ijg.d("Could not handle [%s] in mobile message", new Object[] {
                            s1
                        });
                    }
                }
                i1++;
            }
        }
    }

    public final boolean a(MobileMessage mobilemessage)
    {
        if (mobilemessage == null || !mobilemessage.equals(j))
        {
            j = mobilemessage;
            mLayoutModules.removeAllViews();
            h = 0;
            if (mobilemessage != null)
            {
                i = true;
                g = false;
                MobileMessageModule mobilemessagemodule;
                for (Iterator iterator = mobilemessage.getModules().iterator(); iterator.hasNext(); mLayoutModules.addView(a(mobilemessage.getId(), mobilemessagemodule)))
                {
                    mobilemessagemodule = (MobileMessageModule)iterator.next();
                }

                return true;
            }
        }
        return false;
    }

    public final String b()
    {
        if (j == null)
        {
            return null;
        } else
        {
            return j.getId();
        }
    }

    public final void c()
    {
        a(true);
    }

    public final boolean d()
    {
        return i;
    }

    public void dismiss()
    {
        i = false;
        g(this);
    }

    final void e()
    {
        if (f != null)
        {
            f.a(mLayoutModules.a());
            mLayoutModules.a(f);
            e.addView(f, 0);
        }
    }

    public final void e_()
    {
        h = h + 1;
        if (h >= j.getModules().size() && cwm.a(a().getWindow()))
        {
            l();
            f();
            g();
            j();
        }
    }

    public void onVehicleViewPositionEvent(gef gef1)
    {
        l = gef1.a();
    }
}
