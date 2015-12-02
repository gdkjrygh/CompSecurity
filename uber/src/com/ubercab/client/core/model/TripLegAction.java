// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class TripLegAction
    implements com.ubercab.rider.realtime.model.TripLegAction
{

    String context;
    String description;
    String entityRef;
    String type;

    public TripLegAction()
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
            obj = (TripLegAction)obj;
            if (entityRef == null ? ((TripLegAction) (obj)).entityRef != null : !entityRef.equals(((TripLegAction) (obj)).entityRef))
            {
                return false;
            }
            if (type == null ? ((TripLegAction) (obj)).type != null : !type.equals(((TripLegAction) (obj)).type))
            {
                return false;
            }
            if (context == null ? ((TripLegAction) (obj)).context != null : !context.equals(((TripLegAction) (obj)).context))
            {
                return false;
            }
            if (description == null ? ((TripLegAction) (obj)).description != null : !description.equals(((TripLegAction) (obj)).description))
            {
                return false;
            }
        }
        return true;
    }

    public String getContext()
    {
        return context;
    }

    public String getDescription()
    {
        return description;
    }

    public String getEntityRef()
    {
        return entityRef;
    }

    public String getType()
    {
        return type;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (type != null)
        {
            i = type.hashCode();
        } else
        {
            i = 0;
        }
        if (entityRef != null)
        {
            j = entityRef.hashCode();
        } else
        {
            j = 0;
        }
        if (context != null)
        {
            k = context.hashCode();
        } else
        {
            k = 0;
        }
        if (description != null)
        {
            l = description.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }
}
