// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.messagecenter.a;

import java.text.SimpleDateFormat;
import java.util.Locale;

public abstract class b
{

    public static String a(long l, String s)
    {
        return (new SimpleDateFormat(s, Locale.US)).format(Long.valueOf(l));
    }
}
