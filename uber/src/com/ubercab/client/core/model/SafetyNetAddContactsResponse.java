// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_SafetyNetAddContactsResponse

public abstract class SafetyNetAddContactsResponse
    implements Parcelable
{

    public SafetyNetAddContactsResponse()
    {
    }

    public static SafetyNetAddContactsResponse create(List list)
    {
        return (new Shape_SafetyNetAddContactsResponse()).setContacts(list);
    }

    public abstract List getContacts();

    abstract SafetyNetAddContactsResponse setContacts(List list);
}
