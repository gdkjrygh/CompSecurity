// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.preference;

import android.content.Context;
import android.content.Intent;
import android.preference.RingtonePreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.whatsapp.preference:
//            WaPreference

public class WaRingtonePreference extends RingtonePreference
{

    private static final String z;

    public WaRingtonePreference(Context context)
    {
        super(context);
    }

    public WaRingtonePreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public WaRingtonePreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected View onCreateView(ViewGroup viewgroup)
    {
        return WaPreference.a(super.onCreateView(viewgroup));
    }

    protected void onPrepareRingtonePickerIntent(Intent intent)
    {
        super.onPrepareRingtonePickerIntent(intent);
        if (getShowDefault() && (getRingtoneType() & 1) != 0 && (getRingtoneType() & 2) != 0)
        {
            intent.putExtra(z, android.provider.Settings.System.DEFAULT_NOTIFICATION_URI);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = ")h\035s>!bWh?<c\027u\177-~\rs0ft\020o6<i\027d\177\fC?@\004\004R&T\003\001".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 81;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 72;
          goto _L8
_L3:
        byte0 = 6;
          goto _L8
_L4:
        byte0 = 121;
          goto _L8
        byte0 = 1;
          goto _L8
    }
}
