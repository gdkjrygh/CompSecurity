// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            App, ev

public class ao5 extends LinkMovementMethod
{

    ev a;

    public ao5()
    {
    }

    public boolean onTouchEvent(TextView textview, Spannable spannable, MotionEvent motionevent)
    {
label0:
        {
            int j;
label1:
            {
                int i;
label2:
                {
label3:
                    {
                        i = App.am;
                        j = motionevent.getAction();
                        if (j != 1 && j != 0)
                        {
                            break label1;
                        }
                        int k = (int)motionevent.getX();
                        int l = (int)motionevent.getY();
                        int i1 = textview.getTotalPaddingLeft();
                        int j1 = textview.getTotalPaddingTop();
                        int k1 = textview.getScrollX();
                        int l1 = textview.getScrollY();
                        Layout layout = textview.getLayout();
                        k = layout.getOffsetForHorizontal(layout.getLineForVertical((l - j1) + l1), (k - i1) + k1);
                        spannable = (ev[])spannable.getSpans(k, k, com/whatsapp/ev);
                        if (spannable.length == 0)
                        {
                            break label2;
                        }
                        a = spannable[0];
                        if (j == 1)
                        {
                            a.a(textview, motionevent);
                            if (i == 0)
                            {
                                break label3;
                            }
                        }
                        if (j == 0)
                        {
                            a.a(textview, motionevent);
                        }
                    }
                    return true;
                }
                if (i == 0)
                {
                    break label0;
                }
            }
            if (j == 3 && a != null)
            {
                a.a(textview, motionevent);
            }
        }
        return false;
    }
}
