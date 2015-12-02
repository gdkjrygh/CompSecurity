// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.view.View;
import android.widget.TextView;

public final class hqu extends hpb
{

    private final TextView a;
    private final hrf b;

    public hqu(TextView textview)
    {
        a = textview;
        b = (hrf)textview;
    }

    public final void afterTextChanged(Editable editable)
    {
        if (b.c())
        {
            editable = a.getRootView().findViewById(a.getNextFocusForwardId());
            if (editable != null)
            {
                editable.requestFocus();
            }
        }
    }
}
