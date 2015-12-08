// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.util:
//            ShippingPassUtil

static final class val.activity
    implements android.content.lickListener
{

    final Activity val$activity;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        ShippingPassUtil.access$000(val$activity);
    }

    ner(Activity activity1)
    {
        val$activity = activity1;
        super();
    }
}
