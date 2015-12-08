// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class d
{

    public static String a(InputStream inputstream)
    {
        inputstream = new BufferedReader(new InputStreamReader(inputstream));
        StringBuffer stringbuffer = new StringBuffer();
        do
        {
            String s = inputstream.readLine();
            if (s != null)
            {
                stringbuffer.append(s);
            } else
            {
                return stringbuffer.toString();
            }
        } while (true);
    }
}
