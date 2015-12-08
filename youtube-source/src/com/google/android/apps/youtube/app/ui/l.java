// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.br;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.a.e;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            m

public final class l extends com.google.android.apps.youtube.core.a.l
    implements android.view.View.OnClickListener
{

    private final ChannelStoreOutline.Category b;
    private final Activity c;
    private final am d;

    private l(br br1, ChannelStoreOutline.Category category, Activity activity, am am1)
    {
        super(new e[] {
            br1
        });
        b = (ChannelStoreOutline.Category)com.google.android.apps.youtube.common.fromguava.c.a(category);
        d = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        c = activity;
        com.google.android.apps.youtube.common.fromguava.c.a(br1);
        am1 = (ViewGroup)br1.a();
        ((TextView)br1.a().findViewById(j.ae)).setText(category.toString(activity.getResources()));
        br1 = am1.findViewById(j.ad);
        if (br1 != null)
        {
            br1.setOnClickListener(this);
        }
    }

    public static l a(Activity activity, ChannelStoreOutline.Category category, am am1)
    {
        return new l(new br(activity.getLayoutInflater().inflate(com.google.android.youtube.l.r, null, false)), category, activity, am1);
    }

    public final boolean b(int i)
    {
        return false;
    }

    public final void onClick(View view)
    {
        GDataRequestFactory gdatarequestfactory;
        view = (YouTubeApplication)c.getApplication();
        gdatarequestfactory = view.f().a();
        m.a[b.ordinal()];
        JVM INSTR tableswitch 1 5: default 68
    //                   1 85
    //                   2 96
    //                   3 107
    //                   4 119
    //                   5 130;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        view = null;
_L8:
        d.a(view, b);
        return;
_L2:
        view = gdatarequestfactory.a(com.google.android.apps.youtube.core.async.GDataRequestFactory.ChannelFeed.MOST_SUBSCRIBED);
        continue; /* Loop/switch isn't completed */
_L3:
        view = gdatarequestfactory.a(com.google.android.apps.youtube.core.async.GDataRequestFactory.ChannelFeed.MOST_VIEWED);
        continue; /* Loop/switch isn't completed */
_L4:
        view = gdatarequestfactory.i(view.s());
        continue; /* Loop/switch isn't completed */
_L5:
        view = gdatarequestfactory.a(com.google.android.apps.youtube.core.async.GDataRequestFactory.ChannelFeed.NOTEWORTHY);
        continue; /* Loop/switch isn't completed */
_L6:
        view = gdatarequestfactory.a();
        if (true) goto _L8; else goto _L7
_L7:
    }
}
