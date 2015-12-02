// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.realtime.request.body;


// Referenced classes of package com.ubercab.android.partner.funnel.realtime.request.body:
//            Shape_EmptyBody

public abstract class EmptyBody
{

    public EmptyBody()
    {
    }

    public static EmptyBody create()
    {
        return new Shape_EmptyBody();
    }
}
