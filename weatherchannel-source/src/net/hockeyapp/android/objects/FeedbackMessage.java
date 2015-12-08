// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.objects;

import java.io.Serializable;
import java.util.List;

public class FeedbackMessage
    implements Serializable
{

    private static final long serialVersionUID = 0x863ffc95c8474b80L;
    private String appId;
    private String cleanText;
    private String createdAt;
    private List feedbackAttachments;
    private int id;
    private String model;
    private String name;
    private String oem;
    private String osVersion;
    private String subject;
    private String text;
    private String token;
    private String userString;
    private int via;

    public FeedbackMessage()
    {
    }

    public String getAppId()
    {
        return appId;
    }

    public String getCleanText()
    {
        return cleanText;
    }

    public String getCreatedAt()
    {
        return createdAt;
    }

    public List getFeedbackAttachments()
    {
        return feedbackAttachments;
    }

    public int getId()
    {
        return id;
    }

    public String getModel()
    {
        return model;
    }

    public String getName()
    {
        return name;
    }

    public String getOem()
    {
        return oem;
    }

    public String getOsVersion()
    {
        return osVersion;
    }

    public String getSubjec()
    {
        return subject;
    }

    public String getText()
    {
        return text;
    }

    public String getToken()
    {
        return token;
    }

    public String getUserString()
    {
        return userString;
    }

    public int getVia()
    {
        return via;
    }

    public void setAppId(String s)
    {
        appId = s;
    }

    public void setCleanText(String s)
    {
        cleanText = s;
    }

    public void setCreatedAt(String s)
    {
        createdAt = s;
    }

    public void setFeedbackAttachments(List list)
    {
        feedbackAttachments = list;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setModel(String s)
    {
        model = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setOem(String s)
    {
        oem = s;
    }

    public void setOsVersion(String s)
    {
        osVersion = s;
    }

    public void setSubjec(String s)
    {
        subject = s;
    }

    public void setText(String s)
    {
        text = s;
    }

    public void setToken(String s)
    {
        token = s;
    }

    public void setUserString(String s)
    {
        userString = s;
    }

    public void setVia(int i)
    {
        via = i;
    }
}
