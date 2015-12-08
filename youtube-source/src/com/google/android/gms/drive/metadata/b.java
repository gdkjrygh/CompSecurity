// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.internal.gi;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class b
{

    private final String a;
    private final Set b;

    protected b(String s)
    {
        a = (String)gi.a(s, "fieldName");
        b = Collections.singleton(s);
    }

    protected b(String s, Collection collection)
    {
        a = (String)gi.a(s, "fieldName");
        b = Collections.unmodifiableSet(new HashSet(collection));
    }

    public final Object a(Bundle bundle)
    {
        gi.a(bundle, "bundle");
        if (bundle.get(a) != null)
        {
            return b(bundle);
        } else
        {
            return null;
        }
    }

    public final String a()
    {
        return a;
    }

    protected abstract void a(Bundle bundle, Object obj);

    public final void a(Object obj, Bundle bundle)
    {
        gi.a(bundle, "bundle");
        if (obj == null)
        {
            bundle.putString(a, null);
            return;
        } else
        {
            a(bundle, obj);
            return;
        }
    }

    protected abstract Object b(Bundle bundle);

    public String toString()
    {
        return a;
    }
}
