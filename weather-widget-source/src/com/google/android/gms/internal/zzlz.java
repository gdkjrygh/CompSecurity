// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zze;
import java.util.regex.Pattern;

public class zzlz
{

    private static final Pattern zzagg = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean zzcB(String s)
    {
        return s == null || zze.zzacG.zzb(s);
    }

}
