// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming.plugin;

import com.comscore.analytics.Core;
import com.comscore.streaming.StreamSense;
import com.comscore.streaming.StreamSenseEventType;
import com.comscore.utils.CSLog;
import com.comscore.utils.task.TaskExecutor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.comscore.streaming.plugin:
//            StreamSensePlayer, b, StreamSensePluginListener

public class StreamSensePlugin extends StreamSense
{

    private static final float b[][];
    private Runnable c;
    private List d;
    private List e;
    private long f;
    private boolean g;
    private List h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private float p;
    private int q;
    private int r;
    private int s;
    private StreamSensePlayer t;

    public StreamSensePlugin(String s1, String s2, String s3)
    {
        n = 10;
        o = 1000;
        p = 1.25F;
        s = 2;
        q = 300;
        r = 6;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        f = 0L;
        g = false;
        d = new ArrayList();
        e = new ArrayList();
        h = new ArrayList();
        setLabel("ns_st_mp", s1);
        setLabel("ns_st_pv", s2);
        setLabel("ns_st_mv", s3);
    }

    private long a(int i1)
    {
        return ((Long)d.get(d.size() - 1 - i1)).longValue();
    }

    static long a(StreamSensePlugin streamsenseplugin, int i1)
    {
        return streamsenseplugin.a(i1);
    }

    private boolean a(long l1)
    {
        return t.getDuration() > 0L && Math.abs(l1 - t.getDuration()) < (long)o;
    }

    static boolean a(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.m;
    }

    static boolean a(StreamSensePlugin streamsenseplugin, long l1)
    {
        return streamsenseplugin.a(l1);
    }

    static boolean a(StreamSensePlugin streamsenseplugin, boolean flag)
    {
        streamsenseplugin.g = flag;
        return flag;
    }

    private long b(int i1)
    {
        return ((Long)e.get(e.size() - 1 - i1)).longValue();
    }

    static long b(StreamSensePlugin streamsenseplugin, int i1)
    {
        return streamsenseplugin.b(i1);
    }

    static long b(StreamSensePlugin streamsenseplugin, long l1)
    {
        streamsenseplugin.f = l1;
        return l1;
    }

    static StreamSensePlayer b(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.t;
    }

    private Runnable c()
    {
        return new b(this);
    }

    static List c(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.d;
    }

    static List d(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.e;
    }

    private boolean d()
    {
        if (d.size() < 2)
        {
            CSLog.e(this, "isSeekInProgress: not enough previous playback positions");
        } else
        {
            if (d.size() > 1 && a(0) < a(1))
            {
                return true;
            }
            int j1 = q;
            int i1 = 0;
            float f1 = 0.0F;
            for (; i1 < d.size(); i1++)
            {
                float f2 = b[d.size() - 2][i1];
                f1 += (float)((Long)d.get(i1)).longValue() * f2;
            }

            if (f1 / (float)j1 > p)
            {
                return true;
            }
        }
        return false;
    }

    static boolean e(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.i;
    }

    static int f(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.s;
    }

    static int g(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.r;
    }

    static boolean h(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.d();
    }

    static boolean i(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.k;
    }

    static long j(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.f;
    }

    static List k(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.h;
    }

    static boolean l(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.g;
    }

    static boolean m(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.l;
    }

    static boolean n(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.j;
    }

    static int o(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.n;
    }

    public void addListener(StreamSensePluginListener streamsensepluginlistener)
    {
        h.add(streamsensepluginlistener);
    }

    public void clearAllListeners()
    {
        h.clear();
    }

    public void clearListener(StreamSensePluginListener streamsensepluginlistener)
    {
        h.remove(streamsensepluginlistener);
    }

    public StreamSensePlayer getPlayer()
    {
        return t;
    }

    public void notify(StreamSenseEventType streamsenseeventtype, HashMap hashmap, long l1)
    {
        HashMap hashmap1 = hashmap;
        if (hashmap == null)
        {
            hashmap1 = new HashMap();
        }
        for (hashmap = h.iterator(); hashmap.hasNext(); ((StreamSensePluginListener)hashmap.next()).onGetLabels(streamsenseeventtype, hashmap1)) { }
        long l2;
        if (l1 <= 0L)
        {
            if (t != null)
            {
                l1 = t.getPosition();
            } else
            {
                l1 = 0L;
            }
        }
        l2 = l1;
        if (l1 < 0L)
        {
            l2 = 0L;
        }
        super.notify(streamsenseeventtype, hashmap1, l2);
    }

    public void setDetectEnd(boolean flag)
    {
        l = flag;
    }

    public void setDetectPause(boolean flag)
    {
        j = flag;
    }

    public void setDetectPlay(boolean flag)
    {
        k = flag;
    }

    public void setDetectSeek(boolean flag)
    {
        i = flag;
    }

    public void setEndDetectionErrorMargin(int i1)
    {
        o = i1;
    }

    public void setMaximumNumberOfEntriesInHistory(int i1)
    {
        if (i1 >= 2 && i1 <= 13)
        {
            r = i1;
        }
    }

    public void setMinimumNumberOfTimeUpdateEventsBeforeSensingAnything(int i1)
    {
        if (i1 >= 2 && i1 <= 13)
        {
            s = i1;
        }
    }

    public void setPauseDetectionErrorMargin(int i1)
    {
        n = i1;
    }

    public void setPlayer(StreamSensePlayer streamsenseplayer)
    {
        t = streamsenseplayer;
    }

    public void setPulseSamplingInterval(int i1)
    {
        if (i1 > 0)
        {
            q = i1;
        }
    }

    public void setSeekDetectionMinQuotient(float f1)
    {
        if (f1 > 1.0F)
        {
            p = f1;
        }
    }

    public void setSmartStateDetection(boolean flag)
    {
        m = flag;
    }

    public void startSmartStateDetection()
    {
        stopSmartStateDetection();
        if (m && t != null)
        {
            c = c();
            a.getTaskExecutor().execute(c, q);
        }
    }

    public void stopSmartStateDetection()
    {
        if (c != null)
        {
            a.getTaskExecutor().removeEnqueuedTask(c);
            c = null;
        }
    }

    static 
    {
        float af[] = {
            -1F, 1.0F
        };
        float af1[] = {
            -0.5F, 0.0F, 0.5F
        };
        float af2[] = {
            -0.3F, -0.1F, 0.1F, 0.3F
        };
        float af3[] = {
            -0.10714F, -0.07143F, -0.03571F, 0.0F, 0.03571F, 0.07143F, 0.10714F
        };
        float af4[] = {
            -0.08333F, -0.05952F, -0.03571F, -0.0119F, 0.0119F, 0.03571F, 0.05952F, 0.08333F
        };
        float af5[] = {
            -0.03846F, -0.03147F, -0.02448F, -0.01748F, -0.01049F, -0.0035F, 0.0035F, 0.01049F, 0.01748F, 0.02448F, 
            0.03147F, 0.03846F
        };
        float af6[] = {
            -0.03297F, -0.02747F, -0.02198F, -0.01648F, -0.01099F, -0.00549F, 0.0F, 0.00549F, 0.01099F, 0.01648F, 
            0.02198F, 0.02747F, 0.03297F
        };
        b = (new float[][] {
            af, af1, af2, new float[] {
                -0.2F, -0.1F, 0.0F, 0.1F, 0.2F
            }, new float[] {
                -0.14286F, -0.08571F, -0.02857F, 0.02857F, 0.08571F, 0.14286F
            }, af3, af4, new float[] {
                -0.06667F, -0.05F, -0.03333F, -0.01667F, 0.0F, 0.01667F, 0.03333F, 0.05F, 0.06667F
            }, new float[] {
                -0.05455F, -0.04242F, -0.0303F, -0.01818F, -0.00606F, 0.00606F, 0.01818F, 0.0303F, 0.04242F, 0.05455F
            }, new float[] {
                -0.04545F, -0.03636F, -0.02727F, -0.01818F, -0.00909F, 0.0F, 0.00909F, 0.01818F, 0.02727F, 0.03636F, 
                0.04545F
            }, 
            af5, af6
        });
    }
}
