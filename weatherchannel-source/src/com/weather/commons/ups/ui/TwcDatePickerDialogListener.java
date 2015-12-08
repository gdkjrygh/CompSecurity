// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.DialogFragment;

public interface TwcDatePickerDialogListener
    extends android.app.DatePickerDialog.OnDateSetListener
{

    public abstract void dialogDismissed(DialogFragment dialogfragment, boolean flag);
}
