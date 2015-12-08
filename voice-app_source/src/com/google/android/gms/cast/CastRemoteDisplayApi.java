// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface CastRemoteDisplayApi
{

    public abstract PendingResult startRemoteDisplay(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult stopRemoteDisplay(GoogleApiClient googleapiclient);
}
