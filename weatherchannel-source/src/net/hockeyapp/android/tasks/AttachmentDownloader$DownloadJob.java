// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.tasks;

import net.hockeyapp.android.objects.FeedbackAttachment;
import net.hockeyapp.android.views.AttachmentView;

// Referenced classes of package net.hockeyapp.android.tasks:
//            AttachmentDownloader

private static class <init>
{

    private final AttachmentView attachmentView;
    private final FeedbackAttachment feedbackAttachment;
    private int remainingRetries;
    private boolean success;

    public boolean consumeRetry()
    {
        int i = remainingRetries - 1;
        remainingRetries = i;
        return i >= 0;
    }

    public AttachmentView getAttachmentView()
    {
        return attachmentView;
    }

    public FeedbackAttachment getFeedbackAttachment()
    {
        return feedbackAttachment;
    }

    public boolean hasRetry()
    {
        return remainingRetries > 0;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess(boolean flag)
    {
        success = flag;
    }

    private (FeedbackAttachment feedbackattachment, AttachmentView attachmentview)
    {
        feedbackAttachment = feedbackattachment;
        attachmentView = attachmentview;
        success = false;
        remainingRetries = 2;
    }

    remainingRetries(FeedbackAttachment feedbackattachment, AttachmentView attachmentview, remainingRetries remainingretries)
    {
        this(feedbackattachment, attachmentview);
    }
}
