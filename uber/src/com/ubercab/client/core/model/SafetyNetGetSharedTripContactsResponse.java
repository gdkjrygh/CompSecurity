// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_SafetyNetGetSharedTripContactsResponse

public abstract class SafetyNetGetSharedTripContactsResponse
    implements Parcelable
{

    public SafetyNetGetSharedTripContactsResponse()
    {
    }

    public static SafetyNetGetSharedTripContactsResponse create(List list)
    {
        return (new Shape_SafetyNetGetSharedTripContactsResponse()).setContacts(list);
    }

    public abstract List getContacts();

    abstract SafetyNetGetSharedTripContactsResponse setContacts(List list);
}
