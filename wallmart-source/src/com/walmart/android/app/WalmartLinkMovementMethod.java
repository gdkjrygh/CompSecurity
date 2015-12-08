// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.walmart.android.app.main.NavigationItemUtils;
import com.walmart.android.util.WalmartUri;

public class WalmartLinkMovementMethod extends LinkMovementMethod
{

    private static WalmartLinkMovementMethod sInstance;
    private final Context mContext;

    public WalmartLinkMovementMethod(Context context)
    {
        mContext = context.getApplicationContext();
    }

    public static MovementMethod getInstance()
    {
        throw new RuntimeException("Use getInstance(Context context) instead");
    }

    public static MovementMethod getInstance(Context context)
    {
        if (sInstance == null)
        {
            sInstance = new WalmartLinkMovementMethod(context);
        }
        return sInstance;
    }

    private void onClick(ClickableSpan clickablespan, TextView textview)
    {
        WalmartUri walmarturi;
        if (!(clickablespan instanceof URLSpan))
        {
            break MISSING_BLOCK_LABEL_34;
        }
        walmarturi = WalmartUri.parse(((URLSpan)clickablespan).getURL());
        if (walmarturi != null)
        {
            try
            {
                NavigationItemUtils.launchFromUri(mContext, walmarturi.getOriginalUri());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ClickableSpan clickablespan)
            {
                return;
            }
        }
        clickablespan.onClick(textview);
        return;
    }

    public boolean onTouchEvent(TextView textview, Spannable spannable, MotionEvent motionevent)
    {
        ClickableSpan aclickablespan[];
        int i;
        i = motionevent.getAction();
        if (i != 1 && i != 0)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        int j = (int)motionevent.getX();
        int k = (int)motionevent.getY();
        int l = textview.getTotalPaddingLeft();
        int i1 = textview.getTotalPaddingTop();
        int j1 = textview.getScrollX();
        int k1 = textview.getScrollY();
        Layout layout = textview.getLayout();
        j = layout.getOffsetForHorizontal(layout.getLineForVertical((k - i1) + k1), (j - l) + j1);
        aclickablespan = (ClickableSpan[])spannable.getSpans(j, j, android/text/style/ClickableSpan);
        if (aclickablespan.length == 0)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (i != 1) goto _L2; else goto _L1
_L1:
        onClick(aclickablespan[0], textview);
_L4:
        return true;
_L2:
        if (i != 0) goto _L4; else goto _L3
_L3:
        Selection.setSelection(spannable, spannable.getSpanStart(aclickablespan[0]), spannable.getSpanEnd(aclickablespan[0]));
        return true;
        Selection.removeSelection(spannable);
        return super.onTouchEvent(textview, spannable, motionevent);
    }
}
