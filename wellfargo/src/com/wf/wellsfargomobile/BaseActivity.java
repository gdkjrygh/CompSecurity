// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

// Referenced classes of package com.wf.wellsfargomobile:
//            WFApp

public abstract class BaseActivity extends Activity
{

    public BaseActivity()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        j;
        JVM INSTR tableswitch 14 14: default 28
    //                   14 33;
           goto _L1 _L2
_L1:
        WFApp.a(0L);
        return;
_L2:
        setResult(14, new Intent());
        finish();
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!WFApp.ae() && android.os.Build.VERSION.SDK_INT >= 11)
        {
            getWindow().setFlags(8192, 8192);
        }
    }

    protected void onRestart()
    {
        super.onRestart();
        long l = System.currentTimeMillis();
        long l1 = WFApp.y();
        if (WFApp.y() != 0L && l - l1 > 0x927c0L)
        {
            WFApp.i();
            setResult(14, new Intent());
            finish();
        }
    }

    protected void onStart()
    {
        super.onStart();
        WFApp.a(0L);
    }

    protected void onStop()
    {
        super.onStop();
        WFApp.a(System.currentTimeMillis());
    }
}
