// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            WebImagePicker

class w8
    implements android.widget.TextView.OnEditorActionListener
{

    final WebImagePicker a;

    w8(WebImagePicker webimagepicker)
    {
        a = webimagepicker;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 3)
        {
            WebImagePicker.g(a);
            return true;
        } else
        {
            return false;
        }
    }
}
