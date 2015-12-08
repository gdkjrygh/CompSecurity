// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.recommendvip;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.go.weatherex.recommendvip:
//            RecommendVipActivity

class d
    implements android.content.DialogInterface.OnKeyListener
{

    final RecommendVipActivity a;

    d(RecommendVipActivity recommendvipactivity)
    {
        a = recommendvipactivity;
        super();
    }

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            RecommendVipActivity.c(a).dismiss();
            return true;
        } else
        {
            return false;
        }
    }
}
