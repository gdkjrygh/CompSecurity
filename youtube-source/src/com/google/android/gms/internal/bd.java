// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            do, bo, bl

public final class bd
{

    public static boolean a(Context context, bo bo1, bl bl)
    {
        if (bo1 == null)
        {
            com.google.android.gms.internal.do.d("No intent data for launcher overlay.");
            return false;
        }
        bl = new Intent();
        if (TextUtils.isEmpty(bo1.url))
        {
            com.google.android.gms.internal.do.d("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(bo1.mimeType))
        {
            bl.setDataAndType(Uri.parse(bo1.url), bo1.mimeType);
        } else
        {
            bl.setData(Uri.parse(bo1.url));
        }
        bl.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(bo1.packageName))
        {
            bl.setPackage(bo1.packageName);
        }
        if (!TextUtils.isEmpty(bo1.gs))
        {
            String as[] = bo1.gs.split("/", 2);
            if (as.length < 2)
            {
                com.google.android.gms.internal.do.d((new StringBuilder("Could not parse component name from open GMSG: ")).append(bo1.gs).toString());
                return false;
            }
            bl.setClassName(as[0], as[1]);
        }
        try
        {
            com.google.android.gms.internal.do.c((new StringBuilder("Launching an intent: ")).append(bl).toString());
            context.startActivity(bl);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.google.android.gms.internal.do.d(context.getMessage());
            return false;
        }
        return true;
    }
}
