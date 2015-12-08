// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.player.mp4;


public final class b
{

    private final int a;
    private final String b;

    public b(String s)
    {
        if (s.length() != 4)
        {
            throw new IllegalArgumentException("Tag not four characters long");
        } else
        {
            b = s;
            a = s.charAt(0) << 24 | s.charAt(1) << 16 | s.charAt(2) << 8 | s.charAt(3);
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        return a == ((b)obj).a;
    }

    public final String toString()
    {
        return b;
    }
}
