// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.au;
import com.google.android.apps.youtube.core.utils.l;
import com.google.android.apps.youtube.datalib.innertube.model.Offlineability;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            OfflineStreamQuality

public final class p
{

    private static final OfflineStreamQuality a;
    private static final OfflineStreamQuality b;
    private final SharedPreferences c;
    private final List d;
    private final OfflineStreamQuality e;

    public p(Context context, au au, SharedPreferences sharedpreferences)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        com.google.android.apps.youtube.common.fromguava.c.a(au);
        c = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        boolean flag = l.a(context, au);
        d = a(flag);
        if (flag)
        {
            context = b;
        } else
        {
            context = a;
        }
        e = context;
    }

    private static List a(boolean flag)
    {
        OfflineStreamQuality aofflinestreamquality[] = OfflineStreamQuality.values();
        ArrayList arraylist = new ArrayList(aofflinestreamquality.length);
        int j = aofflinestreamquality.length;
        for (int i = 0; i < j; i++)
        {
            OfflineStreamQuality offlinestreamquality = aofflinestreamquality[i];
            if (flag || offlinestreamquality.getQualityValue() < 720)
            {
                arraylist.add(offlinestreamquality);
            }
        }

        return Collections.unmodifiableList(arraylist);
    }

    private OfflineStreamQuality b(OfflineStreamQuality offlinestreamquality)
    {
        Object obj;
        obj = c.getString("offline_quality", null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        int i;
        i = Integer.parseInt(((String) (obj)));
        obj = d.iterator();
        OfflineStreamQuality offlinestreamquality1;
        int j;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_68;
            }
            offlinestreamquality1 = (OfflineStreamQuality)((Iterator) (obj)).next();
            j = offlinestreamquality1.getQualityValue();
        } while (j != i);
        return offlinestreamquality1;
        NumberFormatException numberformatexception;
        numberformatexception;
        return offlinestreamquality;
    }

    public final List a()
    {
        return d;
    }

    public final void a(OfflineStreamQuality offlinestreamquality)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(offlinestreamquality);
        c.edit().putString("offline_quality", Integer.toString(offlinestreamquality.getQualityValue())).commit();
    }

    public final boolean a(Offlineability offlineability)
    {
        OfflineStreamQuality offlinestreamquality = b(null);
        if (offlineability == null) goto _L2; else goto _L1
_L1:
        if (offlinestreamquality != null && offlineability.b().containsKey(offlinestreamquality.getFormatType())) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (offlinestreamquality != null || !b())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final boolean b()
    {
        return d.size() > 1;
    }

    public final OfflineStreamQuality c()
    {
        return b(e);
    }

    public final boolean d()
    {
        return c.getBoolean("offline_policy", true);
    }

    static 
    {
        a = OfflineStreamQuality.SD;
        b = OfflineStreamQuality.SD;
    }
}
