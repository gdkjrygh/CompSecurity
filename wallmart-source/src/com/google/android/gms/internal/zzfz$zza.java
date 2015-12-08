// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzfz

protected static final class zzCI extends Exception
{

    private final int zzCI;

    public int getErrorCode()
    {
        return zzCI;
    }

    public (String s, int i)
    {
        super(s);
        zzCI = i;
    }
}
