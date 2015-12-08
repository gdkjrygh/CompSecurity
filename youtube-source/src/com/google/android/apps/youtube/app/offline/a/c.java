// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import com.google.a.a.a.a.mk;
import com.google.a.a.a.a.ml;
import com.google.android.apps.youtube.app.a.a;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.core.offline.store.e;
import com.google.android.apps.youtube.core.offline.store.g;
import com.google.android.apps.youtube.core.offline.store.h;
import com.google.android.apps.youtube.core.offline.store.i;
import com.google.android.apps.youtube.datalib.legacy.model.OfflineMediaStatus;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            d

public final class c
{

    private final a a;
    private final i b;
    private final b c;

    public c(a a1, i j, b b1)
    {
        b = (i)com.google.android.apps.youtube.common.fromguava.c.a(j);
        a = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
    }

    private VastAd a(VmapAdBreak vmapadbreak)
    {
        Object obj;
        try
        {
            obj = a.a(vmapadbreak);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            L.a((new StringBuilder("Error loading vast ad [originalVideoId=")).append(vmapadbreak.getOriginalVideoId()).append("]").toString(), ((Throwable) (obj)));
            return null;
        }
        if (obj == null)
        {
            return null;
        }
        if (((VastAd) (obj)).isEmpty() || ((VastAd) (obj)).isForecastingAd() || ((VastAd) (obj)).getAdVideoId() != null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        L.b((new StringBuilder("Error loading non-YouTube-hosted ad video [request=")).append(vmapadbreak.getOriginalVideoId()).append("]").toString());
        return null;
        obj = ((VastAd) (obj)).buildUpon().a(null).d();
        if (!b.a(vmapadbreak.getOriginalVideoId(), vmapadbreak.getAdBreakId(), ((VastAd) (obj))))
        {
            break MISSING_BLOCK_LABEL_178;
        }
        if (((VastAd) (obj)).getAdVideoId() != null)
        {
            b.t(((VastAd) (obj)).getAdVideoId());
        }
        return ((VastAd) (obj));
        IOException ioexception;
        ioexception;
        L.a((new StringBuilder("Error saving vast ad [originalVideoId=")).append(vmapadbreak.getOriginalVideoId()).append("]").toString(), ioexception);
        return null;
    }

    private List b(String s)
    {
        List list = a.a(s, false);
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (!list.isEmpty())
        {
            break MISSING_BLOCK_LABEL_39;
        }
        b.b(s, Collections.emptyList());
        return null;
        boolean flag = b.b(s, list);
        s = list;
        if (!flag)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_113;
        Object obj;
        obj;
        L.a((new StringBuilder("Error loading ad breaks for ad [originalVideoId=")).append(s).append("]").toString(), ((Throwable) (obj)));
        return null;
        obj;
        L.a((new StringBuilder("Error saving ad breaks for ad [originalVideoId=")).append(s).append("]").toString(), ((Throwable) (obj)));
        s = null;
        return s;
    }

    public final String a(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        List list = b.r(s);
        Object obj = list;
        if (list == null)
        {
            obj = b(s);
        }
        if (obj != null)
        {
            if ((obj = VmapAdBreak.firstPrerollAdBreak(((List) (obj)))) != null && !b.c(s, ((VmapAdBreak) (obj)).getAdBreakId()) && (s = a(((VmapAdBreak) (obj)))) != null)
            {
                return s.getAdVideoId();
            }
        }
        return null;
    }

    public final Map a()
    {
        HashMap hashmap;
        Iterator iterator;
        List list = b.e();
        hashmap = new HashMap();
        iterator = list.iterator();
_L6:
        Object obj;
        Object obj1;
        String s;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_362;
        }
        obj1 = (h)iterator.next();
        s = ((h) (obj1)).a.a;
        obj = new mk();
        com.google.android.apps.youtube.app.offline.a.d.a[((h) (obj1)).a.d.ordinal()];
        JVM INSTR tableswitch 1 3: default 104
    //                   1 174
    //                   2 187
    //                   3 250;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L7:
        ml ml1 = new ml();
        ml1.b = (new mk[] {
            obj
        });
        obj1 = (List)hashmap.get(s);
        obj = obj1;
        if (obj1 == null)
        {
            obj = new ArrayList();
            hashmap.put(s, obj);
        }
        ((List) (obj)).add(ml1);
        if (true) goto _L6; else goto _L5
_L5:
        obj.b = 0;
        obj.d = 0;
          goto _L7
_L3:
        obj.b = 2;
        obj.d = (int)Math.max(0L, TimeUnit.MILLISECONDS.toSeconds(((h) (obj1)).a.e - c.a()));
        obj.e = Math.max(0, ((h) (obj1)).a.f - ((h) (obj1)).a.g);
          goto _L7
_L4:
        if (((h) (obj1)).b == null || ((h) (obj1)).b.c != OfflineMediaStatus.COMPLETE)
        {
            obj.b = 3;
        } else
        {
            obj.b = 4;
        }
        obj.d = (int)Math.max(0L, TimeUnit.MILLISECONDS.toSeconds(((h) (obj1)).a.e - c.a()));
        obj.c = ((h) (obj1)).a.c;
        obj.e = Math.max(0, ((h) (obj1)).a.f - Math.max(((h) (obj1)).b.b, ((h) (obj1)).a.g));
          goto _L7
        return hashmap;
          goto _L7
    }
}
