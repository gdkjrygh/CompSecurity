// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.realtime.request.body;


// Referenced classes of package com.ubercab.rds.realtime.request.body:
//            Shape_ContactBody, ContactMessageBody

public abstract class ContactBody
{

    public ContactBody()
    {
    }

    public static ContactBody create()
    {
        return new Shape_ContactBody();
    }

    public abstract String getCsatOutcome();

    public abstract ContactMessageBody getMessage();

    public abstract boolean getReopenContact();

    public abstract String getRequesterId();

    public abstract ContactBody setCsatOutcome(String s);

    public abstract ContactBody setMessage(ContactMessageBody contactmessagebody);

    public abstract ContactBody setReopenContact(boolean flag);

    public abstract ContactBody setRequesterId(String s);
}
