// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.client;

import com.ubercab.rider.realtime.request.body.SafetyNetContactsBody;
import com.ubercab.rider.realtime.request.body.SafetyNetDeleteContactsBody;
import ica;

public interface SafetyNetApi
{

    public abstract ica getContacts(String s);

    public abstract ica postCreateContacts(String s, SafetyNetContactsBody safetynetcontactsbody);

    public abstract ica putDeleteContacts(String s, SafetyNetDeleteContactsBody safetynetdeletecontactsbody);
}
