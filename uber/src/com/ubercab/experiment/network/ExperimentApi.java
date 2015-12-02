// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.experiment.network;

import retrofit.Callback;

public interface ExperimentApi
{

    public abstract void getExperimentDefinitions(Callback callback);

    public abstract void getExperiments(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            Double double1, Double double2, String s7, String s8, Callback callback);
}
