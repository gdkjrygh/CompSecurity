// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import java.util.Locale;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            u

public final class <init> extends RuntimeException
{

    private transient (Throwable throwable, String s, Object aobj[])
    {
        super(String.format(Locale.US, s, aobj), throwable);
    }

    (Throwable throwable, String s, Object aobj[], u u)
    {
        this(throwable, s, aobj);
    }
}
