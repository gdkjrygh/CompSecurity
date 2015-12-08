// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming.plugin;

import android.media.MediaPlayer;
import com.comscore.streaming.StreamSenseClip;
import com.comscore.streaming.StreamSenseEventType;
import com.comscore.streaming.StreamSenseState;
import com.comscore.utils.CSLog;
import com.comscore.utils.Utils;
import java.util.HashMap;

// Referenced classes of package com.comscore.streaming.plugin:
//            StreamSensePlugin, StreamSensePlayer, StreamSensePluginListener, a

public class StreamSenseMediaPlayerPlugin extends StreamSensePlugin
    implements StreamSensePlayer, StreamSensePluginListener
{

    private static final String b = "MediaPlayer";
    private static final String c = "4.1404.10";
    private static final String d;
    private MediaPlayer e;

    public StreamSenseMediaPlayerPlugin(MediaPlayer mediaplayer)
    {
        super("MediaPlayer", "4.1404.10", d);
        e = null;
        e = mediaplayer;
        setPlayer(this);
        addListener(this);
        setSmartStateDetection(true);
        setDetectPlay(true);
        setDetectPause(true);
        setDetectSeek(true);
        setDetectEnd(true);
        startSmartStateDetection();
        setLabel("ns_st_it", "c");
        setLabel("ns_st_pn", "1");
        setLabel("ns_st_tp", "1");
    }

    public long getDuration()
    {
        long l = -1L;
        if (e != null)
        {
            l = e.getDuration();
        }
        return l;
    }

    public long getPosition()
    {
        long l = -1L;
        if (e != null)
        {
            int i;
            try
            {
                i = e.getCurrentPosition();
            }
            catch (IllegalStateException illegalstateexception)
            {
                return -1L;
            }
            l = i;
        }
        return l;
    }

    public void onGetLabels(StreamSenseEventType streamsenseeventtype, HashMap hashmap)
    {
        CSLog.d(this, (new StringBuilder()).append("onGetLabels: ").append(streamsenseeventtype).toString());
        long l = Utils.getLong(getClip().getLabel("ns_st_cl"));
        if (e != null && l <= 0L)
        {
            getClip().setLabel("ns_st_cl", String.valueOf(e.getDuration()));
        }
        streamsenseeventtype = getClip().getLabel("ns_st_cs");
        if (e != null && (streamsenseeventtype == null || streamsenseeventtype.equals("0x0")))
        {
            getClip().setLabel("ns_st_cs", (new StringBuilder()).append(e.getVideoWidth()).append("x").append(e.getVideoHeight()).toString());
        }
    }

    public void onPostStateChange(StreamSenseState streamsensestate)
    {
        CSLog.d(this, (new StringBuilder()).append("onPostStateChange = ").append(streamsensestate).toString());
        switch (a.a[streamsensestate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            stopSmartStateDetection();
            break;
        }
    }

    public void onPreStateChange(StreamSenseState streamsensestate)
    {
        CSLog.d(this, (new StringBuilder()).append("onPreStateChange = ").append(streamsensestate).toString());
    }

    public void release()
    {
        notify(StreamSenseEventType.END, getPosition());
        stopSmartStateDetection();
    }

    static 
    {
        d = String.valueOf(android.os.Build.VERSION.SDK_INT);
    }
}
