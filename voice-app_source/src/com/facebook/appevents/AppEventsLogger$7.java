// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

class val.flushState
    implements com.facebook.ack
{

    private final cessTokenAppIdPair val$accessTokenAppId;
    private final ushStatistics val$flushState;
    private final GraphRequest val$postRequest;
    private final ssionEventsState val$sessionEventsState;

    public void onCompleted(GraphResponse graphresponse)
    {
        AppEventsLogger.access$10(val$accessTokenAppId, val$postRequest, graphresponse, val$sessionEventsState, val$flushState);
    }

    ushStatistics()
    {
        val$accessTokenAppId = cesstokenappidpair;
        val$postRequest = graphrequest;
        val$sessionEventsState = ssioneventsstate;
        val$flushState = ushstatistics;
        super();
    }
}
