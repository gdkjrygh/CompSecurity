// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.network.ramen.internal.model;


public class Message
{

    private String msg;
    private int seq;
    private String type;

    public Message()
    {
    }

    public String getMessage()
    {
        return msg;
    }

    public int getSequenceNum()
    {
        return seq;
    }

    public String getType()
    {
        return type;
    }
}
