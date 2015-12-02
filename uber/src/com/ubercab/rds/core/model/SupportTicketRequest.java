// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;
import java.util.Map;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_SupportTicketRequest

public abstract class SupportTicketRequest
    implements Parcelable
{

    public SupportTicketRequest()
    {
    }

    public static SupportTicketRequest create()
    {
        return new Shape_SupportTicketRequest();
    }

    public abstract Map getComponents();

    public abstract Map getImageTokens();

    public abstract double getLatitude();

    public abstract String getLocale();

    public abstract double getLongitude();

    public abstract String getProblemId();

    public abstract String getToken();

    public abstract String getTripId();

    public abstract String getUserType();

    public abstract String getUuid();

    public abstract SupportTicketRequest setComponents(Map map);

    public abstract SupportTicketRequest setImageTokens(Map map);

    public abstract SupportTicketRequest setLatitude(double d);

    public abstract SupportTicketRequest setLocale(String s);

    public abstract SupportTicketRequest setLongitude(double d);

    public abstract SupportTicketRequest setProblemId(String s);

    public abstract SupportTicketRequest setToken(String s);

    public abstract SupportTicketRequest setTripId(String s);

    public abstract SupportTicketRequest setUserType(String s);

    public abstract SupportTicketRequest setUuid(String s);
}
