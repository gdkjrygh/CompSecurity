// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.text.Editable;
import android.widget.ListAdapter;
import hpb;

// Referenced classes of package com.ubercab.client.core.ui:
//            StringListFloatingLabelEditText

final class a extends hpb
{

    final StringListFloatingLabelEditText a;

    public final void afterTextChanged(Editable editable)
    {
        Object obj = a.d();
        if (obj != null && ((ListAdapter) (obj)).getCount() > 0)
        {
            obj = (String)((ListAdapter) (obj)).getItem(0);
            if (obj != null && editable.length() >= ((String) (obj)).length())
            {
                a.e();
            }
        }
    }

    (StringListFloatingLabelEditText stringlistfloatinglabeledittext)
    {
        a = stringlistfloatinglabeledittext;
        super();
    }
}
