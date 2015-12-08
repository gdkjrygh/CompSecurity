// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            Survey

public static class <init> extends Enum
{

    private static final TEXT ENUM$VALUES[];
    public static final TEXT MULTIPLE_CHOICE;
    public static final TEXT TEXT;
    public static final TEXT UNKNOWN;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/mixpanel/android/mpmetrics/Survey$QuestionType, s);
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
        UNKNOWN = new Survey.QuestionType("UNKNOWN", 0) {

            public String toString()
            {
                return "*unknown_type*";
            }

        };
        MULTIPLE_CHOICE = new Survey.QuestionType("MULTIPLE_CHOICE", 1) {

            public String toString()
            {
                return "multiple_choice";
            }

        };
        TEXT = new Survey.QuestionType("TEXT", 2) {

            public String toString()
            {
                return "text";
            }

        };
        ENUM$VALUES = (new ENUM.VALUES[] {
            UNKNOWN, MULTIPLE_CHOICE, TEXT
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
