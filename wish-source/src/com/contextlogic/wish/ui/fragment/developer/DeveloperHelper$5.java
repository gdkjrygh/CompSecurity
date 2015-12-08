// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.developer;

import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

// Referenced classes of package com.contextlogic.wish.ui.fragment.developer:
//            DeveloperHelper

static final class val.devFbAppCheckbox
    implements android.view.er
{

    final Activity val$activity;
    final Spinner val$countriesSpinner;
    final CheckBox val$devFbAppCheckbox;
    final EditText val$serverPathText;

    public void onClick(View view)
    {
        val$countriesSpinner.getSelectedItem().toString();
        DeveloperHelper.access$200(val$activity, val$serverPathText.getText().toString(), Boolean.valueOf(val$devFbAppCheckbox.isChecked()));
    }

    (Spinner spinner, Activity activity1, EditText edittext, CheckBox checkbox)
    {
        val$countriesSpinner = spinner;
        val$activity = activity1;
        val$serverPathText = edittext;
        val$devFbAppCheckbox = checkbox;
        super();
    }
}
