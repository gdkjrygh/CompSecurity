// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.navigation;

import com.google.a.a.a.a.aa;
import com.google.a.a.a.a.am;
import com.google.a.a.a.a.bj;
import com.google.a.a.a.a.jx;
import com.google.a.a.a.a.jz;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.qf;
import com.google.android.apps.youtube.app.GuideActivity;
import com.google.android.apps.youtube.app.fragments.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.fragments.navigation.d;
import com.google.android.apps.youtube.app.search.SearchType;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.navigation.UnknownNavigationException;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app.navigation:
//            b

public final class c
    implements b
{

    static final Set a;
    private final GuideActivity b;
    private final PaneDescriptor c;

    public c(GuideActivity guideactivity, PaneDescriptor panedescriptor)
    {
        b = (GuideActivity)com.google.android.apps.youtube.common.fromguava.c.a(guideactivity);
        c = (PaneDescriptor)com.google.android.apps.youtube.common.fromguava.c.a(panedescriptor);
    }

    public static c a(GuideActivity guideactivity, kz kz1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(guideactivity);
        com.google.android.apps.youtube.common.fromguava.c.a(kz1);
        PaneDescriptor panedescriptor = com.google.android.apps.youtube.app.fragments.navigation.d.d(((aa)com.google.android.apps.youtube.common.fromguava.c.a(kz1.r)).b);
        panedescriptor.setNavigationEndpoint(kz1);
        return new c(guideactivity, panedescriptor);
    }

    public static c a(GuideActivity guideactivity, kz kz1, boolean flag)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(guideactivity);
        com.google.android.apps.youtube.common.fromguava.c.a(kz1);
        PaneDescriptor panedescriptor = com.google.android.apps.youtube.app.fragments.navigation.d.a(((jx)com.google.android.apps.youtube.common.fromguava.c.a(kz1.o)).b, flag);
        panedescriptor.setNavigationEndpoint(kz1);
        return new c(guideactivity, panedescriptor);
    }

    public static c b(GuideActivity guideactivity, kz kz1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(guideactivity);
        com.google.android.apps.youtube.common.fromguava.c.a(kz1);
        Object obj = ((bj)com.google.android.apps.youtube.common.fromguava.c.a(kz1.m)).b;
        if (a.contains(obj))
        {
            obj = com.google.android.apps.youtube.app.fragments.navigation.d.b(((String) (obj)));
            ((PaneDescriptor) (obj)).setNavigationEndpoint(kz1);
            return new c(guideactivity, ((PaneDescriptor) (obj)));
        } else
        {
            throw new UnknownNavigationException((new StringBuilder("Unknown category name: ")).append(((String) (obj))).toString());
        }
    }

    public static c b(GuideActivity guideactivity, kz kz1, boolean flag)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(guideactivity);
        com.google.android.apps.youtube.common.fromguava.c.a(kz1);
        PaneDescriptor panedescriptor = com.google.android.apps.youtube.app.fragments.navigation.d.b(((am)com.google.android.apps.youtube.common.fromguava.c.a(kz1.c)).b, flag);
        panedescriptor.setNavigationEndpoint(kz1);
        return new c(guideactivity, panedescriptor);
    }

    public static c c(GuideActivity guideactivity, kz kz1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(guideactivity);
        com.google.android.apps.youtube.common.fromguava.c.a(kz1);
        Object obj = ((jz)com.google.android.apps.youtube.common.fromguava.c.a(kz1.p)).b;
        if (((String) (obj)).equals("uploads"))
        {
            obj = com.google.android.apps.youtube.app.fragments.navigation.d.e();
        } else
        if (((String) (obj)).equals("favorites"))
        {
            obj = com.google.android.apps.youtube.app.fragments.navigation.d.f();
        } else
        if (((String) (obj)).equals("watch_later"))
        {
            obj = com.google.android.apps.youtube.app.fragments.navigation.d.h();
        } else
        if (((String) (obj)).equals("history"))
        {
            obj = com.google.android.apps.youtube.app.fragments.navigation.d.d();
        } else
        if (((String) (obj)).equals("playlists"))
        {
            obj = com.google.android.apps.youtube.app.fragments.navigation.d.g();
        } else
        {
            if (((String) (obj)).equals("purchases"))
            {
                L.e("Purchases V2 User Feed requested but not supported");
                throw new UnknownNavigationException("Purchases V2 User Feed requested but not supported");
            }
            if (((String) (obj)).equals("subscriptions"))
            {
                obj = com.google.android.apps.youtube.app.fragments.navigation.d.b();
            } else
            if (((String) (obj)).equals("live"))
            {
                obj = com.google.android.apps.youtube.app.fragments.navigation.d.c();
            } else
            {
                throw new UnknownNavigationException((new StringBuilder("Unknown V2 User Feed requested: ")).append(((String) (obj))).toString());
            }
        }
        ((PaneDescriptor) (obj)).setNavigationEndpoint(kz1);
        return new c(guideactivity, ((PaneDescriptor) (obj)));
    }

    public static c d(GuideActivity guideactivity, kz kz1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(guideactivity);
        com.google.android.apps.youtube.common.fromguava.c.a(kz1);
        Object obj = ((qf)com.google.android.apps.youtube.common.fromguava.c.a(kz1.g)).b;
        obj = com.google.android.apps.youtube.app.fragments.navigation.d.a(SearchType.DEFAULT_SEARCH_TYPE, ((String) (obj)), null);
        ((PaneDescriptor) (obj)).setNavigationEndpoint(kz1);
        return new c(guideactivity, ((PaneDescriptor) (obj)));
    }

    public final void a()
    {
        b.a(c);
    }

    static 
    {
        HashSet hashset = new HashSet(15);
        a = hashset;
        hashset.add("Autos");
        a.add("Comedy");
        a.add("Education");
        a.add("Entertainment");
        a.add("Film");
        a.add("Games");
        a.add("Music");
        a.add("News");
        a.add("Nonprofit");
        a.add("People");
        a.add("Animals");
        a.add("Tech");
        a.add("Sports");
        a.add("Howto");
        a.add("Travel");
    }
}
