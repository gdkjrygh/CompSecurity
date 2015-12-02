// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification.model;

import android.os.Bundle;
import android.text.TextUtils;
import bjw;
import dug;

// Referenced classes of package com.ubercab.client.feature.notification.model:
//            TripNotificationData, FareSplitAcceptedNotificationData, FareSplitInviteNotificationData, MessageNotificationData, 
//            ReceiptNotificationData, SurgeNotificationData

public abstract class NotificationData
{

    static final String KEY_MESSAGE_IDENTIFIER = "message_identifier";
    static final String KEY_TIMESTAMP = "timestamp";
    static final String KEY_TYPE = "type";
    private static final int SIMPLE_MESSAGE_ID = 19;
    private Integer mMessageIdentifier;
    private final Source mSource;
    protected Long mTimestamp;
    private final String mType;

    protected NotificationData(String s, Source source)
    {
        mSource = source;
        mType = s;
    }

    public static NotificationData fromUberBundle(bjw bjw, Bundle bundle)
    {
        Object obj;
        Object obj1;
        String s;
        obj1 = null;
        obj = null;
        s = bundle.getString("type");
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return ((NotificationData) (obj));
_L2:
        s.hashCode();
        JVM INSTR lookupswitch 6: default 84
    //                   3568677: 182
    //                   109803310: 262
    //                   120981341: 198
    //                   597429311: 214
    //                   954925063: 230
    //                   1082290744: 246;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        byte byte0 = -1;
_L20:
        byte0;
        JVM INSTR tableswitch 0 5: default 128
    //                   0 278
    //                   1 287
    //                   2 295
    //                   3 303
    //                   4 311
    //                   5 319;
           goto _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L10:
        bjw = obj1;
_L26:
        obj = bjw;
        if (bjw == null) goto _L1; else goto _L17
_L17:
        obj = bundle.getString("message_identifier");
        bundle = bundle.getString("timestamp");
        bjw.mMessageIdentifier = Integer.valueOf(dug.a(((String) (obj)), -1));
        obj = bjw;
        if (bundle == null) goto _L1; else goto _L18
_L18:
        bjw.mTimestamp = Long.valueOf(dug.a(bundle, 0L));
        return bjw;
_L4:
        if (!s.equals("trip")) goto _L3; else goto _L19
_L19:
        byte0 = 0;
          goto _L20
_L6:
        if (!s.equals("fare_split_accepted")) goto _L3; else goto _L21
_L21:
        byte0 = 1;
          goto _L20
_L7:
        if (!s.equals("fare_split_invite")) goto _L3; else goto _L22
_L22:
        byte0 = 2;
          goto _L20
_L8:
        if (!s.equals("message")) goto _L3; else goto _L23
_L23:
        byte0 = 3;
          goto _L20
_L9:
        if (!s.equals("receipt")) goto _L3; else goto _L24
_L24:
        byte0 = 4;
          goto _L20
_L5:
        if (!s.equals("surge")) goto _L3; else goto _L25
_L25:
        byte0 = 5;
          goto _L20
_L11:
        bjw = TripNotificationData.fromUberBundle(bjw, bundle);
          goto _L26
_L12:
        bjw = FareSplitAcceptedNotificationData.fromUberBundle(bundle);
          goto _L26
_L13:
        bjw = FareSplitInviteNotificationData.fromUberBundle(bundle);
          goto _L26
_L14:
        bjw = MessageNotificationData.fromUberBundle(bundle);
          goto _L26
_L15:
        bjw = ReceiptNotificationData.fromUberBundle(bundle);
          goto _L26
_L16:
        bjw = SurgeNotificationData.fromUberBundle(bundle);
          goto _L26
    }

    public Integer getMessageIdentifier()
    {
        int i;
        if (mMessageIdentifier == null)
        {
            i = 19;
        } else
        {
            i = mMessageIdentifier.intValue();
        }
        return Integer.valueOf(i);
    }

    public Source getSource()
    {
        return mSource;
    }

    public abstract String getTag();

    public Long getTimestamp()
    {
        return mTimestamp;
    }

    public String getType()
    {
        return mType;
    }
}
