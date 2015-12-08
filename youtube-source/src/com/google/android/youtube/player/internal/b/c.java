// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal.b;

import android.app.Activity;
import android.content.Context;
import com.google.android.youtube.player.internal.as;
import com.google.android.youtube.player.internal.at;
import com.google.android.youtube.player.internal.g;

// Referenced classes of package com.google.android.youtube.player.internal.b:
//            e

public abstract class c
{

    private static final c a = b();

    public c()
    {
    }

    public static c a()
    {
        return a;
    }

    private static c b()
    {
        Object obj = Class.forName("com.google.android.youtube.api.locallylinked.LocallyLinkedFactory").asSubclass(com/google/android/youtube/player/internal/b/c);
        obj = (c)((Class) (obj)).newInstance();
        return ((c) (obj));
        Object obj1;
        obj1;
        try
        {
            throw new IllegalStateException(((Throwable) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            return new e();
        }
        obj1;
        throw new IllegalStateException(((Throwable) (obj1)));
    }

    public abstract com.google.android.youtube.player.internal.c a(Context context, String s, as as, at at);

    public abstract g a(Activity activity, com.google.android.youtube.player.internal.c c1, boolean flag);

}
