// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.golauncher.purchase.sevendaypurchase;

import android.content.Intent;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;

// Referenced classes of package com.jiubang.golauncher.purchase.sevendaypurchase:
//            SevenDayPurchaseGoogleActivity

public class a
{

    public static void a(boolean flag)
    {
        Intent intent = new Intent(GoWidgetApplication.b(), com/jiubang/golauncher/purchase/sevendaypurchase/SevenDayPurchaseGoogleActivity);
        intent.setFlags(0x10000000);
        intent.putExtra("isfromcheckpay", flag);
        GoWidgetApplication.b().startActivity(intent);
    }
}
