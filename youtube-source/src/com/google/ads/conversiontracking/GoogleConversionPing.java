// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.conversiontracking;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;

// Referenced classes of package com.google.ads.conversiontracking:
//            a, g, b

public final class GoogleConversionPing
{

    public static void a(Context context, String s, String s1, String s2, Map map)
    {
        if (TextUtils.isEmpty(s2))
        {
            Log.e("GoogleConversionPing", "Error sending remarketing ping with empty screen name");
            return;
        }
        try
        {
            (new Thread(new a(b.b(context, (new g()).a(s).a().b(s1).c("").d(s2).a(null)), true, null, context))).start();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("GoogleConversionPing", "Error sending ping", context);
        }
    }
}
