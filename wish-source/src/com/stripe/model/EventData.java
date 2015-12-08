// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import java.util.Map;

// Referenced classes of package com.stripe.model:
//            StripeObject

public class EventData extends StripeObject
{

    StripeObject object;
    Map previousAttributes;

    public EventData()
    {
    }

    public StripeObject getObject()
    {
        return object;
    }

    public Map getPreviousAttributes()
    {
        return previousAttributes;
    }

    public void setObject(StripeObject stripeobject)
    {
        object = stripeobject;
    }

    public void setPreviousAttributes(Map map)
    {
        previousAttributes = map;
    }
}
