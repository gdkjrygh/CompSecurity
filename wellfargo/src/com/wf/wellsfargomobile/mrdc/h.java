// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;


// Referenced classes of package com.wf.wellsfargomobile.mrdc:
//            ImageModeType

class h
{

    static final int a[];

    static 
    {
        a = new int[ImageModeType.values().length];
        try
        {
            a[ImageModeType.FRONT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ImageModeType.REAR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
