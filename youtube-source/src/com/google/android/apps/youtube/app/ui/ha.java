// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;

public final class ha
{

    public final Video a;
    public final Transfer b;

    private ha(Video video)
    {
        a = (Video)c.a(video);
        b = null;
    }

    private ha(Transfer transfer)
    {
        b = (Transfer)c.a(transfer);
        a = null;
    }

    public static ha a(Video video)
    {
        return new ha(video);
    }

    public static ha a(Transfer transfer)
    {
        return new ha(transfer);
    }

    public final boolean a()
    {
        return a != null;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ha)
        {
            obj = (ha)obj;
            flag = flag1;
            if (com.google.android.apps.youtube.common.fromguava.b.a(a, ((ha) (obj)).a))
            {
                flag = flag1;
                if (com.google.android.apps.youtube.common.fromguava.b.a(b, ((ha) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return (i + 527) * 31 + j;
    }
}
