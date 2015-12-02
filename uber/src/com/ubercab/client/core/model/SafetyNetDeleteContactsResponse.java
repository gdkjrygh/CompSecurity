// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_SafetyNetDeleteContactsResponse

public abstract class SafetyNetDeleteContactsResponse
    implements Parcelable
{

    public SafetyNetDeleteContactsResponse()
    {
    }

    public static SafetyNetDeleteContactsResponse create(List list)
    {
        return (new Shape_SafetyNetDeleteContactsResponse()).setContacts(list);
    }

    public abstract List getContacts();

    abstract SafetyNetDeleteContactsResponse setContacts(List list);
}
