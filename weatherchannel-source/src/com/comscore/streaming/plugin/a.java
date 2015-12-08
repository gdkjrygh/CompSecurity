// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming.plugin;

import com.comscore.streaming.StreamSenseState;

class a
{

    static final int a[];

    static 
    {
        a = new int[StreamSenseState.values().length];
        try
        {
            a[StreamSenseState.IDLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
    }
}
