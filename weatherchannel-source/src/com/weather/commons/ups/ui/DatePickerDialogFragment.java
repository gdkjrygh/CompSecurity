// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import com.google.common.base.Preconditions;
import com.weather.util.date.Day;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.weather.commons.ups.ui:
//            TwcDatePickerDialogListener

public class DatePickerDialogFragment extends DialogFragment
{

    private final TwcDatePickerDialogListener callback;
    private final int dayOfMonth;
    private final String dialogTitle;
    private final int monthOfYear;
    private final int yearOfBirth;

    public DatePickerDialogFragment(TwcDatePickerDialogListener twcdatepickerdialoglistener, String s, Day day)
    {
        callback = (TwcDatePickerDialogListener)Preconditions.checkNotNull(twcdatepickerdialoglistener);
        dialogTitle = s;
        yearOfBirth = day.getYear();
        monthOfYear = day.getMonthOfYear();
        dayOfMonth = day.getDayOfMonth();
    }

    public Dialog onCreateDialog(final Bundle datePickerDialog)
    {
        final AtomicBoolean buttonPressed = new AtomicBoolean();
        datePickerDialog = new DatePickerDialog(null, yearOfBirth, monthOfYear, dayOfMonth, buttonPressed) {

            final DatePickerDialogFragment this$0;
            final AtomicBoolean val$buttonPressed;

            protected void onStop()
            {
                super.onStop();
                if (!buttonPressed.get())
                {
                    callback.dialogDismissed(DatePickerDialogFragment.this, false);
                }
            }

            
            {
                this$0 = DatePickerDialogFragment.this;
                buttonPressed = atomicboolean;
                super(final_context, ondatesetlistener, i, j, k);
            }
        };
        datePickerDialog.setTitle(dialogTitle);
        buttonPressed = new android.content.DialogInterface.OnClickListener() {

            final DatePickerDialogFragment this$0;
            final AtomicBoolean val$buttonPressed;
            final DatePickerDialog val$datePickerDialog;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                boolean flag = true;
                buttonPressed.set(true);
                if (i != -1)
                {
                    flag = false;
                }
                callback.dialogDismissed(DatePickerDialogFragment.this, flag);
                if (flag)
                {
                    dialoginterface = datePickerDialog.getDatePicker();
                    dialoginterface.clearFocus();
                    callback.onDateSet(dialoginterface, dialoginterface.getYear(), dialoginterface.getMonth(), dialoginterface.getDayOfMonth());
                }
            }

            
            {
                this$0 = DatePickerDialogFragment.this;
                buttonPressed = atomicboolean;
                datePickerDialog = datepickerdialog;
                super();
            }
        };
        datePickerDialog.setButton(-2, getString(0x1040000), buttonPressed);
        datePickerDialog.setButton(-1, getString(com.weather.commons.R.string.date_picker_btn_set), buttonPressed);
        return datePickerDialog;
    }

}
