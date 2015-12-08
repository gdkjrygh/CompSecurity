// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.text.TextUtils;
import java.util.List;

// Referenced classes of package com.google.analytics.tracking.android:
//            Dispatcher, Log, Hit, HitBuilder

class NoopDispatcher
    implements Dispatcher
{

    NoopDispatcher()
    {
    }

    public int dispatchHits(List list)
    {
        if (list != null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        return i;
_L2:
        Log.iDebug("Hits not actually being sent as dispatch is false...");
        int k = Math.min(list.size(), 40);
        int j = 0;
        do
        {
            i = k;
            if (j >= k)
            {
                continue;
            }
            if (Log.debugEnabled())
            {
                String s;
                String s1;
                if (TextUtils.isEmpty(((Hit)list.get(j)).getHitParams()))
                {
                    s1 = "";
                } else
                {
                    s1 = HitBuilder.postProcessHit((Hit)list.get(j), System.currentTimeMillis());
                }
                if (TextUtils.isEmpty(s1))
                {
                    s = "Hit couldn't be read, wouldn't be sent:";
                } else
                if (s1.length() <= 2036)
                {
                    s = "GET would be sent:";
                } else
                if (s1.length() > 8192)
                {
                    s = "Would be too big:";
                } else
                {
                    s = "POST would be sent:";
                }
                Log.iDebug((new StringBuilder()).append(s).append(s1).toString());
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean okToDispatch()
    {
        return true;
    }
}
