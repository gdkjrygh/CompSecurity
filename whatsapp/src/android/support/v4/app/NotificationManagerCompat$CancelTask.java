// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            INotificationSideChannel, FragmentActivity

class tag
    implements tag
{

    private static final String z[];
    final boolean all = false;
    final int id;
    final String packageName;
    final String tag;

    public void send(INotificationSideChannel inotificationsidechannel)
    {
label0:
        {
            if (all)
            {
                inotificationsidechannel.cancelAll(packageName);
                if (FragmentActivity.a == 0)
                {
                    break label0;
                }
            }
            inotificationsidechannel.cancel(packageName, id, tag);
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(z[1]);
        stringbuilder.append(z[2]).append(packageName);
        stringbuilder.append(z[3]).append(id);
        stringbuilder.append(z[0]).append(tag);
        stringbuilder.append(z[4]).append(all);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "H\037K`I^";
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
                obj = "'^QbK\bk^rE?";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\024^\\jO\003Zq`C\001\005";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "H\037Ve\024";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "H\037^mB^";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 46;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 100;
          goto _L9
_L5:
        byte1 = 63;
          goto _L9
_L6:
        byte1 = 63;
          goto _L9
        byte1 = 1;
          goto _L9
    }

    public A(String s, int i, String s1)
    {
        packageName = s;
        id = i;
        tag = s1;
    }
}
