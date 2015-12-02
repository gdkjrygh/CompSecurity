// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.text.TextUtils;
import hpb;

// Referenced classes of package com.ubercab.client.core.ui:
//            ClearableEditText

final class a extends hpb
{

    final ClearableEditText a;

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (a.hasFocus())
        {
            ClearableEditText clearableedittext = a;
            boolean flag;
            if (!TextUtils.isEmpty(charsequence))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            clearableedittext.a(flag);
        }
    }

    (ClearableEditText clearableedittext)
    {
        a = clearableedittext;
        super();
    }
}
