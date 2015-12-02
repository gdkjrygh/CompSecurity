// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_UpfrontFareResponse, UpfrontFareSearchResults

public abstract class UpfrontFareResponse
{

    public UpfrontFareResponse()
    {
    }

    public static UpfrontFareResponse create()
    {
        return new Shape_UpfrontFareResponse();
    }

    public abstract UpfrontFareSearchResults getDropoffs();

    public abstract List getTagged();

    public abstract String getTagline();

    abstract UpfrontFareResponse setDropoffs(UpfrontFareSearchResults upfrontfaresearchresults);

    abstract UpfrontFareResponse setTagged(List list);

    abstract UpfrontFareResponse setTagline(String s);
}
