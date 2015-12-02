// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_SafetyNetGetContactsResponse

public abstract class SafetyNetGetContactsResponse
    implements Parcelable
{

    public SafetyNetGetContactsResponse()
    {
    }

    public static SafetyNetGetContactsResponse create(List list)
    {
        return (new Shape_SafetyNetGetContactsResponse()).setContacts(list);
    }

    public abstract List getContacts();

    abstract SafetyNetGetContactsResponse setContacts(List list);
}
