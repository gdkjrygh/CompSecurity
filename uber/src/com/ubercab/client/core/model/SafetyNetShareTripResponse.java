// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_SafetyNetShareTripResponse

public abstract class SafetyNetShareTripResponse
    implements Parcelable
{

    public SafetyNetShareTripResponse()
    {
    }

    public static SafetyNetShareTripResponse create(List list)
    {
        return (new Shape_SafetyNetShareTripResponse()).setContacts(list);
    }

    public abstract List getContacts();

    abstract SafetyNetShareTripResponse setContacts(List list);
}
