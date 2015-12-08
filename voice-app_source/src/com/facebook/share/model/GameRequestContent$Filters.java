// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;


// Referenced classes of package com.facebook.share.model:
//            GameRequestContent

public static final class _cls9 extends Enum
{

    public static final APP_NON_USERS APP_NON_USERS;
    public static final APP_NON_USERS APP_USERS;
    private static final APP_NON_USERS ENUM$VALUES[];

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/facebook/share/model/GameRequestContent$Filters, s);
    }

    public static _cls9[] values()
    {
        _cls9 a_lcls9[] = ENUM$VALUES;
        int i = a_lcls9.length;
        _cls9 a_lcls9_1[] = new ENUM.VALUES[i];
        System.arraycopy(a_lcls9, 0, a_lcls9_1, 0, i);
        return a_lcls9_1;
    }

    static 
    {
        APP_USERS = new <init>("APP_USERS", 0);
        APP_NON_USERS = new <init>("APP_NON_USERS", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            APP_USERS, APP_NON_USERS
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
