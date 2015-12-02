// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

// Referenced classes of package com.whatsapp:
//            og, ViewSharedContactActivity, dh

class oe extends og
{

    final byte R[];
    final ViewSharedContactActivity S;

    oe(ViewSharedContactActivity viewsharedcontactactivity, dh dh, String s, int i, String s1, byte abyte0[])
    {
        S = viewsharedcontactactivity;
        R = abyte0;
        super(dh, s, i, s1);
    }

    public InputStream a(boolean flag)
    {
        return new ByteArrayInputStream(R);
    }
}
