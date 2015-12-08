// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.a.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;

public final class a
{

    public static boolean a(Context context)
    {
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
