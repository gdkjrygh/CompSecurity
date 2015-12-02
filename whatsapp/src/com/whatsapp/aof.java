// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            ee

class aof
    implements android.view.View.OnClickListener
{

    final ee a;

    aof(ee ee1)
    {
        a = ee1;
        super();
    }

    public void onClick(View view)
    {
        ee.b(a);
        a.dismiss();
    }
}
