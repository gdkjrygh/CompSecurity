// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer.e.d;

final class k
    implements d
{

    k()
    {
    }

    public final boolean a(Object obj)
    {
        obj = com.google.android.exoplayer.e.k.d((String)obj);
        return !TextUtils.isEmpty(((CharSequence) (obj))) && (!((String) (obj)).contains("text") || ((String) (obj)).contains("text/vtt")) && !((String) (obj)).contains("html") && !((String) (obj)).contains("xml");
    }
}
