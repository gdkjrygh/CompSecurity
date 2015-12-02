// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.network.ramen.model;


public class Message
{

    private final String mMessage;
    private final String mType;

    public Message(com.ubercab.network.ramen.internal.model.Message message)
    {
        mMessage = message.getMessage();
        mType = message.getType();
    }

    public Message(String s, String s1)
    {
        mMessage = s;
        mType = s1;
    }

    public String getMessage()
    {
        return mMessage;
    }

    public String getType()
    {
        return mType;
    }
}
