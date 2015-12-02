// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.network.ramen.internal.model;

import java.util.ArrayList;
import java.util.List;

public final class Response
{

    private List msg;

    public Response()
    {
    }

    public final List getMessages()
    {
        if (msg == null)
        {
            msg = new ArrayList();
        }
        return msg;
    }
}
