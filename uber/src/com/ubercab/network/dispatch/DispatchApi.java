// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.network.dispatch;

import java.util.Map;
import retrofit.Callback;

public interface DispatchApi
{

    public abstract void request(Map map, Callback callback);
}
