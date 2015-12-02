// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class l extends Enum
{

    public static final l CONTACTPICKER_LIST;
    public static final l CONTACTPICKER_MENU;
    public static final l CONTACTS_LIST;
    public static final l CONTACTS_MENU;
    public static final l EMPTY_CALLS;
    public static final l EMPTY_CONTACTS;
    public static final l EMPTY_CONVERSATIONS;
    public static final l INVITE_NON_WA_CONTACT;
    public static final l SETTINGS_CONTACTS;
    private static final l b[];
    private static final String z[];
    private final int a;

    private l(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static l valueOf(String s)
    {
        return (l)Enum.valueOf(com/whatsapp/fieldstats/l, s);
    }

    public static l[] values()
    {
        return (l[])b.clone();
    }

    public int getCode()
    {
        return a;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[9];
        obj = "\036R7jf\036I*aj\030S,";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\030P)j~\002^8rk\016";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\030P)j~\002^6pq\030O*\177s\024R7m";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\016X-jn\023Z*ad\022S-\177d\tN";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\036R7jf\036I)wd\026X+aj\030S,";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\030P)j~\002^6ps\034^-m";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\036R7jf\036I)wd\026X+ak\024N-";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\024S/ws\030B7qi\002J8ad\022S-\177d\t";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\036R7jf\036I*ak\024N-";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                z = as;
                SETTINGS_CONTACTS = new l(z[3], 0, 1);
                CONTACTS_LIST = new l(z[8], 1, 2);
                CONTACTS_MENU = new l(z[0], 2, 3);
                CONTACTPICKER_LIST = new l(z[6], 3, 4);
                CONTACTPICKER_MENU = new l(z[4], 4, 5);
                EMPTY_CONVERSATIONS = new l(z[2], 5, 6);
                EMPTY_CONTACTS = new l(z[5], 6, 7);
                INVITE_NON_WA_CONTACT = new l(z[7], 7, 8);
                EMPTY_CALLS = new l(z[1], 8, 9);
                b = (new l[] {
                    SETTINGS_CONTACTS, CONTACTS_LIST, CONTACTS_MENU, CONTACTPICKER_LIST, CONTACTPICKER_MENU, EMPTY_CONVERSATIONS, EMPTY_CONTACTS, INVITE_NON_WA_CONTACT, EMPTY_CALLS
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 508
    //                   0 531
    //                   1 538
    //                   2 545
    //                   3 552;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_552;
_L3:
        byte byte1 = 39;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 93;
          goto _L9
_L5:
        byte1 = 29;
          goto _L9
_L6:
        byte1 = 121;
          goto _L9
        byte1 = 62;
          goto _L9
    }
}
