// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.view.View;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinMapViewLayout, CheckinMapController

private class <init>
    implements android.view.ButtonListener
{

    private final int code;
    final CheckinMapViewLayout this$0;

    public void onClick(View view)
    {
        controller.checkin(code);
    }

    private (int i)
    {
        this$0 = CheckinMapViewLayout.this;
        super();
        code = i;
    }

    code(int i, code code1)
    {
        this(i);
    }
}
