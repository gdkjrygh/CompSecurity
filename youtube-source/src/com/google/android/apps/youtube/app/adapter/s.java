// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.app.Dialog;
import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.ui.SubscribeHelper;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.p;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ae, ChannelStoreItemRendererFactory, r, t

final class s
    implements android.view.View.OnClickListener, ae
{

    final ChannelStoreItemRendererFactory a;
    private final View b;
    private final TextView c;
    private final View d;
    private final ImageButton e;
    private final ProgressBar f;
    private UserProfile g;

    private s(ChannelStoreItemRendererFactory channelstoreitemrendererfactory, View view)
    {
        a = channelstoreitemrendererfactory;
        super();
        b = view;
        d = view.findViewById(j.am);
        c = (TextView)view.findViewById(j.an);
        f = (ProgressBar)view.findViewById(j.dS);
        e = (ImageButton)view.findViewById(j.eZ);
        e.setOnClickListener(this);
        d.setOnClickListener(com.google.android.apps.youtube.app.adapter.ChannelStoreItemRendererFactory.a(channelstoreitemrendererfactory));
    }

    s(ChannelStoreItemRendererFactory channelstoreitemrendererfactory, View view, byte byte0)
    {
        this(channelstoreitemrendererfactory, view);
    }

    private View a()
    {
        boolean flag1 = true;
        boolean flag = false;
        c.setText(g.displayUsername);
        d.setTag(g);
        e.setTag(g);
        e.setContentDescription(ChannelStoreItemRendererFactory.d(a).getString(p.d, new Object[] {
            g.displayUsername
        }));
        Object obj = (ChannelStoreItemRendererFactory.State)ChannelStoreItemRendererFactory.c(a).get(g.uri);
        ChannelStoreItemRendererFactory.State state = ((ChannelStoreItemRendererFactory.State) (obj));
        if (obj == null)
        {
            state = ChannelStoreItemRendererFactory.State.WORKING;
        }
        obj = e;
        int i;
        if (state == ChannelStoreItemRendererFactory.State.WORKING)
        {
            flag1 = false;
        }
        ((ImageButton) (obj)).setEnabled(flag1);
        obj = e;
        if (state == ChannelStoreItemRendererFactory.State.WORKING)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        ((ImageButton) (obj)).setVisibility(i);
        obj = e;
        if (state == ChannelStoreItemRendererFactory.State.UNSUBSCRIBED)
        {
            i = h.v;
        } else
        {
            i = h.w;
        }
        ((ImageButton) (obj)).setImageResource(i);
        obj = f;
        if (state == ChannelStoreItemRendererFactory.State.WORKING)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((ProgressBar) (obj)).setVisibility(i);
        return b;
    }

    static View a(s s1)
    {
        return s1.a();
    }

    static void a(s s1, boolean flag)
    {
        s1.a(false);
    }

    private void a(boolean flag)
    {
        com.google.android.apps.youtube.app.adapter.ChannelStoreItemRendererFactory.a(a, this, g);
        if (!ChannelStoreItemRendererFactory.e(a).b())
        {
            L.c("Ignoring click due to not authenticated");
            return;
        } else
        {
            ChannelStoreItemRendererFactory.g(a).a(g.uri, com.google.android.apps.youtube.common.a.a.a(ChannelStoreItemRendererFactory.f(a), new r(a, g, this, flag)));
            return;
        }
    }

    static UserProfile b(s s1)
    {
        return s1.g;
    }

    public final View a(int i, Object obj)
    {
        obj = (UserProfile)obj;
        g = ((UserProfile) (obj));
        if (ChannelStoreItemRendererFactory.b(a) && ChannelStoreItemRendererFactory.c(a).get(((UserProfile) (obj)).uri) == null)
        {
            com.google.android.apps.youtube.app.adapter.ChannelStoreItemRendererFactory.a(a, ((UserProfile) (obj)), this);
        }
        return a();
    }

    public final void onClick(View view)
    {
        int i = com.google.android.apps.youtube.app.adapter.ChannelStoreItemRendererFactory.h(a).v();
        if ((ChannelStoreItemRendererFactory.State)ChannelStoreItemRendererFactory.c(a).get(g.uri) == ChannelStoreItemRendererFactory.State.SUBSCRIBED)
        {
            SubscribeHelper.a(ChannelStoreItemRendererFactory.i(a), "ChannelStore", i, true);
            view = new t(this);
            (new aa(ChannelStoreItemRendererFactory.d(a))).setMessage(Html.fromHtml(ChannelStoreItemRendererFactory.d(a).getString(p.gn, new Object[] {
                g.displayUsername
            }))).setPositiveButton(0x1040013, view).setNegativeButton(0x1040009, view).create().show();
            return;
        } else
        {
            SubscribeHelper.a(ChannelStoreItemRendererFactory.i(a), "ChannelStore", i, false);
            a(true);
            return;
        }
    }
}
