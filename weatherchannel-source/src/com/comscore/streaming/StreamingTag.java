// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import com.comscore.utils.Date;
import com.comscore.utils.Utils;
import java.util.HashMap;

// Referenced classes of package com.comscore.streaming:
//            p, StreamSense, StreamSenseState, StreamSenseEventType, 
//            StreamSenseClip

public class StreamingTag
{

    private StreamSense a;
    private long b;
    private long c;
    private int d;
    private HashMap e;
    private p f;
    private boolean g;

    public StreamingTag()
    {
        d = 0;
        b = 0L;
        c = 0L;
        e = null;
        g = false;
        f = p.None;
        a = new StreamSense();
        a.setLabel("ns_st_it", "r");
    }

    private HashMap a(HashMap hashmap)
    {
        hashmap = Utils.mapOfStrings(hashmap);
        if (!hashmap.containsKey("ns_st_ci"))
        {
            hashmap.put("ns_st_ci", "0");
        }
        if (!hashmap.containsKey("c3"))
        {
            hashmap.put("c3", "*null");
        }
        if (!hashmap.containsKey("c4"))
        {
            hashmap.put("c4", "*null");
        }
        if (!hashmap.containsKey("c6"))
        {
            hashmap.put("c6", "*null");
        }
        return hashmap;
    }

    private void a(long l)
    {
        if (a.getState() != StreamSenseState.IDLE && a.getState() != StreamSenseState.PAUSED)
        {
            a.notify(StreamSenseEventType.END, b(l));
        } else
        if (a.getState() == StreamSenseState.PAUSED)
        {
            a.notify(StreamSenseEventType.END, c);
            return;
        }
    }

    private void a(long l, HashMap hashmap)
    {
        a(l);
        d = d + 1;
        if (!hashmap.containsKey("ns_st_cn"))
        {
            hashmap.put("ns_st_cn", String.valueOf(d));
        }
        if (!hashmap.containsKey("ns_st_pn"))
        {
            hashmap.put("ns_st_pn", "1");
        }
        if (!hashmap.containsKey("ns_st_tp"))
        {
            hashmap.put("ns_st_tp", "0");
        }
        a.setClip(hashmap);
        e = hashmap;
        b = l;
        c = 0L;
        a.notify(StreamSenseEventType.PLAY, c);
    }

    private void a(HashMap hashmap, p p1)
    {
        long l;
        l = Date.unixTime();
        hashmap = a(Utils.mapOfStrings(hashmap));
        if (f == p.None)
        {
            f = p1;
        }
        if (!g || f != p1) goto _L2; else goto _L1
_L1:
        if (c(hashmap)) goto _L4; else goto _L3
_L3:
        a(l, hashmap);
_L6:
        g = true;
        f = p1;
        return;
_L4:
        a.getClip().setLabels(hashmap);
        if (a.getState() != StreamSenseState.PLAYING)
        {
            b = l;
            a.notify(StreamSenseEventType.PLAY, c);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        a(l, hashmap);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean a(String s, HashMap hashmap, HashMap hashmap1)
    {
        boolean flag1 = true;
        if (s != null)
        {
            boolean flag;
            if (hashmap != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (hashmap1 == null)
            {
                flag1 = false;
            }
            if (flag1 & flag)
            {
                hashmap = (String)hashmap.get(s);
                s = (String)hashmap1.get(s);
                if (hashmap != null && s != null)
                {
                    return hashmap.equals(s);
                }
            }
        }
        return false;
    }

    private long b(long l)
    {
        if (b > 0L && l >= b)
        {
            c = c + (l - b);
        } else
        {
            c = 0L;
        }
        return c;
    }

    private void b(HashMap hashmap)
    {
        long l = Date.unixTime();
        a(l);
        d = d + 1;
        hashmap = a(Utils.mapOfStrings(hashmap));
        if (!hashmap.containsKey("ns_st_cn"))
        {
            hashmap.put("ns_st_cn", String.valueOf(d));
        }
        if (!hashmap.containsKey("ns_st_pn"))
        {
            hashmap.put("ns_st_pn", "1");
        }
        if (!hashmap.containsKey("ns_st_tp"))
        {
            hashmap.put("ns_st_tp", "1");
        }
        if (!hashmap.containsKey("ns_st_ad"))
        {
            hashmap.put("ns_st_ad", "1");
        }
        a.setClip(hashmap);
        c = 0L;
        a.notify(StreamSenseEventType.PLAY, c);
        b = l;
        g = false;
    }

    private boolean c(HashMap hashmap)
    {
        hashmap = a(Utils.mapOfStrings(hashmap));
        return a("ns_st_ci", e, hashmap) && a("c3", e, hashmap) && a("c4", e, hashmap) && a("c6", e, hashmap);
    }

    public void playAdvertisement()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("ns_st_ct", "va");
        b(hashmap);
    }

    public void playAudioAdvertisement()
    {
        playAudioAdvertisement(new HashMap());
    }

    public void playAudioAdvertisement(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        if (hashmap != null)
        {
            hashmap1.putAll(hashmap);
        }
        if (!hashmap1.containsKey("ns_st_ct"))
        {
            hashmap1.put("ns_st_ct", "aa");
        }
        b(hashmap1);
    }

    public void playAudioContentPart(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        if (hashmap != null)
        {
            hashmap1.putAll(hashmap);
        }
        if (!hashmap1.containsKey("ns_st_ct"))
        {
            hashmap1.put("ns_st_ct", "ac");
        }
        a(hashmap1, p.AudioContent);
    }

    public void playContentPart(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        if (hashmap != null)
        {
            hashmap1.putAll(hashmap);
        }
        if (!hashmap1.containsKey("ns_st_ct"))
        {
            hashmap1.put("ns_st_ct", "vc");
        }
        a(hashmap1, p.VideoContent);
    }

    public void playVideoAdvertisement()
    {
        playVideoAdvertisement(new HashMap());
    }

    public void playVideoAdvertisement(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        if (hashmap != null)
        {
            hashmap1.putAll(hashmap);
        }
        if (!hashmap1.containsKey("ns_st_ct"))
        {
            hashmap1.put("ns_st_ct", "va");
        }
        b(hashmap1);
    }

    public void playVideoContentPart(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        if (hashmap != null)
        {
            hashmap1.putAll(hashmap);
        }
        if (!hashmap1.containsKey("ns_st_ct"))
        {
            hashmap1.put("ns_st_ct", "vc");
        }
        a(hashmap1, p.VideoContent);
    }

    public void stop()
    {
        long l = Date.unixTime();
        a.notify(StreamSenseEventType.PAUSE, b(l));
    }
}
