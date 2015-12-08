// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.widget.DatePicker;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.weather.commons.ups.ui:
//            DatePickerDialogFragment, TwcDatePickerDialogListener

class val.datePickerDialog
    implements android.content.ener
{

    final DatePickerDialogFragment this$0;
    final AtomicBoolean val$buttonPressed;
    final DatePickerDialog val$datePickerDialog;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        boolean flag = true;
        val$buttonPressed.set(true);
        if (i != -1)
        {
            flag = false;
        }
        DatePickerDialogFragment.access$000(DatePickerDialogFragment.this).dialogDismissed(DatePickerDialogFragment.this, flag);
        if (flag)
        {
            dialoginterface = val$datePickerDialog.getDatePicker();
            dialoginterface.clearFocus();
            DatePickerDialogFragment.access$000(DatePickerDialogFragment.this).onDateSet(dialoginterface, dialoginterface.getYear(), dialoginterface.getMonth(), dialoginterface.getDayOfMonth());
        }
    }

    ()
    {
        this$0 = final_datepickerdialogfragment;
        val$buttonPressed = atomicboolean;
        val$datePickerDialog = DatePickerDialog.this;
        super();
    }
}
