// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.listeners;

import net.hockeyapp.android.StringListener;
import net.hockeyapp.android.tasks.SendFeedbackTask;

public abstract class SendFeedbackListener extends StringListener
{

    public SendFeedbackListener()
    {
    }

    public void feedbackFailed(SendFeedbackTask sendfeedbacktask, Boolean boolean1)
    {
    }

    public void feedbackSuccessful(SendFeedbackTask sendfeedbacktask)
    {
    }
}
