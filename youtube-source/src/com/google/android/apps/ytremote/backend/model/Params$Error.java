// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.model;


public final class A extends Enum
{

    private static final NO_REMOTE_CONTROL $VALUES[];
    public static final NO_REMOTE_CONTROL BAD_REQUEST;
    public static final NO_REMOTE_CONTROL LOUNGE_NOT_FOUND;
    public static final NO_REMOTE_CONTROL NOT_IN_PARTY_MODE;
    public static final NO_REMOTE_CONTROL NO_REMOTE_CONTROL;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/google/android/apps/ytremote/backend/model/Params$Error, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        BAD_REQUEST = new <init>("BAD_REQUEST", 0);
        LOUNGE_NOT_FOUND = new <init>("LOUNGE_NOT_FOUND", 1);
        NOT_IN_PARTY_MODE = new <init>("NOT_IN_PARTY_MODE", 2);
        NO_REMOTE_CONTROL = new <init>("NO_REMOTE_CONTROL", 3);
        $VALUES = (new .VALUES[] {
            BAD_REQUEST, LOUNGE_NOT_FOUND, NOT_IN_PARTY_MODE, NO_REMOTE_CONTROL
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
