// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import net.hockeyapp.android.Strings;

// Referenced classes of package net.hockeyapp.android.views:
//            AttachmentListView

public class FeedbackView extends LinearLayout
{

    public static final int ADD_ATTACHMENT_BUTTON_ID = 8208;
    public static final int ADD_RESPONSE_BUTTON_ID = 0x20010;
    public static final int EMAIL_EDIT_TEXT_ID = 8196;
    public static final int FEEDBACK_SCROLLVIEW_ID = 0x20017;
    public static final int LAST_UPDATED_TEXT_VIEW_ID = 8192;
    public static final int MESSAGES_LISTVIEW_ID = 0x20016;
    public static final int NAME_EDIT_TEXT_ID = 8194;
    public static final int REFRESH_BUTTON_ID = 0x20011;
    public static final int SEND_FEEDBACK_BUTTON_ID = 8201;
    public static final int SUBJECT_EDIT_TEXT_ID = 8198;
    public static final int TEXT_EDIT_TEXT_ID = 8200;
    public static final int WRAPPER_BASE_ID = 0x20012;
    public static final int WRAPPER_LAYOUT_ATTACHMENTS = 8209;
    public static final int WRAPPER_LAYOUT_BUTTONS_ID = 0x20014;
    public static final int WRAPPER_LAYOUT_FEEDBACK_AND_MESSAGES_ID = 0x20015;
    public static final int WRAPPER_LAYOUT_FEEDBACK_ID = 0x20013;
    private ScrollView feedbackScrollView;
    private ListView messagesListView;
    private LinearLayout wrapperBase;
    private ViewGroup wrapperLayoutAttachments;
    private LinearLayout wrapperLayoutButtons;
    private LinearLayout wrapperLayoutFeedback;
    private LinearLayout wrapperLayoutFeedbackAndMessages;

    public FeedbackView(Context context)
    {
        super(context);
        loadLayoutParams(context);
        loadWrapperBase(context);
        loadFeedbackScrollView(context);
        loadWrapperLayoutFeedback(context);
        loadWrapperLayoutFeedbackAndMessages(context);
        loadNameInput(context);
        loadEmailInput(context);
        loadSubjectInput(context);
        loadTextInput(context);
        loadAttachmentList(context);
        loadAddAttachmentButton(context);
        loadSendFeedbackButton(context);
        loadLastUpdatedLabel(context);
        loadWrapperLayoutButtons(context);
        loadAddResponseButton(context);
        loadRefreshButton(context);
        loadMessagesListView(context);
    }

    private Drawable getButtonSelector()
    {
        StateListDrawable statelistdrawable = new StateListDrawable();
        ColorDrawable colordrawable = new ColorDrawable(0xff000000);
        statelistdrawable.addState(new int[] {
            0xfefeff59
        }, colordrawable);
        colordrawable = new ColorDrawable(0xff444444);
        statelistdrawable.addState(new int[] {
            0xfefeff59, 0x101009c
        }, colordrawable);
        colordrawable = new ColorDrawable(0xff888888);
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, colordrawable);
        return statelistdrawable;
    }

    private Drawable getEditTextBackground(Context context)
    {
        int i = (int)(context.getResources().getDisplayMetrics().density * 10F);
        ShapeDrawable shapedrawable = new ShapeDrawable(new RectShape());
        Paint paint = shapedrawable.getPaint();
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1.0F);
        shapedrawable.setPadding(i, i, i, i);
        i = (int)((double)context.getResources().getDisplayMetrics().density * 1.5D);
        context = new ShapeDrawable(new RectShape());
        paint = context.getPaint();
        paint.setColor(0xff444444);
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1.0F);
        context.setPadding(0, 0, 0, i);
        return new LayerDrawable(new Drawable[] {
            context, shapedrawable
        });
    }

    private void loadAddAttachmentButton(Context context)
    {
        context = new Button(context);
        context.setId(8208);
        int i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        int j = (int)TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics());
        int k = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, 0, k);
        layoutparams.gravity = 1;
        context.setLayoutParams(layoutparams);
        context.setBackgroundDrawable(getButtonSelector());
        context.setPadding(j, i, j, i);
        context.setText(Strings.get(1031));
        context.setTextColor(-1);
        context.setTextSize(2, 15F);
        wrapperLayoutFeedback.addView(context);
    }

    private void loadAddResponseButton(Context context)
    {
        context = new Button(context);
        context.setId(0x20010);
        int i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        int j = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        int k = (int)TypedValue.applyDimension(1, 5F, getResources().getDisplayMetrics());
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, k, j);
        layoutparams.gravity = 1;
        layoutparams.weight = 1.0F;
        context.setLayoutParams(layoutparams);
        context.setBackgroundDrawable(getButtonSelector());
        context.setPadding(0, i, 0, i);
        context.setGravity(17);
        context.setText(Strings.get(1033));
        context.setTextColor(-1);
        context.setTextSize(2, 15F);
        wrapperLayoutButtons.addView(context);
    }

    private void loadAttachmentList(Context context)
    {
        wrapperLayoutAttachments = new AttachmentListView(context);
        wrapperLayoutAttachments.setId(8209);
        context = new android.widget.LinearLayout.LayoutParams(-1, -1);
        int i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        context.gravity = 3;
        wrapperLayoutAttachments.setLayoutParams(context);
        wrapperLayoutAttachments.setPadding(0, 0, 0, i);
        wrapperLayoutFeedback.addView(wrapperLayoutAttachments);
    }

    private void loadEmailInput(Context context)
    {
        EditText edittext = new EditText(context);
        edittext.setId(8196);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics()));
        edittext.setLayoutParams(layoutparams);
        edittext.setImeOptions(5);
        edittext.setInputType(33);
        edittext.setSingleLine(true);
        edittext.setTextColor(0xff888888);
        edittext.setTextSize(2, 15F);
        edittext.setTypeface(null, 0);
        edittext.setHint(Strings.get(1027));
        edittext.setHintTextColor(0xffcccccc);
        setEditTextBackground(context, edittext);
        wrapperLayoutFeedback.addView(edittext);
    }

    private void loadFeedbackScrollView(Context context)
    {
        feedbackScrollView = new ScrollView(context);
        feedbackScrollView.setId(0x20017);
        context = new android.widget.LinearLayout.LayoutParams(-1, -1);
        int i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        context.gravity = 17;
        feedbackScrollView.setLayoutParams(context);
        feedbackScrollView.setPadding(i, 0, i, 0);
        wrapperBase.addView(feedbackScrollView);
    }

    private void loadLastUpdatedLabel(Context context)
    {
        context = new TextView(context);
        context.setId(8192);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        int i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        layoutparams.setMargins(0, 0, 0, 0);
        context.setLayoutParams(layoutparams);
        context.setPadding(0, i, 0, i);
        context.setEllipsize(android.text.TextUtils.TruncateAt.END);
        context.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
        context.setSingleLine(true);
        context.setText(Strings.get(1030));
        context.setTextColor(0xff888888);
        context.setTextSize(2, 15F);
        context.setTypeface(null, 0);
        wrapperLayoutFeedbackAndMessages.addView(context);
    }

    private void loadLayoutParams(Context context)
    {
        context = new android.widget.LinearLayout.LayoutParams(-1, -2);
        setBackgroundColor(-1);
        setLayoutParams(context);
    }

    private void loadMessagesListView(Context context)
    {
        messagesListView = new ListView(context);
        messagesListView.setId(0x20016);
        context = new android.widget.LinearLayout.LayoutParams(-1, -1);
        int i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        messagesListView.setLayoutParams(context);
        messagesListView.setPadding(0, i, 0, i);
        wrapperLayoutFeedbackAndMessages.addView(messagesListView);
    }

    private void loadNameInput(Context context)
    {
        EditText edittext = new EditText(context);
        edittext.setId(8194);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        int i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        layoutparams.setMargins(0, i / 2, 0, i);
        edittext.setLayoutParams(layoutparams);
        edittext.setImeOptions(5);
        edittext.setInputType(16385);
        edittext.setSingleLine(true);
        edittext.setTextColor(0xff888888);
        edittext.setTextSize(2, 15F);
        edittext.setTypeface(null, 0);
        edittext.setHint(Strings.get(1026));
        edittext.setHintTextColor(0xffcccccc);
        setEditTextBackground(context, edittext);
        wrapperLayoutFeedback.addView(edittext);
    }

    private void loadRefreshButton(Context context)
    {
        context = new Button(context);
        context.setId(0x20011);
        int i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        int j = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        int k = (int)TypedValue.applyDimension(1, 5F, getResources().getDisplayMetrics());
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(k, 0, 0, j);
        layoutparams.gravity = 1;
        context.setLayoutParams(layoutparams);
        context.setBackgroundDrawable(getButtonSelector());
        context.setPadding(0, i, 0, i);
        context.setGravity(17);
        context.setText(Strings.get(1034));
        context.setTextColor(-1);
        context.setTextSize(2, 15F);
        layoutparams.weight = 1.0F;
        wrapperLayoutButtons.addView(context);
    }

    private void loadSendFeedbackButton(Context context)
    {
        context = new Button(context);
        context.setId(8201);
        int i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        int j = (int)TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics());
        int k = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, 0, k);
        layoutparams.gravity = 1;
        context.setLayoutParams(layoutparams);
        context.setBackgroundDrawable(getButtonSelector());
        context.setPadding(j, i, j, i);
        context.setText(Strings.get(1032));
        context.setTextColor(-1);
        context.setTextSize(2, 15F);
        wrapperLayoutFeedback.addView(context);
    }

    private void loadSubjectInput(Context context)
    {
        EditText edittext = new EditText(context);
        edittext.setId(8198);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics()));
        edittext.setLayoutParams(layoutparams);
        edittext.setImeOptions(5);
        edittext.setInputType(16433);
        edittext.setSingleLine(true);
        edittext.setTextColor(0xff888888);
        edittext.setTextSize(2, 15F);
        edittext.setTypeface(null, 0);
        edittext.setHint(Strings.get(1028));
        edittext.setHintTextColor(0xffcccccc);
        setEditTextBackground(context, edittext);
        wrapperLayoutFeedback.addView(edittext);
    }

    private void loadTextInput(Context context)
    {
        EditText edittext = new EditText(context);
        edittext.setId(8200);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        int i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        int j = (int)TypedValue.applyDimension(1, 100F, getResources().getDisplayMetrics());
        layoutparams.setMargins(0, 0, 0, i);
        edittext.setLayoutParams(layoutparams);
        edittext.setImeOptions(5);
        edittext.setInputType(16385);
        edittext.setSingleLine(false);
        edittext.setTextColor(0xff888888);
        edittext.setTextSize(2, 15F);
        edittext.setTypeface(null, 0);
        edittext.setMinimumHeight(j);
        edittext.setHint(Strings.get(1029));
        edittext.setHintTextColor(0xffcccccc);
        setEditTextBackground(context, edittext);
        wrapperLayoutFeedback.addView(edittext);
    }

    private void loadWrapperBase(Context context)
    {
        wrapperBase = new LinearLayout(context);
        wrapperBase.setId(0x20012);
        context = new android.widget.LinearLayout.LayoutParams(-1, -1);
        context.gravity = 49;
        wrapperBase.setLayoutParams(context);
        wrapperBase.setPadding(0, 0, 0, 0);
        wrapperBase.setOrientation(1);
        addView(wrapperBase);
    }

    private void loadWrapperLayoutButtons(Context context)
    {
        wrapperLayoutButtons = new LinearLayout(context);
        wrapperLayoutButtons.setId(0x20014);
        context = new android.widget.LinearLayout.LayoutParams(-1, -2);
        int i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        context.gravity = 3;
        wrapperLayoutButtons.setLayoutParams(context);
        wrapperLayoutButtons.setPadding(0, i, 0, i);
        wrapperLayoutButtons.setGravity(48);
        wrapperLayoutButtons.setOrientation(0);
        wrapperLayoutFeedbackAndMessages.addView(wrapperLayoutButtons);
    }

    private void loadWrapperLayoutFeedback(Context context)
    {
        wrapperLayoutFeedback = new LinearLayout(context);
        wrapperLayoutFeedback.setId(0x20013);
        context = new android.widget.LinearLayout.LayoutParams(-1, -1);
        int i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        context.gravity = 3;
        wrapperLayoutFeedback.setLayoutParams(context);
        wrapperLayoutFeedback.setPadding(i, i, i, i);
        wrapperLayoutFeedback.setGravity(48);
        wrapperLayoutFeedback.setOrientation(1);
        feedbackScrollView.addView(wrapperLayoutFeedback);
    }

    private void loadWrapperLayoutFeedbackAndMessages(Context context)
    {
        wrapperLayoutFeedbackAndMessages = new LinearLayout(context);
        wrapperLayoutFeedbackAndMessages.setId(0x20015);
        context = new android.widget.LinearLayout.LayoutParams(-1, -1);
        int i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        context.gravity = 17;
        wrapperLayoutFeedbackAndMessages.setLayoutParams(context);
        wrapperLayoutFeedbackAndMessages.setPadding(i, i, i, 0);
        wrapperLayoutFeedbackAndMessages.setGravity(48);
        wrapperLayoutFeedbackAndMessages.setOrientation(1);
        wrapperBase.addView(wrapperLayoutFeedbackAndMessages);
    }

    private void setEditTextBackground(Context context, EditText edittext)
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            edittext.setBackgroundDrawable(getEditTextBackground(context));
        }
    }
}
