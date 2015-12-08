// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.core.ui.FixedAspectRatioFrameLayout;
import com.google.android.apps.youtube.datalib.legacy.model.Branding;
import com.google.android.youtube.e;
import com.google.android.youtube.f;
import com.google.android.youtube.h;
import com.google.android.youtube.i;
import com.google.android.youtube.j;
import com.google.android.youtube.o;
import com.google.android.youtube.p;
import org.apache.http.client.HttpResponseException;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            k, i, h, j

public final class g
    implements android.view.View.OnClickListener, android.view.animation.Animation.AnimationListener, b
{

    private final long A;
    private boolean B;
    private boolean C;
    private final int D;
    private UserProfile E;
    private com.google.android.apps.youtube.app.ui.j F;
    private final Activity a;
    private final bj b;
    private final k c;
    private final com.google.android.apps.youtube.app.ui.i d;
    private final aw e;
    private final am f;
    private final Resources g;
    private final View h;
    private final View i;
    private final ImageView j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final View o;
    private final View p;
    private final TextView q;
    private final ProgressBar r;
    private final ImageView s;
    private final ImageView t;
    private final float u;
    private final FixedAspectRatioFrameLayout v;
    private final ImageView w;
    private boolean x;
    private boolean y;
    private final Animation z;

    public g(Activity activity, View view, bj bj1, aw aw1, am am1)
    {
        this(activity, view, bj1, aw1, am1, p.eG);
    }

    private g(Activity activity, View view, bj bj1, aw aw1, am am1, int i1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        e = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        f = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        c = new k(this, (byte)0);
        d = new com.google.android.apps.youtube.app.ui.i(this, (byte)0);
        g = activity.getResources();
        h = view.findViewById(j.ak);
        i = h.findViewById(j.al);
        j = (ImageView)i.findViewById(j.ah);
        k = (TextView)i.findViewById(j.ap);
        m = (TextView)i.findViewById(j.ar);
        l = (TextView)i.findViewById(j.aq);
        n = (TextView)i.findViewById(j.ao);
        D = i1;
        x = true;
        y = true;
        v = (FixedAspectRatioFrameLayout)h.findViewById(j.aj);
        if (v != null)
        {
            w = (ImageView)com.google.android.apps.youtube.common.fromguava.c.a((ImageView)v.findViewById(j.ai), "banner may not be null if bannerContainer is set");
            view = v;
            if (x)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            view.setVisibility(i1);
        } else
        {
            w = null;
        }
        z = AnimationUtils.loadAnimation(activity, 0x10a0000);
        z.setAnimationListener(this);
        A = g.getInteger(0x10e0000);
        B = false;
        C = false;
        o = i.findViewById(j.fH);
        p = i.findViewById(j.eZ);
        q = (TextView)i.findViewById(j.fc);
        r = (ProgressBar)i.findViewById(j.fb);
        p.setOnClickListener(this);
        t = (ImageView)i.findViewById(j.fa);
        s = (ImageView)i.findViewById(j.fd);
        u = g.getFraction(i.b, 1, 1);
    }

    static ImageView a(g g1)
    {
        return g1.j;
    }

    private void a()
    {
        if (j != null)
        {
            j.setImageBitmap(BitmapFactory.decodeResource(g, h.am));
        }
    }

    static boolean a(g g1, boolean flag)
    {
        g1.C = true;
        return true;
    }

    static void b(g g1)
    {
        g1.a();
    }

    private void b(UserProfile userprofile)
    {
        E = userprofile;
        if (k != null)
        {
            k.setText(userprofile.displayUsername);
        }
        a.getString(D);
        if (m != null)
        {
            m.setText(String.format("%1$,d", new Object[] {
                Long.valueOf(userprofile.uploadViewsCount)
            }));
        }
        if (l != null)
        {
            l.setText(String.format("%1$,d", new Object[] {
                Integer.valueOf(userprofile.uploadedCount)
            }));
        }
        if (n != null)
        {
            n.setText(g.getQuantityString(o.c, userprofile.subscribersCount, new Object[] {
                Integer.valueOf(userprofile.subscribersCount)
            }));
        }
        if (j != null && userprofile.thumbnailUri != null)
        {
            b.a(userprofile.thumbnailUri, com.google.android.apps.youtube.common.a.a.a(a, c));
            return;
        } else
        {
            a();
            return;
        }
    }

    static boolean b(g g1, boolean flag)
    {
        g1.B = false;
        return false;
    }

    static ImageView c(g g1)
    {
        return g1.w;
    }

    static boolean d(g g1)
    {
        return g1.x;
    }

    static boolean e(g g1)
    {
        return g1.B;
    }

    static Animation f(g g1)
    {
        return g1.z;
    }

    static long g(g g1)
    {
        return g1.A;
    }

    public final void a(SubscribeHelper.SubscriptionStatus subscriptionstatus, boolean flag)
    {
        float f1;
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = u;
        }
        switch (com.google.android.apps.youtube.app.ui.h.a[subscriptionstatus.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            p.setClickable(true);
            p.setAlpha(f1);
            p.setBackgroundResource(h.ay);
            q.setText(p.fO);
            q.setVisibility(0);
            q.setTextColor(g.getColor(f.q));
            t.setVisibility(8);
            s.setVisibility(0);
            r.setVisibility(8);
            return;

        case 2: // '\002'
        case 3: // '\003'
            p.setClickable(true);
            p.setAlpha(f1);
            p.setBackgroundResource(h.ax);
            q.setText(p.fN);
            q.setVisibility(0);
            q.setTextColor(g.getColor(f.t));
            t.setVisibility(0);
            s.setVisibility(8);
            r.setVisibility(8);
            return;

        case 4: // '\004'
            p.setClickable(false);
            break;
        }
        p.setAlpha(1.0F);
        t.setVisibility(8);
        s.setVisibility(8);
        r.setVisibility(0);
    }

    public final void a(com.google.android.apps.youtube.app.ui.j j1)
    {
        F = j1;
    }

    public final void a(UserProfile userprofile)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(userprofile);
        b(userprofile);
    }

    public final void a(Branding branding)
    {
        boolean flag = true;
        if (v == null || w == null) goto _L2; else goto _L1
_L1:
        if (branding == null) goto _L4; else goto _L3
_L3:
        DisplayMetrics displaymetrics;
        displaymetrics = new DisplayMetrics();
        a.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        if (!g.getBoolean(e.b)) goto _L6; else goto _L5
_L5:
        displaymetrics.densityDpi;
        JVM INSTR lookupswitch 4: default 104
    //                   120: 167
    //                   240: 175
    //                   320: 183
    //                   480: 183;
           goto _L7 _L8 _L9 _L10 _L10
_L7:
        branding = branding.channelBannerTabletMediumUri;
_L12:
        if (branding == null)
        {
            break; /* Loop/switch isn't completed */
        }
        y = true;
        b.a(branding, com.google.android.apps.youtube.common.a.a.a(a, d));
        if (x)
        {
            if (C)
            {
                flag = false;
            }
            B = flag;
            v.setVisibility(0);
        }
_L2:
        return;
_L8:
        branding = branding.channelBannerTabletLowUri;
        continue; /* Loop/switch isn't completed */
_L9:
        branding = branding.channelBannerTabletHdUri;
        continue; /* Loop/switch isn't completed */
_L10:
        branding = branding.channelBannerTabletExtraHdUri;
        if (true) goto _L12; else goto _L11
_L6:
        switch (displaymetrics.densityDpi)
        {
        default:
            branding = branding.channelBannerMobileMediumUri;
            break;

        case 120: // 'x'
            branding = branding.channelBannerMobileLowUri;
            break;

        case 240: 
            branding = branding.channelBannerMobileMediumHdUri;
            break;

        case 320: 
            branding = branding.channelBannerMobileHdUri;
            break;

        case 480: 
            branding = branding.channelBannerMobileExtraHdUri;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        branding = null;
        continue; /* Loop/switch isn't completed */
_L11:
        y = false;
        v.setVisibility(8);
        return;
        if (true) goto _L12; else goto _L13
_L13:
    }

    public final void a(Object obj, Exception exception)
    {
        L.a("Error retrieving user profile", exception);
        if ((exception instanceof HttpResponseException) && ((HttpResponseException)exception).getStatusCode() == 403)
        {
            e.a(p.af);
            return;
        } else
        {
            e.c(exception);
            a();
            return;
        }
    }

    public final void a(Object obj, Object obj1)
    {
        b((UserProfile)obj1);
    }

    public final void a(boolean flag, float f1)
    {
        x = flag;
        if (v != null)
        {
            FixedAspectRatioFrameLayout fixedaspectratioframelayout = v;
            int i1;
            if (x && y)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            fixedaspectratioframelayout.setVisibility(i1);
            v.setAspectRatio(f1);
        }
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (w != null)
        {
            w.invalidate();
            v.setBackgroundDrawable(null);
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    public final void onClick(View view)
    {
        if (F != null)
        {
            if (view == o)
            {
                f.a(E.uri);
            } else
            if (view == p)
            {
                F.i_();
                return;
            }
        }
    }
}
