// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.notification.model.TripNotificationData;

final class ang.Object
    implements Runnable
{

    final boolean a;
    final String b;
    final dzs c;

    public final void run()
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = true;
        if (!a) goto _L2; else goto _L1
_L1:
        Object obj;
        byte byte0;
        obj = b;
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 3: default 60
    //                   -2146525273: 125
    //                   -1325796731: 153
    //                   -734206867: 139;
           goto _L3 _L4 _L5 _L6
_L3:
        int i;
        int j;
        i = ((flag) ? 1 : 0);
        j = ((flag1) ? 1 : 0);
        byte0;
        JVM INSTR tableswitch 0 2: default 96
    //                   0 102
    //                   1 167
    //                   2 176;
           goto _L2 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_176;
_L7:
        break; /* Loop/switch isn't completed */
_L2:
        j = 0;
        i = ((flag) ? 1 : 0);
_L10:
        obj = TripNotificationData.createFakeData(b, j, i);
        c.m.a(((com.ubercab.client.feature.notification.model.NotificationData) (obj)));
        return;
_L4:
        if (((String) (obj)).equals("accepted"))
        {
            byte0 = 0;
        }
          goto _L3
_L6:
        if (((String) (obj)).equals("arrived"))
        {
            byte0 = 1;
        }
          goto _L3
_L5:
        if (((String) (obj)).equals("on_trip"))
        {
            byte0 = 2;
        }
          goto _L3
_L8:
        i = 1;
        j = ((flag1) ? 1 : 0);
          goto _L10
        j = 3;
        i = 2;
          goto _L10
    }

    (dzs dzs1, boolean flag, String s)
    {
        c = dzs1;
        a = flag;
        b = s;
        super();
    }
}
