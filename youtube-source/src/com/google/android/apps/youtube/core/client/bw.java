// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;


final class bw
{

    static final int a[];

    static 
    {
        a = new int[com.google.android.apps.youtube.datalib.innertube.model.TrackingUrl.ClientParam.values().length];
        try
        {
            a[com.google.android.apps.youtube.datalib.innertube.model.TrackingUrl.ClientParam.C.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.innertube.model.TrackingUrl.ClientParam.CPN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.innertube.model.TrackingUrl.ClientParam.CONN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.innertube.model.TrackingUrl.ClientParam.CMT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.innertube.model.TrackingUrl.ClientParam.MS.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
