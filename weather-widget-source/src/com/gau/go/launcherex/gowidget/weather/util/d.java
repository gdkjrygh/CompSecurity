// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;

public class d
{

    public static ArrayList a;

    static 
    {
        a = new ArrayList();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setDataAndType(Uri.parse("content://com.android.calendar"), "time/epoch");
        intent.addFlags(0x10000000);
        a.add(intent);
        intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setClassName("com.android.calendar", "com.android.calendar.LaunchActivity");
        intent.addFlags(0x10000000);
        a.add(intent);
    }
}
