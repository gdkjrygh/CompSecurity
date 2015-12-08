// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import net.hockeyapp.android.utils.ViewHelper;

public class UpdateView extends RelativeLayout
{

    public static final int HEADER_VIEW_ID = 4097;
    public static final int NAME_LABEL_ID = 4098;
    public static final int UPDATE_BUTTON_ID = 4100;
    public static final int VERSION_LABEL_ID = 4099;
    public static final int WEB_VIEW_ID = 4101;
    protected RelativeLayout headerView;
    protected boolean layoutHorizontally;
    protected boolean limitHeight;

    public UpdateView(Context context)
    {
        this(context, true);
    }

    public UpdateView(Context context, AttributeSet attributeset)
    {
        this(context, true, false);
    }

    public UpdateView(Context context, boolean flag)
    {
        this(context, true, false);
    }

    public UpdateView(Context context, boolean flag, boolean flag1)
    {
        super(context);
        headerView = null;
        layoutHorizontally = false;
        limitHeight = false;
        if (flag)
        {
            setLayoutHorizontally(context);
        } else
        {
            layoutHorizontally = false;
        }
        limitHeight = flag1;
        loadLayoutParams(context);
        loadHeaderView(context);
        loadWebView(context);
        loadShadow(headerView, context);
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

    private void loadHeaderView(Context context)
    {
        headerView = new RelativeLayout(context);
        headerView.setId(4097);
        android.widget.RelativeLayout.LayoutParams layoutparams;
        if (layoutHorizontally)
        {
            layoutparams = new android.widget.RelativeLayout.LayoutParams((int)TypedValue.applyDimension(1, 250F, getResources().getDisplayMetrics()), -1);
            layoutparams.addRule(9, -1);
            headerView.setPadding(0, 0, 0, 0);
        } else
        {
            layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            headerView.setPadding(0, 0, 0, (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics()));
        }
        headerView.setLayoutParams(layoutparams);
        headerView.setBackgroundColor(Color.rgb(230, 236, 239));
        loadTitleLabel(headerView, context);
        loadVersionLabel(headerView, context);
        loadUpdateButton(headerView, context);
        addView(headerView);
    }

    private void loadLayoutParams(Context context)
    {
        context = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        setBackgroundColor(-1);
        setLayoutParams(context);
    }

    private void loadShadow(RelativeLayout relativelayout, Context context)
    {
        int i = (int)TypedValue.applyDimension(1, 3F, getResources().getDisplayMetrics());
        ImageView imageview = new ImageView(context);
        android.widget.RelativeLayout.LayoutParams layoutparams;
        if (layoutHorizontally)
        {
            layoutparams = new android.widget.RelativeLayout.LayoutParams(1, -1);
            layoutparams.addRule(11, -1);
            imageview.setBackgroundDrawable(new ColorDrawable(0xff000000));
        } else
        {
            layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, i);
            layoutparams.addRule(10, -1);
            imageview.setBackgroundDrawable(ViewHelper.getGradient());
        }
        imageview.setLayoutParams(layoutparams);
        relativelayout.addView(imageview);
        relativelayout = new ImageView(context);
        context = new android.widget.RelativeLayout.LayoutParams(-1, i);
        if (layoutHorizontally)
        {
            context.addRule(10, -1);
        } else
        {
            context.addRule(3, 4097);
        }
        relativelayout.setLayoutParams(context);
        relativelayout.setBackgroundDrawable(ViewHelper.getGradient());
        addView(relativelayout);
    }

    private void loadTitleLabel(RelativeLayout relativelayout, Context context)
    {
        context = new TextView(context);
        context.setId(4098);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        int i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        layoutparams.setMargins(i, i, i, 0);
        context.setLayoutParams(layoutparams);
        context.setEllipsize(android.text.TextUtils.TruncateAt.END);
        context.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
        context.setSingleLine(true);
        context.setTextColor(0xff000000);
        context.setTextSize(2, 20F);
        context.setTypeface(null, 1);
        relativelayout.addView(context);
    }

    private void loadUpdateButton(RelativeLayout relativelayout, Context context)
    {
        context = new Button(context);
        context.setId(4100);
        int i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams((int)TypedValue.applyDimension(1, 120F, getResources().getDisplayMetrics()), -2);
        layoutparams.setMargins(i, i, i, i);
        layoutparams.addRule(9, -1);
        layoutparams.addRule(3, 4099);
        context.setLayoutParams(layoutparams);
        context.setBackgroundDrawable(getButtonSelector());
        context.setText("Update");
        context.setTextColor(-1);
        context.setTextSize(2, 16F);
        relativelayout.addView(context);
    }

    private void loadVersionLabel(RelativeLayout relativelayout, Context context)
    {
        context = new TextView(context);
        context.setId(4099);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        int i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        layoutparams.setMargins(i, (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics()), i, 0);
        layoutparams.addRule(3, 4098);
        context.setLayoutParams(layoutparams);
        context.setEllipsize(android.text.TextUtils.TruncateAt.END);
        context.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
        context.setLines(2);
        context.setLineSpacing(0.0F, 1.1F);
        context.setTextColor(0xff000000);
        context.setTextSize(2, 16F);
        context.setTypeface(null, 1);
        relativelayout.addView(context);
    }

    private void loadWebView(Context context)
    {
        WebView webview = new WebView(context);
        webview.setId(4101);
        int i = (int)TypedValue.applyDimension(1, 400F, context.getResources().getDisplayMetrics());
        if (!limitHeight)
        {
            i = -1;
        }
        context = new android.widget.RelativeLayout.LayoutParams(-1, i);
        if (layoutHorizontally)
        {
            context.addRule(1, 4097);
        } else
        {
            context.addRule(3, 4097);
        }
        context.setMargins(0, 0, 0, 0);
        webview.setLayoutParams(context);
        webview.setBackgroundColor(-1);
        addView(webview);
    }

    private void setLayoutHorizontally(Context context)
    {
        if (getResources().getConfiguration().orientation == 2)
        {
            layoutHorizontally = true;
            return;
        } else
        {
            layoutHorizontally = false;
            return;
        }
    }
}
