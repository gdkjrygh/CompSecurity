// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.campaigns;


// Referenced classes of package com.arubanetworks.meridian.campaigns:
//            CampaignsService

private static final class g extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c h[];
    final long d;
    final long e;
    final long f;
    final long g;

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/arubanetworks/meridian/campaigns/CampaignsService$UpdateCheckState, s);
    }

    public static g[] values()
    {
        return (g[])h.clone();
    }

    static 
    {
        a = new <init>("HIGH", 0, 20L, 15L, 10L, 1L);
        b = new <init>("MEDIUM", 1, 60L, 40L, 7L, 1L);
        c = new <init>("LOW", 2, 300L, 200L, 5L, 1L);
        h = (new h[] {
            a, b, c
        });
    }

    private (String s, int i, long l, long l1, long l2, long l3)
    {
        super(s, i);
        e = 1000L * l1;
        d = 1000L * l;
        f = 1000L * l2 * 0xf4240L;
        g = 1000L * l3;
    }
}
