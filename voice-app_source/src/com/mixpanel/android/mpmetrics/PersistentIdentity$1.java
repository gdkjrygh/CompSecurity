// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.SharedPreferences;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            PersistentIdentity

class this._cls0
    implements android.content.haredPreferenceChangeListener
{

    final PersistentIdentity this$0;

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        synchronized (PersistentIdentity.access$0())
        {
            PersistentIdentity.access$1(PersistentIdentity.this);
            PersistentIdentity.access$2(false);
        }
        return;
        s;
        sharedpreferences;
        JVM INSTR monitorexit ;
        throw s;
    }

    ChangeListener()
    {
        this$0 = PersistentIdentity.this;
        super();
    }
}
