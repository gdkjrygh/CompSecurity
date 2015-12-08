// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;


public abstract class RemovalCause extends Enum
{

    private static final RemovalCause $VALUES[];
    public static final RemovalCause COLLECTED;
    public static final RemovalCause EXPIRED;
    public static final RemovalCause EXPLICIT;
    public static final RemovalCause REPLACED;
    public static final RemovalCause SIZE;

    private RemovalCause(String s, int i)
    {
        super(s, i);
    }


    public static RemovalCause valueOf(String s)
    {
        return (RemovalCause)Enum.valueOf(com/google/common/cache/RemovalCause, s);
    }

    public static RemovalCause[] values()
    {
        return (RemovalCause[])$VALUES.clone();
    }

    abstract boolean wasEvicted();

    static 
    {
        EXPLICIT = new RemovalCause("EXPLICIT", 0) {

            boolean wasEvicted()
            {
                return false;
            }

        };
        REPLACED = new RemovalCause("REPLACED", 1) {

            boolean wasEvicted()
            {
                return false;
            }

        };
        COLLECTED = new RemovalCause("COLLECTED", 2) {

            boolean wasEvicted()
            {
                return true;
            }

        };
        EXPIRED = new RemovalCause("EXPIRED", 3) {

            boolean wasEvicted()
            {
                return true;
            }

        };
        SIZE = new RemovalCause("SIZE", 4) {

            boolean wasEvicted()
            {
                return true;
            }

        };
        $VALUES = (new RemovalCause[] {
            EXPLICIT, REPLACED, COLLECTED, EXPIRED, SIZE
        });
    }
}
