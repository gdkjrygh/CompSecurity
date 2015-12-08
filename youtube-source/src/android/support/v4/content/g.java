// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;

// Referenced classes of package android.support.v4.content:
//            f

class g extends f
{

    g()
    {
    }

    public final Intent a(ComponentName componentname)
    {
        return Intent.makeMainActivity(componentname);
    }
}
