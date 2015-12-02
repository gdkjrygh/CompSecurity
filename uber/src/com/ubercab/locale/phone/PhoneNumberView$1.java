// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.phone;

import android.view.KeyEvent;
import android.widget.TextView;
import gpm;

// Referenced classes of package com.ubercab.locale.phone:
//            PhoneNumberView

final class a
    implements android.widget.ctionListener
{

    final PhoneNumberView a;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        return PhoneNumberView.a(a) != null && PhoneNumberView.a(a).a(i);
    }

    ner(PhoneNumberView phonenumberview)
    {
        a = phonenumberview;
        super();
    }
}
