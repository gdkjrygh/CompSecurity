// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.Filter;

// Referenced classes of package com.whatsapp:
//            ab8, ContactPicker, App, abx

class wz extends Filter
{

    final ab8 a;

    private wz(ab8 ab8_1)
    {
        a = ab8_1;
        super();
    }

    wz(ab8 ab8_1, abx abx)
    {
        this(ab8_1);
    }

    protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
    {
        return new android.widget.Filter.FilterResults();
    }

    protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
    {
label0:
        {
            if (charsequence == null || charsequence.length() == 0)
            {
                ContactPicker.b(a.d, null);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            ContactPicker.b(a.d, charsequence.toString());
        }
        a.notifyDataSetChanged();
    }
}
