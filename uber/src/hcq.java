// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class hcq
{

    public static void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalStateException("TripHistoryActivity must specify an intent action.");
        } else
        {
            return;
        }
    }
}
