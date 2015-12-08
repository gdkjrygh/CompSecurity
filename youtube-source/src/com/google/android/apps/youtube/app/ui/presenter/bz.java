// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.widget.BaseAdapter;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.h;
import com.google.android.apps.youtube.uilib.a.j;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            bx

public final class bz
    implements j
{

    private final Context a;
    private final bj b;
    private final a c;
    private final v d;

    public bz(Context context, bj bj1, a a1, AtomicReference atomicreference, YouTubeActivity youtubeactivity, h h, RemoteControlContextualMenuController remotecontrolcontextualmenucontroller)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        c = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        com.google.android.apps.youtube.common.fromguava.c.a(remotecontrolcontextualmenucontroller);
        d = ad.d(youtubeactivity, (AtomicReference)com.google.android.apps.youtube.common.fromguava.c.a(atomicreference));
        remotecontrolcontextualmenucontroller.a(d, (BaseAdapter)com.google.android.apps.youtube.common.fromguava.c.a(h));
    }

    public final g a()
    {
        return new bx(a, b, c, d);
    }
}
