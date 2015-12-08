// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.drive.metadata.b;

public class a extends b
{

    public a(String s)
    {
        super(s);
    }

    protected final void a(Bundle bundle, Object obj)
    {
        obj = (Boolean)obj;
        bundle.putBoolean(a(), ((Boolean) (obj)).booleanValue());
    }

    protected final Object b(Bundle bundle)
    {
        return Boolean.valueOf(bundle.getBoolean(a()));
    }
}
