// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            InAppNotification

public static class <init> extends Enum
{

    private static final TAKEOVER ENUM$VALUES[];
    public static final TAKEOVER MINI;
    public static final TAKEOVER TAKEOVER;
    public static final TAKEOVER UNKNOWN;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/mixpanel/android/mpmetrics/InAppNotification$Type, s);
    }

    public static <init>[] values()
    {
        <init> a_3C_init>[] = ENUM$VALUES;
        int i = a_3C_init>.length;
        <init> a_3C_init>1[] = new ENUM.VALUES[i];
        System.arraycopy(a_3C_init>, 0, a_3C_init>1, 0, i);
        return a_3C_init>1;
    }

    static 
    {
        UNKNOWN = new InAppNotification.Type("UNKNOWN", 0) {

            public String toString()
            {
                return "*unknown_type*";
            }

        };
        MINI = new InAppNotification.Type("MINI", 1) {

            public String toString()
            {
                return "mini";
            }

        };
        TAKEOVER = new InAppNotification.Type("TAKEOVER", 2) {

            public String toString()
            {
                return "takeover";
            }

        };
        ENUM$VALUES = (new ENUM.VALUES[] {
            UNKNOWN, MINI, TAKEOVER
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, _cls3 _pcls3)
    {
        this(s, i);
    }
}
