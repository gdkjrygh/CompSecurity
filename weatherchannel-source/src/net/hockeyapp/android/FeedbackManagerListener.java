// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import net.hockeyapp.android.objects.FeedbackMessage;

// Referenced classes of package net.hockeyapp.android:
//            StringListener, FeedbackActivity

public abstract class FeedbackManagerListener extends StringListener
{

    public FeedbackManagerListener()
    {
    }

    public abstract boolean feedbackAnswered(FeedbackMessage feedbackmessage);

    public Class getFeedbackActivityClass()
    {
        return net/hockeyapp/android/FeedbackActivity;
    }
}
