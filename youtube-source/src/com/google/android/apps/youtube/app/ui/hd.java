// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.youtube.app.adapter.ba;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.async.g;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.core.transfer.UploadService;
import com.google.android.apps.youtube.core.transfer.h;
import com.google.android.apps.youtube.core.transfer.k;
import com.google.android.apps.youtube.core.ui.PagedView;
import com.google.android.apps.youtube.core.ui.l;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.core.utils.w;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import com.google.android.apps.youtube.datalib.model.transfer.a;
import com.google.android.youtube.p;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            he, et, ck, ha, 
//            hg, hf

public final class hd extends l
    implements android.widget.AdapterView.OnItemClickListener, h
{

    private final ck a = new ck();
    private final ba b;
    private final et g;
    private final ak h;
    private final bc i;
    private final Analytics j;
    private w k;
    private final am l;

    public hd(Activity activity, ak ak1, PagedView pagedview, ba ba1, et et1, af af, bc bc1, 
            Analytics analytics, aw aw, am am1)
    {
        super(activity, pagedview, et1, com.google.android.apps.youtube.core.async.g.a(af, new he()), aw);
        i = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        h = (ak)com.google.android.apps.youtube.common.fromguava.c.a(ak1);
        l = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        g = (et)com.google.android.apps.youtube.common.fromguava.c.a(et1);
        g.a(this);
        b = ba1;
        j = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
    }

    private ha a(ha ha1)
    {
        for (int i1 = 0; i1 < b.getCount(); i1++)
        {
            ha ha2 = (ha)b.getItem(i1);
            if (ha2.equals(ha1))
            {
                return ha2;
            }
        }

        return null;
    }

    static Video a(hd hd1, Video video, Transfer transfer)
    {
        int i1 = (int)transfer.g.b("upload_file_duration", video.duration);
        hd1 = new Date(System.currentTimeMillis() - 5000L);
        return video.buildUpon().duration(i1).uploadedDate(hd1).build();
    }

    static void a(hd hd1, Transfer transfer, Video video)
    {
        transfer = hd1.a(com.google.android.apps.youtube.app.ui.ha.a(transfer));
        if (transfer != null)
        {
            hd1.b.a(transfer, com.google.android.apps.youtube.app.ui.ha.a(video));
        }
    }

    private void g(Transfer transfer)
    {
        if (transfer.c != com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.COMPLETED)
        {
            String s = transfer.g.b("authAccount");
            if (h.b().equals(s))
            {
                h(transfer);
            }
        }
    }

    private void h(Transfer transfer)
    {
        ha ha1 = com.google.android.apps.youtube.app.ui.ha.a(transfer);
        ha ha2 = a(ha1);
        if (ha2 != null)
        {
            b.a(ha2, ha1);
        } else
        {
            b.c(0, ha1);
        }
        b.a(new hg(transfer));
    }

    protected final void a()
    {
        super.a();
        if (k == null)
        {
            k = UploadService.a(c.getApplicationContext(), this);
        }
    }

    protected final void a(GDataRequest gdatarequest, List list)
    {
        super.a(gdatarequest, list);
        if (k == null)
        {
            k = UploadService.a(c.getApplicationContext(), this);
        }
    }

    public final void a(Transfer transfer)
    {
    }

    public final volatile boolean a(Object obj)
    {
        obj = (ha)obj;
        if (((ha) (obj)).a())
        {
            ck ck1 = a;
            return com.google.android.apps.youtube.app.ui.ck.a(((ha) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final void b()
    {
    }

    public final void b(Transfer transfer)
    {
        g(transfer);
    }

    public final void c()
    {
        super.c();
        if (k != null)
        {
            k.b(c.getApplicationContext());
            k = null;
        }
    }

    public final void c(Transfer transfer)
    {
        if (transfer.a() && !b.a(transfer))
        {
            h(transfer);
        }
    }

    public final void d(Transfer transfer)
    {
label0:
        {
            if (transfer.c == com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.COMPLETED)
            {
                String s = transfer.h.b("video_id");
                if (s == null)
                {
                    break label0;
                }
                transfer = com.google.android.apps.youtube.common.a.a.a(c, new hf(this, transfer, (byte)0));
                i.f(s, transfer);
            }
            return;
        }
        g(transfer);
    }

    public final void e(Transfer transfer)
    {
        b.b(com.google.android.apps.youtube.app.ui.ha.a(transfer));
        if (transfer.c != com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.COMPLETED && (transfer.d & 0x40) == 0)
        {
            ah.a(c, p.M, 1);
        }
    }

    public final void f(Transfer transfer)
    {
        if (k != null)
        {
            ((k)k.a()).a(transfer.a);
        }
    }

    public final void m_()
    {
        if (k != null)
        {
            for (Iterator iterator = ((k)k.a()).a().values().iterator(); iterator.hasNext(); g((Transfer)iterator.next())) { }
        }
    }

    public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (i1 < b.getCount())
        {
            adapterview = (ha)b.getItem(i1);
            if (adapterview != null && adapterview.a())
            {
                j.a(com.google.android.apps.youtube.core.Analytics.VideoCategory.Uploads, i1);
                l.a(((ha) (adapterview)).a.id, true, WatchFeature.MY_UPLOADS);
            }
        }
    }
}
