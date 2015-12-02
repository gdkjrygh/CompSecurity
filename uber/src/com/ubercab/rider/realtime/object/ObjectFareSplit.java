// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import com.ubercab.rider.realtime.model.FareSplitClient;
import hlm;
import java.util.Iterator;
import java.util.List;

abstract class ObjectFareSplit
    implements hlm
{

    ObjectFareSplit()
    {
    }

    public FareSplitClient getClientInitiator()
    {
        Object obj = getClients();
        if (obj == null || ((List) (obj)).isEmpty())
        {
            return null;
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            FareSplitClient faresplitclient = (FareSplitClient)((Iterator) (obj)).next();
            if (faresplitclient.getIsInitiator())
            {
                return faresplitclient;
            }
        }

        return null;
    }

    public FareSplitClient getClientSelf()
    {
        Object obj = getClients();
        if (obj == null || ((List) (obj)).isEmpty())
        {
            return null;
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            FareSplitClient faresplitclient = (FareSplitClient)((Iterator) (obj)).next();
            if (faresplitclient.getIsSelf())
            {
                return faresplitclient;
            }
        }

        return null;
    }
}
