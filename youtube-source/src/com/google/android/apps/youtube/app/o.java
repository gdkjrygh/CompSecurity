// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.os.AsyncTask;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.e;
import com.google.android.apps.youtube.core.offline.store.h;
import com.google.android.apps.youtube.core.offline.store.i;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app:
//            DebugOfflineAdActivity, h

final class o extends AsyncTask
{

    final DebugOfflineAdActivity a;

    private o(DebugOfflineAdActivity debugofflineadactivity)
    {
        a = debugofflineadactivity;
        super();
    }

    o(DebugOfflineAdActivity debugofflineadactivity, byte byte0)
    {
        this(debugofflineadactivity);
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = DebugOfflineAdActivity.b(a).d();
        Object obj = DebugOfflineAdActivity.b(a).e().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            x x1 = (x)((Iterator) (obj)).next();
            Object obj1 = ((i) (aobj)).r(x1.a());
            if (obj1 != null)
            {
                obj1 = ((List) (obj1)).iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    VmapAdBreak vmapadbreak = (VmapAdBreak)((Iterator) (obj1)).next();
                    ((i) (aobj)).e(x1.a(), vmapadbreak.getAdBreakId());
                }
            }
        } while (true);
        obj = new HashSet();
        Iterator iterator = ((i) (aobj)).e().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            h h1 = (h)iterator.next();
            if (h1.b != null && !((Set) (obj)).contains(h1.b.a))
            {
                ((i) (aobj)).t(h1.b.a);
                ((Set) (obj)).add(h1.b.a);
            }
        } while (true);
        return null;
    }

    protected final void onPostExecute(Object obj)
    {
        ah.b(a, "All offline ad playback counts have been reset to 0!", 1);
        (new com.google.android.apps.youtube.app.h(a, (byte)0)).execute(new Void[] {
            null
        });
    }
}
