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
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataResponseException;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.ui.PagedView;
import com.google.android.apps.youtube.core.ui.l;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            if, ck, ig, et, 
//            ih, ii

public class ie extends l
    implements android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemLongClickListener
{

    private final boolean a;
    private final ck b;
    private final a g;
    private final et h;
    private final ig i;
    private ih j;
    private final ii k;

    public ie(Activity activity, PagedView pagedview, a a1, af af, aw aw, boolean flag, am am1, 
            boolean flag1, WatchFeature watchfeature, Analytics analytics, com.google.android.apps.youtube.core.Analytics.VideoCategory videocategory)
    {
        this(activity, pagedview, a1, af, aw, flag, am1, flag1, watchfeature, analytics, videocategory, null);
    }

    private ie(Activity activity, PagedView pagedview, a a1, af af, aw aw, boolean flag, am am1, 
            boolean flag1, WatchFeature watchfeature, Analytics analytics, com.google.android.apps.youtube.core.Analytics.VideoCategory videocategory, ii ii)
    {
        this(activity, pagedview, a1, af, aw, flag, ((ig) (new if((am)c.a(am1), flag1, (WatchFeature)c.a(watchfeature), (Analytics)c.a(analytics), (com.google.android.apps.youtube.core.Analytics.VideoCategory)c.a(videocategory)))), null);
    }

    public ie(Activity activity, PagedView pagedview, a a1, af af, aw aw, boolean flag, ig ig1)
    {
        this(activity, pagedview, a1, af, aw, true, ig1, null);
    }

    private ie(Activity activity, PagedView pagedview, a a1, af af, aw aw, boolean flag, ig ig1, 
            ii ii)
    {
        super(activity, pagedview, a1, af, aw);
        a = flag;
        b = new ck();
        i = (ig)c.a(ig1);
        k = ii;
        if (a1 instanceof et)
        {
            ((et)a1).a(this);
            h = (et)a1;
            g = h.b();
            return;
        } else
        {
            h = null;
            g = a1;
            pagedview.setOnItemClickListener(this);
            return;
        }
    }

    public final void a(GDataRequest gdatarequest, Page page)
    {
        super.a(gdatarequest, page);
        int i1;
        if (page.entries.size() < page.elementsPerPage && page.startIndex == 1)
        {
            page.entries.size();
        } else
        {
            i1 = page.totalResults;
        }
        if (k != null)
        {
            gdatarequest = k;
        }
    }

    public final void a(GDataRequest gdatarequest, Exception exception)
    {
        if ((exception instanceof GDataResponseException) && ((GDataResponseException)exception).containsYouTubeSignupRequiredError())
        {
            a(gdatarequest, (new com.google.android.apps.youtube.datalib.legacy.model.Page.Builder()).build());
            return;
        }
        ii ii;
        if (k != null)
        {
            ii = k;
        }
        super.a(gdatarequest, exception);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        a((GDataRequest)obj, exception);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        a((GDataRequest)obj, (Page)obj1);
    }

    public final volatile boolean a(Object obj)
    {
label0:
        {
            obj = (Video)obj;
            if (!a)
            {
                ck ck1 = b;
                if (!com.google.android.apps.youtube.app.ui.ck.a(((Video) (obj))))
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    protected final void n_()
    {
        ii ii;
        if (k != null)
        {
            ii = k;
        }
    }

    public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (adapterview != null)
        {
            adapterview = adapterview.getAdapter();
        } else
        {
            adapterview = g;
        }
        if (i1 < adapterview.getCount())
        {
            adapterview = (Video)adapterview.getItem(i1);
            if (adapterview != null)
            {
                i.a(adapterview, i1);
            }
        }
    }

    public final boolean onItemLongClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (adapterview != null)
        {
            adapterview = adapterview.getAdapter();
        } else
        {
            adapterview = g;
        }
        if ((Video)adapterview.getItem(i1) != null)
        {
            return j.a();
        } else
        {
            return false;
        }
    }
}
