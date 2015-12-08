// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataResponseException;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.ui.PagedView;
import com.google.android.apps.youtube.core.ui.l;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            dp, dq, et, dr

public final class do extends l
    implements android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemLongClickListener
{

    private final a a;
    private final et b;
    private final dq g;
    private dr h;

    public do(Activity activity, PagedView pagedview, a a1, af af, aw aw, am am)
    {
        this(activity, pagedview, a1, af, aw, ((dq) (new dp(am))));
    }

    public do(Activity activity, PagedView pagedview, a a1, af af, aw aw, dq dq1)
    {
        super(activity, pagedview, a1, af, aw);
        g = (dq)c.a(dq1, "onPlaylistClickListener can't be null");
        if (a1 instanceof et)
        {
            ((et)a1).a(this);
            b = (et)a1;
            a = b.b();
            return;
        } else
        {
            b = null;
            a = a1;
            pagedview.setOnItemClickListener(this);
            return;
        }
    }

    public final void a(GDataRequest gdatarequest, Exception exception)
    {
        if ((exception instanceof GDataResponseException) && ((GDataResponseException)exception).containsYouTubeSignupRequiredError())
        {
            a(gdatarequest, (new com.google.android.apps.youtube.datalib.legacy.model.Page.Builder()).build());
            return;
        } else
        {
            super.a(gdatarequest, exception);
            return;
        }
    }

    public final volatile void a(Object obj, Exception exception)
    {
        a((GDataRequest)obj, exception);
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
        if (adapterview != null)
        {
            adapterview = adapterview.getAdapter();
        } else
        {
            adapterview = a;
        }
        if (i < adapterview.getCount())
        {
            adapterview = (Playlist)adapterview.getItem(i);
            if (adapterview != null)
            {
                g.a(adapterview);
            }
        }
    }

    public final boolean onItemLongClick(AdapterView adapterview, View view, int i, long l1)
    {
        if (adapterview != null)
        {
            adapterview = adapterview.getAdapter();
        } else
        {
            adapterview = a;
        }
        if ((Playlist)adapterview.getItem(i) != null)
        {
            return h.a();
        } else
        {
            return false;
        }
    }
}
