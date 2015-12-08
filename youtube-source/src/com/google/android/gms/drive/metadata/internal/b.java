// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.drive.metadata.c;
import java.util.Date;

public final class b extends c
{

    public b(String s)
    {
        super(s);
    }

    protected final void a(Bundle bundle, Object obj)
    {
        obj = (Date)obj;
        bundle.putLong(a(), ((Date) (obj)).getTime());
    }

    protected final Object b(Bundle bundle)
    {
        return new Date(bundle.getLong(a()));
    }
}
