// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.ia;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.gi;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

// Referenced classes of package com.google.android.gms.wallet.ia:
//            a

public final class PurchaseIntentBuilder extends a
{

    public PurchaseIntentBuilder(Context context)
    {
        super(context, "com.google.android.gms.wallet.ACTION_REVIEW_PURCHASE_OPTIONS", "flow_inapp");
    }

    protected final Intent onIntentBuilt(Intent intent, BuyFlowConfig buyflowconfig)
    {
        boolean flag;
        if (mIntent.getStringExtra("com.google.android.libraries.inapp.EXTRA_JWT") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.b(flag, "JWT is required");
        return intent;
    }

    public final PurchaseIntentBuilder setDisplayHints(Bundle bundle)
    {
        mArgs.putBundle("com.google.android.libraries.inapp.EXTRA_DISPLAY_HINTS", bundle);
        return this;
    }

    public final PurchaseIntentBuilder setFreeUsageAmount(int i)
    {
        mArgs.putInt("com.google.android.gms.wallet.freeUsageAmount", i);
        return this;
    }

    public final PurchaseIntentBuilder setJwt(String s)
    {
        mIntent.putExtra("com.google.android.libraries.inapp.EXTRA_JWT", s);
        return this;
    }

    public final PurchaseIntentBuilder setUiTemplate(int i)
    {
        mArgs.putInt("com.google.android.libraries.inapp.EXTRA_UI_TEMPLATE", i);
        return this;
    }

    public final PurchaseIntentBuilder setUsageUnit(int i)
    {
        mArgs.putInt("com.google.android.libraries.inapp.EXTRA_USAGE_UNIT", i);
        return this;
    }
}
