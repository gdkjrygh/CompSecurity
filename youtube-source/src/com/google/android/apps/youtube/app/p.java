// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.os.AsyncTask;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.i;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app:
//            DebugOfflineAdActivity, h

final class p extends AsyncTask
{

    final DebugOfflineAdActivity a;

    private p(DebugOfflineAdActivity debugofflineadactivity)
    {
        a = debugofflineadactivity;
        super();
    }

    p(DebugOfflineAdActivity debugofflineadactivity, byte byte0)
    {
        this(debugofflineadactivity);
    }

    private transient Void a(Long along[])
    {
        i j = DebugOfflineAdActivity.b(a).d();
        long l = along[0].longValue();
        for (along = DebugOfflineAdActivity.b(a).e().iterator(); along.hasNext();)
        {
            x x1 = (x)along.next();
            Object obj = j.r(x1.a());
            if (obj != null)
            {
                obj = ((List) (obj)).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    VmapAdBreak vmapadbreak = (VmapAdBreak)((Iterator) (obj)).next();
                    VastAd vastad = j.b(x1.a(), vmapadbreak.getAdBreakId());
                    if (vastad != null)
                    {
                        try
                        {
                            j.b(x1.a(), vmapadbreak.getAdBreakId(), vastad.buildUpon().b(l).d());
                        }
                        catch (IOException ioexception) { }
                    }
                }
            }
        }

        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((Long[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        ah.b(a, "All offline ad expiration times have been changed!", 1);
        (new h(a, (byte)0)).execute(new Void[] {
            null
        });
    }
}
