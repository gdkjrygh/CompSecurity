// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;


class RedeemRequest
{
    public static final class Method extends Enum
    {

        private static final Method $VALUES[];
        public static final Method AMEX;
        public static final Method GCActivate;
        public static final Method GCReload;

        public static Method valueOf(String s)
        {
            return (Method)Enum.valueOf(com/walmart/android/service/saver/RedeemRequest$Method, s);
        }

        public static Method[] values()
        {
            return (Method[])$VALUES.clone();
        }

        static 
        {
            AMEX = new Method("AMEX", 0);
            GCActivate = new Method("GCActivate", 1);
            GCReload = new Method("GCReload", 2);
            $VALUES = (new Method[] {
                AMEX, GCActivate, GCReload
            });
        }

        private Method(String s, int i)
        {
            super(s, i);
        }
    }


    public String method;

    RedeemRequest()
    {
    }
}
