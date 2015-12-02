// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.client;

import com.ubercab.rider.realtime.request.body.ContactBody;
import ica;

public interface ContactsApi
{

    public abstract ica getContact(String s);

    public abstract ica getContacts(String s);

    public abstract ica postMessage(String s, ContactBody contactbody);
}
