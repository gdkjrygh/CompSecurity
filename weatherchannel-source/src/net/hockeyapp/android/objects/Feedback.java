// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.objects;

import java.io.Serializable;
import java.util.ArrayList;

public class Feedback
    implements Serializable
{

    private static final long serialVersionUID = 0x23f22471d131d6e8L;
    private String createdAt;
    private String email;
    private int id;
    private ArrayList messages;
    private String name;

    public Feedback()
    {
    }

    public String getCreatedAt()
    {
        return createdAt;
    }

    public String getEmail()
    {
        return email;
    }

    public int getId()
    {
        return id;
    }

    public ArrayList getMessages()
    {
        return messages;
    }

    public String getName()
    {
        return name;
    }

    public void setCreatedAt(String s)
    {
        createdAt = s;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setMessages(ArrayList arraylist)
    {
        messages = arraylist;
    }

    public void setName(String s)
    {
        name = s;
    }
}
