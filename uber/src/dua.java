// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;

public final class dua
{

    public static String a(Context context)
    {
        if (!TextUtils.isEmpty(""))
        {
            return "";
        } else
        {
            return context.getPackageManager().getInstallerPackageName(context.getPackageName());
        }
    }
}
