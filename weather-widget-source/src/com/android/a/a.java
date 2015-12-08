// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;

import android.content.Intent;

// Referenced classes of package com.android.a:
//            aa, m

public class a extends aa
{

    private Intent b;

    public a()
    {
    }

    public a(m m)
    {
        super(m);
    }

    public String getMessage()
    {
        if (b != null)
        {
            return "User needs to (re)enter credentials.";
        } else
        {
            return super.getMessage();
        }
    }
}
