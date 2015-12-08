// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

// Referenced classes of package com.walmart.android.ui:
//            DialogFactory

public class DialogHelper
{

    private static final String TAG = com/walmart/android/ui/DialogHelper.getSimpleName();
    private static long lastDialogActivityTime;

    public DialogHelper()
    {
    }

    public static void displayErrorDialog(int i, Context context)
    {
        displayErrorDialog(context.getResources().getString(i), context);
    }

    public static void displayErrorDialog(String s, Context context)
    {
        displayErrorDialog(null, s, context, null);
    }

    public static void displayErrorDialog(String s, Integer integer, Context context)
    {
        if (integer.intValue() == 0x15f92)
        {
            s = null;
        }
        displayErrorDialog(s, integer, context, false, null);
    }

    public static void displayErrorDialog(String s, Integer integer, Context context, boolean flag, android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        String s1;
        String s2;
        Object obj;
        obj = null;
        s2 = obj;
        s1 = s;
        if (s != null) goto _L2; else goto _L1
_L1:
        integer.intValue();
        JVM INSTR tableswitch 90002 90003: default 40
    //                   90002 135
    //                   90003 124;
           goto _L3 _L4 _L5
_L3:
        s1 = "Oops! Something went wrong. Please try again.";
        Log.e("DIALOG", (new StringBuilder()).append("unkn error code ").append(integer).toString(), new Exception());
        s2 = obj;
_L2:
        if (s1 == null) goto _L7; else goto _L6
_L6:
        if (!flag) goto _L9; else goto _L8
_L8:
        if (!isItOkToBotherUserNow()) goto _L7; else goto _L9
_L9:
        if (s2 == null) goto _L11; else goto _L10
_L10:
        s = DialogFactory.createAlertDialog(s2, s1, context);
_L14:
        if (s == null) goto _L7; else goto _L12
_L12:
        s.setOnDismissListener(ondismisslistener);
        s.show();
_L7:
        return;
_L5:
        s1 = "Sorry, something went wrong while retrieving data. Please try again later.";
        s2 = obj;
        continue; /* Loop/switch isn't completed */
_L4:
        s2 = "Network problem";
        s1 = "Sorry, there seems to be a problem with your network connection.";
        continue; /* Loop/switch isn't completed */
_L11:
        s = DialogFactory.createAlertDialog(s1, context);
        if (true) goto _L14; else goto _L13
_L13:
        s;
        Log.e(TAG, "Unable to show dialog.", s);
        return;
        if (true) goto _L2; else goto _L15
_L15:
    }

    public static void displayErrorDialog(String s, String s1, Context context)
    {
        displayErrorDialog(s, s1, context, null);
    }

    public static void displayErrorDialog(String s, String s1, Context context, android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        try
        {
            s = DialogFactory.createAlertDialog(s, s1, context);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(TAG, "Unable to show dialog.", s);
            return;
        }
        if (ondismisslistener == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        s.setOnDismissListener(ondismisslistener);
        s.show();
        return;
    }

    public static boolean isItOkToBotherUserNow()
    {
        long l = Math.abs(lastDialogActivityTime - System.currentTimeMillis());
        lastDialogActivityTime = System.currentTimeMillis();
        return l > 10000L;
    }

}
