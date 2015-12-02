// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import java.util.Map;
import retrofit.Callback;

public interface SignupApi
{

    public abstract void create(Map map, Callback callback);

    public abstract void validate(Map map, Callback callback);
}
