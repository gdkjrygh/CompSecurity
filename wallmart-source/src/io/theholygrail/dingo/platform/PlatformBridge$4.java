// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.platform;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;
import android.widget.LinearLayout;

// Referenced classes of package io.theholygrail.dingo.platform:
//            PlatformBridge

class val.dialog
    implements android.content.nShowListener
{

    final PlatformBridge this$0;
    final AlertDialog val$dialog;

    public void onShow(DialogInterface dialoginterface)
    {
        try
        {
            dialoginterface = val$dialog.getButton(-1);
            Button button = val$dialog.getButton(-2);
            Button button1 = val$dialog.getButton(-3);
            int i = dialoginterface.getWidth();
            int j = button.getWidth();
            int k = button1.getWidth();
            dialoginterface = (LinearLayout)dialoginterface.getParent();
            int l = dialoginterface.getPaddingLeft();
            int i1 = dialoginterface.getPaddingRight();
            if (dialoginterface.getOrientation() == 0 && i + j + k + (l + i1) > dialoginterface.getWidth())
            {
                dialoginterface.setOrientation(1);
                dialoginterface.setGravity(5);
                PlatformBridge.access$700(PlatformBridge.this, dialoginterface);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            return;
        }
    }

    ()
    {
        this$0 = final_platformbridge;
        val$dialog = AlertDialog.this;
        super();
    }
}
