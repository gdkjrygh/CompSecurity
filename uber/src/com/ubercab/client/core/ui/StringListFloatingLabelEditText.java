// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import com.ubercab.ui.AutoCompleteFloatingLabelEditText;
import hpb;
import java.util.List;

public class StringListFloatingLabelEditText extends AutoCompleteFloatingLabelEditText
{

    public StringListFloatingLabelEditText(Context context)
    {
        super(context);
    }

    public StringListFloatingLabelEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0x7f010003);
        b(0);
        a(new hpb() {

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

            
            {
                a = StringListFloatingLabelEditText.this;
                super();
            }
        });
    }

    public final void a(List list)
    {
        a(((ListAdapter) (new ArrayAdapter(getContext(), 0x109000a, list))));
    }
}
