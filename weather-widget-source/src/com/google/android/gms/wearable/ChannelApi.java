// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.gms.wearable:
//            Channel

public interface ChannelApi
{
    public static interface ChannelListener
    {

        public static final int CLOSE_REASON_DISCONNECTED = 1;
        public static final int CLOSE_REASON_LOCAL_CLOSE = 3;
        public static final int CLOSE_REASON_NORMAL = 0;
        public static final int CLOSE_REASON_REMOTE_CLOSE = 2;

        public abstract void onChannelClosed(Channel channel, int i, int j);

        public abstract void onChannelOpened(Channel channel);

        public abstract void onInputClosed(Channel channel, int i, int j);

        public abstract void onOutputClosed(Channel channel, int i, int j);
    }

    public static interface CloseReason
        extends Annotation
    {
    }

    public static interface OpenChannelResult
        extends Result
    {

        public abstract Channel getChannel();
    }


    public abstract PendingResult addListener(GoogleApiClient googleapiclient, ChannelListener channellistener);

    public abstract PendingResult openChannel(GoogleApiClient googleapiclient, String s, String s1);

    public abstract PendingResult removeListener(GoogleApiClient googleapiclient, ChannelListener channellistener);
}
