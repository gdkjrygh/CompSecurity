// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;

class pe
{

    static final int a[];

    static 
    {
        a = new int[AppStatsDsOpType.values().length];
        try
        {
            a[AppStatsDsOpType.APP_STATS_DS_INSERT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
    }
}
