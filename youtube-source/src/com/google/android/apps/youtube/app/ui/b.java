// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.player.PlaybackClientManager;
import com.google.android.apps.youtube.datalib.legacy.model.InfoCard;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.youtube.j;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            u, e, d, c

public final class b
    implements u
{

    private final Activity a;
    private final bj b;
    private final View c;
    private final PlaybackClientManager d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final a i;
    private final a j;
    private final RatingBar k;
    private final ImageView l;
    private d m;
    private InfoCard n;
    private com.google.android.apps.youtube.datalib.legacy.model.InfoCard.InfoCardAction o;
    private boolean p;

    public b(Activity activity, bj bj1, View view, PlaybackClientManager playbackclientmanager)
    {
        a = activity;
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        c = view;
        d = playbackclientmanager;
        i = com.google.android.apps.youtube.common.a.a.a(activity, new e(this, (byte)0));
        j = com.google.android.apps.youtube.common.a.a.a(activity, new com.google.android.apps.youtube.app.ui.d(this, (byte)0));
        e = (ImageView)view.findViewById(j.u);
        f = (TextView)view.findViewById(j.r);
        k = (RatingBar)view.findViewById(j.dW);
        l = (ImageView)view.findViewById(j.dX);
        h = (TextView)view.findViewById(j.s);
        g = (TextView)view.findViewById(j.b);
        view.setVisibility(8);
        g.setOnClickListener(new com.google.android.apps.youtube.app.ui.c(this, (byte)0));
    }

    private void a(Bitmap bitmap)
    {
        e.setImageBitmap(bitmap);
        boolean flag;
        if (n != null && n.getInfoCardApp().getRatingImageUri() != null && !n.getInfoCardApp().hasRating())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            m = com.google.android.apps.youtube.common.a.d.a(j);
            b.a(n.getInfoCardApp().getRatingImageUri(), m);
        }
    }

    static void a(b b1)
    {
        if (b1.n == null || b1.o == null)
        {
            return;
        } else
        {
            b1.d.a(b1.n, b1.o);
            b1.a.startActivity(new Intent("android.intent.action.VIEW", b1.o.getLinkUrl()));
            return;
        }
    }

    static void a(b b1, Bitmap bitmap)
    {
        b1.a(bitmap);
    }

    static void b(b b1, Bitmap bitmap)
    {
        b1.l.setImageBitmap(bitmap);
        b1 = b1.l;
        int i1;
        if (bitmap != null)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        b1.setVisibility(i1);
    }

    private void e()
    {
        if (p && n != null)
        {
            if (c.getVisibility() != 0)
            {
                d.a(n, 1);
            }
            c.setVisibility(0);
        }
    }

    public final View a()
    {
        return c;
    }

    public final boolean a(VastAd vastad)
    {
        if (vastad.getInfoCards() == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = vastad.getInfoCards().iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        vastad = (InfoCard)iterator.next();
        if (vastad.getType() != 2 || vastad.getInfoCardApp() == null) goto _L5; else goto _L4
_L4:
        if (vastad == null)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        vastad = null;
        if (true) goto _L4; else goto _L6
_L6:
        Object obj = vastad.getActions().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            com.google.android.apps.youtube.datalib.legacy.model.InfoCard.InfoCardAction infocardaction = (com.google.android.apps.youtube.datalib.legacy.model.InfoCard.InfoCardAction)((Iterator) (obj)).next();
            if (infocardaction.getType() != 4)
            {
                continue;
            }
            o = infocardaction;
            g.setText(infocardaction.getTitle());
            break;
        } while (true);
        n = vastad;
        f.setText(vastad.getInfoCardApp().getAppName());
        TextView textview = h;
        if (TextUtils.isEmpty(vastad.getInfoCardApp().getPrice()))
        {
            obj = "";
        } else
        {
            obj = vastad.getInfoCardApp().getPrice();
        }
        textview.setText(((CharSequence) (obj)));
        if (vastad.getInfoCardApp().hasRating())
        {
            l.setVisibility(8);
            k.setVisibility(0);
            k.setRating(n.getInfoCardApp().getRating());
        }
        if (vastad.getInfoCardApp().getIcon() != null)
        {
            m = com.google.android.apps.youtube.common.a.d.a(i);
            b.a(vastad.getInfoCardApp().getIcon(), m);
        } else
        {
            a(((Bitmap) (null)));
        }
        return true;
    }

    public final void b()
    {
        p = true;
        e();
    }

    public final void c()
    {
        p = false;
        n = null;
        o = null;
        if (m != null)
        {
            m.a();
            m = null;
        }
        e.setImageDrawable(null);
        k.setVisibility(8);
        l.setVisibility(4);
        l.setImageDrawable(null);
        c.setVisibility(8);
    }

    public final void d()
    {
        e();
    }
}
