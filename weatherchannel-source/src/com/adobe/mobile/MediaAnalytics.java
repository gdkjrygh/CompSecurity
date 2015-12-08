// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.adobe.mobile:
//            MediaItem, MediaState, StaticMethods, AnalyticsTrackInternal, 
//            MediaSettings

final class MediaAnalytics
{

    private static final String AD_CLICKED_KEY = "a.media.ad.clicked";
    private static final String AD_COMPLETE_KEY = "a.media.ad.complete";
    private static final String AD_CPM = "a.media.ad.CPM";
    private static final String AD_LENGTH_KEY = "a.media.ad.length";
    private static final String AD_MILESTONE_KEY = "a.media.ad.milestone";
    private static final String AD_NAME_KEY = "a.media.ad.name";
    private static final String AD_OFFSET_MILESTONE_KEY = "a.media.ad.offsetMilestone";
    private static final String AD_PLAYER_NAME_KEY = "a.media.ad.playerName";
    private static final String AD_POD = "a.media.ad.pod";
    private static final String AD_POD_POSITION = "a.media.ad.podPosition";
    private static final String AD_SEGMENT_KEY = "a.media.ad.segment";
    private static final String AD_SEGMENT_NUM_KEY = "a.media.ad.segmentNum";
    private static final String AD_SEGMENT_VIEW_KEY = "a.media.ad.segmentView";
    private static final String AD_TIME_PLAYED_KEY = "a.media.ad.timePlayed";
    private static final String AD_VIEW_KEY = "a.media.ad.view";
    private static final String CHANNEL_KEY = "a.media.channel";
    private static final String COMPLETE_KEY = "a.media.complete";
    private static final String CONTENT_TYPE_KEY = "a.contentType";
    private static final String CONTENT_TYPE_VALUE = "video";
    private static final String CONTENT_TYPE_VALUE_AD = "videoAd";
    private static final String DEFAULT_PLAYER_NAME = "Not_Specified";
    private static final String INITIAL_HIT_PAGE_EVENT = "m_s";
    private static final String LENGTH_KEY = "a.media.length";
    protected static final double LIVE_EVENT_LENGTH = -1D;
    private static final String MEDIA_CLICKED_KEY = "a.media.clicked";
    private static final String MEDIA_HIT_PAGE_EVENT = "m_i";
    private static final String MEDIA_VIEW_KEY = "a.media.view";
    private static final String MILESTONE_KEY = "a.media.milestone";
    private static final String NAME_KEY = "a.media.name";
    private static final String OFFSET_MILESTONE_KEY = "a.media.offsetMilestone";
    private static final String PAGE_EVENT_VAR_OVERRIDE = "&&pe";
    private static final String PEV_VALUE_OVERRIDE = "video";
    private static final String PEV_VALUE_OVERRIDE_AD = "videoAd";
    private static final String PEV_VAR_OVERRIDE = "&&pev3";
    private static final String PLAYER_NAME_KEY = "a.media.playerName";
    private static final String SEGMENT_KEY = "a.media.segment";
    private static final String SEGMENT_NUM_KEY = "a.media.segmentNum";
    private static final String SEGMENT_VIEW_KEY = "a.media.segmentView";
    private static final String TIME_PLAYED_KEY = "a.media.timePlayed";
    private static MediaAnalytics _instance = null;
    private static final Object _instanceMutex = new Object();
    private static final List unwantedValues = Arrays.asList(new String[] {
        null, ""
    });
    protected int completeCloseOffsetThreshold;
    private final HashMap mediaItemList = new HashMap();
    protected int trackSeconds;

    MediaAnalytics()
    {
        trackSeconds = 0;
        completeCloseOffsetThreshold = 1;
    }

    private void addGenericMediaContextData(HashMap hashmap, MediaItem mediaitem, boolean flag)
    {
        String s;
        if (flag)
        {
            s = "m_s";
        } else
        {
            s = "m_i";
        }
        hashmap.put("&&pe", s);
        if (!mediaitem.mediaAd || isNilOrEmptyString(mediaitem.parentName)) goto _L2; else goto _L1
_L1:
        hashmap.put("&&pev3", "videoAd");
        hashmap.put("a.contentType", "videoAd");
        hashmap.put("a.media.ad.name", mediaitem.getName());
        hashmap.put("a.media.ad.playerName", mediaitem.getPlayerName());
        hashmap.put("a.media.name", cleanName(mediaitem.parentName));
        if (!mediaitem.isLive())
        {
            hashmap.put("a.media.ad.length", Integer.toString((int)mediaitem.getLength()));
        }
        if (mediaitem.parentPod != null && mediaitem.parentPod.length() > 0)
        {
            hashmap.put("a.media.ad.pod", mediaitem.parentPod);
        }
        if (mediaitem.parentPodPosition > 0.0D)
        {
            hashmap.put("a.media.ad.podPosition", Integer.toString((int)mediaitem.parentPodPosition));
        }
        if (flag && !isNilOrEmptyString(mediaitem.CPM))
        {
            hashmap.put("a.media.ad.CPM", mediaitem.CPM);
        }
_L4:
        if (!isNilOrEmptyString(mediaitem.channel))
        {
            hashmap.put("a.media.channel", mediaitem.channel);
        }
        return;
_L2:
        hashmap.put("&&pev3", "video");
        hashmap.put("a.contentType", "video");
        hashmap.put("a.media.name", mediaitem.getName());
        hashmap.put("a.media.playerName", mediaitem.getPlayerName());
        if (!mediaitem.isLive())
        {
            hashmap.put("a.media.length", Integer.toString((int)mediaitem.getLength()));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void addSegmentContextData(HashMap hashmap, MediaItem mediaitem)
    {
        if (mediaitem.isSegmentByMilestones() || mediaitem.isSegmentByOffsetMilestones())
        {
            Object obj1 = mediaitem.currentMediaState;
            Object obj = obj1;
            if (mediaitem.previousMediaState != null)
            {
                if (mediaitem.currentMediaState.segmentNum != mediaitem.lastTrackSegmentNumber || mediaitem.currentMediaState.complete)
                {
                    if (!mediaitem.mediaAd)
                    {
                        obj = "a.media.segmentView";
                    } else
                    {
                        obj = "a.media.ad.segmentView";
                    }
                    hashmap.put(obj, String.valueOf(true));
                }
                obj = obj1;
                if (mediaitem.currentMediaState.segmentNum != mediaitem.previousMediaState.segmentNum)
                {
                    obj = mediaitem.previousMediaState;
                }
            }
            if (((MediaState) (obj)).segmentNum > 0)
            {
                if (!mediaitem.mediaAd)
                {
                    obj1 = "a.media.segmentNum";
                } else
                {
                    obj1 = "a.media.ad.segmentNum";
                }
                hashmap.put(obj1, Integer.toString(((MediaState) (obj)).segmentNum));
            }
            if (((MediaState) (obj)).segment != null)
            {
                if (!mediaitem.mediaAd)
                {
                    obj1 = "a.media.segment";
                } else
                {
                    obj1 = "a.media.ad.segment";
                }
                hashmap.put(obj1, ((MediaState) (obj)).segment);
            }
        }
        mediaitem.lastTrackSegmentNumber = mediaitem.currentMediaState.segmentNum;
    }

    private String cleanName(String s)
    {
        if (isNilOrEmptyString(s))
        {
            return null;
        } else
        {
            return s.replace("\n", "").replace("\r", "").replace("--**--", "");
        }
    }

    private boolean hashMapIsNullOrEmpty(HashMap hashmap)
    {
        return hashmap == null || hashmap.size() == 0;
    }

    private boolean isNilOrEmptyString(String s)
    {
        return s == null || s.trim().length() == 0;
    }

    private MediaItem mediaItemWithName(String s)
    {
        s = cleanName(s);
        if (isNilOrEmptyString(s) || hashMapIsNullOrEmpty(mediaItemList))
        {
            return null;
        } else
        {
            return (MediaItem)mediaItemList.get(s);
        }
    }

    private void notifyDelegateOfMediaState(MediaItem mediaitem)
    {
        if (mediaitem.callback != null)
        {
            mediaitem.callback.call(mediaitem.getReportMediaState());
        }
    }

    private void removeEmptyValues(HashMap hashmap)
    {
        hashmap.values().removeAll(unwantedValues);
    }

    private void removeMediaItemIfComplete(MediaItem mediaitem)
    {
        if (mediaitem.currentMediaState.percent >= 100D)
        {
            mediaItemList.remove(mediaitem.name);
        }
    }

    protected static MediaAnalytics sharedInstance()
    {
        MediaAnalytics mediaanalytics;
        synchronized (_instanceMutex)
        {
            if (_instance == null)
            {
                _instance = new MediaAnalytics();
            }
            mediaanalytics = _instance;
        }
        return mediaanalytics;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void trackMedia(HashMap hashmap)
    {
        AnalyticsTrackInternal.trackInternal("Media", hashmap, StaticMethods.getTimeSince1970());
    }

    private void trackMediaItemWithContextData(MediaItem mediaitem, HashMap hashmap)
    {
        trackMedia(hashmap);
        mediaitem.currentMediaState.setTimePlayedSinceTrack(0.0D);
    }

    private void trackMediaStateIfNecessary(MediaItem mediaitem, HashMap hashmap, boolean flag)
    {
        if (hashmap != null)
        {
            hashmap = new HashMap(hashmap);
        } else
        {
            hashmap = new HashMap();
        }
        addGenericMediaContextData(hashmap, mediaitem, false);
        addSegmentContextData(hashmap, mediaitem);
        if (mediaitem.previousMediaState == null)
        {
            hashmap.put("&&pe", "m_s");
            String s;
            if (!mediaitem.mediaAd)
            {
                s = "a.media.view";
            } else
            {
                s = "a.media.ad.view";
            }
            hashmap.put(s, Boolean.valueOf(true));
            trackMediaItemWithContextData(mediaitem, hashmap);
        } else
        {
            boolean flag1 = flag;
            String s1;
            if (mediaitem.currentMediaState.complete)
            {
                if (!mediaitem.isCompleteTracked())
                {
                    if (!mediaitem.mediaAd)
                    {
                        s1 = "a.media.complete";
                    } else
                    {
                        s1 = "a.media.ad.complete";
                    }
                    hashmap.put(s1, String.valueOf(true));
                    mediaitem.setCompleteTracked(true);
                    flag = true;
                }
                removeMediaItemIfComplete(mediaitem);
                flag1 = flag;
            }
            if (mediaitem.currentMediaState.clicked)
            {
                if (!mediaitem.mediaAd)
                {
                    s1 = "a.media.clicked";
                } else
                {
                    s1 = "a.media.ad.clicked";
                }
                hashmap.put(s1, String.valueOf(true));
            }
            flag = flag1;
            if (mediaitem.currentMediaState.offsetMilestone > mediaitem.previousMediaState.offsetMilestone)
            {
                if (!mediaitem.mediaAd)
                {
                    s1 = "a.media.offsetMilestone";
                } else
                {
                    s1 = "a.media.ad.offsetMilestone";
                }
                hashmap.put(s1, Integer.toString(mediaitem.currentMediaState.offsetMilestone));
                flag = true;
            }
            if (mediaitem.currentMediaState.milestone > mediaitem.previousMediaState.milestone)
            {
                if (!mediaitem.mediaAd)
                {
                    s1 = "a.media.milestone";
                } else
                {
                    s1 = "a.media.ad.milestone";
                }
                hashmap.put(s1, Integer.toString(mediaitem.currentMediaState.milestone));
                flag = true;
            }
            flag1 = flag;
            if (mediaitem.getTrackSecondsThreshold() > 0)
            {
                flag1 = flag;
                if (mediaitem.currentMediaState.getTimePlayedSinceTrack() >= (double)mediaitem.getTrackSecondsThreshold())
                {
                    flag1 = true;
                }
            }
            if (flag1)
            {
                if (mediaitem.currentMediaState.getTimePlayedSinceTrack() > 0.0D)
                {
                    if (!mediaitem.mediaAd)
                    {
                        s1 = "a.media.timePlayed";
                    } else
                    {
                        s1 = "a.media.ad.timePlayed";
                    }
                    hashmap.put(s1, Integer.toString((int)mediaitem.currentMediaState.getTimePlayedSinceTrack()));
                }
                trackMediaItemWithContextData(mediaitem, hashmap);
                return;
            }
        }
    }

    private void trackMediaViewed(MediaItem mediaitem)
    {
        HashMap hashmap = new HashMap();
        String s;
        if (!mediaitem.mediaAd)
        {
            s = "a.media.view";
        } else
        {
            s = "a.media.ad.view";
        }
        hashmap.put(s, String.valueOf(true));
        addGenericMediaContextData(hashmap, mediaitem, true);
        addSegmentContextData(hashmap, mediaitem);
        trackMediaItemWithContextData(mediaitem, hashmap);
        removeMediaItemIfComplete(mediaitem);
    }

    protected void click(String s, double d)
    {
        this;
        JVM INSTR monitorenter ;
        s = mediaItemWithName(s);
        if (s == null) goto _L2; else goto _L1
_L1:
        boolean flag = s.isPlaying();
        if (flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        s.trackCalled = false;
        s.click(d);
        notifyDelegateOfMediaState(s);
        if (!((MediaItem) (s)).trackCalled && ((MediaItem) (s)).previousMediaState != null)
        {
            trackMediaStateIfNecessary(s, null, true);
        }
        if (true) goto _L2; else goto _L4
_L4:
        s;
        throw s;
    }

    protected final Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    protected void close(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = mediaItemWithName(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        s.trackCalled = false;
        s.close();
        notifyDelegateOfMediaState(s);
        if (((MediaItem) (s)).trackCalled)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (((MediaItem) (s)).currentMediaState.getTimePlayed() > 0.0D)
        {
            trackMediaStateIfNecessary(s, null, true);
        }
        mediaItemList.remove(((MediaItem) (s)).name);
          goto _L1
        s;
        throw s;
        s.itemClosed = true;
          goto _L1
    }

    protected void complete(String s, double d)
    {
        this;
        JVM INSTR monitorenter ;
        s = mediaItemWithName(s);
        if (s == null) goto _L2; else goto _L1
_L1:
        boolean flag = s.isPlaying();
        if (flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        s.trackCalled = false;
        s.complete(d);
        notifyDelegateOfMediaState(s);
        if (!((MediaItem) (s)).trackCalled && ((MediaItem) (s)).previousMediaState != null)
        {
            trackMediaStateIfNecessary(s, null, false);
        }
        if (true) goto _L2; else goto _L4
_L4:
        s;
        throw s;
    }

    protected void monitor(String s, double d)
    {
        this;
        JVM INSTR monitorenter ;
        s = mediaItemWithName(s);
        if (s == null) goto _L2; else goto _L1
_L1:
        boolean flag = s.isPlaying();
        if (flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!((MediaItem) (s)).trackCalled)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s.trackCalled = false;
          goto _L2
        s;
        throw s;
        s.monitor(d);
        notifyDelegateOfMediaState(s);
        if (((MediaItem) (s)).previousMediaState != null && !((MediaItem) (s)).trackCalled)
        {
            trackMediaStateIfNecessary(s, null, false);
        }
          goto _L2
    }

    protected void open(MediaSettings mediasettings, Media.MediaCallback mediacallback)
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = cleanName(mediasettings.name);
        if (!isNilOrEmptyString(s1)) goto _L2; else goto _L1
_L1:
        StaticMethods.logWarningFormat("Analytics - ADBMediaSettings is required with a valid name. Media item not opened", new Object[0]);
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!mediasettings.isMediaAd || !isNilOrEmptyString(mediasettings.parentName))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        StaticMethods.logWarningFormat("Analytics - Media ad requires parent name, please specify a parent name. Media item not opened", new Object[0]);
          goto _L3
        mediasettings;
        throw mediasettings;
        double d;
        if (mediasettings.length <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        d = mediasettings.length;
_L9:
        if (!isNilOrEmptyString(mediasettings.playerName)) goto _L5; else goto _L4
_L4:
        String s = "Not_Specified";
_L8:
        Iterator iterator;
        if (mediaItemList.containsKey(s1))
        {
            close(s1);
        }
        if (isNilOrEmptyString(mediasettings.playerID))
        {
            break MISSING_BLOCK_LABEL_204;
        }
        iterator = mediaItemList.keySet().iterator();
_L7:
        String s2;
        String s3;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_204;
            }
            s2 = (String)iterator.next();
            s3 = ((MediaItem)mediaItemList.get(s2)).getPlayerID();
        } while (s3 == null);
        if (!s3.equals(mediasettings.playerID)) goto _L7; else goto _L6
_L6:
        close(s2);
        mediasettings = new MediaItem(mediasettings, this, s1, d, s);
        mediasettings.callback = mediacallback;
        mediaItemList.put(s1, mediasettings);
          goto _L3
_L5:
        s = cleanName(mediasettings.playerName);
          goto _L8
        d = -1D;
          goto _L9
    }

    protected void play(String s, double d)
    {
        this;
        JVM INSTR monitorenter ;
        s = mediaItemWithName(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        s.trackCalled = false;
        s.play(d);
        notifyDelegateOfMediaState(s);
        if (!((MediaItem) (s)).trackCalled)
        {
            if (((MediaItem) (s)).previousMediaState != null)
            {
                break; /* Loop/switch isn't completed */
            }
            trackMediaViewed(s);
        }
_L4:
        s.trackCalled = false;
        removeMediaItemIfComplete(s);
        if (true) goto _L1; else goto _L3
        s;
        throw s;
_L3:
label0:
        {
            if (((MediaItem) (s)).currentMediaState.segmentNum == ((MediaItem) (s)).lastTrackSegmentNumber || ((MediaItem) (s)).currentMediaState.timePlayed <= 0.0D)
            {
                break label0;
            }
            trackMediaStateIfNecessary(s, null, true);
        }
          goto _L4
        trackMediaStateIfNecessary(s, null, false);
          goto _L4
    }

    protected void setTrackCalledOnItem(String s)
    {
        s = mediaItemWithName(s);
        if (s == null)
        {
            return;
        } else
        {
            s.trackCalled = true;
            return;
        }
    }

    protected void stop(String s, double d)
    {
        this;
        JVM INSTR monitorenter ;
        s = mediaItemWithName(s);
        if (s == null) goto _L2; else goto _L1
_L1:
        boolean flag = s.isPlaying();
        if (flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        s.trackCalled = false;
        s.stop(d);
        notifyDelegateOfMediaState(s);
        if (!((MediaItem) (s)).trackCalled && ((MediaItem) (s)).previousMediaState != null)
        {
            trackMediaStateIfNecessary(s, null, false);
        }
        if (true) goto _L2; else goto _L4
_L4:
        s;
        throw s;
    }

    protected void track(String s, Map map)
    {
        this;
        JVM INSTR monitorenter ;
        MediaItem mediaitem = mediaItemWithName(s);
        if (mediaitem != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (mediaitem.currentMediaState == null) goto _L4; else goto _L3
_L3:
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s = new HashMap(map);
_L5:
        removeEmptyValues(s);
        trackMediaStateIfNecessary(mediaitem, s, true);
_L4:
        if (mediaitem.itemClosed)
        {
            mediaItemList.remove(mediaitem.name);
        }
        mediaitem.trackCalled = false;
          goto _L1
        s;
        throw s;
        s = new HashMap();
          goto _L5
    }

}
