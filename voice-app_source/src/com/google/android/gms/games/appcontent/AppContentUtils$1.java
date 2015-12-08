// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentUtils, AppContentActionRef

static final class zzaoH
    implements pContentRunner
{

    final ArrayList zzaoH;

    public void zzb(ArrayList arraylist, int i)
    {
        zzaoH.add(new AppContentActionRef(arraylist, i));
    }

    f(ArrayList arraylist)
    {
        zzaoH = arraylist;
        super();
    }
}
