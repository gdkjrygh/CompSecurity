// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import com.comscore.utils.Utils;
import java.util.HashMap;
import java.util.Set;

// Referenced classes of package com.comscore.streaming:
//            StreamSenseEventType, StreamSenseState, StreamSenseUtils

public class StreamSenseClip
{

    HashMap a;
    private int b;
    private int c;
    private long d;
    private long e;
    private long f;
    private long g;
    private String h;

    public StreamSenseClip()
    {
        a = new HashMap();
        reset();
    }

    private void a(String s, HashMap hashmap)
    {
        hashmap = (String)hashmap.get(s);
        if (hashmap != null)
        {
            a.put(s, hashmap);
        }
    }

    protected int a()
    {
        return b;
    }

    protected HashMap a(StreamSenseEventType streamsenseeventtype, HashMap hashmap)
    {
        if (hashmap == null)
        {
            hashmap = new HashMap();
        }
        hashmap.put("ns_st_cn", getClipId());
        hashmap.put("ns_st_bt", String.valueOf(e()));
        if (streamsenseeventtype == StreamSenseEventType.PLAY || streamsenseeventtype == null)
        {
            hashmap.put("ns_st_sq", String.valueOf(c));
        }
        if (streamsenseeventtype == StreamSenseEventType.PAUSE || streamsenseeventtype == StreamSenseEventType.END || streamsenseeventtype == StreamSenseEventType.KEEP_ALIVE || streamsenseeventtype == StreamSenseEventType.HEART_BEAT || streamsenseeventtype == null)
        {
            hashmap.put("ns_st_pt", String.valueOf(f()));
            hashmap.put("ns_st_pc", String.valueOf(b));
        }
        hashmap.putAll(getLabels());
        return hashmap;
    }

    protected void a(int i)
    {
        b = i;
    }

    protected void a(long l)
    {
        d = l;
    }

    protected void a(HashMap hashmap, StreamSenseState streamsensestate)
    {
        if (hashmap != null)
        {
            a.putAll(hashmap);
        }
        b(a, streamsensestate);
    }

    protected void b()
    {
        b = b + 1;
    }

    protected void b(int i)
    {
        c = i;
    }

    protected void b(long l)
    {
        f = l;
    }

    protected void b(HashMap hashmap, StreamSenseState streamsensestate)
    {
        String s = (String)hashmap.get("ns_st_cn");
        if (s != null)
        {
            setClipId(s);
            hashmap.remove("ns_st_cn");
        }
        s = (String)hashmap.get("ns_st_bt");
        if (s != null)
        {
            try
            {
                d = Long.parseLong(s);
                hashmap.remove("ns_st_bt");
            }
            catch (NumberFormatException numberformatexception2) { }
        }
        a("ns_st_cl", hashmap);
        a("ns_st_pn", hashmap);
        a("ns_st_tp", hashmap);
        a("ns_st_ub", hashmap);
        a("ns_st_br", hashmap);
        if (streamsensestate == StreamSenseState.PLAYING || streamsensestate == null)
        {
            String s1 = (String)hashmap.get("ns_st_sq");
            NumberFormatException numberformatexception;
            if (s1 != null)
            {
                try
                {
                    c = Integer.parseInt(s1);
                    hashmap.remove("ns_st_sq");
                }
                catch (NumberFormatException numberformatexception1) { }
            }
        }
        if (streamsensestate != StreamSenseState.BUFFERING)
        {
            s1 = (String)hashmap.get("ns_st_pt");
            if (s1 != null)
            {
                try
                {
                    f = Long.parseLong(s1);
                    hashmap.remove("ns_st_pt");
                }
                // Misplaced declaration of an exception variable
                catch (NumberFormatException numberformatexception) { }
            }
        }
        if (streamsensestate != StreamSenseState.PAUSED && streamsensestate != StreamSenseState.IDLE && streamsensestate != null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        streamsensestate = (String)hashmap.get("ns_st_pc");
        if (streamsensestate == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        b = Integer.parseInt(streamsensestate);
        hashmap.remove("ns_st_pc");
        return;
        hashmap;
    }

    protected int c()
    {
        return c;
    }

    protected void c(long l)
    {
        g = l;
    }

    protected void d()
    {
        c = c + 1;
    }

    protected void d(long l)
    {
        e = l;
    }

    protected long e()
    {
        long l1 = d;
        long l = l1;
        if (e >= 0L)
        {
            l = l1 + (System.currentTimeMillis() - e);
        }
        return l;
    }

    protected long f()
    {
        long l1 = f;
        long l = l1;
        if (g >= 0L)
        {
            l = l1 + (System.currentTimeMillis() - g);
        }
        return l;
    }

    protected long g()
    {
        return g;
    }

    public String getClipId()
    {
        if (Utils.isEmpty(h))
        {
            setClipId("1");
        }
        return h;
    }

    public String getLabel(String s)
    {
        return (String)a.get(s);
    }

    public HashMap getLabels()
    {
        return a;
    }

    protected long h()
    {
        return e;
    }

    public void reset()
    {
        reset(null);
    }

    public void reset(Set set)
    {
        if (set != null && !set.isEmpty())
        {
            StreamSenseUtils.filterMap(a, set);
        } else
        {
            a.clear();
        }
        if (!a.containsKey("ns_st_cl"))
        {
            a.put("ns_st_cl", "0");
        }
        if (!a.containsKey("ns_st_pn"))
        {
            a.put("ns_st_pn", "1");
        }
        if (!a.containsKey("ns_st_tp"))
        {
            a.put("ns_st_tp", "1");
        }
        a(0);
        b(0);
        a(0L);
        d(-1L);
        b(0L);
        c(-1L);
    }

    public void setClipId(String s)
    {
        h = s;
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
}
