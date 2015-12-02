// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            INotificationSideChannel

class notif
    implements notif
{

    private static final String z[];
    final int id;
    final Notification notif;
    final String packageName;
    final String tag;

    public void send(INotificationSideChannel inotificationsidechannel)
    {
        inotificationsidechannel.notify(packageName, id, tag, notif);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(z[1]);
        stringbuilder.append(z[2]).append(packageName);
        stringbuilder.append(z[0]).append(id);
        stringbuilder.append(z[3]).append(tag);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "yb\025a,";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\033-\blp,\026\035v}\016";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "%#\037nw2'2d{0x";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "yb\bdqo";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 22;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 85;
          goto _L9
_L5:
        byte0 = 66;
          goto _L9
_L6:
        byte0 = 124;
          goto _L9
        byte0 = 5;
          goto _L9
    }

    public A(String s, int i, String s1, Notification notification)
    {
        packageName = s;
        id = i;
        tag = s1;
        notif = notification;
    }
}
