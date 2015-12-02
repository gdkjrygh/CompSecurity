// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import java.util.Map;
import retrofit.Callback;

public interface SafetyNetApi
{

    public abstract void addContacts(String s, Map map, Callback callback);

    public abstract void deleteContacts(String s, Map map, Callback callback);

    public abstract void getContacts(String s, Callback callback);

    public abstract void getSharedTripContacts(String s, Callback callback);

    public abstract void shareTrip(String s, Map map, Callback callback);
}
