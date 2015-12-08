// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.ui.PagedView;
import com.google.android.apps.youtube.core.ui.l;
import com.google.android.apps.youtube.datalib.legacy.model.LiveEvent;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            et

public final class br extends l
    implements android.widget.AdapterView.OnItemClickListener
{

    private final a a;
    private final d b;
    private final am g;

    public br(Activity activity, PagedView pagedview, et et1, bc bc1, aw aw, am am1, d d1)
    {
        super(activity, pagedview, et1, bc1.u(), aw);
        g = am1;
        b = d1;
        et1.a(this);
        a = et1.b();
    }

    public final volatile boolean a(Object obj)
    {
        obj = (LiveEvent)obj;
        return b.a(obj);
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
            adapterview = (LiveEvent)adapterview.getItem(i);
            if (adapterview != null)
            {
                g.a(((LiveEvent) (adapterview)).video.id, false, WatchFeature.LIVE);
            }
        }
    }
}
