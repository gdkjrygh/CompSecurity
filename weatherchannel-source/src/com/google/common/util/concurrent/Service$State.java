// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            Service

public static abstract class <init> extends Enum
{

    private static final FAILED $VALUES[];
    public static final FAILED FAILED;
    public static final FAILED NEW;
    public static final FAILED RUNNING;
    public static final FAILED STARTING;
    public static final FAILED STOPPING;
    public static final FAILED TERMINATED;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/util/concurrent/Service$State, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    abstract boolean isTerminal();

    static 
    {
        NEW = new Service.State("NEW", 0) {

            boolean isTerminal()
            {
                return false;
            }

        };
        STARTING = new Service.State("STARTING", 1) {

            boolean isTerminal()
            {
                return false;
            }

        };
        RUNNING = new Service.State("RUNNING", 2) {

            boolean isTerminal()
            {
                return false;
            }

        };
        STOPPING = new Service.State("STOPPING", 3) {

            boolean isTerminal()
            {
                return false;
            }

        };
        TERMINATED = new Service.State("TERMINATED", 4) {

            boolean isTerminal()
            {
                return true;
            }

        };
        FAILED = new Service.State("FAILED", 5) {

            boolean isTerminal()
            {
                return true;
            }

        };
        $VALUES = (new .VALUES[] {
            NEW, STARTING, RUNNING, STOPPING, TERMINATED, FAILED
        });
    }

    private _cls6(String s, int i)
    {
        super(s, i);
    }

    _cls6(String s, int i, _cls6 _pcls6)
    {
        this(s, i);
    }
}
