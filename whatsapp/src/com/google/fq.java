// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            cT

class fq
{

    static final int a[];

    static 
    {
        a = new int[cT.values().length];
        try
        {
            a[cT.INT32.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            a[cT.SINT32.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            a[cT.SFIXED32.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            a[cT.INT64.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            a[cT.SINT64.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            a[cT.SFIXED64.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            a[cT.BOOL.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            a[cT.FLOAT.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            a[cT.DOUBLE.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            a[cT.UINT32.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            a[cT.FIXED32.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[cT.UINT64.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[cT.FIXED64.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[cT.STRING.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[cT.BYTES.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[cT.ENUM.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[cT.MESSAGE.ordinal()] = 17;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[cT.GROUP.ordinal()] = 18;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
