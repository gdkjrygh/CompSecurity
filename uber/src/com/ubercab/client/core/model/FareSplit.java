// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.content.Context;
import com.ubercab.rider.realtime.model.FareSplitClient;
import dty;
import gjy;
import gka;
import gki;
import java.util.ArrayList;
import java.util.List;

public class FareSplit
    implements com.ubercab.rider.realtime.model.FareSplit
{

    List clients;

    public FareSplit()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FareSplit)obj;
            if (clients == null ? ((FareSplit) (obj)).clients != null : !clients.equals(((FareSplit) (obj)).clients))
            {
                return false;
            }
        }
        return true;
    }

    public FareSplitClient getClientInitiator()
    {
        if (clients == null)
        {
            return null;
        } else
        {
            return (FareSplitClient)gki.d(clients, new gka() {

                final FareSplit this$0;

                public boolean apply(FareSplitClient faresplitclient)
                {
                    return faresplitclient.getIsInitiator();
                }

                public volatile boolean apply(Object obj)
                {
                    return apply((FareSplitClient)obj);
                }

            
            {
                this$0 = FareSplit.this;
                super();
            }
            }).d();
        }
    }

    public FareSplitClient getClientSelf()
    {
        if (clients == null)
        {
            return null;
        } else
        {
            return (FareSplitClient)gki.d(clients, new gka() {

                final FareSplit this$0;

                public boolean apply(FareSplitClient faresplitclient)
                {
                    return faresplitclient.getIsSelf();
                }

                public volatile boolean apply(Object obj)
                {
                    return apply((FareSplitClient)obj);
                }

            
            {
                this$0 = FareSplit.this;
                super();
            }
            }).d();
        }
    }

    public List getClients()
    {
        if (clients == null)
        {
            return new ArrayList();
        } else
        {
            return clients;
        }
    }

    public String getDescription(Context context)
    {
        return dty.a(context, this);
    }

    public int hashCode()
    {
        if (clients != null)
        {
            return clients.hashCode();
        } else
        {
            return 0;
        }
    }
}
