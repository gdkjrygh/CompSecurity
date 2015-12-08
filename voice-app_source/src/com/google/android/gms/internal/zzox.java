// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;

class zzox
    implements com.google.android.gms.panorama.PanoramaApi.PanoramaResult
{

    private final Status zzOt;
    private final Intent zzaGA;

    public zzox(Status status, Intent intent)
    {
        zzOt = (Status)zzu.zzu(status);
        zzaGA = intent;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public Intent getViewerIntent()
    {
        return zzaGA;
    }
}
