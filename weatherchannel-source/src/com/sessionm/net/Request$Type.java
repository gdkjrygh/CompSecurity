// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net;


// Referenced classes of package com.sessionm.net:
//            Request

public static final class hc extends Enum
{

    public static final ha gL;
    public static final ha gM;
    public static final ha gN;
    public static final ha gO;
    public static final ha gP;
    public static final ha gQ;
    public static final ha gR;
    public static final ha gS;
    public static final ha gT;
    public static final ha gU;
    public static final ha gV;
    public static final ha gW;
    public static final ha gX;
    public static final ha gY;
    public static final ha gZ;
    public static final ha ha;
    private static final ha hd[];
    private final d fO;
    private final String hb;
    private final int hc;

    static d a(hc hc1)
    {
        return hc1.fO;
    }

    public static fO valueOf(String s)
    {
        return (fO)Enum.valueOf(com/sessionm/net/Request$Type, s);
    }

    public static fO[] values()
    {
        return (fO[])hd.clone();
    }

    d aQ()
    {
        return fO;
    }

    String getPath()
    {
        return hb;
    }

    int getTimeout()
    {
        return hc;
    }

    static 
    {
        gL = new <init>("SESSION_START", 0, "/v%s/apps/%s/session.json", d.gw, 30000);
        gM = new <init>("ACTION", 1, "/v%s/events.json", d.gw);
        gN = new <init>("SESSION_END", 2, "/v%s/session.json", d.gw, 5000);
        gO = new <init>("SESSION_UPDATE", 3, "/v%s/session.json", d.gz);
        gP = new <init>("CONTENT", 4, "", d.gx);
        gQ = new <init>("ERROR", 5, "/v%s/apps/%s/errors.json", d.gw);
        gR = new <init>("DELIVERED", 6, "/v%s/apps/%s/bugs/delivered.json", d.gx);
        gS = new <init>("CLAIM", 7, "/v%s/apps/%s/awards/%s/ads", d.gx);
        gT = new <init>("CLAIMABLEACHIEVEMENT", 8, "/v%s/apps/%s/claimable_achievement.json", d.gx);
        gU = new <init>("ACHIEVEMENTSLIST", 9, "/v%s/apps/%s/achievements_list.json", d.gx);
        gV = new <init>("GENERIC", 10, "", d.gA);
        gW = new <init>("OPT_IN_OUT", 11, "/optout.json", d.gz);
        gX = new <init>("CPI", 12, "/transactions", d.gw);
        gY = new <init>("LOG_IN", 13, "/members/login.json", d.gw);
        gZ = new <init>("SIGN_UP", 14, "/members/signup.json", d.gw);
        ha = new <init>("LOG_OUT", 15, "/members/logout.json", d.gx);
        hd = (new hd[] {
            gL, gM, gN, gO, gP, gQ, gR, gS, gT, gU, 
            gV, gW, gX, gY, gZ, ha
        });
    }

    private d(String s, int i, String s1, d d)
    {
        super(s, i);
        hb = s1;
        fO = d;
        hc = -1;
    }

    private d(String s, int i, String s1, d d, int j)
    {
        super(s, i);
        hb = s1;
        fO = d;
        hc = j;
    }
}
