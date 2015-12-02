// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.ubercab.client.feature.trip.address:
//            AddressFlowEditText

final class a
    implements android.widget.nListener
{

    final AddressFlowEditText a;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        boolean flag1 = false;
        boolean flag;
        if (keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == 3 || flag)
        {
            AddressFlowEditText.e(a);
            flag1 = true;
        }
        return flag1;
    }

    (AddressFlowEditText addressflowedittext)
    {
        a = addressflowedittext;
        super();
    }
}
