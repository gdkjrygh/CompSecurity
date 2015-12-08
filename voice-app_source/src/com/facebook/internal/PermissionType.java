// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


public final class PermissionType extends Enum
{

    private static final PermissionType ENUM$VALUES[];
    public static final PermissionType PUBLISH;
    public static final PermissionType READ;

    private PermissionType(String s, int i)
    {
        super(s, i);
    }

    public static PermissionType valueOf(String s)
    {
        return (PermissionType)Enum.valueOf(com/facebook/internal/PermissionType, s);
    }

    public static PermissionType[] values()
    {
        PermissionType apermissiontype[] = ENUM$VALUES;
        int i = apermissiontype.length;
        PermissionType apermissiontype1[] = new PermissionType[i];
        System.arraycopy(apermissiontype, 0, apermissiontype1, 0, i);
        return apermissiontype1;
    }

    static 
    {
        READ = new PermissionType("READ", 0);
        PUBLISH = new PermissionType("PUBLISH", 1);
        ENUM$VALUES = (new PermissionType[] {
            READ, PUBLISH
        });
    }
}
