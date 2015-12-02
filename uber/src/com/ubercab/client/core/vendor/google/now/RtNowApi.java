// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.google.now;

import java.util.Map;
import retrofit.client.Response;

public interface RtNowApi
{

    public abstract Response addCredentials(String s);

    public abstract Response checkCredentials(Map map);
}
