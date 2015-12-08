// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.gcm.request;


public class PhotoCloudMessage
{

    private String message;
    private String title;

    public PhotoCloudMessage()
    {
    }

    public String getMessage()
    {
        return message;
    }

    public String getTitle()
    {
        return title;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
