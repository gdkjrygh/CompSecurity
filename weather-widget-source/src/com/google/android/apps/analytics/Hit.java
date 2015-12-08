// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


public class Hit
{

    final long hitId;
    final String hitString;

    Hit(String s, long l)
    {
        hitString = s;
        hitId = l;
    }
}
