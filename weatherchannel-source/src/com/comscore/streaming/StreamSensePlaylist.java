// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import com.comscore.utils.CSLog;
import java.util.HashMap;
import java.util.Set;

// Referenced classes of package com.comscore.streaming:
//            StreamSenseClip, StreamSenseEventType, StreamSenseState, StreamSenseUtils

public class StreamSensePlaylist
{

    private StreamSenseClip a;
    private String b;
    private int c;
    private int d;
    private int e;
    private long f;
    private long g;
    private HashMap h;
    private int i;
    private boolean j;

    public StreamSensePlaylist()
    {
        a = null;
        j = false;
        a = new StreamSenseClip();
        h = new HashMap();
        reset();
    }

    protected int a()
    {
        return c;
    }

    protected HashMap a(StreamSenseEventType streamsenseeventtype, HashMap hashmap)
    {
        if (hashmap == null)
        {
            hashmap = new HashMap();
        }
        hashmap.put("ns_st_bp", String.valueOf(c()));
        hashmap.put("ns_st_sp", String.valueOf(c));
        hashmap.put("ns_st_id", String.valueOf(b));
        if (e > 0)
        {
            hashmap.put("ns_st_bc", String.valueOf(e));
        }
        if (streamsenseeventtype == StreamSenseEventType.PAUSE || streamsenseeventtype == StreamSenseEventType.END || streamsenseeventtype == StreamSenseEventType.KEEP_ALIVE || streamsenseeventtype == StreamSenseEventType.HEART_BEAT || streamsenseeventtype == null)
        {
            hashmap.put("ns_st_pa", String.valueOf(d()));
            hashmap.put("ns_st_pp", String.valueOf(d));
        }
        if ((streamsenseeventtype == StreamSenseEventType.PLAY || streamsenseeventtype == null) && !j())
        {
            hashmap.put("ns_st_pb", "1");
            a(true);
        }
        hashmap.putAll(getLabels());
        return hashmap;
    }

    protected void a(int k)
    {
        c = k;
    }

    protected void a(long l)
    {
        CSLog.d(this, (new StringBuilder()).append("addPlaybackTime(").append(l).append(")").toString());
        if (a.g() >= 0L)
        {
            long l1 = l - a.g();
            a.c(-1L);
            a.b(a.f() + l1);
            d(d() + l1);
            CSLog.d(this, (new StringBuilder()).append("addPlaybackTime(").append(l).append(") ->").append(l1).toString());
        }
    }

    protected void a(HashMap hashmap, StreamSenseState streamsensestate)
    {
        if (hashmap != null)
        {
            h.putAll(hashmap);
        }
        b(h, streamsensestate);
    }

    protected void a(boolean flag)
    {
        j = flag;
    }

    protected void b()
    {
        c = c + 1;
    }

    protected void b(int k)
    {
        d = k;
    }

    protected void b(long l)
    {
        CSLog.d(this, (new StringBuilder()).append("addBufferingTime(").append(l).append(")").toString());
        if (a.h() >= 0L)
        {
            long l1 = l - a.h();
            a.d(-1L);
            a.a(a.e() + l1);
            c(c() + l1);
            CSLog.d(this, (new StringBuilder()).append("addBufferingTime(").append(l).append(") ->").append(l1).toString());
        }
    }

    protected void b(HashMap hashmap, StreamSenseState streamsensestate)
    {
        String s = (String)hashmap.get("ns_st_sp");
        if (s != null)
        {
            try
            {
                c = Integer.parseInt(s);
                hashmap.remove("ns_st_sp");
            }
            catch (NumberFormatException numberformatexception3) { }
        }
        s = (String)hashmap.get("ns_st_bc");
        if (s != null)
        {
            try
            {
                e = Integer.parseInt(s);
                hashmap.remove("ns_st_bc");
            }
            catch (NumberFormatException numberformatexception2) { }
        }
        s = (String)hashmap.get("ns_st_bp");
        if (s != null)
        {
            try
            {
                f = Long.parseLong(s);
                hashmap.remove("ns_st_bp");
            }
            catch (NumberFormatException numberformatexception1) { }
        }
        s = (String)hashmap.get("ns_st_id");
        if (s != null)
        {
            b = s;
            hashmap.remove("ns_st_id");
        }
        if (streamsensestate != StreamSenseState.BUFFERING)
        {
            String s1 = (String)hashmap.get("ns_st_pa");
            if (s1 != null)
            {
                try
                {
                    g = Long.parseLong(s1);
                    hashmap.remove("ns_st_pa");
                }
                catch (NumberFormatException numberformatexception) { }
            }
        }
        if (streamsensestate != StreamSenseState.PAUSED && streamsensestate != StreamSenseState.IDLE && streamsensestate != null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        streamsensestate = (String)hashmap.get("ns_st_pp");
        if (streamsensestate == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        d = Integer.parseInt(streamsensestate);
        hashmap.remove("ns_st_pp");
        return;
        hashmap;
    }

    protected long c()
    {
        long l1 = f;
        long l = l1;
        if (a.h() >= 0L)
        {
            l = l1 + (System.currentTimeMillis() - a.h());
        }
        return l;
    }

    protected void c(int k)
    {
        e = k;
    }

    protected void c(long l)
    {
        f = l;
    }

    protected long d()
    {
        long l1 = g;
        long l = l1;
        if (a.g() >= 0L)
        {
            l = l1 + (System.currentTimeMillis() - a.g());
        }
        return l;
    }

    protected void d(int k)
    {
        i = k;
    }

    protected void d(long l)
    {
        g = l;
    }

    protected int e()
    {
        return d;
    }

    protected void f()
    {
        d = d + 1;
        a.b();
    }

    protected int g()
    {
        return e;
    }

    public StreamSenseClip getClip()
    {
        return a;
    }

    public String getLabel(String s)
    {
        return (String)h.get(s);
    }

    public HashMap getLabels()
    {
        return h;
    }

    public String getPlaylistId()
    {
        return b;
    }

    protected void h()
    {
        e = e + 1;
    }

    protected void i()
    {
        i = i + 1;
    }

    protected boolean j()
    {
        return j;
    }

    public void reset()
    {
        reset(null);
    }

    public void reset(Set set)
    {
        if (set != null && !set.isEmpty())
        {
            StreamSenseUtils.filterMap(h, set);
        } else
        {
            h.clear();
        }
        setPlaylistId((new StringBuilder()).append(System.currentTimeMillis()).append("_").append(i).toString());
        c(0L);
        d(0L);
        b(0);
        a(0);
        c(0);
        j = false;
    }

    public void setLabel(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(s, s1);
        a(hashmap, ((StreamSenseState) (null)));
    }

    public void setLabels(HashMap hashmap)
    {
        a(hashmap, ((StreamSenseState) (null)));
    }

    public void setPlaylistId(String s)
    {
        b = s;
    }
}
