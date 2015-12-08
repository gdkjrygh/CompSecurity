// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package net.hockeyapp.android.views:
//            AttachmentListView

public class FeedbackMessageView extends LinearLayout
{

    public static final int ATTACHMENT_LIST_VIEW_ID = 12292;
    public static final int AUTHOR_TEXT_VIEW_ID = 12289;
    public static final int DATE_TEXT_VIEW_ID = 12290;
    public static final int MESSAGE_TEXT_VIEW_ID = 12291;
    private AttachmentListView attachmentListView;
    private TextView authorTextView;
    private TextView dateTextView;
    private TextView messageTextView;
    private boolean ownMessage;

    public FeedbackMessageView(Context context)
    {
        this(context, true);
    }

    public FeedbackMessageView(Context context, boolean flag)
    {
        super(context);
        ownMessage = flag;
        loadLayoutParams(context);
        loadAuthorLabel(context);
        loadDateLabel(context);
        loadMessageLabel(context);
        loadAttachmentList(context);
    }

    private void loadAttachmentList(Context context)
    {
        attachmentListView = new AttachmentListView(context);
        attachmentListView.setId(12292);
        context = new android.widget.LinearLayout.LayoutParams(-1, -1);
        int i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        context.setMargins(i, 0, i, i);
        attachmentListView.setLayoutParams(context);
        addView(attachmentListView);
    }

    private void loadAuthorLabel(Context context)
    {
        authorTextView = new TextView(context);
        authorTextView.setId(12289);
        context = new android.widget.LinearLayout.LayoutParams(-2, -2);
        int i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        context.setMargins(i, i, i, 0);
        authorTextView.setLayoutParams(context);
        authorTextView.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
        authorTextView.setSingleLine(true);
        authorTextView.setTextColor(0xff888888);
        authorTextView.setTextSize(2, 15F);
        authorTextView.setTypeface(null, 0);
        addView(authorTextView);
    }

    private void loadDateLabel(Context context)
    {
        dateTextView = new TextView(context);
        dateTextView.setId(12290);
        context = new android.widget.LinearLayout.LayoutParams(-2, -2);
        int i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        context.setMargins(i, 0, i, 0);
        dateTextView.setLayoutParams(context);
        dateTextView.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
        dateTextView.setSingleLine(true);
        dateTextView.setTextColor(0xff888888);
        dateTextView.setTextSize(2, 15F);
        dateTextView.setTypeface(null, 2);
        addView(dateTextView);
    }

    private void loadLayoutParams(Context context)
    {
        setOrientation(1);
        setGravity(3);
        setBackgroundColor(0xffcccccc);
    }

    private void loadMessageLabel(Context context)
    {
        messageTextView = new TextView(context);
        messageTextView.setId(12291);
        context = new android.widget.LinearLayout.LayoutParams(-2, -2);
        int i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        context.setMargins(i, 0, i, i);
        messageTextView.setLayoutParams(context);
        messageTextView.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
        messageTextView.setSingleLine(false);
        messageTextView.setTextColor(0xff000000);
        messageTextView.setTextSize(2, 18F);
        messageTextView.setTypeface(null, 0);
        addView(messageTextView);
    }

    private void setAuthorLaberColor(int i)
    {
        if (authorTextView != null)
        {
            authorTextView.setTextColor(i);
        }
    }

    private void setDateLaberColor(int i)
    {
        if (dateTextView != null)
        {
            dateTextView.setTextColor(i);
        }
    }

    private void setMessageLaberColor(int i)
    {
        if (messageTextView != null)
        {
            messageTextView.setTextColor(i);
        }
    }

    public void setAuthorLabelText(String s)
    {
        if (authorTextView != null && s != null)
        {
            authorTextView.setText(s);
        }
    }

    public void setDateLabelText(String s)
    {
        if (dateTextView != null && s != null)
        {
            dateTextView.setText(s);
        }
    }

    public void setFeedbackMessageViewBgAndTextColor(int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        setBackgroundColor(0xffcccccc);
        setAuthorLaberColor(-1);
        setDateLaberColor(-1);
_L4:
        setMessageLaberColor(0xff000000);
        return;
_L2:
        if (i == 1)
        {
            setBackgroundColor(-1);
            setAuthorLaberColor(0xffcccccc);
            setDateLaberColor(0xffcccccc);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setMessageLabelText(String s)
    {
        if (messageTextView != null && s != null)
        {
            messageTextView.setText(s);
        }
    }
}
