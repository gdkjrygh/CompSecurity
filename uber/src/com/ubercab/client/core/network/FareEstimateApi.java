// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import java.util.List;
import retrofit.Callback;

public interface FareEstimateApi
{

    public abstract void fareEstimates(double d, double d1, double d2, double d3, List list, String s, Callback callback);
}
