// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.e;

// Referenced classes of package com.google.android.gms.internal:
//            ce, cz, do, cj, 
//            ck, ch, de

public final class cf
{

    public static de a(Context context, ce ce1, ch ch)
    {
        if (ce1.en.iP)
        {
            com.google.android.gms.internal.do.a("Fetching ad response from local ad request service.");
            context = new cj(context, ce1, ch);
            context.e();
            return context;
        }
        com.google.android.gms.internal.do.a("Fetching ad response from remote ad request service.");
        if (e.a(context) != 0)
        {
            com.google.android.gms.internal.do.d("Failed to connect to remote ad request service.");
            return null;
        } else
        {
            return new ck(context, ce1, ch);
        }
    }
}
