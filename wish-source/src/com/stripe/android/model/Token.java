// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.android.model;

import com.stripe.model.StripeObject;
import java.util.Date;

// Referenced classes of package com.stripe.android.model:
//            Card

public class Token extends StripeObject
{

    Card card;
    Date created;
    String id;
    boolean livemode;
    boolean used;

    public Token(String s, boolean flag, Date date, Boolean boolean1, Card card1)
    {
        id = s;
        livemode = flag;
        card = card1;
        created = date;
        used = boolean1.booleanValue();
    }

    public Card getCard()
    {
        return card;
    }

    public Date getCreated()
    {
        return created;
    }

    public String getId()
    {
        return id;
    }

    public boolean getLivemode()
    {
        return livemode;
    }

    public boolean getUsed()
    {
        return used;
    }
}
