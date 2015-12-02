// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import java.util.Map;
import retrofit.Callback;

public interface TunesApi
{

    public abstract void handshake(String s, Map map, Callback callback);

    public abstract void playlist(String s, String s1, String s2, Double double1, Double double2, String s3, String s4, 
            Callback callback);

    public abstract void provider(String s, String s1, Boolean boolean1, Double double1, Double double2, String s2, String s3, 
            Callback callback);

    public abstract void providers(String s, String s1, Callback callback);

    public abstract void search(String s, String s1, String s2, String s3, Callback callback);

    public abstract void startTrial(String s, String s1, Map map, Callback callback);
}
