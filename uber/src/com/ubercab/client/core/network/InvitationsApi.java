// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import java.util.List;
import java.util.Map;
import retrofit.Callback;

public interface InvitationsApi
{

    public abstract void createInvites(Map map, Callback callback);

    public abstract void getInvites(String s, List list, int i, Callback callback);
}
