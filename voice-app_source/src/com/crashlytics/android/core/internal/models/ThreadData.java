// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core.internal.models;


public class ThreadData
{
    public static final class FrameData
    {

        public final long address;
        public final String file;
        public final int importance;
        public final long offset;
        public final String symbol;

        public FrameData(long l, int i)
        {
            this(l, "", i);
        }

        public FrameData(long l, String s, int i)
        {
            this(l, s, "", 0L, i);
        }

        public FrameData(long l, String s, String s1, long l1, int i)
        {
            address = l;
            symbol = s;
            file = s1;
            offset = l1;
            importance = i;
        }
    }


    public static final int IMPORTANCE_CRASHED_THREAD = 4;
    public final FrameData frames[];
    public final int importance;
    public final String name;

    public ThreadData(int i, FrameData aframedata[])
    {
        this(null, i, aframedata);
    }

    public ThreadData(String s, int i, FrameData aframedata[])
    {
        name = s;
        importance = i;
        frames = aframedata;
    }
}
