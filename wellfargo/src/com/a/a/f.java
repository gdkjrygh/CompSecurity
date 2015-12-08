// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;


public final class f extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    public static final f g;
    public static final f h;
    public static final f i;
    public static final f j;
    public static final f k;
    private static final f n[];
    private final String l;
    private final String m;

    private f(String s, int i1, String s1, String s2)
    {
        super(s, i1);
        l = s1;
        m = s2;
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/a/a/f, s);
    }

    public static f[] values()
    {
        return (f[])n.clone();
    }

    public String toString()
    {
        return l;
    }

    static 
    {
        a = new f("THM_NotYet", 0, "Not Yet", "Profile request has successfully started but is not completed");
        b = new f("THM_OK", 1, "Okay", "Completed, No errors");
        c = new f("THM_Connection_Error", 2, "Connection Error", "There has been a connection issue, profiling aborted");
        d = new f("THM_HostNotFound_Error", 3, "Host Not Found", "Unable to resolve the host name");
        e = new f("THM_NetworkTimeout_Error", 4, "Network Timeout", "Communications layer timed out");
        f = new f("THM_Internal_Error", 5, "Internal Error", "Internal Error, profiling incomplete or interrupted");
        g = new f("THM_HostVerification_Error", 6, "Host Verification Error", "Certificate verification failure! Potential MITM attack");
        h = new f("THM_Interrupted_Error", 7, "Interrupted", "Request was cancelled");
        i = new f("THM_InvalidOrgID", 8, "Invalid ORG ID", "Request contained an invalid org id");
        j = new f("THM_ConfigurationError", 9, "Configuration Error", "Failed to retrieve configuration from server");
        k = new f("THM_PartialProfile", 10, "Partial Profile", "Connection error, only partial profile completed");
        n = (new f[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
