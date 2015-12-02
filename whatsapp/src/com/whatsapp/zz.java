// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.TextUtils;

// Referenced classes of package com.whatsapp:
//            z2, og

public final class zz extends z2
{

    public zz(og og1)
    {
        super(og1);
    }

    protected boolean b(og og1)
    {
        boolean flag;
        if (!TextUtils.equals(a.d, og1.d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        og1.d = a.d;
        og1.b = a.b;
        return flag;
    }
}
