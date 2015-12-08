// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


final class r
{

    public final boolean a;
    public final boolean b;
    public final int c;

    public r(boolean flag, boolean flag1, int i)
    {
        a = flag;
        b = flag1;
        c = i;
    }

    public final String toString()
    {
        return (new StringBuilder("ContentVideoState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" wasStopped=").append(a).append(" wasEnded=").append(b).append(" videoPositionMillis=").append(c).append("}").toString();
    }
}
