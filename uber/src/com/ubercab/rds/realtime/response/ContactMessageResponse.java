// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.realtime.response;


// Referenced classes of package com.ubercab.rds.realtime.response:
//            Shape_ContactMessageResponse

public abstract class ContactMessageResponse
{

    public ContactMessageResponse()
    {
    }

    public static ContactMessageResponse create()
    {
        return new Shape_ContactMessageResponse();
    }

    public abstract String getText();

    public abstract ContactMessageResponse setText(String s);
}
