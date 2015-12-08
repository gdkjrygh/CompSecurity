// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.aa;
import java.io.File;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics, aa, Z, v

final class D extends aa
{

    private File a;

    D(v v1, File file)
    {
        a = file;
        super();
    }

    public final void a()
    {
        V v1 = Crashlytics.getInstance().q();
        if (v1 != null)
        {
            (new com.crashlytics.android.aa(v1)).a(new Z(a, v.j()));
        }
    }
}
