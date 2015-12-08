// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.a;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.go.weatherex.a:
//            a

class b
    implements android.widget.TextView.OnEditorActionListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 3)
        {
            com.go.weatherex.a.a.a(a);
        }
        return false;
    }
}
