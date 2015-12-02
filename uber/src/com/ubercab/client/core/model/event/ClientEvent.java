// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.event;

import com.ubercab.client.core.model.Client;

public class ClientEvent
{

    private final Client mClient;

    public ClientEvent(Client client)
    {
        mClient = client;
    }

    public Client getClient()
    {
        return mClient;
    }
}
