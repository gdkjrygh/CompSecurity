// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.io.Serializable;

public class jabber_id
    implements Serializable
{

    private static final long serialVersionUID = 0xe4e8add1ace065aaL;
    public final String cc;
    public String jabber_id;
    public final String number;

    (String s, String s1)
    {
        cc = s;
        number = s1;
        jabber_id = null;
    }
}
