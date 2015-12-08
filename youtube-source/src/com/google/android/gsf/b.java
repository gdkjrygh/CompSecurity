// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.content.Intent;

public final class b
{

    public static final Intent a = (new Intent()).setPackage("com.google.android.gsf.login").setAction("com.google.android.gsf.action.GET_GLS").addCategory("android.intent.category.DEFAULT");

    static String a(int i)
    {
        switch (i)
        {
        default:
            return "Unknown error";

        case 0: // '\0'
            return "The Google login service cannot be found.";

        case 1: // '\001'
            return "The Google login service cannot be verified.";
        }
    }

}
