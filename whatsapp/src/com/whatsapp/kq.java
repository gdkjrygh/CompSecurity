// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, GroupChatRecentLocationsActivity, Conversation, og, 
//            ContactInfo

class kq
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final GroupChatRecentLocationsActivity a;

    kq(GroupChatRecentLocationsActivity groupchatrecentlocationsactivity)
    {
        a = groupchatrecentlocationsactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        int j = App.am;
        i;
        JVM INSTR tableswitch 0 3: default 36
    //                   0 43
    //                   1 65
    //                   2 84
    //                   3 215;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        dialoginterface.dismiss();
        return;
_L2:
        a.startActivity(Conversation.a(GroupChatRecentLocationsActivity.a(a)));
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        App.b(GroupChatRecentLocationsActivity.a(a), a);
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        Intent intent1;
        if (GroupChatRecentLocationsActivity.a(a).z != null)
        {
            ContactInfo.a(GroupChatRecentLocationsActivity.a(a), a);
            if (j == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        String s = GroupChatRecentLocationsActivity.a(a).a();
        intent1 = new Intent(z[6], android.provider.ContactsContract.Contacts.CONTENT_URI);
        intent1.putExtra(z[3], s);
        intent1.setComponent(intent1.resolveActivity(a.getPackageManager()));
        if (intent1.getComponent() == null) goto _L7; else goto _L6
_L6:
        a.startActivityForResult(intent1, 10);
        if (j == 0) goto _L8; else goto _L7
_L7:
        Log.i(z[1]);
        App.J();
_L8:
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        Intent intent = new Intent(z[0]);
        intent.setType(z[2]);
        intent.putExtra(z[4], GroupChatRecentLocationsActivity.a(a).a(a));
        intent.putExtra(z[5], 2);
        intent.setFlags(0x80000);
        a.startActivityForResult(intent, 11);
        if (true) goto _L1; else goto _L9
_L9:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "1\n\022ap9\000Xzq$\001\030g11\007\002zp>J?]L\0256\"LP\002;3WV\004";
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
                obj = "7\026\031fo3\f\027gm5\007\023}k<\013\025rk9\013\030`03\013\030gz(\020V`f#\020\023~?3\013\030g~3\020V\177v#\020Vpp%\b\0223q?\020Vup%\n\022";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "&\n\022=~>\000\004|v4J\025fm#\013\004=v$\001\033<|?\n\002r|$";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = " \f\031}z";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = " \f\031}z";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = " \f\031}z\017\020\017cz";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "1\n\022ap9\000Xzq$\001\030g11\007\002zp>J?]L\0256\"";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 31;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 80;
          goto _L9
_L5:
        byte1 = 100;
          goto _L9
_L6:
        byte1 = 118;
          goto _L9
        byte1 = 19;
          goto _L9
    }
}
