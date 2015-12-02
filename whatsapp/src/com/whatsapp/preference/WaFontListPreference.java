// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.DialogToastActivity;

// Referenced classes of package com.whatsapp.preference:
//            WaListPreference, c, b

public class WaFontListPreference extends WaListPreference
{

    public static int c = 0;
    private int b;

    public WaFontListPreference(Context context)
    {
        super(context);
    }

    public WaFontListPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    static int a(WaFontListPreference wafontlistpreference, int i)
    {
        wafontlistpreference.b = i;
        return i;
    }

    protected void onDialogClosed(boolean flag)
    {
        super.onDialogClosed(flag);
        CharSequence acharsequence[] = getEntryValues();
        if (flag && b >= 0 && acharsequence != null)
        {
            String s = acharsequence[b].toString();
            if (callChangeListener(s))
            {
                setValue(s);
            }
        }
    }

    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder)
    {
        boolean flag = WaListPreference.a;
        super.onPrepareDialogBuilder(builder);
        c c1 = new c(this, getEntries(), getEntryValues());
        b = findIndexOfValue(getValue());
        builder.setSingleChoiceItems(c1, b, new b(this));
        builder.setPositiveButton(null, null);
        if (flag)
        {
            DialogToastActivity.g++;
        }
    }

    public boolean persistString(String s)
    {
        c = Integer.parseInt(s);
        return super.persistString(s);
    }

}
