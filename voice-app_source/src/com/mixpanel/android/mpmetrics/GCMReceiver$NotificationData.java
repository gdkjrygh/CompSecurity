// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Intent;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            GCMReceiver

static class <init>
{

    public final int icon;
    public final Intent intent;
    public final String message;
    public final CharSequence title;

    private A(int i, CharSequence charsequence, String s, Intent intent1)
    {
        icon = i;
        title = charsequence;
        message = s;
        intent = intent1;
    }

    intent(int i, CharSequence charsequence, String s, Intent intent1, intent intent2)
    {
        this(i, charsequence, s, intent1);
    }
}
