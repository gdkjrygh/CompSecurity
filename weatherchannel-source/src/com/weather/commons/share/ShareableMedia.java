// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.share;

import android.net.Uri;
import com.weather.util.intent.MimeType;

public interface ShareableMedia
{

    public abstract MimeType getMimeType();

    public abstract String getTitle();

    public abstract Uri getUri();
}
