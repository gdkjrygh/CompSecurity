// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.b;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.o;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            u, gv, gw, gx, 
//            gu

public final class gt
    implements u
{

    private final bc a;
    private final bj b;
    private final am c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final com.google.android.apps.youtube.common.a.b g;
    private final com.google.android.apps.youtube.common.a.b h;
    private final com.google.android.apps.youtube.common.a.b i;
    private final Resources j;
    private final com.google.android.apps.youtube.common.c.a k;
    private final View l;
    private d m;
    private UserProfile n;
    private boolean o;

    public gt(Activity activity, bc bc1, bj bj1, am am1, View view)
    {
        a = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        c = am1;
        l = view;
        view.setVisibility(8);
        g = com.google.android.apps.youtube.common.a.a.a(activity, new gv(this, (byte)0));
        h = com.google.android.apps.youtube.common.a.a.a(activity, new gw(this, (byte)0));
        i = com.google.android.apps.youtube.common.a.a.a(activity, new gx(this, (byte)0));
        d = (ImageView)view.findViewById(j.ah);
        e = (TextView)view.findViewById(j.J);
        f = (TextView)view.findViewById(j.fV);
        j = activity.getResources();
        k = ((YouTubeApplication)activity.getApplication()).E();
        view.setOnClickListener(new gu(this, (byte)0));
    }

    static d a(gt gt1, d d1)
    {
        gt1.m = d1;
        return d1;
    }

    static void a(gt gt1)
    {
        gt1.e();
    }

    static void a(gt gt1, UserProfile userprofile)
    {
        gt1.n = userprofile;
        if (gt1.e != null)
        {
            gt1.e.setText(gt1.j.getString(p.hl, new Object[] {
                userprofile.displayUsername
            }));
        }
        if (gt1.d != null && userprofile.thumbnailUri != null)
        {
            gt1.b.a(userprofile.thumbnailUri, gt1.g);
        } else
        {
            gt1.e();
        }
        if (gt1.f != null)
        {
            gt1.f.setText(gt1.j.getQuantityString(o.d, userprofile.uploadedCount, new Object[] {
                Integer.valueOf(userprofile.uploadedCount)
            }));
        }
        gt1.f();
    }

    static com.google.android.apps.youtube.common.a.b b(gt gt1)
    {
        return gt1.h;
    }

    static bc c(gt gt1)
    {
        return gt1.a;
    }

    static ImageView d(gt gt1)
    {
        return gt1.d;
    }

    private void e()
    {
        if (d != null)
        {
            d.setImageBitmap(BitmapFactory.decodeResource(j, h.am));
        }
    }

    static void e(gt gt1)
    {
        if (gt1.n != null)
        {
            gt1.k.c(new b());
            gt1.c.a(gt1.n.uri);
        }
    }

    private void f()
    {
        if (o && n != null)
        {
            l.setVisibility(0);
        }
    }

    public final View a()
    {
        return l;
    }

    public final boolean a(VastAd vastad)
    {
        if (TextUtils.isEmpty(vastad.getAdVideoId()))
        {
            return false;
        } else
        {
            d d1 = com.google.android.apps.youtube.common.a.d.a(i);
            a.a(vastad.getAdVideoId(), d1);
            return true;
        }
    }

    public final void b()
    {
        o = true;
        f();
    }

    public final void c()
    {
        if (m != null)
        {
            m.a();
            m = null;
        }
        o = false;
        n = null;
        d.setImageDrawable(null);
        l.setVisibility(8);
    }

    public final void d()
    {
        f();
    }
}
