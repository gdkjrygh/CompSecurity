// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.text.Editable;
import android.text.TextWatcher;
import com.ubercab.ui.Button;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            EditEmailFragment

final class a
    implements TextWatcher
{

    final EditEmailFragment a;

    public final void afterTextChanged(Editable editable)
    {
        Button button = a.mEmailSaveButton;
        boolean flag;
        if (!editable.toString().isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        button.setEnabled(flag);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (EditEmailFragment editemailfragment)
    {
        a = editemailfragment;
        super();
    }
}
