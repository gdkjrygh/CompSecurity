// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.DatePickerDialog;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.weather.commons.ups.ui:
//            DatePickerDialogFragment, TwcDatePickerDialogListener

class val.buttonPressed extends DatePickerDialog
{

    final DatePickerDialogFragment this$0;
    final AtomicBoolean val$buttonPressed;

    protected void onStop()
    {
        super.onStop();
        if (!val$buttonPressed.get())
        {
            DatePickerDialogFragment.access$000(DatePickerDialogFragment.this).dialogDismissed(DatePickerDialogFragment.this, false);
        }
    }

    (android.app.istener istener, int i, int j, int k, AtomicBoolean atomicboolean)
    {
        this$0 = final_datepickerdialogfragment;
        val$buttonPressed = atomicboolean;
        super(Context.this, istener, i, j, k);
    }
}
