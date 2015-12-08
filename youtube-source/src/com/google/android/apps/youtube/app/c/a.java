// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.c;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.a.a.a.a.lq;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.honeycomb.phone.ao;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.identity.as;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.datalib.innertube.bc;
import com.google.android.apps.youtube.datalib.innertube.be;
import com.google.android.apps.youtube.datalib.innertube.bf;
import com.google.android.apps.youtube.datalib.innertube.model.ba;
import com.google.android.gms.wallet.ia.PurchaseIntentBuilder;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.c:
//            d, b, c

public final class a
    implements ao
{

    private final bc a;
    private final l b;
    private final as c;
    private final YouTubeActivity d;
    private String e;
    private String f;
    private d g;

    public a(YouTubeActivity youtubeactivity, bc bc1, l l1, as as1)
    {
        d = (YouTubeActivity)com.google.android.apps.youtube.common.fromguava.c.a(youtubeactivity);
        a = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        b = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        c = (as)com.google.android.apps.youtube.common.fromguava.c.a(as1);
    }

    static void a(a a1, ba ba)
    {
        if (a1.g != null)
        {
            a1.g.a(ba, a1.e);
        }
    }

    static void a(a a1, String s, String s1)
    {
        a1.a(s, s1);
    }

    static void a(a a1, Throwable throwable)
    {
        a1.a(throwable);
    }

    private void a(String s, String s1)
    {
        f = s1;
        s1 = c.a(b);
        s = ((PurchaseIntentBuilder)((PurchaseIntentBuilder)((PurchaseIntentBuilder)(new PurchaseIntentBuilder(d)).setBuyerAccount(s1)).setEnvironment(1)).setJwt(s).setTheme(1)).build();
        s.setPackage("com.google.android.gms");
        d.a(s, 906, this);
    }

    private void a(Throwable throwable)
    {
        if (g != null)
        {
            g.a(throwable);
        }
    }

    public final void a(lq lq1, String s)
    {
        e = s;
        f = null;
        s = lq1.c;
        lq1 = lq1.d;
        if (TextUtils.isEmpty(s))
        {
            lq1 = a.a().a(lq1);
            lq1.a(bf.a);
            a.a(lq1, new b(this));
            return;
        } else
        {
            a(s, ((String) (lq1)));
            return;
        }
    }

    public final void a(d d1)
    {
        g = d1;
    }

    public final boolean a(int i, int j, Intent intent)
    {
        if (i != 906)
        {
            return false;
        }
        j;
        JVM INSTR tableswitch -1 1: default 36
    //                   -1 43
    //                   0 131
    //                   1 104;
           goto _L1 _L2 _L3 _L4
_L1:
        a(((Throwable) (null)));
_L6:
        return true;
_L2:
        intent = intent.getBundleExtra("com.google.android.libraries.inapp.EXTRA_RESPONSE").getString("orderId");
        String s = f;
        intent = a.b().b(intent).a(s);
        intent.a(be.a);
        a.a(intent, new com.google.android.apps.youtube.app.c.c(this));
        continue; /* Loop/switch isn't completed */
_L4:
        a(((Throwable) (new Error(d.getResources().getString(p.hg)))));
        continue; /* Loop/switch isn't completed */
_L3:
        if (g != null)
        {
            g.a();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
