// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.realtime.request.body;


// Referenced classes of package com.ubercab.rds.realtime.request.body:
//            Shape_ContactMessageBody

public abstract class ContactMessageBody
{

    public ContactMessageBody()
    {
    }

    public static ContactMessageBody create()
    {
        return new Shape_ContactMessageBody();
    }

    public abstract String getText();

    public abstract ContactMessageBody setText(String s);
}
