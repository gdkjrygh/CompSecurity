// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.event;

import java.util.List;

public final class ErrorObjectEvent
{

    private final List mErrorObj;

    public ErrorObjectEvent(List list)
    {
        mErrorObj = list;
    }

    public final List getErrorObj()
    {
        return mErrorObj;
    }
}
