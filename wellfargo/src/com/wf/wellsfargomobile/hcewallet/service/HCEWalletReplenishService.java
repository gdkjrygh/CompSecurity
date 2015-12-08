// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.wf.wellsfargomobile.WFApp;
import java.util.ArrayList;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.service:
//            WalletIntentService

public class HCEWalletReplenishService extends Service
{

    private ArrayList a;

    public HCEWalletReplenishService()
    {
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            Intent intent = new Intent(this, com/wf/wellsfargomobile/hcewallet/service/WalletIntentService);
            intent.putExtra("WALLET_INTENT_SERVICE_CD", 1005);
            intent.putParcelableArrayListExtra("TOKEN_KEY_ARR", a);
            startService(intent);
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        Log.d("ReplenishService", "About To Start ReplenishmentService");
        if (intent != null && intent.hasExtra("TOKENS"))
        {
            a = intent.getParcelableArrayListExtra("TOKENS");
            long l = System.currentTimeMillis();
            long l1 = WFApp.y();
            if (WFApp.y() != 0L && l - l1 > 0x927c0L)
            {
                a(true);
            }
        }
        return super.onStartCommand(intent, i, j);
    }
}
