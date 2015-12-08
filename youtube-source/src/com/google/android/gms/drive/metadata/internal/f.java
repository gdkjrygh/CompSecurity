// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.b;
import java.util.Collection;

public abstract class f extends b
{

    public f(String s, Collection collection)
    {
        super(s, collection);
    }

    protected final void a(Bundle bundle, Object obj)
    {
        obj = (Parcelable)obj;
        bundle.putParcelable(a(), ((Parcelable) (obj)));
    }

    protected final Object b(Bundle bundle)
    {
        return bundle.getParcelable(a());
    }
}
