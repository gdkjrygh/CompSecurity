// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.drive.metadata:
//            b

public final class d extends b
{

    public d(String s)
    {
        super(s);
    }

    protected final void a(Bundle bundle, Object obj)
    {
        obj = (String)obj;
        bundle.putString(a(), ((String) (obj)));
    }

    protected final Object b(Bundle bundle)
    {
        return bundle.getString(a());
    }
}
