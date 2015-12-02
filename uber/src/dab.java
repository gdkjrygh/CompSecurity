// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.contacts.Contact;

public final class dab
{

    private Contact a;

    public dab()
    {
        a = new Contact();
    }

    public final Contact a()
    {
        return a;
    }

    public final dab a(String s)
    {
        Contact.a(a, s);
        return this;
    }

    public final dab b(String s)
    {
        Contact.b(a, s);
        return this;
    }

    public final dab c(String s)
    {
        Contact.c(a, s);
        return this;
    }
}
