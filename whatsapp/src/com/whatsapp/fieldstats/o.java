// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class o extends Enum
{

    public static final o ABOUT;
    public static final o ACCOUNT;
    public static final o BACKUP_CONVERSATIONS;
    public static final o CHANGE_NUMBER;
    public static final o CHATS_ALL_ARCHIVE;
    public static final o CHATS_ALL_CLEAR;
    public static final o CHATS_ALL_DELETE;
    public static final o CHAT_ARCHIVE;
    public static final o CHAT_CLEAR;
    public static final o CHAT_DELETE;
    public static final o CONTACTS_VIEWS;
    public static final o CONTACT_US;
    public static final o DELETE_ACCOUNT;
    public static final o FAQ;
    public static final o FAVORITES_VIEWS;
    public static final o GROUP_INFO;
    public static final o NEW_BROADCAST_LIST;
    public static final o NEW_GROUP;
    public static final o PROFILE;
    public static final o SETTINGS;
    public static final o STATUS_VIEWS;
    public static final o TAF_VIA_CONTACTPICKER_MENU;
    public static final o TAF_VIA_CONTACTSFRAGMENT_MENU;
    public static final o TAF_VIA_CONTACTS_LIST;
    public static final o TAF_VIA_CONTACT_PICKER_LIST;
    public static final o TAF_VIA_EMPTY;
    public static final o TAF_VIA_INVITE_NON_WA_CONTACT;
    public static final o TAF_VIA_SETTINGS;
    public static final o TELL_A_FRIEND;
    private static final o a[];
    private static final String z[];
    private final int b;

    private o(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static o valueOf(String s)
    {
        return (o)Enum.valueOf(com/whatsapp/fieldstats/o, s);
    }

    public static o[] values()
    {
        return (o[])a.clone();
    }

    public int getCode()
    {
        return b;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[29];
        obj = "\0275\177\036b\013<r\006n\025/}\002x\0028";
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
                obj = "\000<x\025g\035<a\t~\032)\177\te\0044}\001t\006\"s\017\177\001";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\000<x\025g\035<a\031t\000)w\004v\007";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\023/q\037a\0134p\f~";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\0328i\025v\0062k\032";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\0275\177\036n\0208r\017e\021";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\0208r\017e\021\"\177\tr\033(p\036";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\0275\177\036b\013<r\006n\0271{\013c";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\025?q\037e";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\0275\177\004v\021\"p\037|\0268l";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\007)\177\036d\007\"h\003t\003.";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\000<x\025g\035<a\t~\032)\177\te\013-w\tz\021/a\006x\007)";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\022<o";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\0275\177\036b\013<r\006n\0208r\017e\021";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\0272p\036p\027)m\025g\0358i\031";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\000<x\025g\035<a\t~\032)\177\te\007\"r\003b\0";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\000<x\025g\035<a\t~\032)\177\te\007;l\013v\0318p\036n\0318p\037";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\0272p\036p\027)a\037b";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\022<h\005c\035){\031n\0024{\035b";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\004/q\fx\0308";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "\0078j\036x\032:m";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "\000<x\025g\035<a\017|\004)g";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\0275\177\036n\0271{\013c";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "\0328i\025s\0062\177\016r\025.j\025}\035.j";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "\000<x\025g\035<a\003\177\0024j\017n\0322p\025f\025\"}\005\177\000<}\036";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "\026<}\001d\004\"}\005\177\0028l\031p\0004q\004b";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "\0275\177\036n\025/}\002x\0028";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "\0008r\006n\025\"x\030x\0213z";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "\025>}\005d\032)";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                z = as;
                NEW_GROUP = new o(z[4], 0, 1);
                NEW_BROADCAST_LIST = new o(z[23], 1, 2);
                SETTINGS = new o(z[20], 2, 3);
                PROFILE = new o(z[19], 3, 4);
                ACCOUNT = new o(z[28], 4, 5);
                CHANGE_NUMBER = new o(z[9], 5, 6);
                GROUP_INFO = new o(z[3], 6, 7);
                BACKUP_CONVERSATIONS = new o(z[25], 7, 8);
                ABOUT = new o(z[8], 8, 9);
                FAQ = new o(z[12], 9, 10);
                CONTACT_US = new o(z[17], 10, 11);
                DELETE_ACCOUNT = new o(z[6], 11, 12);
                CONTACTS_VIEWS = new o(z[14], 12, 13);
                STATUS_VIEWS = new o(z[10], 13, 14);
                TAF_VIA_SETTINGS = new o(z[2], 14, 15);
                TAF_VIA_CONTACTS_LIST = new o(z[15], 15, 16);
                TAF_VIA_CONTACTPICKER_MENU = new o(z[1], 16, 17);
                TAF_VIA_EMPTY = new o(z[21], 17, 18);
                TAF_VIA_INVITE_NON_WA_CONTACT = new o(z[24], 18, 19);
                TAF_VIA_CONTACT_PICKER_LIST = new o(z[11], 19, 20);
                TAF_VIA_CONTACTSFRAGMENT_MENU = new o(z[16], 20, 21);
                TELL_A_FRIEND = new o(z[27], 21, 22);
                FAVORITES_VIEWS = new o(z[18], 22, 23);
                CHAT_DELETE = new o(z[5], 23, 24);
                CHAT_CLEAR = new o(z[22], 24, 25);
                CHAT_ARCHIVE = new o(z[26], 25, 26);
                CHATS_ALL_DELETE = new o(z[13], 26, 27);
                CHATS_ALL_CLEAR = new o(z[7], 27, 28);
                CHATS_ALL_ARCHIVE = new o(z[0], 28, 29);
                a = (new o[] {
                    NEW_GROUP, NEW_BROADCAST_LIST, SETTINGS, PROFILE, ACCOUNT, CHANGE_NUMBER, GROUP_INFO, BACKUP_CONVERSATIONS, ABOUT, FAQ, 
                    CONTACT_US, DELETE_ACCOUNT, CONTACTS_VIEWS, STATUS_VIEWS, TAF_VIA_SETTINGS, TAF_VIA_CONTACTS_LIST, TAF_VIA_CONTACTPICKER_MENU, TAF_VIA_EMPTY, TAF_VIA_INVITE_NON_WA_CONTACT, TAF_VIA_CONTACT_PICKER_LIST, 
                    TAF_VIA_CONTACTSFRAGMENT_MENU, TELL_A_FRIEND, FAVORITES_VIEWS, CHAT_DELETE, CHAT_CLEAR, CHAT_ARCHIVE, CHATS_ALL_DELETE, CHATS_ALL_CLEAR, CHATS_ALL_ARCHIVE
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1488
    //                   0 1511
    //                   1 1518
    //                   2 1525
    //                   3 1532;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1532;
_L3:
        byte byte1 = 49;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 84;
          goto _L9
_L5:
        byte1 = 125;
          goto _L9
_L6:
        byte1 = 62;
          goto _L9
        byte1 = 74;
          goto _L9
    }
}
