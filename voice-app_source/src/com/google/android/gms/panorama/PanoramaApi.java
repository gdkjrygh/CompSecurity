// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.panorama;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

public interface PanoramaApi
{
    public static interface PanoramaResult
        extends Result
    {

        public abstract Intent getViewerIntent();
    }


    public abstract PendingResult loadPanoramaInfo(GoogleApiClient googleapiclient, Uri uri);

    public abstract PendingResult loadPanoramaInfoAndGrantAccess(GoogleApiClient googleapiclient, Uri uri);
}
