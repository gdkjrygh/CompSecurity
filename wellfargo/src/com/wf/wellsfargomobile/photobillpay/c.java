// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.photobillpay;

import android.content.Intent;

public final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final String d = com/wf/wellsfargomobile/photobillpay/c.getName();
    private static final c e[];

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c b(Intent intent)
    {
        if (!intent.hasExtra(d))
        {
            throw new IllegalStateException();
        } else
        {
            return values()[intent.getIntExtra(d, -1)];
        }
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/wf/wellsfargomobile/photobillpay/c, s);
    }

    public static c[] values()
    {
        return (c[])e.clone();
    }

    public void a(Intent intent)
    {
        intent.putExtra(d, ordinal());
    }

    static 
    {
        a = new c("PHOTO_SCAN_TIMED_OUT", 0);
        b = new c("PHOTO_SUBMIT_TIMED_OUT", 1);
        c = new c("COMPLETED_SUCCESS", 2);
        e = (new c[] {
            a, b, c
        });
    }
}
