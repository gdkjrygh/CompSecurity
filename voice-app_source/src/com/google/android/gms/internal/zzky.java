// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Base64;

public final class zzky
{

    public static String zzi(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return Base64.encodeToString(abyte0, 0);
        }
    }

    public static String zzj(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return Base64.encodeToString(abyte0, 10);
        }
    }
}
