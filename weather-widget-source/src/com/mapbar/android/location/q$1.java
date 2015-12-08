// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.os.Process;

// Referenced classes of package com.mapbar.android.location:
//            q

final class <init> extends <init>
{

    private q b;

    public final Object call()
    {
        try
        {
            Process.setThreadPriority(10);
            q q1 = b;
            Object aobj[] = a;
            q1.a();
        }
        catch (Exception exception) { }
        return null;
    }

    (q q1)
    {
        b = q1;
        super();
    }
}
