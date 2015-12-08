// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


final class iq extends ThreadLocal
{

    iq()
    {
    }

    protected final Object initialValue()
    {
        return new String[5];
    }
}
