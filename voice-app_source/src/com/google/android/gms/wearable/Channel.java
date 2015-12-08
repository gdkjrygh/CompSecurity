// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.io.InputStream;
import java.io.OutputStream;

public interface Channel
    extends Parcelable
{
    public static interface GetInputStreamResult
        extends Releasable, Result
    {

        public abstract InputStream getInputStream();
    }

    public static interface GetOutputStreamResult
        extends Releasable, Result
    {

        public abstract OutputStream getOutputStream();
    }


    public abstract PendingResult addListener(GoogleApiClient googleapiclient, ChannelApi.ChannelListener channellistener);

    public abstract PendingResult close(GoogleApiClient googleapiclient);

    public abstract PendingResult close(GoogleApiClient googleapiclient, int i);

    public abstract PendingResult getInputStream(GoogleApiClient googleapiclient);

    public abstract String getNodeId();

    public abstract PendingResult getOutputStream(GoogleApiClient googleapiclient);

    public abstract String getPath();

    public abstract PendingResult receiveFile(GoogleApiClient googleapiclient, Uri uri, boolean flag);

    public abstract PendingResult removeListener(GoogleApiClient googleapiclient, ChannelApi.ChannelListener channellistener);

    public abstract PendingResult sendFile(GoogleApiClient googleapiclient, Uri uri);

    public abstract PendingResult sendFile(GoogleApiClient googleapiclient, Uri uri, long l, long l1);
}
