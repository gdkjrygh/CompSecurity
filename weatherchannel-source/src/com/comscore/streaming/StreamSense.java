// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import com.comscore.analytics.Core;
import com.comscore.analytics.comScore;
import com.comscore.utils.CSLog;
import com.comscore.utils.Utils;
import com.comscore.utils.task.TaskExecutor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.comscore.streaming:
//            StreamSenseState, StreamSensePlaylist, StreamSenseEventType, StreamSenseClip, 
//            StreamSenseListener, d, a, b, 
//            c, e, StreamSenseMediaPlayer, StreamSenseVideoView, 
//            StreamSenseUtils, f

public class StreamSense
{

    protected Core a;
    private HashMap b;
    private String c;
    private long d;
    private long e;
    private StreamSenseState f;
    private int g;
    private StreamSensePlaylist h;
    private Runnable i;
    private boolean j;
    private Runnable k;
    private f l;
    private Runnable m;
    private long n;
    private int o;
    private long p;
    private boolean q;
    private StreamSenseState r;
    private String s;
    private String t;
    private HashMap u;
    private List v;
    private List w;
    private int x;
    private int y;

    public StreamSense()
    {
        c = null;
        f = null;
        h = null;
        i = null;
        j = true;
        l = null;
        CSLog.d(this, "StreamSense()");
        a = comScore.getCore();
        b = new HashMap();
        g = 1;
        f = StreamSenseState.IDLE;
        h = new StreamSensePlaylist();
        i = null;
        j = true;
        m = null;
        o = 0;
        f();
        k = null;
        l = null;
        q = false;
        r = null;
        e = 0L;
        x = 0x124f80;
        y = 500;
        v = new ArrayList();
        w = n();
        reset();
    }

    private long a(long l1)
    {
        for (Iterator iterator = w.iterator(); iterator.hasNext();)
        {
            HashMap hashmap = (HashMap)iterator.next();
            Long long1 = (Long)hashmap.get("playingtime");
            if (long1 == null || l1 < long1.longValue())
            {
                return ((Long)hashmap.get("interval")).longValue();
            }
        }

        return 0L;
    }

    private StreamSenseState a(StreamSenseEventType streamsenseeventtype)
    {
        if (streamsenseeventtype == StreamSenseEventType.PLAY)
        {
            return StreamSenseState.PLAYING;
        }
        if (streamsenseeventtype == StreamSenseEventType.PAUSE)
        {
            return StreamSenseState.PAUSED;
        }
        if (streamsenseeventtype == StreamSenseEventType.BUFFER)
        {
            return StreamSenseState.BUFFERING;
        }
        if (streamsenseeventtype == StreamSenseEventType.END)
        {
            return StreamSenseState.IDLE;
        } else
        {
            return null;
        }
    }

    private HashMap a(StreamSenseEventType streamsenseeventtype, HashMap hashmap)
    {
        if (!a.isEnabled())
        {
            new HashMap();
        }
        CSLog.d(this, (new StringBuilder()).append("createMeasurementLabels(").append(streamsenseeventtype).append(")").toString());
        HashMap hashmap1 = new HashMap();
        if (hashmap != null)
        {
            hashmap1.putAll(hashmap);
        }
        if (!hashmap1.containsKey("ns_ts"))
        {
            hashmap1.put("ns_ts", String.valueOf(System.currentTimeMillis()));
        }
        if (streamsenseeventtype != null && !hashmap1.containsKey("ns_st_ev"))
        {
            hashmap1.put("ns_st_ev", streamsenseeventtype.toString());
        }
        hashmap1.putAll(getLabels());
        b(streamsenseeventtype, hashmap1);
        h.a(streamsenseeventtype, hashmap1);
        h.getClip().a(streamsenseeventtype, hashmap1);
        if (!hashmap1.containsKey("ns_st_mp"))
        {
            hashmap1.put("ns_st_mp", s);
        }
        if (!hashmap1.containsKey("ns_st_mv"))
        {
            hashmap1.put("ns_st_mv", t);
        }
        if (!hashmap1.containsKey("ns_st_ub"))
        {
            hashmap1.put("ns_st_ub", "0");
        }
        if (!hashmap1.containsKey("ns_st_br"))
        {
            hashmap1.put("ns_st_br", "0");
        }
        if (!hashmap1.containsKey("ns_st_pn"))
        {
            hashmap1.put("ns_st_pn", "1");
        }
        if (!hashmap1.containsKey("ns_st_tp"))
        {
            hashmap1.put("ns_st_tp", "1");
        }
        if (!hashmap1.containsKey("ns_st_it"))
        {
            hashmap1.put("ns_st_it", "c");
        }
        hashmap1.put("ns_st_sv", "4.1502.26");
        return hashmap1;
    }

    static void a(StreamSense streamsense)
    {
        streamsense.j();
    }

    static void a(StreamSense streamsense, StreamSenseState streamsensestate, HashMap hashmap)
    {
        streamsense.a(streamsensestate, hashmap);
    }

    private void a(StreamSenseState streamsensestate, HashMap hashmap)
    {
        long l1 = 0L;
        if (a.isEnabled())
        {
            CSLog.d(this, (new StringBuilder()).append("transitionTo(").append(streamsensestate).append(", ").append(hashmap).append(")").toString());
            l();
            if (c(streamsensestate))
            {
                StreamSenseState streamsensestate1 = getState();
                long l2 = d;
                long l3 = f(hashmap);
                if (l2 >= 0L)
                {
                    l1 = l3 - l2;
                }
                b(getState(), hashmap);
                c(streamsensestate, hashmap);
                d(streamsensestate);
                for (Iterator iterator = v.iterator(); iterator.hasNext(); ((StreamSenseListener)iterator.next()).onStateChange(streamsensestate1, streamsensestate, hashmap, l1)) { }
                c(hashmap);
                h.b(hashmap, streamsensestate);
                h.getClip().b(hashmap, streamsensestate);
                streamsensestate = a(streamsensestate.toEventType(), hashmap);
                streamsensestate.putAll(hashmap);
                if (b(f))
                {
                    a(((HashMap) (streamsensestate)));
                    r = f;
                    g = g + 1;
                    return;
                }
            }
        }
    }

    private void a(StreamSenseState streamsensestate, HashMap hashmap, long l1)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            CSLog.d(this, (new StringBuilder()).append("transitionTo(").append(streamsensestate).append(", ").append(hashmap).append(", ").append(l1).append(")").toString());
            l();
            l = new d(this, streamsensestate, hashmap);
            a.getTaskExecutor().execute(l, l1);
            return;
        }
    }

    private boolean a(StreamSenseState streamsensestate)
    {
        while (!a.isEnabled() || streamsensestate != StreamSenseState.PLAYING && streamsensestate != StreamSenseState.PAUSED) 
        {
            return false;
        }
        return true;
    }

    public static StreamSense analyticsFor(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        StreamSense streamsense = new StreamSense();
        streamsense.engageTo(streamsensemediaplayer);
        streamsense.setPausePlaySwitchDelayEnabled(true);
        return streamsense;
    }

    public static StreamSense analyticsFor(StreamSenseVideoView streamsensevideoview)
    {
        StreamSense streamsense = new StreamSense();
        streamsense.engageTo(streamsensevideoview);
        return streamsense;
    }

    private HashMap b(StreamSenseEventType streamsenseeventtype, HashMap hashmap)
    {
        if (a.isEnabled()) goto _L2; else goto _L1
_L1:
        HashMap hashmap1 = new HashMap();
_L4:
        return hashmap1;
_L2:
label0:
        {
label1:
            {
                long l1;
                long l2;
                long l3;
                if (hashmap == null)
                {
                    hashmap = new HashMap();
                }
                hashmap.put("ns_st_ec", String.valueOf(g));
                if (hashmap.containsKey("ns_st_po"))
                {
                    break label0;
                }
                l2 = e;
                l3 = f(hashmap);
                if (streamsenseeventtype != StreamSenseEventType.PLAY && streamsenseeventtype != StreamSenseEventType.KEEP_ALIVE && streamsenseeventtype != StreamSenseEventType.HEART_BEAT)
                {
                    l1 = l2;
                    if (streamsenseeventtype != null)
                    {
                        break label1;
                    }
                    l1 = l2;
                    if (f != StreamSenseState.PLAYING)
                    {
                        break label1;
                    }
                }
                l1 = l2 + (l3 - h.getClip().g());
            }
            hashmap.put("ns_st_po", String.valueOf(l1));
        }
        hashmap1 = hashmap;
        if (streamsenseeventtype == StreamSenseEventType.HEART_BEAT)
        {
            hashmap.put("ns_st_hc", String.valueOf(o));
            hashmap.put("ns_st_pe", "1");
            return hashmap;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(StreamSenseState streamsensestate, HashMap hashmap)
    {
        if (a.isEnabled())
        {
            CSLog.d(this, (new StringBuilder()).append("onExit(").append(streamsensestate).append(", ").append(hashmap).append(")").toString());
            long l1 = f(hashmap);
            if (streamsensestate == StreamSenseState.PLAYING)
            {
                h.a(l1);
                e();
                h();
                return;
            }
            if (streamsensestate == StreamSenseState.BUFFERING)
            {
                h.b(l1);
                k();
                return;
            }
            if (streamsensestate == StreamSenseState.IDLE)
            {
                getClip().reset(getClip().getLabels().keySet());
                return;
            }
        }
    }

    private void b(HashMap hashmap)
    {
        while (!a.isEnabled() || f(hashmap) >= 0L) 
        {
            return;
        }
        hashmap.put("ns_ts", String.valueOf(System.currentTimeMillis()));
    }

    private boolean b(StreamSenseState streamsensestate)
    {
        while (streamsensestate == StreamSenseState.PAUSED && (r == StreamSenseState.IDLE || r == null) || streamsensestate == StreamSenseState.BUFFERING || r == streamsensestate) 
        {
            return false;
        }
        return true;
    }

    private void c()
    {
        if (a.isEnabled())
        {
            k();
            if (isPauseOnBufferingEnabled() && b(StreamSenseState.PAUSED))
            {
                i = new a(this);
                a.getTaskExecutor().execute(i, y);
                return;
            }
        }
    }

    private void c(StreamSenseState streamsensestate, HashMap hashmap)
    {
        if (a.isEnabled()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l1;
        CSLog.d(this, (new StringBuilder()).append("onEnter(").append(streamsensestate).append(", ").append(hashmap).append(")").toString());
        l1 = f(hashmap);
        e = e(hashmap);
        if (streamsensestate != StreamSenseState.PLAYING)
        {
            break; /* Loop/switch isn't completed */
        }
        d();
        g();
        h.getClip().c(l1);
        if (b(streamsensestate))
        {
            h.getClip().d();
            if (h.a() < 1)
            {
                h.a(1);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (streamsensestate != StreamSenseState.PAUSED)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b(streamsensestate))
        {
            h.f();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (streamsensestate != StreamSenseState.BUFFERING)
        {
            continue; /* Loop/switch isn't completed */
        }
        h.getClip().d(l1);
        if (!j) goto _L1; else goto _L5
_L5:
        c();
        return;
        if (streamsensestate != StreamSenseState.IDLE) goto _L1; else goto _L6
_L6:
        f();
        return;
    }

    private void c(HashMap hashmap)
    {
        if (a.isEnabled())
        {
            String s1 = (String)hashmap.get("ns_st_mp");
            if (s1 != null)
            {
                s = s1;
                hashmap.remove("ns_st_mp");
            }
            s1 = (String)hashmap.get("ns_st_mv");
            if (s1 != null)
            {
                t = s1;
                hashmap.remove("ns_st_mv");
            }
            s1 = (String)hashmap.get("ns_st_ec");
            if (s1 != null)
            {
                try
                {
                    g = Integer.parseInt(s1);
                    hashmap.remove("ns_st_ec");
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (HashMap hashmap)
                {
                    return;
                }
            }
        }
    }

    private boolean c(StreamSenseState streamsensestate)
    {
        return streamsensestate != null && getState() != streamsensestate;
    }

    private void d()
    {
        if (a.isEnabled())
        {
            i();
            if (w != null)
            {
                long l1;
                if (n >= 0L)
                {
                    l1 = n;
                    CSLog.d(this, (new StringBuilder()).append("Resuming heart beat timer. Next event in ").append(l1).append(" ms").toString());
                } else
                {
                    l1 = a(h.getClip().f());
                    CSLog.d(this, (new StringBuilder()).append("Starting heart beat timer. Next event in ").append(l1).append(" ms").toString());
                }
                if (l1 > 0L)
                {
                    p = System.currentTimeMillis() + l1;
                    m = new b(this);
                    a.getTaskExecutor().execute(m, l1);
                    return;
                }
            }
        }
    }

    private void d(StreamSenseState streamsensestate)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            f = streamsensestate;
            d = System.currentTimeMillis();
            return;
        }
    }

    private void d(HashMap hashmap)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            u = g(null);
            u.putAll(hashmap);
            return;
        }
    }

    private long e(HashMap hashmap)
    {
        if (hashmap.containsKey("ns_st_po"))
        {
            long l1;
            try
            {
                l1 = Long.valueOf((String)hashmap.get("ns_st_po")).longValue();
            }
            // Misplaced declaration of an exception variable
            catch (HashMap hashmap)
            {
                return -1L;
            }
            return l1;
        } else
        {
            return -1L;
        }
    }

    private void e()
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            CSLog.d(this, "Pausing heartbeat timer.");
            i();
            n = p - System.currentTimeMillis();
            p = -1L;
            return;
        }
    }

    private long f(HashMap hashmap)
    {
        if (hashmap.containsKey("ns_ts"))
        {
            long l1;
            try
            {
                l1 = Long.valueOf((String)hashmap.get("ns_ts")).longValue();
            }
            // Misplaced declaration of an exception variable
            catch (HashMap hashmap)
            {
                return -1L;
            }
            return l1;
        } else
        {
            return -1L;
        }
    }

    private void f()
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            CSLog.d(this, "Resetting heartbeat timer.");
            n = -1L;
            p = -1L;
            o = 0;
            return;
        }
    }

    private HashMap g(HashMap hashmap)
    {
        return a(f.toEventType(), hashmap);
    }

    private void g()
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            CSLog.d(this, "Starting keep alive timer");
            h();
            k = new c(this);
            a.getTaskExecutor().execute(k, x, true, x);
            return;
        }
    }

    public static String getVersion()
    {
        return "4.1502.26";
    }

    private void h()
    {
        if (a.isEnabled())
        {
            CSLog.d(this, "stopKeepAliveTask()");
            if (k != null)
            {
                a.getTaskExecutor().removeEnqueuedTask(k);
                k = null;
                return;
            }
        }
    }

    private void i()
    {
        if (a.isEnabled())
        {
            CSLog.d(this, "releaseHeartBeatTask()");
            if (m != null)
            {
                a.getTaskExecutor().removeEnqueuedTask(m);
                m = null;
                return;
            }
        }
    }

    private void j()
    {
        if (a.isEnabled())
        {
            CSLog.d(this, "Firing paused on buffering event");
            if (r == StreamSenseState.PLAYING)
            {
                h.h();
                h.f();
                a(a(StreamSenseEventType.PAUSE, ((HashMap) (null))));
                g = g + 1;
                r = StreamSenseState.PAUSED;
                return;
            }
        }
    }

    private void k()
    {
        if (a.isEnabled())
        {
            CSLog.d(this, "stopPausedOnBufferingTask()");
            if (i != null)
            {
                a.getTaskExecutor().removeEnqueuedTask(i);
                i = null;
                return;
            }
        }
    }

    private void l()
    {
        if (a.isEnabled())
        {
            CSLog.d(this, "stopDelayedTransitionTask()");
            if (l != null)
            {
                a.getTaskExecutor().removeEnqueuedTask(l);
                l = null;
                return;
            }
        }
    }

    private boolean m()
    {
        android.content.Context context = a.getAppContext();
        String s1 = a.getPublisherSecret();
        String s2 = a.getPixelURL();
        return context == null || s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0;
    }

    private List n()
    {
        ArrayList arraylist = new ArrayList();
        HashMap hashmap = new HashMap();
        hashmap.put("playingtime", Long.valueOf(60000L));
        hashmap.put("interval", Long.valueOf(10000L));
        arraylist.add(hashmap);
        hashmap = new HashMap();
        hashmap.put("playingtime", null);
        hashmap.put("interval", Long.valueOf(60000L));
        arraylist.add(hashmap);
        return arraylist;
    }

    protected void a()
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            CSLog.d(this, "Firing heart beat");
            o = o + 1;
            a(a(StreamSenseEventType.HEART_BEAT, ((HashMap) (null))));
            n = -1L;
            d();
            return;
        }
    }

    protected void a(HashMap hashmap)
    {
        a(hashmap, true);
    }

    protected void a(HashMap hashmap, boolean flag)
    {
        if (a.isEnabled())
        {
            CSLog.d(this, (new StringBuilder()).append("dispatch(").append(hashmap).append(", ").append(flag).append(")").toString());
            if (flag)
            {
                d(hashmap);
            }
            if (!m())
            {
                String s1 = c;
                a.getTaskExecutor().execute(new e(this, hashmap, s1), true);
                return;
            }
        }
    }

    public void addListener(StreamSenseListener streamsenselistener)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            v.add(streamsenselistener);
            return;
        }
    }

    protected void b()
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            CSLog.d(this, "Firing keep alive");
            a(a(StreamSenseEventType.KEEP_ALIVE, ((HashMap) (null))));
            g = g + 1;
            return;
        }
    }

    public void engageTo(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        streamsensemediaplayer.setStreamSense(this);
    }

    public void engageTo(StreamSenseVideoView streamsensevideoview)
    {
        streamsensevideoview.setStreamSense(this);
    }

    public HashMap exportState()
    {
        return u;
    }

    public StreamSenseClip getClip()
    {
        return h.getClip();
    }

    public int getKeepAliveInterval()
    {
        return x;
    }

    public String getLabel(String s1)
    {
        return (String)b.get(s1);
    }

    public HashMap getLabels()
    {
        return b;
    }

    public int getPauseOnBufferingInterval()
    {
        return y;
    }

    public String getPixelURL()
    {
        return c;
    }

    public StreamSensePlaylist getPlaylist()
    {
        return h;
    }

    public StreamSenseState getState()
    {
        return f;
    }

    public void importState(HashMap hashmap)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            reset();
            hashmap = Utils.mapOfStrings(hashmap);
            h.b(hashmap, null);
            h.getClip().b(hashmap, null);
            c(hashmap);
            g = g + 1;
            return;
        }
    }

    public boolean isPauseOnBufferingEnabled()
    {
        return j;
    }

    public boolean isPausePlaySwitchDelayEnabled()
    {
        return q;
    }

    public void notify(StreamSenseEventType streamsenseeventtype, long l1)
    {
        notify(streamsenseeventtype, new HashMap(), l1);
    }

    public void notify(StreamSenseEventType streamsenseeventtype, HashMap hashmap, long l1)
    {
        if (!a.isEnabled())
        {
            return;
        }
        CSLog.d(this, (new StringBuilder()).append("notify(").append(streamsenseeventtype).append(", ").append(hashmap).append(")").toString());
        StreamSenseState streamsensestate = a(streamsenseeventtype);
        hashmap = Utils.mapOfStrings(hashmap);
        b(hashmap);
        if (!hashmap.containsKey("ns_st_po"))
        {
            hashmap.put("ns_st_po", String.valueOf(l1));
        }
        if (streamsenseeventtype == StreamSenseEventType.PLAY || streamsenseeventtype == StreamSenseEventType.PAUSE || streamsenseeventtype == StreamSenseEventType.BUFFER || streamsenseeventtype == StreamSenseEventType.END)
        {
            if (isPausePlaySwitchDelayEnabled() && a(f) && a(streamsensestate) && (f != StreamSenseState.PLAYING || streamsensestate != StreamSenseState.PAUSED || l != null))
            {
                a(streamsensestate, hashmap, 500L);
                return;
            } else
            {
                a(streamsensestate, hashmap);
                return;
            }
        } else
        {
            streamsenseeventtype = a(streamsenseeventtype, hashmap);
            streamsenseeventtype.putAll(hashmap);
            a(streamsenseeventtype, false);
            g = g + 1;
            return;
        }
    }

    public void removeListener(StreamSenseListener streamsenselistener)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            v.remove(streamsenselistener);
            return;
        }
    }

    public void reset()
    {
        reset(null);
    }

    public void reset(Set set)
    {
        if (!a.isEnabled())
        {
            return;
        }
        CSLog.d(this, "Reset()");
        h.reset(set);
        h.d(0);
        h.setPlaylistId((new StringBuilder()).append(System.currentTimeMillis()).append("_1").toString());
        h.getClip().reset(set);
        if (set != null && !set.isEmpty())
        {
            StreamSenseUtils.filterMap(b, set);
        } else
        {
            b.clear();
        }
        g = 1;
        o = 0;
        e();
        f();
        h();
        k();
        l();
        f = StreamSenseState.IDLE;
        d = -1L;
        r = null;
        s = "android_puppet";
        t = "4.1502.26";
        u = null;
    }

    public Boolean setClip(HashMap hashmap)
    {
        return setClip(hashmap, false);
    }

    public Boolean setClip(HashMap hashmap, boolean flag)
    {
        Boolean boolean1;
        if (!a.isEnabled())
        {
            boolean1 = Boolean.FALSE;
        } else
        {
            boolean1 = Boolean.FALSE;
            if (f == StreamSenseState.IDLE)
            {
                h.getClip().reset();
                h.getClip().a(Utils.mapOfStrings(hashmap), null);
                if (flag)
                {
                    h.b();
                }
                return Boolean.TRUE;
            }
        }
        return boolean1;
    }

    public void setHeartbeatIntervals(List list)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            w = list;
            return;
        }
    }

    public void setKeepAliveInterval(int i1)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            x = i1;
            return;
        }
    }

    public void setLabel(String s1, String s2)
    {
        if (!a.isEnabled())
        {
            return;
        }
        if (s2 == null)
        {
            b.remove(s1);
            return;
        } else
        {
            b.put(s1, s2);
            return;
        }
    }

    public void setLabels(HashMap hashmap)
    {
        while (!a.isEnabled() || hashmap == null) 
        {
            return;
        }
        if (b == null)
        {
            b = Utils.mapOfStrings(hashmap);
            return;
        } else
        {
            b.putAll(Utils.mapOfStrings(hashmap));
            return;
        }
    }

    public void setPauseOnBufferingEnabled(boolean flag)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            j = flag;
            return;
        }
    }

    public void setPauseOnBufferingInterval(int i1)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            y = i1;
            return;
        }
    }

    public void setPausePlaySwitchDelayEnabled(boolean flag)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            q = flag;
            return;
        }
    }

    public String setPixelURL(String s1)
    {
        int j1;
        if (!a.isEnabled())
        {
            return c;
        }
        if (s1 == null || s1.length() == 0)
        {
            return null;
        }
        j1 = s1.indexOf('?');
        if (j1 < 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = s1;
        if (j1 < s1.length() - 1)
        {
            obj = s1.substring(j1 + 1).split("&");
            int k1 = obj.length;
            int i1 = 0;
            while (i1 < k1) 
            {
                String as[] = obj[i1].split("=");
                if (as.length == 2)
                {
                    setLabel(as[0], as[1]);
                } else
                if (as.length == 1)
                {
                    setLabel("name", as[0]);
                }
                i1++;
            }
            obj = s1.substring(0, j1 + 1);
        }
_L4:
        c = ((String) (obj));
        return c;
_L2:
        obj = (new StringBuilder()).append(s1).append('?').toString();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Boolean setPlaylist(HashMap hashmap)
    {
        Boolean boolean1;
        if (!a.isEnabled())
        {
            boolean1 = Boolean.FALSE;
        } else
        {
            boolean1 = Boolean.FALSE;
            if (f == StreamSenseState.IDLE)
            {
                h.i();
                h.reset();
                h.getClip().reset();
                h.a(Utils.mapOfStrings(hashmap), null);
                return Boolean.TRUE;
            }
        }
        return boolean1;
    }
}
