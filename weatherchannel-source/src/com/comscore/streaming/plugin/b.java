// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming.plugin;

import com.comscore.streaming.StreamSenseEventType;
import com.comscore.streaming.StreamSenseState;
import com.comscore.utils.CSLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.comscore.streaming.plugin:
//            StreamSensePlugin, StreamSensePlayer, c, StreamSensePluginListener

class b
    implements Runnable
{

    final StreamSensePlugin a;

    b(StreamSensePlugin streamsenseplugin)
    {
        a = streamsenseplugin;
        super();
    }

    public void run()
    {
        if (StreamSensePlugin.a(a) && StreamSensePlugin.b(a) != null) goto _L2; else goto _L1
_L1:
        a.stopSmartStateDetection();
_L11:
        return;
_L2:
        Object obj;
        long l;
        long l1;
        obj = a.getState();
        l1 = System.currentTimeMillis();
        l = StreamSensePlugin.b(a).getPosition();
        a.startSmartStateDetection();
        if (!StreamSensePlugin.c(a).isEmpty() && l == StreamSensePlugin.a(a, 0)) goto _L4; else goto _L3
_L3:
        StreamSensePlugin.c(a).add(Long.valueOf(l));
        StreamSensePlugin.d(a).add(Long.valueOf(l1));
        if (StreamSensePlugin.c(a).size() <= 1 || StreamSensePlugin.a(a, 0) >= StreamSensePlugin.a(a, 1)) goto _L6; else goto _L5
_L5:
        long l2 = StreamSensePlugin.a(a, 0);
        long l3 = StreamSensePlugin.b(a, 0);
        StreamSensePlugin.c(a).clear();
        StreamSensePlugin.d(a).clear();
        StreamSensePlugin.c(a).add(Long.valueOf(l2));
        StreamSensePlugin.d(a).add(Long.valueOf(l3));
        Object obj1;
        boolean flag;
        boolean flag1;
        if (StreamSensePlugin.e(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (StreamSensePlugin.c(a).size() > 1)
        {
            CSLog.d(this, (new StringBuilder()).append("Playback Position: ").append(StreamSensePlugin.a(a, 0)).toString());
        }
        CSLog.d(this, (new StringBuilder()).append("Historical Data Count: ").append(StreamSensePlugin.c(a).size()).toString());
        if (StreamSensePlugin.c(a).size() > StreamSensePlugin.g(a))
        {
            StreamSensePlugin.c(a).remove(0);
            StreamSensePlugin.d(a).remove(0);
        }
        flag1 = flag;
        if (StreamSensePlugin.e(a))
        {
            flag1 = flag;
            if (!flag)
            {
                flag1 = StreamSensePlugin.h(a);
            }
        }
_L12:
        CSLog.d(this, (new StringBuilder()).append("Current state: ").append(a.getState()).toString());
        c.a[a.getState().ordinal()];
        JVM INSTR tableswitch 1 4: default 488
    //                   1 692
    //                   2 692
    //                   3 855
    //                   4 1045;
           goto _L7 _L8 _L8 _L9 _L10
_L10:
        break MISSING_BLOCK_LABEL_1045;
_L7:
        break; /* Loop/switch isn't completed */
_L6:
        if (StreamSensePlugin.c(a).size() > 1)
        {
            CSLog.d(this, (new StringBuilder()).append("Playback Position: ").append(StreamSensePlugin.a(a, 0)).toString());
        }
        CSLog.d(this, (new StringBuilder()).append("Historical Data Count: ").append(StreamSensePlugin.c(a).size()).toString());
        if (StreamSensePlugin.c(a).size() >= StreamSensePlugin.f(a))
        {
            flag = false;
            break MISSING_BLOCK_LABEL_333;
        }
          goto _L11
_L4:
        StreamSensePlugin.d(a).set(StreamSensePlugin.d(a).size() - 1, Long.valueOf(System.currentTimeMillis()));
        flag1 = false;
          goto _L12
_L8:
        if (StreamSensePlugin.i(a) && l > StreamSensePlugin.j(a) && !flag1)
        {
            for (obj1 = StreamSensePlugin.k(a).iterator(); ((Iterator) (obj1)).hasNext(); ((StreamSensePluginListener)((Iterator) (obj1)).next()).onPreStateChange(a.getState())) { }
            CSLog.d(this, "Moving to PLAYING state");
            if (StreamSensePlugin.l(a))
            {
                obj1 = new HashMap();
                ((HashMap) (obj1)).put("ns_st_ui", "seek");
                a.notify(StreamSenseEventType.PLAY, ((HashMap) (obj1)), l);
            } else
            {
                a.notify(StreamSenseEventType.PLAY, null, ((Long)StreamSensePlugin.c(a).get(0)).longValue());
            }
            StreamSensePlugin.a(a, false);
        }
          goto _L13
_L9:
        if (StreamSensePlugin.i(a) && l > StreamSensePlugin.j(a) && !flag1)
        {
            for (obj1 = StreamSensePlugin.k(a).iterator(); ((Iterator) (obj1)).hasNext(); ((StreamSensePluginListener)((Iterator) (obj1)).next()).onPreStateChange(a.getState())) { }
            CSLog.d(this, "Moving to PLAYING state");
            if (StreamSensePlugin.l(a))
            {
                obj1 = new HashMap();
                ((HashMap) (obj1)).put("ns_st_ui", "seek");
                a.notify(StreamSenseEventType.PLAY, ((HashMap) (obj1)), l);
            } else
            {
                a.notify(StreamSenseEventType.PLAY, null, ((Long)StreamSensePlugin.c(a).get(0)).longValue());
            }
            StreamSensePlugin.a(a, false);
        } else
        if (StreamSensePlugin.e(a) && flag1)
        {
            StreamSensePlugin.a(a, true);
        }
          goto _L13
        if (StreamSensePlugin.e(a) && flag1)
        {
            for (obj1 = StreamSensePlugin.k(a).iterator(); ((Iterator) (obj1)).hasNext(); ((StreamSensePluginListener)((Iterator) (obj1)).next()).onPreStateChange(a.getState())) { }
            CSLog.d(this, "Moving to PAUSE (seek) state");
            a.notify(StreamSenseEventType.PAUSE, null, StreamSensePlugin.j(a));
            StreamSensePlugin.a(a, true);
        } else
        if (StreamSensePlugin.m(a) && StreamSensePlugin.a(a, l))
        {
            for (obj1 = StreamSensePlugin.k(a).iterator(); ((Iterator) (obj1)).hasNext(); ((StreamSensePluginListener)((Iterator) (obj1)).next()).onPreStateChange(a.getState())) { }
            CSLog.d(this, "Moving to END state");
            a.notify(StreamSenseEventType.END, null, StreamSensePlugin.b(a).getDuration());
            StreamSensePlugin.a(a, false);
        } else
        if (StreamSensePlugin.n(a) && Math.abs(l - StreamSensePlugin.j(a)) <= (long)StreamSensePlugin.o(a))
        {
            for (obj1 = StreamSensePlugin.k(a).iterator(); ((Iterator) (obj1)).hasNext(); ((StreamSensePluginListener)((Iterator) (obj1)).next()).onPreStateChange(a.getState())) { }
            CSLog.d(this, "Moving to PAUSE state");
            a.notify(StreamSenseEventType.PAUSE, null, StreamSensePlugin.j(a));
        }
_L13:
        if (obj != a.getState())
        {
            for (obj = StreamSensePlugin.k(a).iterator(); ((Iterator) (obj)).hasNext(); ((StreamSensePluginListener)((Iterator) (obj)).next()).onPostStateChange(a.getState())) { }
            if (a.getState() == StreamSenseState.PAUSED)
            {
                StreamSensePlugin.c(a).clear();
                StreamSensePlugin.d(a).clear();
            }
        }
        StreamSensePlugin.b(a, l);
        return;
        break MISSING_BLOCK_LABEL_333;
    }
}
