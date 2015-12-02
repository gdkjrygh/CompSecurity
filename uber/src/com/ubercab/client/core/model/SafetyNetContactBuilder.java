// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            SafetyNetContact

public final class SafetyNetContactBuilder
{

    private SafetyNetContact mContact;

    public SafetyNetContactBuilder()
    {
        mContact = new SafetyNetContact();
    }

    public final SafetyNetContact build()
    {
        return mContact;
    }

    public final SafetyNetContactBuilder setId(String s)
    {
        mContact.id = s;
        return this;
    }

    public final SafetyNetContactBuilder setName(String s)
    {
        mContact.name = s;
        return this;
    }

    public final SafetyNetContactBuilder setPhone(String s)
    {
        mContact.phone = s;
        return this;
    }
}
