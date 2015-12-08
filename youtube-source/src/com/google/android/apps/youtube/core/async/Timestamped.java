// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import java.io.Serializable;

public final class Timestamped
    implements Serializable
{

    public final Object element;
    public final long timestamp;

    public Timestamped(Object obj, long l)
    {
        element = obj;
        timestamp = l;
    }
}
