// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzeu

static class 
{

    static final int zzzg[];
    static final int zzzh[];

    static 
    {
        zzzh = new int[com.google.ads.st.ErrorCode.values().length];
        try
        {
            zzzh[com.google.ads.st.ErrorCode.INTERNAL_ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            zzzh[com.google.ads.st.ErrorCode.INVALID_REQUEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            zzzh[com.google.ads.st.ErrorCode.NETWORK_ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            zzzh[com.google.ads.st.ErrorCode.NO_FILL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        zzzg = new int[com.google.ads.st.Gender.values().length];
        try
        {
            zzzg[com.google.ads.st.Gender.FEMALE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            zzzg[com.google.ads.st.Gender.MALE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            zzzg[com.google.ads.st.Gender.UNKNOWN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
