// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRequest;

public interface SensorsApi
{

    public abstract PendingResult add(GoogleApiClient googleapiclient, SensorRequest sensorrequest, PendingIntent pendingintent);

    public abstract PendingResult add(GoogleApiClient googleapiclient, SensorRequest sensorrequest, OnDataPointListener ondatapointlistener);

    public abstract PendingResult findDataSources(GoogleApiClient googleapiclient, DataSourcesRequest datasourcesrequest);

    public abstract PendingResult remove(GoogleApiClient googleapiclient, PendingIntent pendingintent);

    public abstract PendingResult remove(GoogleApiClient googleapiclient, OnDataPointListener ondatapointlistener);
}
