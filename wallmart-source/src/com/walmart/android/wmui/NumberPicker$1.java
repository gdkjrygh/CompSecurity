// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import java.util.Formatter;

// Referenced classes of package com.walmart.android.wmui:
//            NumberPicker

static final class mBuilder
    implements rmatter
{

    final Object mArgs[] = new Object[1];
    final StringBuilder mBuilder = new StringBuilder();
    final Formatter mFmt;

    public String toString(int i)
    {
        mArgs[0] = Integer.valueOf(i);
        mBuilder.delete(0, mBuilder.length());
        mFmt.format("%02d", mArgs);
        return mFmt.toString();
    }

    rmatter()
    {
        mFmt = new Formatter(mBuilder);
    }
}
