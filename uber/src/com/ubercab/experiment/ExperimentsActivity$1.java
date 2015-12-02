// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.experiment;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.ubercab.experiment:
//            ExperimentsActivity

final class a
    implements android.content.elListener
{

    final AtomicBoolean a;

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.set(true);
    }

    ner(AtomicBoolean atomicboolean)
    {
        a = atomicboolean;
        super();
    }
}
