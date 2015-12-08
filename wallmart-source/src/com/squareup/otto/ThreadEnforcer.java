// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.otto;

import android.os.Looper;

// Referenced classes of package com.squareup.otto:
//            Bus

public interface ThreadEnforcer
{

    public static final ThreadEnforcer ANY = new ThreadEnforcer() {

        public void enforce(Bus bus)
        {
        }

    };
    public static final ThreadEnforcer MAIN = new ThreadEnforcer() {

        public void enforce(Bus bus)
        {
            if (Looper.myLooper() != Looper.getMainLooper())
            {
                throw new IllegalStateException((new StringBuilder()).append("Event bus ").append(bus).append(" accessed from non-main thread ").append(Looper.myLooper()).toString());
            } else
            {
                return;
            }
        }

    };

    public abstract void enforce(Bus bus);

}
