// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.objects;

import java.io.Serializable;

// Referenced classes of package net.hockeyapp.android.objects:
//            Feedback

public class FeedbackResponse
    implements Serializable
{

    private static final long serialVersionUID = 0xf0d2db8d48d1b472L;
    private Feedback feedback;
    private String status;
    private String token;

    public FeedbackResponse()
    {
    }

    public Feedback getFeedback()
    {
        return feedback;
    }

    public String getStatus()
    {
        return status;
    }

    public String getToken()
    {
        return token;
    }

    public void setFeedback(Feedback feedback1)
    {
        feedback = feedback1;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setToken(String s)
    {
        token = s;
    }
}
