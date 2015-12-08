// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.model.transfer;

import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.model.transfer:
//            a

public final class Transfer
{

    public final String a;
    public final String b;
    public final Status c;
    public final int d;
    public final long e;
    public final long f;
    public final a g;
    public final a h;
    public final String i;

    public Transfer(String s, String s1, Status status, int j, long l, long l1, a a1, a a2, String s2)
    {
        a = com.google.android.apps.youtube.common.fromguava.c.a(s, "filePath may not be empty");
        b = com.google.android.apps.youtube.common.fromguava.c.a(s1, "networkUri may not be empty");
        c = (Status)com.google.android.apps.youtube.common.fromguava.c.a(status);
        d = j;
        e = l;
        f = l1;
        g = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        h = (a)com.google.android.apps.youtube.common.fromguava.c.a(a2);
        i = s2;
    }

    public final boolean a()
    {
        return c != Status.COMPLETED && c != Status.FAILED;
    }

    public final boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof Transfer))
        {
            return false;
        } else
        {
            obj = (Transfer)obj;
            return a.equals(((Transfer) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("{filePath=")).append(a).append(", networkUri=").append(b).append("}").toString();
    }

    private class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status COMPLETED;
        public static final Status FAILED;
        public static final Status PENDING;
        public static final Status RUNNING;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/google/android/apps/youtube/datalib/model/transfer/Transfer$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            PENDING = new Status("PENDING", 0);
            RUNNING = new Status("RUNNING", 1);
            COMPLETED = new Status("COMPLETED", 2);
            FAILED = new Status("FAILED", 3);
            $VALUES = (new Status[] {
                PENDING, RUNNING, COMPLETED, FAILED
            });
        }

        private Status(String s, int j)
        {
            super(s, j);
        }
    }

}
