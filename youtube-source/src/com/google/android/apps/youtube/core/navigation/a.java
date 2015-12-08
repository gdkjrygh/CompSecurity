// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.navigation;

import android.content.Context;
import android.net.Uri;
import com.google.a.a.a.a.jx;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.tu;
import com.google.a.a.a.a.wb;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.core.utils.m;

// Referenced classes of package com.google.android.apps.youtube.core.navigation:
//            UnknownNavigationException

public final class a
    implements com.google.android.apps.youtube.datalib.d.a
{

    private final Context a;

    public a(Context context)
    {
        a = context;
    }

    public final void a(kz kz1)
    {
        try
        {
            if (kz1.n != null)
            {
                throw new UnknownNavigationException("Settings not supported");
            }
        }
        // Misplaced declaration of an exception variable
        catch (kz kz1)
        {
            ah.b(a, kz1.getMessage(), 1);
            return;
        }
        if (kz1.r != null)
        {
            throw new UnknownNavigationException("Artist not supported");
        }
        if (kz1.c != null)
        {
            throw new UnknownNavigationException("Browse not supported");
        }
        if (kz1.q != null)
        {
            throw new UnknownNavigationException("Capture not supported");
        }
        if (kz1.m != null)
        {
            throw new UnknownNavigationException("Category not supported");
        }
        if (kz1.d != null)
        {
            throw new UnknownNavigationException("Create Channel not supported");
        }
        if (kz1.e != null)
        {
            throw new UnknownNavigationException("Channel Store not supported");
        }
        if (kz1.f != null)
        {
            throw new UnknownNavigationException("Inbox not supported");
        }
        if (kz1.o != null)
        {
            kz1 = kz1.o.b;
            m.a(a, Uri.parse((new StringBuilder("http://www.youtube.com/user/")).append(kz1).toString()));
            return;
        }
        if (kz1.t != null)
        {
            throw new UnknownNavigationException("Playlist not supported");
        }
        if (kz1.p != null)
        {
            throw new UnknownNavigationException("Feed not supported");
        }
        if (kz1.s != null)
        {
            throw new UnknownNavigationException("Offline not supported");
        }
        if (kz1.w != null)
        {
            throw new UnknownNavigationException("Offline Watch not supported");
        }
        if (kz1.j != null)
        {
            throw new UnknownNavigationException("Purchases not supported");
        }
        if (kz1.g != null)
        {
            throw new UnknownNavigationException("Search not supported");
        }
        if (kz1.l != null)
        {
            throw new UnknownNavigationException("Sign in not supported");
        }
        if (kz1.h != null)
        {
            throw new UnknownNavigationException("Subscription Manager not supported");
        }
        if (kz1.k != null)
        {
            m.b(a, Uri.parse(kz1.k.b));
            return;
        }
        if (kz1.i != null)
        {
            kz1 = kz1.i.b;
            m.a(a, kz1, WatchFeature.NO_FEATURE);
            return;
        }
        if (kz1.u != null)
        {
            throw new UnknownNavigationException("Watch Playlist not supported");
        } else
        {
            throw new UnknownNavigationException("Unknown Navigation");
        }
    }
}
