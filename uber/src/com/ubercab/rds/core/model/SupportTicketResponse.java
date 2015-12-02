// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_SupportTicketResponse

public abstract class SupportTicketResponse
    implements Parcelable
{

    public SupportTicketResponse()
    {
    }

    public static SupportTicketResponse create()
    {
        return new Shape_SupportTicketResponse();
    }

    public abstract String getMessage();

    public abstract SupportTicketResponse setMessage(String s);
}
