// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.weather.commons.video.FeedType;

// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsRecorder

class LocalyticsVideoRecorder extends LocalyticsRecorder
{

    LocalyticsVideoRecorder()
    {
    }

    private void recordClickMainFeedVideo(String s)
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoCommonTags.PREVIOUS_SCREEN, s);
        recordStartMethod(LocalyticsAttributeValues.AttributeValue.VIDEO_START_METHOD_MODULE_CLICK);
    }

    public void recordClickMainFeedVideo(String s, FeedType feedtype)
    {
        recordClickMainFeedVideo(s);
        static class _cls1
        {

            static final int $SwitchMap$com$weather$commons$video$FeedType[];

            static 
            {
                $SwitchMap$com$weather$commons$video$FeedType = new int[FeedType.values().length];
                try
                {
                    $SwitchMap$com$weather$commons$video$FeedType[FeedType.MUST_SEE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$commons$video$FeedType[FeedType.LOCAL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$commons$video$FeedType[FeedType.ON_TV.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.weather.commons.video.FeedType[feedtype.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 67
    //                   2 77
    //                   3 84;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown feed type: ").append(feedtype).toString());
_L2:
        s = LocalyticsVideoTags.VideoDetailsTagName.VIDEO_CATEGORY_MUST_SEE;
_L6:
        incrementValue(s);
        return;
_L3:
        s = LocalyticsVideoTags.VideoDetailsTagName.VIDEO_CATEGORY_LOCAL;
        continue; /* Loop/switch isn't completed */
_L4:
        s = LocalyticsVideoTags.VideoDetailsTagName.VIDEO_CATEGORY_ON_TV;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void recordStartMethod(LocalyticsAttributeValues.AttributeValue attributevalue)
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_START_METHOD, attributevalue.getAttributeValue());
    }

    public void recordVideoDeeplink()
    {
        setPreviousScreenTag(LocalyticsTags.ScreenName.DEEP_LINK.getName());
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_START_METHOD, LocalyticsAttributeValues.AttributeValue.VIDEO_START_METHOD_DEEP_LINK.getAttributeValue());
    }

    public void recordVideoResume()
    {
        setPreviousScreenTag(LocalyticsTags.ScreenName.PAUSED.getName());
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_START_METHOD, LocalyticsAttributeValues.AttributeValue.VIDEO_START_METHOD_RESUMED.getAttributeValue());
    }

    public void setPreviousScreenTag(LocalyticsTags.ScreenName screenname)
    {
        setPreviousScreenTag(screenname.getName());
    }

    public void setPreviousScreenTag(String s)
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoCommonTags.PREVIOUS_SCREEN, s);
    }
}
