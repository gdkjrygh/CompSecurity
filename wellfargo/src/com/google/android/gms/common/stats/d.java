// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import com.google.android.gms.b.a;

// Referenced classes of package com.google.android.gms.common.stats:
//            e

public final class d
{

    public static a a;
    public static a b = com.google.android.gms.b.a.a("gms:common:stats:connections:ignored_calling_processes", "");
    public static a c = com.google.android.gms.b.a.a("gms:common:stats:connections:ignored_calling_services", "");
    public static a d = com.google.android.gms.b.a.a("gms:common:stats:connections:ignored_target_processes", "");
    public static a e = com.google.android.gms.b.a.a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
    public static a f = com.google.android.gms.b.a.a("gms:common:stats:connections:time_out_duration", Long.valueOf(0x927c0L));

    static 
    {
        a = com.google.android.gms.b.a.a("gms:common:stats:connections:level", Integer.valueOf(com.google.android.gms.common.stats.e.a));
    }
}
