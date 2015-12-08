// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;


public class UserMetaData
{

    public static final UserMetaData EMPTY = new UserMetaData();
    public final String email;
    public final String id;
    public final String name;

    public UserMetaData()
    {
        this(null, null, null);
    }

    public UserMetaData(String s, String s1, String s2)
    {
        id = s;
        name = s1;
        email = s2;
    }

    public boolean isEmpty()
    {
        return id == null && name == null && email == null;
    }

}
