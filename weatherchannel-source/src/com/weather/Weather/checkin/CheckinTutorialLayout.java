// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinTutorialView, CheckinTutorialController

public class CheckinTutorialLayout extends FrameLayout
    implements CheckinTutorialView
{

    CheckinTutorialController controller;
    private Dialog dialog;

    public CheckinTutorialLayout(Context context)
    {
        super(context);
    }

    public CheckinTutorialLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CheckinTutorialLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void displayDialog()
    {
        if (dialog == null)
        {
            dialog = (new android.app.AlertDialog.Builder(getContext())).setMessage(0x7f0700c9).setPositiveButton(0x7f0700c8, new _cls2()).setOnCancelListener(new _cls1()).create();
            dialog.setCanceledOnTouchOutside(true);
            dialog.show();
            ((TextView)dialog.findViewById(0x102000b)).setGravity(17);
            ((Button)dialog.findViewById(0x1020019)).setTextColor(getResources().getColor(0x7f0b001c));
        }
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
