// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            CallLogActivity, App

class a_e extends bv
{

    final CallLogActivity b;

    a_e(CallLogActivity calllogactivity)
    {
        b = calllogactivity;
        super();
    }

    public void a(View view)
    {
        App.b(CallLogActivity.b(b), b);
        b.finish();
    }
}
