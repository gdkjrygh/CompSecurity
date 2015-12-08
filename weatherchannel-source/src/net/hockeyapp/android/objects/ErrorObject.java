// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.objects;

import java.io.Serializable;

public class ErrorObject
    implements Serializable
{

    private static final long serialVersionUID = 0x14ede2a74a40f08cL;
    private int code;
    private String message;

    public ErrorObject()
    {
    }

    public int getCode()
    {
        return code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setCode(int i)
    {
        code = i;
    }

    public void setMessage(String s)
    {
        message = s;
    }
}
