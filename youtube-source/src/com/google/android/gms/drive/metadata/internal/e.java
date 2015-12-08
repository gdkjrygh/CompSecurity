// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.drive.metadata.a;
import java.util.ArrayList;
import java.util.Collection;

public final class e extends a
{

    public e(String s)
    {
        super(s);
    }

    protected final void a(Bundle bundle, Object obj)
    {
        obj = (Collection)obj;
        bundle.putParcelableArrayList(a(), new ArrayList(((Collection) (obj))));
    }

    protected final Object b(Bundle bundle)
    {
        return bundle.getParcelableArrayList(a());
    }
}
